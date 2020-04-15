package unist.cucm.util;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.ModificationItem;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;


public class LDAPManager {
	private Hashtable<String, String> env = new Hashtable<String, String>();
	private DirContext ctx = null;
	private final String[] BASE_DN = {"ou=울산과학기술원,dc=unist,dc=ac,dc=kr",
										"ou=특별법인 울산과학기술원,dc=unist,dc=ac,dc=kr"};
										// "ou=퇴사자,dc=unist,dc=ac,dc=kr"};
	
	public LDAPManager() {
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		// env.put(Context.PROVIDER_URL, "ldaps://dc01.unist.ac.kr:636");
		env.put(Context.PROVIDER_URL, "ldap://dc01.unist.ac.kr");
		// env.put(Context.SECURITY_PROTOCOL, "ssl");
		// env.put(Context.SECURITY_AUTHENTICATION, "simple");
	}
	
	public void authenticateAsAdmin() {
		env.put(Context.SECURITY_PRINCIPAL, "ipt");
		env.put(Context.SECURITY_CREDENTIALS, "Un1st%#ipt");
		try {
			ctx = new InitialDirContext(env);
		} catch(Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: authenticateAsAdmin()");
		}
	}
	
	public boolean authenticate(String user, String pwd) throws Exception {
		env.put(Context.SECURITY_PRINCIPAL, "unist\\" + user);
		env.put(Context.SECURITY_CREDENTIALS, pwd);
		ctx = new InitialDirContext(env);
		if(ctx != null) {
			return true;
		}
		return false;
	}
	
	public Attributes searchUser(String attribute, String value) {
		try {
			String filter = "(&(objectClass=user)(" + attribute + "=" + value + "))";
			
			SearchControls sc = new SearchControls();
			sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
			SearchResult rs = null;
			
			for(int i = 0; i < BASE_DN.length; i++) {
				NamingEnumeration<SearchResult> results = ctx.search(BASE_DN[i], filter, sc);
				while(results.hasMore()) {
					if(rs != null) {
						throw new Exception("Matched multiple users for the " + attribute + ": " + value);
					}
					rs = (SearchResult)results.next();
				}
				if(rs != null) {
					break;
				}
			}
			Attributes attrs = rs.getAttributes();
			return attrs;
		} catch (Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: searchUser()");
			return null;
		}
	}
	
	public List<Attributes> searchAllUsers() {
		try {
			List<Attributes> list = new ArrayList<>();
			
			SearchControls sc = new SearchControls();
			sc.setSearchScope(SearchControls.SUBTREE_SCOPE);
			SearchResult rs = null;
			
			for(int i = 0; i < BASE_DN.length; i++) {
				NamingEnumeration<SearchResult> results = ctx.search(BASE_DN[0], "", sc);
				
				while(results.hasMore()) {
					rs = (SearchResult)results.next();
					list.add(rs.getAttributes());
				}
			}
			return list;
		} catch (Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: searchAllUsers()");
			return null;
		}
	}
	
	public void modifyExtensionById(String userId, String telephoneNum) {
		try {
			Attributes attrs = searchUser("sAMAccountName", userId);
			
			ModificationItem mods[] = new ModificationItem[] {
					 new ModificationItem(DirContext.REPLACE_ATTRIBUTE, new BasicAttribute("telephoneNumber", telephoneNum))
			};
			
			String dn = attrs.get("Distinguishedname").get().toString();

			ctx.modifyAttributes(dn, mods);			
		} catch(Exception e) {
			e.printStackTrace();
			// CommonUtility.writeLog(e.getMessage());
			// CommonUtility.writeLog("Error: modifyUser()");
		}
	}
	
	public void closeContext() {
		try {
			ctx.close();
		} catch(Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: closeContext()");
		}
	}
	
	/*
	public String searchUserForCN(String userId, String searchBase) throws Exception {
		// Create the search controls
		SearchControls searchCtls = new SearchControls();

		// Specify the attributes to return
		String returnedAtts[] = {"sn", "givenName", "samAccountName"};
		searchCtls.setReturningAttributes(returnedAtts);

		// Specify the search scope
		searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		// specify the LDAP search filter
		// String searchFilter = "(&(objectClass=user))";
		String searchFilter = "(&(objectClass=user)(sAMAccountName=" + userId + "))";

		// Specify the Base for the search
		// String searchBase = "ou=울산과학기술원,dc=unist,dc=ac,dc=kr";
		// initialize counter to total the results
		int totalResults = 0;

		// Search for objects using the filter
		NamingEnumeration<SearchResult> answer = ctx.search(searchBase, searchFilter, searchCtls);

		// Loop through the search results
		String result = null;
		while(answer.hasMoreElements()) {
			SearchResult sr = (SearchResult)answer.next();
			totalResults++;
			result = sr.getName() + "," + searchBase;
			// System.out.println(">>>" + sr.getName());
			// Attributes attrs = sr.getAttributes();
			// System.out.println(">>>>>>" + attrs.get("samAccountName"));
		}
		if(totalResults > 1)
			result = null;
		
		return result;
	}
	*/
	public boolean disableUser(String cn) {
		try {
			ModificationItem[] mods = new ModificationItem[1];
			// To enable user
			// int UF_ACCOUNT_ENABLE = 0x0001;
			// mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, new
			// BasicAttribute("userAccountControl",Integer.toString(UF_ACCOUNT_ENABLE)));
	
			// To disable user
			int UF_ACCOUNT_DISABLE = 0x0002;
			mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE,
					new BasicAttribute("userAccountControl", Integer.toString(UF_ACCOUNT_DISABLE)));
			ctx.modifyAttributes(cn, mods);
			CommonUtility.writeLog("Disabled User: " + cn);
			return true;
		} catch(Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: disableUser()");
			return false;
		}
	}
	/*
	public SearchResult findAccountByAccountName(String ldapSearchBase, String accountName) {
		SearchResult searchResult = null;
		try {
			String searchFilter = "(&(objectClass=user)(sAMAccountName=" + accountName + "))";

			SearchControls searchControls = new SearchControls();
			searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);

			NamingEnumeration<SearchResult> results = ctx.search(ldapSearchBase, searchFilter, searchControls);
			
			if(results.hasMoreElements()) {
				searchResult = (SearchResult) results.nextElement();

				// make sure there is not another item available, there should be only 1 match
				if (results.hasMoreElements()) {
					System.err.println("Matched multiple users for the accountName: " + accountName);
					return null;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			CommonUtility.writeLog(e.getMessage());
		}
		return searchResult;
	}
	*/
	
	public boolean resetPassword(String cn, String pwd) {
		try {
			String quotedPassword = "\"" + pwd + "\"";
			char unicodePwd[] = quotedPassword.toCharArray();
			byte pwdArray[] = new byte[unicodePwd.length * 2];

			for (int i = 0; i < unicodePwd.length; i++) {
				pwdArray[i * 2 + 1] = (byte) (unicodePwd[i] >>> 8);
				pwdArray[i * 2 + 0] = (byte) (unicodePwd[i] & 0xff);
			}
			ModificationItem[] mods = new ModificationItem[1];
			mods[0] = new ModificationItem(DirContext.REPLACE_ATTRIBUTE, new BasicAttribute("UnicodePwd", pwdArray));
			ctx.modifyAttributes(cn, mods);
			CommonUtility.writeLog("Reset Password: " + cn);
			return true;
		} catch (Exception e) {
			CommonUtility.writeLog(e.getMessage());
			CommonUtility.writeLog("Error: resetPassword()");
			return false;
		}
	}
}
