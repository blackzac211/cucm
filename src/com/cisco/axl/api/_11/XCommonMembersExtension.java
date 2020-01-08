
package com.cisco.axl.api._11;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XCommonMembersExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XCommonMembersExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XCommonMembersExtension")
@XmlSeeAlso({
    com.cisco.axl.api._11.UpdateUserGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateUserGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateUserGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateUserGroupReq.RemoveUserRoles.class,
    com.cisco.axl.api._11.UpdateUserGroupReq.AddUserRoles.class,
    com.cisco.axl.api._11.UpdateUserGroupReq.UserRoles.class,
    com.cisco.axl.api._11.UpdateMobileVoiceAccessReq.RemoveLocales.class,
    com.cisco.axl.api._11.UpdateMobileVoiceAccessReq.AddLocales.class,
    com.cisco.axl.api._11.UpdateMobileVoiceAccessReq.Locales.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.RemovePatterns.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.AddPatterns.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.Patterns.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.RemovePlars.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.AddPlars.class,
    com.cisco.axl.api._11.UpdateSipDialRulesReq.Plars.class,
    com.cisco.axl.api._11.UpdateRouteFilterReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateRouteFilterReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateRouteFilterReq.Members.class,
    com.cisco.axl.api._11.UpdateMediaResourceListReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateMediaResourceListReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateMediaResourceListReq.Members.class,
    com.cisco.axl.api._11.UpdateLdapDirectoryReq.RemoveAccessControlGroupInfo.class,
    com.cisco.axl.api._11.UpdateLdapDirectoryReq.AddAccessControlGroupInfo.class,
    com.cisco.axl.api._11.UpdateLdapDirectoryReq.AccessControlGroupInfo.class,
    com.cisco.axl.api._11.UpdateUserReq.RemoveExtensionsInfo.class,
    com.cisco.axl.api._11.UpdateUserReq.AddExtensionsInfo.class,
    com.cisco.axl.api._11.UpdateUserReq.ExtensionsInfo.class,
    com.cisco.axl.api._11.UpdateRouteListReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateRouteListReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateRouteListReq.Members.class,
    com.cisco.axl.api._11.UpdateTimeScheduleReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateTimeScheduleReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateTimeScheduleReq.Members.class,
    com.cisco.axl.api._11.UpdateLineGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateLineGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateLineGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateCcdRequestingServiceReq.RemoveAssociatedTrunks.class,
    com.cisco.axl.api._11.UpdateCcdRequestingServiceReq.AddAssociatedTrunks.class,
    com.cisco.axl.api._11.UpdateCcdRequestingServiceReq.AssociatedTrunks.class,
    com.cisco.axl.api._11.UpdateResourcePriorityNamespaceListReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateResourcePriorityNamespaceListReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateResourcePriorityNamespaceListReq.Members.class,
    com.cisco.axl.api._11.UpdateHuntListReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateHuntListReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateHuntListReq.Members.class,
    com.cisco.axl.api._11.UpdateMediaResourceGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateMediaResourceGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateMediaResourceGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateDateTimeGroupReq.RemovePhoneNtpReferences.class,
    com.cisco.axl.api._11.UpdateDateTimeGroupReq.AddPhoneNtpReferences.class,
    com.cisco.axl.api._11.UpdateDateTimeGroupReq.PhoneNtpReferences.class,
    com.cisco.axl.api._11.UpdateImeClientReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateImeClientReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateImeClientReq.Members.class,
    com.cisco.axl.api._11.UpdateImeClientReq.RemoveCcmExternalIpMaps.class,
    com.cisco.axl.api._11.UpdateImeClientReq.AddCcmExternalIpMaps.class,
    com.cisco.axl.api._11.UpdateImeClientReq.CcmExternalIpMaps.class,
    com.cisco.axl.api._11.UpdateElinGroupReq.RemoveElinNumbers.class,
    com.cisco.axl.api._11.UpdateElinGroupReq.AddElinNumbers.class,
    com.cisco.axl.api._11.UpdateElinGroupReq.ElinNumbers.class,
    com.cisco.axl.api._11.UpdateSipTrunkReq.RemoveDestinations.class,
    com.cisco.axl.api._11.UpdateSipTrunkReq.AddDestinations.class,
    com.cisco.axl.api._11.UpdateSipTrunkReq.Destinations.class,
    com.cisco.axl.api._11.UpdateDeviceMobilityReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateDeviceMobilityReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateDeviceMobilityReq.Members.class,
    com.cisco.axl.api._11.UpdateLbmHubGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateLbmHubGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateLbmHubGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateGeoLocationPolicyReq.RemoveRelatedPolicies.class,
    com.cisco.axl.api._11.UpdateGeoLocationPolicyReq.AddRelatedPolicies.class,
    com.cisco.axl.api._11.UpdateGeoLocationPolicyReq.RelatedPolicies.class,
    com.cisco.axl.api._11.UpdateCallerFilterListReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateCallerFilterListReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateCallerFilterListReq.Members.class,
    com.cisco.axl.api._11.UpdateIpPhoneServicesReq.RemoveParameters.class,
    com.cisco.axl.api._11.UpdateIpPhoneServicesReq.AddParameters.class,
    com.cisco.axl.api._11.UpdateIpPhoneServicesReq.Parameters.class,
    com.cisco.axl.api._11.UpdateCssReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateCssReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateCssReq.Members.class,
    com.cisco.axl.api._11.UpdateSelfProvisioningReq.RemoveLanguages.class,
    com.cisco.axl.api._11.UpdateSelfProvisioningReq.AddLanguages.class,
    com.cisco.axl.api._11.UpdateSelfProvisioningReq.Languages.class,
    com.cisco.axl.api._11.UpdateWlanProfileGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateWlanProfileGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateWlanProfileGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateCallManagerGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateCallManagerGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateCallManagerGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateRemoteDestinationReq.RemoveRingSchedule.class,
    com.cisco.axl.api._11.UpdateRemoteDestinationReq.AddRingSchedule.class,
    com.cisco.axl.api._11.UpdateRemoteDestinationReq.RingSchedule.class,
    com.cisco.axl.api._11.UpdateCallPickupGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateCallPickupGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateCallPickupGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.RemoveAppUsers.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.AddAppUsers.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.AppUsers.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.RemoveEndUsers.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.AddEndUsers.class,
    com.cisco.axl.api._11.UpdateApplicationServerReq.EndUsers.class,
    com.cisco.axl.api._11.UpdateH323TrunkReq.RemoveDestinations.class,
    com.cisco.axl.api._11.UpdateH323TrunkReq.AddDestinations.class,
    com.cisco.axl.api._11.UpdateH323TrunkReq.Destinations.class,
    com.cisco.axl.api._11.UpdateRouteGroupReq.RemoveMembers.class,
    com.cisco.axl.api._11.UpdateRouteGroupReq.AddMembers.class,
    com.cisco.axl.api._11.UpdateRouteGroupReq.Members.class,
    com.cisco.axl.api._11.UpdateSafForwarderReq.RemoveAssociatedCucms.class,
    com.cisco.axl.api._11.UpdateSafForwarderReq.AddAssociatedCucms.class,
    com.cisco.axl.api._11.UpdateSafForwarderReq.AssociatedCucms.class,
    com.cisco.axl.api._11.XUserGroup.Members.class,
    com.cisco.axl.api._11.XUserGroup.UserRoles.class,
    com.cisco.axl.api._11.XLdapDirectory.AccessControlGroupInfo.class,
    com.cisco.axl.api._11.XDeviceMobility.Members.class,
    com.cisco.axl.api._11.XElinGroup.ElinNumbers.class,
    com.cisco.axl.api._11.XCcdRequestingService.AssociatedTrunks.class,
    com.cisco.axl.api._11.XGeoLocationPolicy.RelatedPolicies.class,
    com.cisco.axl.api._11.XUser.ExtensionsInfo.class,
    com.cisco.axl.api._11.XCallPickupGroup.Members.class,
    com.cisco.axl.api._11.XResourcePriorityNamespaceList.Members.class,
    com.cisco.axl.api._11.XRouteGroup.Members.class,
    com.cisco.axl.api._11.XCallerFilterList.Members.class,
    com.cisco.axl.api._11.XWlanProfileGroup.Members.class,
    com.cisco.axl.api._11.XDateTimeGroup.PhoneNtpReferences.class,
    com.cisco.axl.api._11.XHuntList.Members.class,
    com.cisco.axl.api._11.XLineGroup.Members.class,
    com.cisco.axl.api._11.XRemoteDestination.RingSchedule.class,
    com.cisco.axl.api._11.XIpPhoneServices.Parameters.class,
    com.cisco.axl.api._11.XApplicationServer.AppUsers.class,
    com.cisco.axl.api._11.XApplicationServer.EndUsers.class,
    com.cisco.axl.api._11.LElinGroup.ElinNumbers.class,
    com.cisco.axl.api._11.XImeClient.Members.class,
    com.cisco.axl.api._11.XImeClient.CcmExternalIpMaps.class,
    com.cisco.axl.api._11.XRouteList.Members.class,
    com.cisco.axl.api._11.XMediaResourceList.Members.class,
    com.cisco.axl.api._11.XSafForwarder.AssociatedCucms.class,
    com.cisco.axl.api._11.XCss.Members.class,
    com.cisco.axl.api._11.XCallManagerGroup.Members.class,
    com.cisco.axl.api._11.XMobileVoiceAccess.Locales.class,
    com.cisco.axl.api._11.XRouteFilter.Members.class,
    com.cisco.axl.api._11.XDdi.Members.class,
    com.cisco.axl.api._11.XH323Trunk.Destinations.class,
    com.cisco.axl.api._11.XTimeSchedule.Members.class,
    com.cisco.axl.api._11.XSdpTransparencyProfile.AttributeSet.class,
    com.cisco.axl.api._11.XSipTrunk.Destinations.class,
    com.cisco.axl.api._11.XMediaResourceGroup.Members.class,
    com.cisco.axl.api._11.LLdapDirectory.AccessControlGroupInfo.class,
    com.cisco.axl.api._11.XSipDialRules.Patterns.class,
    com.cisco.axl.api._11.XSipDialRules.Plars.class,
    com.cisco.axl.api._11.XLbmHubGroup.Members.class
})
public class XCommonMembersExtension {


}
