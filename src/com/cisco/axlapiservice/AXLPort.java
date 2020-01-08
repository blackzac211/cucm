
package com.cisco.axlapiservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import com.cisco.axl.api._11.AddAarGroupReq;
import com.cisco.axl.api._11.AddAdvertisedPatternsReq;
import com.cisco.axl.api._11.AddAnnouncementReq;
import com.cisco.axl.api._11.AddAppServerInfoReq;
import com.cisco.axl.api._11.AddAppUserReq;
import com.cisco.axl.api._11.AddApplicationDialRulesReq;
import com.cisco.axl.api._11.AddApplicationServerReq;
import com.cisco.axl.api._11.AddApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._11.AddApplicationUserCapfProfileReq;
import com.cisco.axl.api._11.AddAudioCodecPreferenceListReq;
import com.cisco.axl.api._11.AddBillingServerReq;
import com.cisco.axl.api._11.AddBlockedLearnedPatternsReq;
import com.cisco.axl.api._11.AddCCAProfilesReq;
import com.cisco.axl.api._11.AddCallManagerGroupReq;
import com.cisco.axl.api._11.AddCallParkReq;
import com.cisco.axl.api._11.AddCallPickupGroupReq;
import com.cisco.axl.api._11.AddCalledPartyTracingReq;
import com.cisco.axl.api._11.AddCalledPartyTransformationPatternReq;
import com.cisco.axl.api._11.AddCallerFilterListReq;
import com.cisco.axl.api._11.AddCallingPartyTransformationPatternReq;
import com.cisco.axl.api._11.AddCcdAdvertisingServiceReq;
import com.cisco.axl.api._11.AddCcdHostedDNGroupReq;
import com.cisco.axl.api._11.AddCcdHostedDNReq;
import com.cisco.axl.api._11.AddCcdRequestingServiceReq;
import com.cisco.axl.api._11.AddCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._11.AddCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._11.AddCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._11.AddCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._11.AddCmcInfoReq;
import com.cisco.axl.api._11.AddCommonDeviceConfigReq;
import com.cisco.axl.api._11.AddCommonPhoneConfigReq;
import com.cisco.axl.api._11.AddConferenceBridgeReq;
import com.cisco.axl.api._11.AddConferenceNowReq;
import com.cisco.axl.api._11.AddCredentialPolicyReq;
import com.cisco.axl.api._11.AddCssReq;
import com.cisco.axl.api._11.AddCtiRoutePointReq;
import com.cisco.axl.api._11.AddCumaServerSecurityProfileReq;
import com.cisco.axl.api._11.AddCustomUserFieldReq;
import com.cisco.axl.api._11.AddDateTimeGroupReq;
import com.cisco.axl.api._11.AddDefaultDeviceProfileReq;
import com.cisco.axl.api._11.AddDeviceMobilityGroupReq;
import com.cisco.axl.api._11.AddDeviceMobilityReq;
import com.cisco.axl.api._11.AddDevicePoolReq;
import com.cisco.axl.api._11.AddDeviceProfileReq;
import com.cisco.axl.api._11.AddDhcpServerReq;
import com.cisco.axl.api._11.AddDhcpSubnetReq;
import com.cisco.axl.api._11.AddDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._11.AddDirectedCallParkReq;
import com.cisco.axl.api._11.AddDirectoryLookupDialRulesReq;
import com.cisco.axl.api._11.AddElinGroupReq;
import com.cisco.axl.api._11.AddEndUserCapfProfileReq;
import com.cisco.axl.api._11.AddEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._11.AddExternalCallControlProfileReq;
import com.cisco.axl.api._11.AddFacInfoReq;
import com.cisco.axl.api._11.AddFallbackProfileReq;
import com.cisco.axl.api._11.AddFeatureControlPolicyReq;
import com.cisco.axl.api._11.AddFeatureGroupTemplateReq;
import com.cisco.axl.api._11.AddGatekeeperReq;
import com.cisco.axl.api._11.AddGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._11.AddGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._11.AddGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._11.AddGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._11.AddGatewayReq;
import com.cisco.axl.api._11.AddGatewaySccpEndpointsReq;
import com.cisco.axl.api._11.AddGatewaySubunitsReq;
import com.cisco.axl.api._11.AddGeoLocationFilterReq;
import com.cisco.axl.api._11.AddGeoLocationPolicyReq;
import com.cisco.axl.api._11.AddGeoLocationReq;
import com.cisco.axl.api._11.AddH323GatewayReq;
import com.cisco.axl.api._11.AddH323PhoneReq;
import com.cisco.axl.api._11.AddH323TrunkReq;
import com.cisco.axl.api._11.AddHandoffConfigurationReq;
import com.cisco.axl.api._11.AddHttpProfileReq;
import com.cisco.axl.api._11.AddHuntListReq;
import com.cisco.axl.api._11.AddHuntPilotReq;
import com.cisco.axl.api._11.AddImeClientReq;
import com.cisco.axl.api._11.AddImeE164TransformationReq;
import com.cisco.axl.api._11.AddImeEnrolledPatternGroupReq;
import com.cisco.axl.api._11.AddImeEnrolledPatternReq;
import com.cisco.axl.api._11.AddImeExclusionNumberGroupReq;
import com.cisco.axl.api._11.AddImeExclusionNumberReq;
import com.cisco.axl.api._11.AddImeFirewallReq;
import com.cisco.axl.api._11.AddImeRouteFilterElementReq;
import com.cisco.axl.api._11.AddImeRouteFilterGroupReq;
import com.cisco.axl.api._11.AddImeServerReq;
import com.cisco.axl.api._11.AddImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._11.AddIpPhoneServicesReq;
import com.cisco.axl.api._11.AddIvrUserLocaleReq;
import com.cisco.axl.api._11.AddLbmGroupReq;
import com.cisco.axl.api._11.AddLbmHubGroupReq;
import com.cisco.axl.api._11.AddLdapDirectoryReq;
import com.cisco.axl.api._11.AddLdapFilterReq;
import com.cisco.axl.api._11.AddLdapSyncCustomFieldReq;
import com.cisco.axl.api._11.AddLineGroupReq;
import com.cisco.axl.api._11.AddLineReq;
import com.cisco.axl.api._11.AddLocalRouteGroupReq;
import com.cisco.axl.api._11.AddLocationReq;
import com.cisco.axl.api._11.AddMediaResourceGroupReq;
import com.cisco.axl.api._11.AddMediaResourceListReq;
import com.cisco.axl.api._11.AddMeetMeReq;
import com.cisco.axl.api._11.AddMessageWaitingReq;
import com.cisco.axl.api._11.AddMlppDomainReq;
import com.cisco.axl.api._11.AddMobileVoiceAccessReq;
import com.cisco.axl.api._11.AddMobilityProfileReq;
import com.cisco.axl.api._11.AddMobilityReq;
import com.cisco.axl.api._11.AddMtpReq;
import com.cisco.axl.api._11.AddNetworkAccessProfileReq;
import com.cisco.axl.api._11.AddPhoneButtonTemplateReq;
import com.cisco.axl.api._11.AddPhoneNtpReq;
import com.cisco.axl.api._11.AddPhoneReq;
import com.cisco.axl.api._11.AddPhoneSecurityProfileReq;
import com.cisco.axl.api._11.AddPhysicalLocationReq;
import com.cisco.axl.api._11.AddPresenceGroupReq;
import com.cisco.axl.api._11.AddPresenceRedundancyGroupReq;
import com.cisco.axl.api._11.AddProcessNodeReq;
import com.cisco.axl.api._11.AddRecordingProfileReq;
import com.cisco.axl.api._11.AddRegionReq;
import com.cisco.axl.api._11.AddRemoteClusterReq;
import com.cisco.axl.api._11.AddRemoteDestinationProfileReq;
import com.cisco.axl.api._11.AddRemoteDestinationReq;
import com.cisco.axl.api._11.AddResourcePriorityNamespaceListReq;
import com.cisco.axl.api._11.AddResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.AddRouteFilterReq;
import com.cisco.axl.api._11.AddRouteGroupReq;
import com.cisco.axl.api._11.AddRouteListReq;
import com.cisco.axl.api._11.AddRoutePartitionReq;
import com.cisco.axl.api._11.AddRoutePatternReq;
import com.cisco.axl.api._11.AddSIPNormalizationScriptReq;
import com.cisco.axl.api._11.AddSNMPCommunityStringReq;
import com.cisco.axl.api._11.AddSNMPCommunityStringRes;
import com.cisco.axl.api._11.AddSNMPUserReq;
import com.cisco.axl.api._11.AddSNMPUserRes;
import com.cisco.axl.api._11.AddSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._11.AddSafForwarderReq;
import com.cisco.axl.api._11.AddSafSecurityProfileReq;
import com.cisco.axl.api._11.AddSdpTransparencyProfileReq;
import com.cisco.axl.api._11.AddServiceProfileReq;
import com.cisco.axl.api._11.AddSipDialRulesReq;
import com.cisco.axl.api._11.AddSipProfileReq;
import com.cisco.axl.api._11.AddSipRealmReq;
import com.cisco.axl.api._11.AddSipRoutePatternReq;
import com.cisco.axl.api._11.AddSipTrunkReq;
import com.cisco.axl.api._11.AddSipTrunkSecurityProfileReq;
import com.cisco.axl.api._11.AddSoftKeyTemplateReq;
import com.cisco.axl.api._11.AddSrstReq;
import com.cisco.axl.api._11.AddTimePeriodReq;
import com.cisco.axl.api._11.AddTimeScheduleReq;
import com.cisco.axl.api._11.AddTodAccessReq;
import com.cisco.axl.api._11.AddTransPatternReq;
import com.cisco.axl.api._11.AddTranscoderReq;
import com.cisco.axl.api._11.AddTransformationProfileReq;
import com.cisco.axl.api._11.AddUcServiceReq;
import com.cisco.axl.api._11.AddUnitsToGatewayReq;
import com.cisco.axl.api._11.AddUniversalDeviceTemplateReq;
import com.cisco.axl.api._11.AddUniversalLineTemplateReq;
import com.cisco.axl.api._11.AddUserGroupReq;
import com.cisco.axl.api._11.AddUserPhoneAssociationReq;
import com.cisco.axl.api._11.AddUserProfileProvisionReq;
import com.cisco.axl.api._11.AddUserReq;
import com.cisco.axl.api._11.AddVg224Req;
import com.cisco.axl.api._11.AddVohServerReq;
import com.cisco.axl.api._11.AddVoiceMailPilotReq;
import com.cisco.axl.api._11.AddVoiceMailPortReq;
import com.cisco.axl.api._11.AddVoiceMailProfileReq;
import com.cisco.axl.api._11.AddVpnGatewayReq;
import com.cisco.axl.api._11.AddVpnGroupReq;
import com.cisco.axl.api._11.AddVpnProfileReq;
import com.cisco.axl.api._11.AddWLANProfileReq;
import com.cisco.axl.api._11.AddWifiHotspotReq;
import com.cisco.axl.api._11.AddWlanProfileGroupReq;
import com.cisco.axl.api._11.ApplyDirectedCallParkReq;
import com.cisco.axl.api._11.ApplyGatewayReq;
import com.cisco.axl.api._11.ApplyLineReq;
import com.cisco.axl.api._11.ApplyResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.AssignPresenceUserReq;
import com.cisco.axl.api._11.DoAuthenticateUserReq;
import com.cisco.axl.api._11.DoAuthenticateUserRes;
import com.cisco.axl.api._11.DoChangeDNDStatusReq;
import com.cisco.axl.api._11.DoChangeDNDStatusRes;
import com.cisco.axl.api._11.DoDeviceLoginReq;
import com.cisco.axl.api._11.DoDeviceLoginRes;
import com.cisco.axl.api._11.DoDeviceLogoutReq;
import com.cisco.axl.api._11.DoDeviceLogoutRes;
import com.cisco.axl.api._11.DoDeviceResetReq;
import com.cisco.axl.api._11.DoDeviceResetRes;
import com.cisco.axl.api._11.DoLdapSyncReq;
import com.cisco.axl.api._11.DoLdapSyncRes;
import com.cisco.axl.api._11.DoUpdateLicenseUsageReq;
import com.cisco.axl.api._11.DoUpdateLicenseUsageRes;
import com.cisco.axl.api._11.DoUpdateRemoteClusterReq;
import com.cisco.axl.api._11.DoUpdateRemoteClusterRes;
import com.cisco.axl.api._11.ExecuteSQLQueryReq;
import com.cisco.axl.api._11.ExecuteSQLQueryRes;
import com.cisco.axl.api._11.ExecuteSQLUpdateReq;
import com.cisco.axl.api._11.ExecuteSQLUpdateRes;
import com.cisco.axl.api._11.GetAarGroupReq;
import com.cisco.axl.api._11.GetAarGroupRes;
import com.cisco.axl.api._11.GetAdvertisedPatternsReq;
import com.cisco.axl.api._11.GetAdvertisedPatternsRes;
import com.cisco.axl.api._11.GetAnnouncementReq;
import com.cisco.axl.api._11.GetAnnouncementRes;
import com.cisco.axl.api._11.GetAnnunciatorReq;
import com.cisco.axl.api._11.GetAnnunciatorRes;
import com.cisco.axl.api._11.GetAppServerInfoReq;
import com.cisco.axl.api._11.GetAppServerInfoRes;
import com.cisco.axl.api._11.GetAppUserReq;
import com.cisco.axl.api._11.GetAppUserRes;
import com.cisco.axl.api._11.GetApplicationDialRulesReq;
import com.cisco.axl.api._11.GetApplicationDialRulesRes;
import com.cisco.axl.api._11.GetApplicationServerReq;
import com.cisco.axl.api._11.GetApplicationServerRes;
import com.cisco.axl.api._11.GetApplicationUserCapfProfileReq;
import com.cisco.axl.api._11.GetApplicationUserCapfProfileRes;
import com.cisco.axl.api._11.GetAudioCodecPreferenceListReq;
import com.cisco.axl.api._11.GetAudioCodecPreferenceListRes;
import com.cisco.axl.api._11.GetBillingServerReq;
import com.cisco.axl.api._11.GetBillingServerRes;
import com.cisco.axl.api._11.GetBlockedLearnedPatternsReq;
import com.cisco.axl.api._11.GetBlockedLearnedPatternsRes;
import com.cisco.axl.api._11.GetCCAProfilesReq;
import com.cisco.axl.api._11.GetCCAProfilesRes;
import com.cisco.axl.api._11.GetCCMVersionReq;
import com.cisco.axl.api._11.GetCCMVersionRes;
import com.cisco.axl.api._11.GetCallManagerGroupReq;
import com.cisco.axl.api._11.GetCallManagerGroupRes;
import com.cisco.axl.api._11.GetCallManagerReq;
import com.cisco.axl.api._11.GetCallManagerRes;
import com.cisco.axl.api._11.GetCallParkReq;
import com.cisco.axl.api._11.GetCallParkRes;
import com.cisco.axl.api._11.GetCallPickupGroupReq;
import com.cisco.axl.api._11.GetCallPickupGroupRes;
import com.cisco.axl.api._11.GetCalledPartyTransformationPatternReq;
import com.cisco.axl.api._11.GetCalledPartyTransformationPatternRes;
import com.cisco.axl.api._11.GetCallerFilterListReq;
import com.cisco.axl.api._11.GetCallerFilterListRes;
import com.cisco.axl.api._11.GetCallingPartyTransformationPatternReq;
import com.cisco.axl.api._11.GetCallingPartyTransformationPatternRes;
import com.cisco.axl.api._11.GetCcdAdvertisingServiceReq;
import com.cisco.axl.api._11.GetCcdAdvertisingServiceRes;
import com.cisco.axl.api._11.GetCcdFeatureConfigReq;
import com.cisco.axl.api._11.GetCcdFeatureConfigRes;
import com.cisco.axl.api._11.GetCcdHostedDNGroupReq;
import com.cisco.axl.api._11.GetCcdHostedDNGroupRes;
import com.cisco.axl.api._11.GetCcdHostedDNReq;
import com.cisco.axl.api._11.GetCcdHostedDNRes;
import com.cisco.axl.api._11.GetCcdRequestingServiceReq;
import com.cisco.axl.api._11.GetCcdRequestingServiceRes;
import com.cisco.axl.api._11.GetCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._11.GetCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._11.GetCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._11.GetCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._11.GetCmcInfoReq;
import com.cisco.axl.api._11.GetCmcInfoRes;
import com.cisco.axl.api._11.GetCommonDeviceConfigReq;
import com.cisco.axl.api._11.GetCommonDeviceConfigRes;
import com.cisco.axl.api._11.GetCommonPhoneConfigReq;
import com.cisco.axl.api._11.GetCommonPhoneConfigRes;
import com.cisco.axl.api._11.GetConferenceBridgeReq;
import com.cisco.axl.api._11.GetConferenceBridgeRes;
import com.cisco.axl.api._11.GetConferenceNowReq;
import com.cisco.axl.api._11.GetConferenceNowRes;
import com.cisco.axl.api._11.GetCredentialPolicyDefaultReq;
import com.cisco.axl.api._11.GetCredentialPolicyDefaultRes;
import com.cisco.axl.api._11.GetCredentialPolicyReq;
import com.cisco.axl.api._11.GetCredentialPolicyRes;
import com.cisco.axl.api._11.GetCssReq;
import com.cisco.axl.api._11.GetCssRes;
import com.cisco.axl.api._11.GetCtiRoutePointReq;
import com.cisco.axl.api._11.GetCtiRoutePointRes;
import com.cisco.axl.api._11.GetCumaServerSecurityProfileReq;
import com.cisco.axl.api._11.GetCumaServerSecurityProfileRes;
import com.cisco.axl.api._11.GetCustomUserFieldReq;
import com.cisco.axl.api._11.GetCustomUserFieldRes;
import com.cisco.axl.api._11.GetDateTimeGroupReq;
import com.cisco.axl.api._11.GetDateTimeGroupRes;
import com.cisco.axl.api._11.GetDdiReq;
import com.cisco.axl.api._11.GetDdiRes;
import com.cisco.axl.api._11.GetDefaultDeviceProfileReq;
import com.cisco.axl.api._11.GetDefaultDeviceProfileRes;
import com.cisco.axl.api._11.GetDeviceMobilityGroupReq;
import com.cisco.axl.api._11.GetDeviceMobilityGroupRes;
import com.cisco.axl.api._11.GetDeviceMobilityReq;
import com.cisco.axl.api._11.GetDeviceMobilityRes;
import com.cisco.axl.api._11.GetDevicePoolReq;
import com.cisco.axl.api._11.GetDevicePoolRes;
import com.cisco.axl.api._11.GetDeviceProfileOptionsReq;
import com.cisco.axl.api._11.GetDeviceProfileOptionsRes;
import com.cisco.axl.api._11.GetDeviceProfileReq;
import com.cisco.axl.api._11.GetDeviceProfileRes;
import com.cisco.axl.api._11.GetDhcpServerReq;
import com.cisco.axl.api._11.GetDhcpServerRes;
import com.cisco.axl.api._11.GetDhcpSubnetReq;
import com.cisco.axl.api._11.GetDhcpSubnetRes;
import com.cisco.axl.api._11.GetDialPlanReq;
import com.cisco.axl.api._11.GetDialPlanRes;
import com.cisco.axl.api._11.GetDialPlanTagReq;
import com.cisco.axl.api._11.GetDialPlanTagRes;
import com.cisco.axl.api._11.GetDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._11.GetDirNumberAliasLookupandSyncRes;
import com.cisco.axl.api._11.GetDirectedCallParkReq;
import com.cisco.axl.api._11.GetDirectedCallParkRes;
import com.cisco.axl.api._11.GetDirectoryLookupDialRulesReq;
import com.cisco.axl.api._11.GetDirectoryLookupDialRulesRes;
import com.cisco.axl.api._11.GetElinGroupReq;
import com.cisco.axl.api._11.GetElinGroupRes;
import com.cisco.axl.api._11.GetEmccFeatureConfigReq;
import com.cisco.axl.api._11.GetEmccFeatureConfigRes;
import com.cisco.axl.api._11.GetEndUserCapfProfileReq;
import com.cisco.axl.api._11.GetEndUserCapfProfileRes;
import com.cisco.axl.api._11.GetEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._11.GetEnterpriseFeatureAccessConfigurationRes;
import com.cisco.axl.api._11.GetEnterprisePhoneConfigReq;
import com.cisco.axl.api._11.GetEnterprisePhoneConfigRes;
import com.cisco.axl.api._11.GetExternalCallControlProfileReq;
import com.cisco.axl.api._11.GetExternalCallControlProfileRes;
import com.cisco.axl.api._11.GetFacInfoReq;
import com.cisco.axl.api._11.GetFacInfoRes;
import com.cisco.axl.api._11.GetFallbackFeatureConfigReq;
import com.cisco.axl.api._11.GetFallbackFeatureConfigRes;
import com.cisco.axl.api._11.GetFallbackProfileReq;
import com.cisco.axl.api._11.GetFallbackProfileRes;
import com.cisco.axl.api._11.GetFeatureControlPolicyReq;
import com.cisco.axl.api._11.GetFeatureControlPolicyRes;
import com.cisco.axl.api._11.GetFeatureGroupTemplateReq;
import com.cisco.axl.api._11.GetFeatureGroupTemplateRes;
import com.cisco.axl.api._11.GetFixedMohAudioSourceReq;
import com.cisco.axl.api._11.GetFixedMohAudioSourceRes;
import com.cisco.axl.api._11.GetGatekeeperReq;
import com.cisco.axl.api._11.GetGatekeeperRes;
import com.cisco.axl.api._11.GetGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._11.GetGatewayEndpointAnalogAccessRes;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessBriRes;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessPriRes;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessT1Res;
import com.cisco.axl.api._11.GetGatewayReq;
import com.cisco.axl.api._11.GetGatewayRes;
import com.cisco.axl.api._11.GetGatewaySccpEndpointsReq;
import com.cisco.axl.api._11.GetGatewaySccpEndpointsRes;
import com.cisco.axl.api._11.GetGeoLocationFilterReq;
import com.cisco.axl.api._11.GetGeoLocationFilterRes;
import com.cisco.axl.api._11.GetGeoLocationPolicyReq;
import com.cisco.axl.api._11.GetGeoLocationPolicyRes;
import com.cisco.axl.api._11.GetGeoLocationReq;
import com.cisco.axl.api._11.GetGeoLocationRes;
import com.cisco.axl.api._11.GetH323GatewayReq;
import com.cisco.axl.api._11.GetH323GatewayRes;
import com.cisco.axl.api._11.GetH323PhoneReq;
import com.cisco.axl.api._11.GetH323PhoneRes;
import com.cisco.axl.api._11.GetH323TrunkReq;
import com.cisco.axl.api._11.GetH323TrunkRes;
import com.cisco.axl.api._11.GetHandoffConfigurationReq;
import com.cisco.axl.api._11.GetHandoffConfigurationRes;
import com.cisco.axl.api._11.GetHttpProfileReq;
import com.cisco.axl.api._11.GetHttpProfileRes;
import com.cisco.axl.api._11.GetHuntListReq;
import com.cisco.axl.api._11.GetHuntListRes;
import com.cisco.axl.api._11.GetHuntPilotReq;
import com.cisco.axl.api._11.GetHuntPilotRes;
import com.cisco.axl.api._11.GetIlsConfigReq;
import com.cisco.axl.api._11.GetIlsConfigRes;
import com.cisco.axl.api._11.GetImeClientReq;
import com.cisco.axl.api._11.GetImeClientRes;
import com.cisco.axl.api._11.GetImeE164TransformationReq;
import com.cisco.axl.api._11.GetImeE164TransformationRes;
import com.cisco.axl.api._11.GetImeEnrolledPatternGroupReq;
import com.cisco.axl.api._11.GetImeEnrolledPatternGroupRes;
import com.cisco.axl.api._11.GetImeEnrolledPatternReq;
import com.cisco.axl.api._11.GetImeEnrolledPatternRes;
import com.cisco.axl.api._11.GetImeExclusionNumberGroupReq;
import com.cisco.axl.api._11.GetImeExclusionNumberGroupRes;
import com.cisco.axl.api._11.GetImeExclusionNumberReq;
import com.cisco.axl.api._11.GetImeExclusionNumberRes;
import com.cisco.axl.api._11.GetImeFeatureConfigReq;
import com.cisco.axl.api._11.GetImeFeatureConfigRes;
import com.cisco.axl.api._11.GetImeFirewallReq;
import com.cisco.axl.api._11.GetImeFirewallRes;
import com.cisco.axl.api._11.GetImeLearnedRoutesReq;
import com.cisco.axl.api._11.GetImeLearnedRoutesRes;
import com.cisco.axl.api._11.GetImeRouteFilterElementReq;
import com.cisco.axl.api._11.GetImeRouteFilterElementRes;
import com.cisco.axl.api._11.GetImeRouteFilterGroupReq;
import com.cisco.axl.api._11.GetImeRouteFilterGroupRes;
import com.cisco.axl.api._11.GetImeServerReq;
import com.cisco.axl.api._11.GetImeServerRes;
import com.cisco.axl.api._11.GetImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._11.GetImportedDirectoryUriCatalogsRes;
import com.cisco.axl.api._11.GetInterClusterServiceProfileReq;
import com.cisco.axl.api._11.GetInterClusterServiceProfileRes;
import com.cisco.axl.api._11.GetInteractiveVoiceResponseReq;
import com.cisco.axl.api._11.GetInteractiveVoiceResponseRes;
import com.cisco.axl.api._11.GetIpPhoneServicesReq;
import com.cisco.axl.api._11.GetIpPhoneServicesRes;
import com.cisco.axl.api._11.GetIvrUserLocaleReq;
import com.cisco.axl.api._11.GetIvrUserLocaleRes;
import com.cisco.axl.api._11.GetLbmGroupReq;
import com.cisco.axl.api._11.GetLbmGroupRes;
import com.cisco.axl.api._11.GetLbmHubGroupReq;
import com.cisco.axl.api._11.GetLbmHubGroupRes;
import com.cisco.axl.api._11.GetLdapAuthenticationReq;
import com.cisco.axl.api._11.GetLdapAuthenticationRes;
import com.cisco.axl.api._11.GetLdapDirectoryReq;
import com.cisco.axl.api._11.GetLdapDirectoryRes;
import com.cisco.axl.api._11.GetLdapFilterReq;
import com.cisco.axl.api._11.GetLdapFilterRes;
import com.cisco.axl.api._11.GetLdapSyncCustomFieldReq;
import com.cisco.axl.api._11.GetLdapSyncCustomFieldRes;
import com.cisco.axl.api._11.GetLdapSyncStatusReq;
import com.cisco.axl.api._11.GetLdapSyncStatusRes;
import com.cisco.axl.api._11.GetLdapSystemReq;
import com.cisco.axl.api._11.GetLdapSystemRes;
import com.cisco.axl.api._11.GetLicensedUserReq;
import com.cisco.axl.api._11.GetLicensedUserRes;
import com.cisco.axl.api._11.GetLineGroupReq;
import com.cisco.axl.api._11.GetLineGroupRes;
import com.cisco.axl.api._11.GetLineOptionsReq;
import com.cisco.axl.api._11.GetLineOptionsRes;
import com.cisco.axl.api._11.GetLineReq;
import com.cisco.axl.api._11.GetLineRes;
import com.cisco.axl.api._11.GetLocalRouteGroupReq;
import com.cisco.axl.api._11.GetLocalRouteGroupRes;
import com.cisco.axl.api._11.GetLocationReq;
import com.cisco.axl.api._11.GetLocationRes;
import com.cisco.axl.api._11.GetMediaResourceGroupReq;
import com.cisco.axl.api._11.GetMediaResourceGroupRes;
import com.cisco.axl.api._11.GetMediaResourceListReq;
import com.cisco.axl.api._11.GetMediaResourceListRes;
import com.cisco.axl.api._11.GetMeetMeReq;
import com.cisco.axl.api._11.GetMeetMeRes;
import com.cisco.axl.api._11.GetMessageWaitingReq;
import com.cisco.axl.api._11.GetMessageWaitingRes;
import com.cisco.axl.api._11.GetMlppDomainReq;
import com.cisco.axl.api._11.GetMlppDomainRes;
import com.cisco.axl.api._11.GetMobileSmartClientProfileReq;
import com.cisco.axl.api._11.GetMobileSmartClientProfileRes;
import com.cisco.axl.api._11.GetMobileVoiceAccessReq;
import com.cisco.axl.api._11.GetMobileVoiceAccessRes;
import com.cisco.axl.api._11.GetMobilityProfileReq;
import com.cisco.axl.api._11.GetMobilityProfileRes;
import com.cisco.axl.api._11.GetMobilityReq;
import com.cisco.axl.api._11.GetMobilityRes;
import com.cisco.axl.api._11.GetMohAudioSourceReq;
import com.cisco.axl.api._11.GetMohAudioSourceRes;
import com.cisco.axl.api._11.GetMohServerReq;
import com.cisco.axl.api._11.GetMohServerRes;
import com.cisco.axl.api._11.GetMtpReq;
import com.cisco.axl.api._11.GetMtpRes;
import com.cisco.axl.api._11.GetNetworkAccessProfileReq;
import com.cisco.axl.api._11.GetNetworkAccessProfileRes;
import com.cisco.axl.api._11.GetNumDevicesReq;
import com.cisco.axl.api._11.GetNumDevicesResponse;
import com.cisco.axl.api._11.GetOSVersionReq;
import com.cisco.axl.api._11.GetOSVersionRes;
import com.cisco.axl.api._11.GetPageLayoutPreferencesReq;
import com.cisco.axl.api._11.GetPageLayoutPreferencesRes;
import com.cisco.axl.api._11.GetPhoneButtonTemplateReq;
import com.cisco.axl.api._11.GetPhoneButtonTemplateRes;
import com.cisco.axl.api._11.GetPhoneNtpReq;
import com.cisco.axl.api._11.GetPhoneNtpRes;
import com.cisco.axl.api._11.GetPhoneOptionsReq;
import com.cisco.axl.api._11.GetPhoneOptionsRes;
import com.cisco.axl.api._11.GetPhoneReq;
import com.cisco.axl.api._11.GetPhoneRes;
import com.cisco.axl.api._11.GetPhoneSecurityProfileReq;
import com.cisco.axl.api._11.GetPhoneSecurityProfileRes;
import com.cisco.axl.api._11.GetPhoneTypeDisplayInstanceReq;
import com.cisco.axl.api._11.GetPhoneTypeDisplayInstanceRes;
import com.cisco.axl.api._11.GetPhysicalLocationReq;
import com.cisco.axl.api._11.GetPhysicalLocationRes;
import com.cisco.axl.api._11.GetPresenceGroupReq;
import com.cisco.axl.api._11.GetPresenceGroupRes;
import com.cisco.axl.api._11.GetPresenceRedundancyGroupReq;
import com.cisco.axl.api._11.GetPresenceRedundancyGroupRes;
import com.cisco.axl.api._11.GetProcessNodeReq;
import com.cisco.axl.api._11.GetProcessNodeRes;
import com.cisco.axl.api._11.GetProcessNodeServiceReq;
import com.cisco.axl.api._11.GetProcessNodeServiceRes;
import com.cisco.axl.api._11.GetRecordingProfileReq;
import com.cisco.axl.api._11.GetRecordingProfileRes;
import com.cisco.axl.api._11.GetRegionReq;
import com.cisco.axl.api._11.GetRegionRes;
import com.cisco.axl.api._11.GetRemoteClusterReq;
import com.cisco.axl.api._11.GetRemoteClusterRes;
import com.cisco.axl.api._11.GetRemoteDestinationProfileReq;
import com.cisco.axl.api._11.GetRemoteDestinationProfileRes;
import com.cisco.axl.api._11.GetRemoteDestinationReq;
import com.cisco.axl.api._11.GetRemoteDestinationRes;
import com.cisco.axl.api._11.GetResourcePriorityNamespaceListReq;
import com.cisco.axl.api._11.GetResourcePriorityNamespaceListRes;
import com.cisco.axl.api._11.GetResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.GetResourcePriorityNamespaceRes;
import com.cisco.axl.api._11.GetRouteFilterReq;
import com.cisco.axl.api._11.GetRouteFilterRes;
import com.cisco.axl.api._11.GetRouteGroupReq;
import com.cisco.axl.api._11.GetRouteGroupRes;
import com.cisco.axl.api._11.GetRouteListReq;
import com.cisco.axl.api._11.GetRouteListRes;
import com.cisco.axl.api._11.GetRoutePartitionReq;
import com.cisco.axl.api._11.GetRoutePartitionRes;
import com.cisco.axl.api._11.GetRoutePatternReq;
import com.cisco.axl.api._11.GetRoutePatternRes;
import com.cisco.axl.api._11.GetSIPNormalizationScriptReq;
import com.cisco.axl.api._11.GetSIPNormalizationScriptRes;
import com.cisco.axl.api._11.GetSNMPCommunityStringReq;
import com.cisco.axl.api._11.GetSNMPCommunityStringRes;
import com.cisco.axl.api._11.GetSNMPMIB2ListReq;
import com.cisco.axl.api._11.GetSNMPMIB2ListRes;
import com.cisco.axl.api._11.GetSNMPUserReq;
import com.cisco.axl.api._11.GetSNMPUserRes;
import com.cisco.axl.api._11.GetSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._11.GetSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._11.GetSafForwarderReq;
import com.cisco.axl.api._11.GetSafForwarderRes;
import com.cisco.axl.api._11.GetSafSecurityProfileReq;
import com.cisco.axl.api._11.GetSafSecurityProfileRes;
import com.cisco.axl.api._11.GetSdpTransparencyProfileReq;
import com.cisco.axl.api._11.GetSdpTransparencyProfileRes;
import com.cisco.axl.api._11.GetSecureConfigReq;
import com.cisco.axl.api._11.GetSecureConfigRes;
import com.cisco.axl.api._11.GetServiceParameterReq;
import com.cisco.axl.api._11.GetServiceParameterRes;
import com.cisco.axl.api._11.GetServiceProfileReq;
import com.cisco.axl.api._11.GetServiceProfileRes;
import com.cisco.axl.api._11.GetSipDialRulesReq;
import com.cisco.axl.api._11.GetSipDialRulesRes;
import com.cisco.axl.api._11.GetSipProfileOptionsReq;
import com.cisco.axl.api._11.GetSipProfileOptionsRes;
import com.cisco.axl.api._11.GetSipProfileReq;
import com.cisco.axl.api._11.GetSipProfileRes;
import com.cisco.axl.api._11.GetSipRealmReq;
import com.cisco.axl.api._11.GetSipRealmRes;
import com.cisco.axl.api._11.GetSipRoutePatternReq;
import com.cisco.axl.api._11.GetSipRoutePatternRes;
import com.cisco.axl.api._11.GetSipTrunkReq;
import com.cisco.axl.api._11.GetSipTrunkRes;
import com.cisco.axl.api._11.GetSipTrunkSecurityProfileReq;
import com.cisco.axl.api._11.GetSipTrunkSecurityProfileRes;
import com.cisco.axl.api._11.GetSoftKeySetReq;
import com.cisco.axl.api._11.GetSoftKeySetRes;
import com.cisco.axl.api._11.GetSoftKeyTemplateReq;
import com.cisco.axl.api._11.GetSoftKeyTemplateRes;
import com.cisco.axl.api._11.GetSrstReq;
import com.cisco.axl.api._11.GetSrstRes;
import com.cisco.axl.api._11.GetSyslogConfigurationReq;
import com.cisco.axl.api._11.GetSyslogConfigurationRes;
import com.cisco.axl.api._11.GetTimePeriodReq;
import com.cisco.axl.api._11.GetTimePeriodRes;
import com.cisco.axl.api._11.GetTimeScheduleReq;
import com.cisco.axl.api._11.GetTimeScheduleRes;
import com.cisco.axl.api._11.GetTodAccessReq;
import com.cisco.axl.api._11.GetTodAccessRes;
import com.cisco.axl.api._11.GetTransPatternOptionsReq;
import com.cisco.axl.api._11.GetTransPatternOptionsRes;
import com.cisco.axl.api._11.GetTransPatternReq;
import com.cisco.axl.api._11.GetTransPatternRes;
import com.cisco.axl.api._11.GetTranscoderReq;
import com.cisco.axl.api._11.GetTranscoderRes;
import com.cisco.axl.api._11.GetTransformationProfileReq;
import com.cisco.axl.api._11.GetTransformationProfileRes;
import com.cisco.axl.api._11.GetTvsCertificateReq;
import com.cisco.axl.api._11.GetTvsCertificateRes;
import com.cisco.axl.api._11.GetUcServiceReq;
import com.cisco.axl.api._11.GetUcServiceRes;
import com.cisco.axl.api._11.GetUniversalDeviceTemplateReq;
import com.cisco.axl.api._11.GetUniversalDeviceTemplateRes;
import com.cisco.axl.api._11.GetUniversalLineTemplateReq;
import com.cisco.axl.api._11.GetUniversalLineTemplateRes;
import com.cisco.axl.api._11.GetUserGroupReq;
import com.cisco.axl.api._11.GetUserGroupRes;
import com.cisco.axl.api._11.GetUserProfileProvisionReq;
import com.cisco.axl.api._11.GetUserProfileProvisionRes;
import com.cisco.axl.api._11.GetUserReq;
import com.cisco.axl.api._11.GetUserRes;
import com.cisco.axl.api._11.GetVg224Req;
import com.cisco.axl.api._11.GetVg224Res;
import com.cisco.axl.api._11.GetVohServerReq;
import com.cisco.axl.api._11.GetVohServerRes;
import com.cisco.axl.api._11.GetVoiceMailPilotReq;
import com.cisco.axl.api._11.GetVoiceMailPilotRes;
import com.cisco.axl.api._11.GetVoiceMailPortReq;
import com.cisco.axl.api._11.GetVoiceMailPortRes;
import com.cisco.axl.api._11.GetVoiceMailProfileReq;
import com.cisco.axl.api._11.GetVoiceMailProfileRes;
import com.cisco.axl.api._11.GetVpnGatewayReq;
import com.cisco.axl.api._11.GetVpnGatewayRes;
import com.cisco.axl.api._11.GetVpnGroupReq;
import com.cisco.axl.api._11.GetVpnGroupRes;
import com.cisco.axl.api._11.GetVpnProfileReq;
import com.cisco.axl.api._11.GetVpnProfileRes;
import com.cisco.axl.api._11.GetWLANProfileReq;
import com.cisco.axl.api._11.GetWLANProfileRes;
import com.cisco.axl.api._11.GetWifiHotspotReq;
import com.cisco.axl.api._11.GetWifiHotspotRes;
import com.cisco.axl.api._11.GetWlanProfileGroupReq;
import com.cisco.axl.api._11.GetWlanProfileGroupRes;
import com.cisco.axl.api._11.ListAarGroupReq;
import com.cisco.axl.api._11.ListAarGroupRes;
import com.cisco.axl.api._11.ListAdvertisedPatternsReq;
import com.cisco.axl.api._11.ListAdvertisedPatternsRes;
import com.cisco.axl.api._11.ListAnnouncementReq;
import com.cisco.axl.api._11.ListAnnouncementRes;
import com.cisco.axl.api._11.ListAnnunciatorReq;
import com.cisco.axl.api._11.ListAnnunciatorRes;
import com.cisco.axl.api._11.ListAppUserReq;
import com.cisco.axl.api._11.ListAppUserRes;
import com.cisco.axl.api._11.ListApplicationDialRulesReq;
import com.cisco.axl.api._11.ListApplicationDialRulesRes;
import com.cisco.axl.api._11.ListApplicationServerReq;
import com.cisco.axl.api._11.ListApplicationServerRes;
import com.cisco.axl.api._11.ListApplicationUserCapfProfileReq;
import com.cisco.axl.api._11.ListApplicationUserCapfProfileRes;
import com.cisco.axl.api._11.ListAssignedPresenceServersReq;
import com.cisco.axl.api._11.ListAssignedPresenceServersRes;
import com.cisco.axl.api._11.ListAssignedPresenceUsersReq;
import com.cisco.axl.api._11.ListAssignedPresenceUsersRes;
import com.cisco.axl.api._11.ListAudioCodecPreferenceListReq;
import com.cisco.axl.api._11.ListAudioCodecPreferenceListRes;
import com.cisco.axl.api._11.ListBillingServerReq;
import com.cisco.axl.api._11.ListBillingServerRes;
import com.cisco.axl.api._11.ListBlockedLearnedPatternsReq;
import com.cisco.axl.api._11.ListBlockedLearnedPatternsRes;
import com.cisco.axl.api._11.ListCCAProfilesReq;
import com.cisco.axl.api._11.ListCCAProfilesRes;
import com.cisco.axl.api._11.ListCallManagerGroupReq;
import com.cisco.axl.api._11.ListCallManagerGroupRes;
import com.cisco.axl.api._11.ListCallManagerReq;
import com.cisco.axl.api._11.ListCallManagerRes;
import com.cisco.axl.api._11.ListCallParkReq;
import com.cisco.axl.api._11.ListCallParkRes;
import com.cisco.axl.api._11.ListCallPickupGroupReq;
import com.cisco.axl.api._11.ListCallPickupGroupRes;
import com.cisco.axl.api._11.ListCalledPartyTracingReq;
import com.cisco.axl.api._11.ListCalledPartyTracingRes;
import com.cisco.axl.api._11.ListCalledPartyTransformationPatternReq;
import com.cisco.axl.api._11.ListCalledPartyTransformationPatternRes;
import com.cisco.axl.api._11.ListCallerFilterListReq;
import com.cisco.axl.api._11.ListCallerFilterListRes;
import com.cisco.axl.api._11.ListCallingPartyTransformationPatternReq;
import com.cisco.axl.api._11.ListCallingPartyTransformationPatternRes;
import com.cisco.axl.api._11.ListCcdAdvertisingServiceReq;
import com.cisco.axl.api._11.ListCcdAdvertisingServiceRes;
import com.cisco.axl.api._11.ListCcdHostedDNGroupReq;
import com.cisco.axl.api._11.ListCcdHostedDNGroupRes;
import com.cisco.axl.api._11.ListCcdHostedDNReq;
import com.cisco.axl.api._11.ListCcdHostedDNRes;
import com.cisco.axl.api._11.ListChangeReq;
import com.cisco.axl.api._11.ListChangeRes;
import com.cisco.axl.api._11.ListCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._11.ListCiscoCatalyst600024PortFXSGatewayRes;
import com.cisco.axl.api._11.ListCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._11.ListCiscoCatalyst6000E1VoIPGatewayRes;
import com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayPriRes;
import com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayT1Res;
import com.cisco.axl.api._11.ListCmcInfoReq;
import com.cisco.axl.api._11.ListCmcInfoRes;
import com.cisco.axl.api._11.ListCommonDeviceConfigReq;
import com.cisco.axl.api._11.ListCommonDeviceConfigRes;
import com.cisco.axl.api._11.ListCommonPhoneConfigReq;
import com.cisco.axl.api._11.ListCommonPhoneConfigRes;
import com.cisco.axl.api._11.ListConferenceBridgeReq;
import com.cisco.axl.api._11.ListConferenceBridgeRes;
import com.cisco.axl.api._11.ListConferenceNowReq;
import com.cisco.axl.api._11.ListConferenceNowRes;
import com.cisco.axl.api._11.ListCredentialPolicyReq;
import com.cisco.axl.api._11.ListCredentialPolicyRes;
import com.cisco.axl.api._11.ListCssReq;
import com.cisco.axl.api._11.ListCssRes;
import com.cisco.axl.api._11.ListCtiRoutePointReq;
import com.cisco.axl.api._11.ListCtiRoutePointRes;
import com.cisco.axl.api._11.ListCumaServerSecurityProfileReq;
import com.cisco.axl.api._11.ListCumaServerSecurityProfileRes;
import com.cisco.axl.api._11.ListCustomUserFieldReq;
import com.cisco.axl.api._11.ListCustomUserFieldRes;
import com.cisco.axl.api._11.ListDateTimeGroupReq;
import com.cisco.axl.api._11.ListDateTimeGroupRes;
import com.cisco.axl.api._11.ListDdiReq;
import com.cisco.axl.api._11.ListDdiRes;
import com.cisco.axl.api._11.ListDefaultDeviceProfileReq;
import com.cisco.axl.api._11.ListDefaultDeviceProfileRes;
import com.cisco.axl.api._11.ListDeviceMobilityGroupReq;
import com.cisco.axl.api._11.ListDeviceMobilityGroupRes;
import com.cisco.axl.api._11.ListDeviceMobilityReq;
import com.cisco.axl.api._11.ListDeviceMobilityRes;
import com.cisco.axl.api._11.ListDevicePoolReq;
import com.cisco.axl.api._11.ListDevicePoolRes;
import com.cisco.axl.api._11.ListDeviceProfileReq;
import com.cisco.axl.api._11.ListDeviceProfileRes;
import com.cisco.axl.api._11.ListDhcpServerReq;
import com.cisco.axl.api._11.ListDhcpServerRes;
import com.cisco.axl.api._11.ListDhcpSubnetReq;
import com.cisco.axl.api._11.ListDhcpSubnetRes;
import com.cisco.axl.api._11.ListDialPlanReq;
import com.cisco.axl.api._11.ListDialPlanRes;
import com.cisco.axl.api._11.ListDialPlanTagReq;
import com.cisco.axl.api._11.ListDialPlanTagRes;
import com.cisco.axl.api._11.ListDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._11.ListDirNumberAliasLookupandSyncRes;
import com.cisco.axl.api._11.ListDirectedCallParkReq;
import com.cisco.axl.api._11.ListDirectedCallParkRes;
import com.cisco.axl.api._11.ListDirectoryLookupDialRulesReq;
import com.cisco.axl.api._11.ListDirectoryLookupDialRulesRes;
import com.cisco.axl.api._11.ListElinGroupReq;
import com.cisco.axl.api._11.ListElinGroupRes;
import com.cisco.axl.api._11.ListEndUserCapfProfileReq;
import com.cisco.axl.api._11.ListEndUserCapfProfileRes;
import com.cisco.axl.api._11.ListEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._11.ListEnterpriseFeatureAccessConfigurationRes;
import com.cisco.axl.api._11.ListExternalCallControlProfileReq;
import com.cisco.axl.api._11.ListExternalCallControlProfileRes;
import com.cisco.axl.api._11.ListFacInfoReq;
import com.cisco.axl.api._11.ListFacInfoRes;
import com.cisco.axl.api._11.ListFallbackProfileReq;
import com.cisco.axl.api._11.ListFallbackProfileRes;
import com.cisco.axl.api._11.ListFeatureControlPolicyReq;
import com.cisco.axl.api._11.ListFeatureControlPolicyRes;
import com.cisco.axl.api._11.ListFeatureGroupTemplateReq;
import com.cisco.axl.api._11.ListFeatureGroupTemplateRes;
import com.cisco.axl.api._11.ListGatekeeperReq;
import com.cisco.axl.api._11.ListGatekeeperRes;
import com.cisco.axl.api._11.ListGatewayReq;
import com.cisco.axl.api._11.ListGatewayRes;
import com.cisco.axl.api._11.ListGeoLocationFilterReq;
import com.cisco.axl.api._11.ListGeoLocationFilterRes;
import com.cisco.axl.api._11.ListGeoLocationPolicyReq;
import com.cisco.axl.api._11.ListGeoLocationPolicyRes;
import com.cisco.axl.api._11.ListGeoLocationReq;
import com.cisco.axl.api._11.ListGeoLocationRes;
import com.cisco.axl.api._11.ListH323GatewayReq;
import com.cisco.axl.api._11.ListH323GatewayRes;
import com.cisco.axl.api._11.ListH323PhoneReq;
import com.cisco.axl.api._11.ListH323PhoneRes;
import com.cisco.axl.api._11.ListH323TrunkReq;
import com.cisco.axl.api._11.ListH323TrunkRes;
import com.cisco.axl.api._11.ListHuntListReq;
import com.cisco.axl.api._11.ListHuntListRes;
import com.cisco.axl.api._11.ListHuntPilotReq;
import com.cisco.axl.api._11.ListHuntPilotRes;
import com.cisco.axl.api._11.ListImeClientReq;
import com.cisco.axl.api._11.ListImeClientRes;
import com.cisco.axl.api._11.ListImeE164TransformationReq;
import com.cisco.axl.api._11.ListImeE164TransformationRes;
import com.cisco.axl.api._11.ListImeEnrolledPatternGroupReq;
import com.cisco.axl.api._11.ListImeEnrolledPatternGroupRes;
import com.cisco.axl.api._11.ListImeEnrolledPatternReq;
import com.cisco.axl.api._11.ListImeEnrolledPatternRes;
import com.cisco.axl.api._11.ListImeExclusionNumberGroupReq;
import com.cisco.axl.api._11.ListImeExclusionNumberGroupRes;
import com.cisco.axl.api._11.ListImeExclusionNumberReq;
import com.cisco.axl.api._11.ListImeExclusionNumberRes;
import com.cisco.axl.api._11.ListImeFirewallReq;
import com.cisco.axl.api._11.ListImeFirewallRes;
import com.cisco.axl.api._11.ListImeRouteFilterElementReq;
import com.cisco.axl.api._11.ListImeRouteFilterElementRes;
import com.cisco.axl.api._11.ListImeRouteFilterGroupReq;
import com.cisco.axl.api._11.ListImeRouteFilterGroupRes;
import com.cisco.axl.api._11.ListImeServerReq;
import com.cisco.axl.api._11.ListImeServerRes;
import com.cisco.axl.api._11.ListImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._11.ListImportedDirectoryUriCatalogsRes;
import com.cisco.axl.api._11.ListInteractiveVoiceResponseReq;
import com.cisco.axl.api._11.ListInteractiveVoiceResponseRes;
import com.cisco.axl.api._11.ListIpPhoneServicesReq;
import com.cisco.axl.api._11.ListIpPhoneServicesRes;
import com.cisco.axl.api._11.ListIvrUserLocaleReq;
import com.cisco.axl.api._11.ListIvrUserLocaleRes;
import com.cisco.axl.api._11.ListLbmGroupReq;
import com.cisco.axl.api._11.ListLbmGroupRes;
import com.cisco.axl.api._11.ListLbmHubGroupReq;
import com.cisco.axl.api._11.ListLbmHubGroupRes;
import com.cisco.axl.api._11.ListLdapDirectoryReq;
import com.cisco.axl.api._11.ListLdapDirectoryRes;
import com.cisco.axl.api._11.ListLdapFilterReq;
import com.cisco.axl.api._11.ListLdapFilterRes;
import com.cisco.axl.api._11.ListLdapSyncCustomFieldReq;
import com.cisco.axl.api._11.ListLdapSyncCustomFieldRes;
import com.cisco.axl.api._11.ListLicensedUserReq;
import com.cisco.axl.api._11.ListLicensedUserRes;
import com.cisco.axl.api._11.ListLineGroupReq;
import com.cisco.axl.api._11.ListLineGroupRes;
import com.cisco.axl.api._11.ListLineReq;
import com.cisco.axl.api._11.ListLineRes;
import com.cisco.axl.api._11.ListLocalRouteGroupReq;
import com.cisco.axl.api._11.ListLocalRouteGroupRes;
import com.cisco.axl.api._11.ListLocationReq;
import com.cisco.axl.api._11.ListLocationRes;
import com.cisco.axl.api._11.ListMediaResourceGroupReq;
import com.cisco.axl.api._11.ListMediaResourceGroupRes;
import com.cisco.axl.api._11.ListMediaResourceListReq;
import com.cisco.axl.api._11.ListMediaResourceListRes;
import com.cisco.axl.api._11.ListMeetMeReq;
import com.cisco.axl.api._11.ListMeetMeRes;
import com.cisco.axl.api._11.ListMessageWaitingReq;
import com.cisco.axl.api._11.ListMessageWaitingRes;
import com.cisco.axl.api._11.ListMlppDomainReq;
import com.cisco.axl.api._11.ListMlppDomainRes;
import com.cisco.axl.api._11.ListMobileSmartClientProfileReq;
import com.cisco.axl.api._11.ListMobileSmartClientProfileRes;
import com.cisco.axl.api._11.ListMobilityProfileReq;
import com.cisco.axl.api._11.ListMobilityProfileRes;
import com.cisco.axl.api._11.ListMohAudioSourceReq;
import com.cisco.axl.api._11.ListMohAudioSourceRes;
import com.cisco.axl.api._11.ListMohServerReq;
import com.cisco.axl.api._11.ListMohServerRes;
import com.cisco.axl.api._11.ListMtpReq;
import com.cisco.axl.api._11.ListMtpRes;
import com.cisco.axl.api._11.ListNetworkAccessProfileReq;
import com.cisco.axl.api._11.ListNetworkAccessProfileRes;
import com.cisco.axl.api._11.ListPhoneButtonTemplateReq;
import com.cisco.axl.api._11.ListPhoneButtonTemplateRes;
import com.cisco.axl.api._11.ListPhoneNtpReq;
import com.cisco.axl.api._11.ListPhoneNtpRes;
import com.cisco.axl.api._11.ListPhoneReq;
import com.cisco.axl.api._11.ListPhoneRes;
import com.cisco.axl.api._11.ListPhoneSecurityProfileReq;
import com.cisco.axl.api._11.ListPhoneSecurityProfileRes;
import com.cisco.axl.api._11.ListPhysicalLocationReq;
import com.cisco.axl.api._11.ListPhysicalLocationRes;
import com.cisco.axl.api._11.ListPresenceGroupReq;
import com.cisco.axl.api._11.ListPresenceGroupRes;
import com.cisco.axl.api._11.ListPresenceRedundancyGroupReq;
import com.cisco.axl.api._11.ListPresenceRedundancyGroupRes;
import com.cisco.axl.api._11.ListProcessNodeReq;
import com.cisco.axl.api._11.ListProcessNodeRes;
import com.cisco.axl.api._11.ListProcessNodeServiceReq;
import com.cisco.axl.api._11.ListProcessNodeServiceRes;
import com.cisco.axl.api._11.ListRecordingProfileReq;
import com.cisco.axl.api._11.ListRecordingProfileRes;
import com.cisco.axl.api._11.ListRegionReq;
import com.cisco.axl.api._11.ListRegionRes;
import com.cisco.axl.api._11.ListRemoteClusterReq;
import com.cisco.axl.api._11.ListRemoteClusterRes;
import com.cisco.axl.api._11.ListRemoteDestinationProfileReq;
import com.cisco.axl.api._11.ListRemoteDestinationProfileRes;
import com.cisco.axl.api._11.ListRemoteDestinationReq;
import com.cisco.axl.api._11.ListRemoteDestinationRes;
import com.cisco.axl.api._11.ListResourcePriorityNamespaceListReq;
import com.cisco.axl.api._11.ListResourcePriorityNamespaceListRes;
import com.cisco.axl.api._11.ListResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.ListResourcePriorityNamespaceRes;
import com.cisco.axl.api._11.ListRouteFilterReq;
import com.cisco.axl.api._11.ListRouteFilterRes;
import com.cisco.axl.api._11.ListRouteGroupReq;
import com.cisco.axl.api._11.ListRouteGroupRes;
import com.cisco.axl.api._11.ListRouteListReq;
import com.cisco.axl.api._11.ListRouteListRes;
import com.cisco.axl.api._11.ListRoutePartitionReq;
import com.cisco.axl.api._11.ListRoutePartitionRes;
import com.cisco.axl.api._11.ListRoutePatternReq;
import com.cisco.axl.api._11.ListRoutePatternRes;
import com.cisco.axl.api._11.ListRoutePlanReq;
import com.cisco.axl.api._11.ListRoutePlanRes;
import com.cisco.axl.api._11.ListSIPNormalizationScriptReq;
import com.cisco.axl.api._11.ListSIPNormalizationScriptRes;
import com.cisco.axl.api._11.ListSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._11.ListSafCcdPurgeBlockLearnedRoutesRes;
import com.cisco.axl.api._11.ListSafForwarderReq;
import com.cisco.axl.api._11.ListSafForwarderRes;
import com.cisco.axl.api._11.ListSafSecurityProfileReq;
import com.cisco.axl.api._11.ListSafSecurityProfileRes;
import com.cisco.axl.api._11.ListSdpTransparencyProfileReq;
import com.cisco.axl.api._11.ListSdpTransparencyProfileRes;
import com.cisco.axl.api._11.ListServiceParameterReq;
import com.cisco.axl.api._11.ListServiceParameterRes;
import com.cisco.axl.api._11.ListServiceProfileReq;
import com.cisco.axl.api._11.ListServiceProfileRes;
import com.cisco.axl.api._11.ListSipDialRulesReq;
import com.cisco.axl.api._11.ListSipDialRulesRes;
import com.cisco.axl.api._11.ListSipProfileReq;
import com.cisco.axl.api._11.ListSipProfileRes;
import com.cisco.axl.api._11.ListSipRealmReq;
import com.cisco.axl.api._11.ListSipRealmRes;
import com.cisco.axl.api._11.ListSipRoutePatternReq;
import com.cisco.axl.api._11.ListSipRoutePatternRes;
import com.cisco.axl.api._11.ListSipTrunkReq;
import com.cisco.axl.api._11.ListSipTrunkRes;
import com.cisco.axl.api._11.ListSipTrunkSecurityProfileReq;
import com.cisco.axl.api._11.ListSipTrunkSecurityProfileRes;
import com.cisco.axl.api._11.ListSoftKeyTemplateReq;
import com.cisco.axl.api._11.ListSoftKeyTemplateRes;
import com.cisco.axl.api._11.ListSrstReq;
import com.cisco.axl.api._11.ListSrstRes;
import com.cisco.axl.api._11.ListTimePeriodReq;
import com.cisco.axl.api._11.ListTimePeriodRes;
import com.cisco.axl.api._11.ListTimeScheduleReq;
import com.cisco.axl.api._11.ListTimeScheduleRes;
import com.cisco.axl.api._11.ListTodAccessReq;
import com.cisco.axl.api._11.ListTodAccessRes;
import com.cisco.axl.api._11.ListTransPatternReq;
import com.cisco.axl.api._11.ListTransPatternRes;
import com.cisco.axl.api._11.ListTranscoderReq;
import com.cisco.axl.api._11.ListTranscoderRes;
import com.cisco.axl.api._11.ListTransformationProfileReq;
import com.cisco.axl.api._11.ListTransformationProfileRes;
import com.cisco.axl.api._11.ListTvsCertificateReq;
import com.cisco.axl.api._11.ListTvsCertificateRes;
import com.cisco.axl.api._11.ListUcServiceReq;
import com.cisco.axl.api._11.ListUcServiceRes;
import com.cisco.axl.api._11.ListUnassignedDeviceReq;
import com.cisco.axl.api._11.ListUnassignedDeviceRes;
import com.cisco.axl.api._11.ListUnassignedPresenceServersReq;
import com.cisco.axl.api._11.ListUnassignedPresenceServersRes;
import com.cisco.axl.api._11.ListUnassignedPresenceUsersReq;
import com.cisco.axl.api._11.ListUnassignedPresenceUsersRes;
import com.cisco.axl.api._11.ListUniversalDeviceTemplateReq;
import com.cisco.axl.api._11.ListUniversalDeviceTemplateRes;
import com.cisco.axl.api._11.ListUniversalLineTemplateReq;
import com.cisco.axl.api._11.ListUniversalLineTemplateRes;
import com.cisco.axl.api._11.ListUserGroupReq;
import com.cisco.axl.api._11.ListUserGroupRes;
import com.cisco.axl.api._11.ListUserProfileProvisionReq;
import com.cisco.axl.api._11.ListUserProfileProvisionRes;
import com.cisco.axl.api._11.ListUserReq;
import com.cisco.axl.api._11.ListUserRes;
import com.cisco.axl.api._11.ListVohServerReq;
import com.cisco.axl.api._11.ListVohServerRes;
import com.cisco.axl.api._11.ListVoiceMailPilotReq;
import com.cisco.axl.api._11.ListVoiceMailPilotRes;
import com.cisco.axl.api._11.ListVoiceMailPortReq;
import com.cisco.axl.api._11.ListVoiceMailPortRes;
import com.cisco.axl.api._11.ListVoiceMailProfileReq;
import com.cisco.axl.api._11.ListVoiceMailProfileRes;
import com.cisco.axl.api._11.ListVpnGatewayReq;
import com.cisco.axl.api._11.ListVpnGatewayRes;
import com.cisco.axl.api._11.ListVpnGroupReq;
import com.cisco.axl.api._11.ListVpnGroupRes;
import com.cisco.axl.api._11.ListVpnProfileReq;
import com.cisco.axl.api._11.ListVpnProfileRes;
import com.cisco.axl.api._11.ListWLANProfileReq;
import com.cisco.axl.api._11.ListWLANProfileRes;
import com.cisco.axl.api._11.ListWifiHotspotReq;
import com.cisco.axl.api._11.ListWifiHotspotRes;
import com.cisco.axl.api._11.ListWlanProfileGroupReq;
import com.cisco.axl.api._11.ListWlanProfileGroupRes;
import com.cisco.axl.api._11.NameAndGUIDRequest;
import com.cisco.axl.api._11.ObjectFactory;
import com.cisco.axl.api._11.RemoveAdvertisedPatternsReq;
import com.cisco.axl.api._11.RemoveAppServerInfoReq;
import com.cisco.axl.api._11.RemoveAppUserReq;
import com.cisco.axl.api._11.RemoveApplicationServerReq;
import com.cisco.axl.api._11.RemoveApplicationToSoftkeyTemplateReq;
import com.cisco.axl.api._11.RemoveApplicationUserCapfProfileReq;
import com.cisco.axl.api._11.RemoveBillingServerReq;
import com.cisco.axl.api._11.RemoveBlockedLearnedPatternsReq;
import com.cisco.axl.api._11.RemoveCCAProfilesReq;
import com.cisco.axl.api._11.RemoveCallParkReq;
import com.cisco.axl.api._11.RemoveCallPickupGroupReq;
import com.cisco.axl.api._11.RemoveCalledPartyTracingReq;
import com.cisco.axl.api._11.RemoveCalledPartyTransformationPatternReq;
import com.cisco.axl.api._11.RemoveCallingPartyTransformationPatternReq;
import com.cisco.axl.api._11.RemoveCcdHostedDNReq;
import com.cisco.axl.api._11.RemoveCmcInfoReq;
import com.cisco.axl.api._11.RemoveConferenceNowReq;
import com.cisco.axl.api._11.RemoveCustomUserFieldReq;
import com.cisco.axl.api._11.RemoveDhcpServerReq;
import com.cisco.axl.api._11.RemoveDhcpSubnetReq;
import com.cisco.axl.api._11.RemoveDirectedCallParkReq;
import com.cisco.axl.api._11.RemoveEndUserCapfProfileReq;
import com.cisco.axl.api._11.RemoveEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._11.RemoveGatewayReq;
import com.cisco.axl.api._11.RemoveGatewaySubunitsReq;
import com.cisco.axl.api._11.RemoveHandoffConfigurationReq;
import com.cisco.axl.api._11.RemoveHuntPilotReq;
import com.cisco.axl.api._11.RemoveImeEnrolledPatternReq;
import com.cisco.axl.api._11.RemoveImeExclusionNumberReq;
import com.cisco.axl.api._11.RemoveImeLearnedRoutesReq;
import com.cisco.axl.api._11.RemoveIpPhoneServicesReq;
import com.cisco.axl.api._11.RemoveIvrUserLocaleReq;
import com.cisco.axl.api._11.RemoveLdapSyncCustomFieldReq;
import com.cisco.axl.api._11.RemoveLineReq;
import com.cisco.axl.api._11.RemoveLocalRouteGroupReq;
import com.cisco.axl.api._11.RemoveMeetMeReq;
import com.cisco.axl.api._11.RemoveMessageWaitingReq;
import com.cisco.axl.api._11.RemoveMlppDomainReq;
import com.cisco.axl.api._11.RemoveMobileVoiceAccessReq;
import com.cisco.axl.api._11.RemoveMohAudioSourceReq;
import com.cisco.axl.api._11.RemovePhoneNtpReq;
import com.cisco.axl.api._11.RemoveRemoteClusterReq;
import com.cisco.axl.api._11.RemoveRemoteDestinationReq;
import com.cisco.axl.api._11.RemoveResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.RemoveRoutePatternReq;
import com.cisco.axl.api._11.RemoveSNMPCommunityStringReq;
import com.cisco.axl.api._11.RemoveSNMPCommunityStringRes;
import com.cisco.axl.api._11.RemoveSNMPUserReq;
import com.cisco.axl.api._11.RemoveSNMPUserRes;
import com.cisco.axl.api._11.RemoveSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._11.RemoveSipRealmReq;
import com.cisco.axl.api._11.RemoveSipRoutePatternReq;
import com.cisco.axl.api._11.RemoveTransPatternReq;
import com.cisco.axl.api._11.RemoveUnitsToGatewayReq;
import com.cisco.axl.api._11.RemoveUserReq;
import com.cisco.axl.api._11.RemoveVg224Req;
import com.cisco.axl.api._11.RemoveVoiceMailPilotReq;
import com.cisco.axl.api._11.ResetDirectedCallParkReq;
import com.cisco.axl.api._11.ResetGatewayReq;
import com.cisco.axl.api._11.ResetLineReq;
import com.cisco.axl.api._11.ResetResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.RestartLineReq;
import com.cisco.axl.api._11.RestartResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.StandardResponse;
import com.cisco.axl.api._11.UnassignPresenceUserReq;
import com.cisco.axl.api._11.UpdateAarGroupMatrixReq;
import com.cisco.axl.api._11.UpdateAarGroupReq;
import com.cisco.axl.api._11.UpdateAdvertisedPatternsReq;
import com.cisco.axl.api._11.UpdateAnnouncementReq;
import com.cisco.axl.api._11.UpdateAnnunciatorReq;
import com.cisco.axl.api._11.UpdateAppServerInfoReq;
import com.cisco.axl.api._11.UpdateAppUserReq;
import com.cisco.axl.api._11.UpdateApplicationDialRulesReq;
import com.cisco.axl.api._11.UpdateApplicationServerReq;
import com.cisco.axl.api._11.UpdateApplicationUserCapfProfileReq;
import com.cisco.axl.api._11.UpdateAudioCodecPreferenceListReq;
import com.cisco.axl.api._11.UpdateBillingServerReq;
import com.cisco.axl.api._11.UpdateBlockedLearnedPatternsReq;
import com.cisco.axl.api._11.UpdateCCAProfilesReq;
import com.cisco.axl.api._11.UpdateCallManagerGroupReq;
import com.cisco.axl.api._11.UpdateCallManagerReq;
import com.cisco.axl.api._11.UpdateCallParkReq;
import com.cisco.axl.api._11.UpdateCallPickupGroupReq;
import com.cisco.axl.api._11.UpdateCalledPartyTransformationPatternReq;
import com.cisco.axl.api._11.UpdateCallerFilterListReq;
import com.cisco.axl.api._11.UpdateCallingPartyTransformationPatternReq;
import com.cisco.axl.api._11.UpdateCcdAdvertisingServiceReq;
import com.cisco.axl.api._11.UpdateCcdFeatureConfigReq;
import com.cisco.axl.api._11.UpdateCcdFeatureConfigRes;
import com.cisco.axl.api._11.UpdateCcdHostedDNGroupReq;
import com.cisco.axl.api._11.UpdateCcdHostedDNReq;
import com.cisco.axl.api._11.UpdateCcdRequestingServiceReq;
import com.cisco.axl.api._11.UpdateCiscoCatalyst600024PortFXSGatewayReq;
import com.cisco.axl.api._11.UpdateCiscoCatalyst6000E1VoIPGatewayReq;
import com.cisco.axl.api._11.UpdateCiscoCatalyst6000T1VoIPGatewayPriReq;
import com.cisco.axl.api._11.UpdateCiscoCatalyst6000T1VoIPGatewayT1Req;
import com.cisco.axl.api._11.UpdateCmcInfoReq;
import com.cisco.axl.api._11.UpdateCommonDeviceConfigReq;
import com.cisco.axl.api._11.UpdateCommonPhoneConfigReq;
import com.cisco.axl.api._11.UpdateConferenceBridgeReq;
import com.cisco.axl.api._11.UpdateConferenceNowReq;
import com.cisco.axl.api._11.UpdateCredentialPolicyDefaultReq;
import com.cisco.axl.api._11.UpdateCredentialPolicyReq;
import com.cisco.axl.api._11.UpdateCssReq;
import com.cisco.axl.api._11.UpdateCtiRoutePointReq;
import com.cisco.axl.api._11.UpdateCumaServerSecurityProfileReq;
import com.cisco.axl.api._11.UpdateCustomUserFieldReq;
import com.cisco.axl.api._11.UpdateDateTimeGroupReq;
import com.cisco.axl.api._11.UpdateDefaultDeviceProfileReq;
import com.cisco.axl.api._11.UpdateDeviceMobilityGroupReq;
import com.cisco.axl.api._11.UpdateDeviceMobilityReq;
import com.cisco.axl.api._11.UpdateDevicePoolReq;
import com.cisco.axl.api._11.UpdateDeviceProfileReq;
import com.cisco.axl.api._11.UpdateDhcpServerReq;
import com.cisco.axl.api._11.UpdateDhcpSubnetReq;
import com.cisco.axl.api._11.UpdateDirNumberAliasLookupandSyncReq;
import com.cisco.axl.api._11.UpdateDirectedCallParkReq;
import com.cisco.axl.api._11.UpdateDirectoryLookupDialRulesReq;
import com.cisco.axl.api._11.UpdateElinGroupReq;
import com.cisco.axl.api._11.UpdateEmccFeatureConfigReq;
import com.cisco.axl.api._11.UpdateEndUserCapfProfileReq;
import com.cisco.axl.api._11.UpdateEnterpriseFeatureAccessConfigurationReq;
import com.cisco.axl.api._11.UpdateEnterprisePhoneConfigReq;
import com.cisco.axl.api._11.UpdateExternalCallControlProfileReq;
import com.cisco.axl.api._11.UpdateFacInfoReq;
import com.cisco.axl.api._11.UpdateFallbackFeatureConfigReq;
import com.cisco.axl.api._11.UpdateFallbackProfileReq;
import com.cisco.axl.api._11.UpdateFeatureControlPolicyReq;
import com.cisco.axl.api._11.UpdateFeatureGroupTemplateReq;
import com.cisco.axl.api._11.UpdateFixedMohAudioSourceReq;
import com.cisco.axl.api._11.UpdateGatekeeperReq;
import com.cisco.axl.api._11.UpdateGatewayEndpointAnalogAccessReq;
import com.cisco.axl.api._11.UpdateGatewayEndpointDigitalAccessBriReq;
import com.cisco.axl.api._11.UpdateGatewayEndpointDigitalAccessPriReq;
import com.cisco.axl.api._11.UpdateGatewayEndpointDigitalAccessT1Req;
import com.cisco.axl.api._11.UpdateGatewayReq;
import com.cisco.axl.api._11.UpdateGatewaySccpEndpointsReq;
import com.cisco.axl.api._11.UpdateGeoLocationFilterReq;
import com.cisco.axl.api._11.UpdateGeoLocationPolicyReq;
import com.cisco.axl.api._11.UpdateGeoLocationReq;
import com.cisco.axl.api._11.UpdateH323GatewayReq;
import com.cisco.axl.api._11.UpdateH323PhoneReq;
import com.cisco.axl.api._11.UpdateH323TrunkReq;
import com.cisco.axl.api._11.UpdateHandoffConfigurationReq;
import com.cisco.axl.api._11.UpdateHttpProfileReq;
import com.cisco.axl.api._11.UpdateHuntListReq;
import com.cisco.axl.api._11.UpdateHuntPilotReq;
import com.cisco.axl.api._11.UpdateIlsConfigReq;
import com.cisco.axl.api._11.UpdateImeClientReq;
import com.cisco.axl.api._11.UpdateImeE164TransformationReq;
import com.cisco.axl.api._11.UpdateImeEnrolledPatternGroupReq;
import com.cisco.axl.api._11.UpdateImeEnrolledPatternReq;
import com.cisco.axl.api._11.UpdateImeExclusionNumberGroupReq;
import com.cisco.axl.api._11.UpdateImeExclusionNumberReq;
import com.cisco.axl.api._11.UpdateImeFeatureConfigReq;
import com.cisco.axl.api._11.UpdateImeFirewallReq;
import com.cisco.axl.api._11.UpdateImeLearnedRoutesReq;
import com.cisco.axl.api._11.UpdateImeRouteFilterElementReq;
import com.cisco.axl.api._11.UpdateImeRouteFilterGroupReq;
import com.cisco.axl.api._11.UpdateImeServerReq;
import com.cisco.axl.api._11.UpdateImportedDirectoryUriCatalogsReq;
import com.cisco.axl.api._11.UpdateInterClusterDirectoryUriReq;
import com.cisco.axl.api._11.UpdateInterClusterServiceProfileReq;
import com.cisco.axl.api._11.UpdateInteractiveVoiceResponseReq;
import com.cisco.axl.api._11.UpdateIpPhoneServicesReq;
import com.cisco.axl.api._11.UpdateIvrUserLocaleReq;
import com.cisco.axl.api._11.UpdateLbmGroupReq;
import com.cisco.axl.api._11.UpdateLbmHubGroupReq;
import com.cisco.axl.api._11.UpdateLdapAuthenticationReq;
import com.cisco.axl.api._11.UpdateLdapDirectoryReq;
import com.cisco.axl.api._11.UpdateLdapFilterReq;
import com.cisco.axl.api._11.UpdateLdapSyncCustomFieldReq;
import com.cisco.axl.api._11.UpdateLdapSystemReq;
import com.cisco.axl.api._11.UpdateLineGroupReq;
import com.cisco.axl.api._11.UpdateLineReq;
import com.cisco.axl.api._11.UpdateLocalRouteGroupReq;
import com.cisco.axl.api._11.UpdateLocationReq;
import com.cisco.axl.api._11.UpdateMediaResourceGroupReq;
import com.cisco.axl.api._11.UpdateMediaResourceListReq;
import com.cisco.axl.api._11.UpdateMeetMeReq;
import com.cisco.axl.api._11.UpdateMessageWaitingReq;
import com.cisco.axl.api._11.UpdateMlppDomainReq;
import com.cisco.axl.api._11.UpdateMobileVoiceAccessReq;
import com.cisco.axl.api._11.UpdateMobilityProfileReq;
import com.cisco.axl.api._11.UpdateMobilityReq;
import com.cisco.axl.api._11.UpdateMohAudioSourceReq;
import com.cisco.axl.api._11.UpdateMohServerReq;
import com.cisco.axl.api._11.UpdateMtpReq;
import com.cisco.axl.api._11.UpdateNetworkAccessProfileReq;
import com.cisco.axl.api._11.UpdatePageLayoutPreferencesReq;
import com.cisco.axl.api._11.UpdatePhoneButtonTemplateReq;
import com.cisco.axl.api._11.UpdatePhoneNtpReq;
import com.cisco.axl.api._11.UpdatePhoneReq;
import com.cisco.axl.api._11.UpdatePhoneSecurityProfileReq;
import com.cisco.axl.api._11.UpdatePhysicalLocationReq;
import com.cisco.axl.api._11.UpdatePresenceGroupReq;
import com.cisco.axl.api._11.UpdatePresenceRedundancyGroupReq;
import com.cisco.axl.api._11.UpdateProcessNodeReq;
import com.cisco.axl.api._11.UpdateProcessNodeServiceReq;
import com.cisco.axl.api._11.UpdateRecordingProfileReq;
import com.cisco.axl.api._11.UpdateRegionMatrixReq;
import com.cisco.axl.api._11.UpdateRegionReq;
import com.cisco.axl.api._11.UpdateRemoteClusterReq;
import com.cisco.axl.api._11.UpdateRemoteDestinationProfileReq;
import com.cisco.axl.api._11.UpdateRemoteDestinationReq;
import com.cisco.axl.api._11.UpdateResourcePriorityNamespaceListReq;
import com.cisco.axl.api._11.UpdateResourcePriorityNamespaceReq;
import com.cisco.axl.api._11.UpdateRouteFilterReq;
import com.cisco.axl.api._11.UpdateRouteGroupReq;
import com.cisco.axl.api._11.UpdateRouteListReq;
import com.cisco.axl.api._11.UpdateRoutePartitionReq;
import com.cisco.axl.api._11.UpdateRoutePartitionsForLearnedPatternsReq;
import com.cisco.axl.api._11.UpdateRoutePatternReq;
import com.cisco.axl.api._11.UpdateSIPNormalizationScriptReq;
import com.cisco.axl.api._11.UpdateSNMPCommunityStringReq;
import com.cisco.axl.api._11.UpdateSNMPCommunityStringRes;
import com.cisco.axl.api._11.UpdateSNMPMIB2ListReq;
import com.cisco.axl.api._11.UpdateSNMPMIB2ListRes;
import com.cisco.axl.api._11.UpdateSNMPUserReq;
import com.cisco.axl.api._11.UpdateSNMPUserRes;
import com.cisco.axl.api._11.UpdateSafCcdPurgeBlockLearnedRoutesReq;
import com.cisco.axl.api._11.UpdateSafForwarderReq;
import com.cisco.axl.api._11.UpdateSafSecurityProfileReq;
import com.cisco.axl.api._11.UpdateSdpTransparencyProfileReq;
import com.cisco.axl.api._11.UpdateSecureConfigReq;
import com.cisco.axl.api._11.UpdateSelfProvisioningReq;
import com.cisco.axl.api._11.UpdateServiceParameterReq;
import com.cisco.axl.api._11.UpdateServiceProfileReq;
import com.cisco.axl.api._11.UpdateSipDialRulesReq;
import com.cisco.axl.api._11.UpdateSipProfileReq;
import com.cisco.axl.api._11.UpdateSipRealmReq;
import com.cisco.axl.api._11.UpdateSipRoutePatternReq;
import com.cisco.axl.api._11.UpdateSipTrunkReq;
import com.cisco.axl.api._11.UpdateSipTrunkSecurityProfileReq;
import com.cisco.axl.api._11.UpdateSoftKeySetReq;
import com.cisco.axl.api._11.UpdateSoftKeyTemplateReq;
import com.cisco.axl.api._11.UpdateSrstReq;
import com.cisco.axl.api._11.UpdateSyslogConfigurationReq;
import com.cisco.axl.api._11.UpdateSyslogConfigurationRes;
import com.cisco.axl.api._11.UpdateTimePeriodReq;
import com.cisco.axl.api._11.UpdateTimeScheduleReq;
import com.cisco.axl.api._11.UpdateTodAccessReq;
import com.cisco.axl.api._11.UpdateTransPatternReq;
import com.cisco.axl.api._11.UpdateTranscoderReq;
import com.cisco.axl.api._11.UpdateTransformationProfileReq;
import com.cisco.axl.api._11.UpdateTvsCertificateReq;
import com.cisco.axl.api._11.UpdateUcServiceReq;
import com.cisco.axl.api._11.UpdateUniversalDeviceTemplateReq;
import com.cisco.axl.api._11.UpdateUniversalLineTemplateReq;
import com.cisco.axl.api._11.UpdateUserGroupReq;
import com.cisco.axl.api._11.UpdateUserProfileProvisionReq;
import com.cisco.axl.api._11.UpdateUserReq;
import com.cisco.axl.api._11.UpdateVg224Req;
import com.cisco.axl.api._11.UpdateVohServerReq;
import com.cisco.axl.api._11.UpdateVoiceMailPilotReq;
import com.cisco.axl.api._11.UpdateVoiceMailPortReq;
import com.cisco.axl.api._11.UpdateVoiceMailProfileReq;
import com.cisco.axl.api._11.UpdateVpnGatewayReq;
import com.cisco.axl.api._11.UpdateVpnGroupReq;
import com.cisco.axl.api._11.UpdateVpnProfileReq;
import com.cisco.axl.api._11.UpdateWLANProfileReq;
import com.cisco.axl.api._11.UpdateWifiHotspotReq;
import com.cisco.axl.api._11.UpdateWlanProfileGroupReq;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AXLPort", targetNamespace = "http://www.cisco.com/AXLAPIService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AXLPort {


    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipProfile")
    @WebResult(name = "addSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipProfile(
        @WebParam(name = "addSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipProfile")
    @WebResult(name = "updateSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipProfile(
        @WebParam(name = "updateSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipProfile")
    @WebResult(name = "getSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipProfileRes getSipProfile(
        @WebParam(name = "getSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipProfile")
    @WebResult(name = "removeSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipProfile(
        @WebParam(name = "removeSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipProfile")
    @WebResult(name = "listSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipProfileRes listSipProfile(
        @WebParam(name = "listSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartSipProfile")
    @WebResult(name = "restartSipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartSipProfile(
        @WebParam(name = "restartSipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applySipProfile")
    @WebResult(name = "applySipProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applySipProfile(
        @WebParam(name = "applySipProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipProfileOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipProfileOptions")
    @WebResult(name = "getSipProfileOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipProfileOptionsRes getSipProfileOptions(
        @WebParam(name = "getSipProfileOptions", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipProfileOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipTrunkSecurityProfile")
    @WebResult(name = "addSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipTrunkSecurityProfile(
        @WebParam(name = "addSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipTrunkSecurityProfile")
    @WebResult(name = "updateSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipTrunkSecurityProfile(
        @WebParam(name = "updateSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipTrunkSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipTrunkSecurityProfile")
    @WebResult(name = "getSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipTrunkSecurityProfileRes getSipTrunkSecurityProfile(
        @WebParam(name = "getSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipTrunkSecurityProfile")
    @WebResult(name = "removeSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipTrunkSecurityProfile(
        @WebParam(name = "removeSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipTrunkSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipTrunkSecurityProfile")
    @WebResult(name = "listSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipTrunkSecurityProfileRes listSipTrunkSecurityProfile(
        @WebParam(name = "listSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipTrunkSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetSipTrunkSecurityProfile")
    @WebResult(name = "resetSipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetSipTrunkSecurityProfile(
        @WebParam(name = "resetSipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applySipTrunkSecurityProfile")
    @WebResult(name = "applySipTrunkSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applySipTrunkSecurityProfile(
        @WebParam(name = "applySipTrunkSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTimePeriod")
    @WebResult(name = "addTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTimePeriod(
        @WebParam(name = "addTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTimePeriod")
    @WebResult(name = "updateTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTimePeriod(
        @WebParam(name = "updateTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTimePeriodRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTimePeriod")
    @WebResult(name = "getTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTimePeriodRes getTimePeriod(
        @WebParam(name = "getTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTimePeriod")
    @WebResult(name = "removeTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTimePeriod(
        @WebParam(name = "removeTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTimePeriodRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTimePeriod")
    @WebResult(name = "listTimePeriodResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTimePeriodRes listTimePeriod(
        @WebParam(name = "listTimePeriod", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTimePeriodReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTimeSchedule")
    @WebResult(name = "addTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTimeSchedule(
        @WebParam(name = "addTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTimeSchedule")
    @WebResult(name = "updateTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTimeSchedule(
        @WebParam(name = "updateTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTimeScheduleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTimeSchedule")
    @WebResult(name = "getTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTimeScheduleRes getTimeSchedule(
        @WebParam(name = "getTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTimeSchedule")
    @WebResult(name = "removeTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTimeSchedule(
        @WebParam(name = "removeTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTimeScheduleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTimeSchedule")
    @WebResult(name = "listTimeScheduleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTimeScheduleRes listTimeSchedule(
        @WebParam(name = "listTimeSchedule", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTimeScheduleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTodAccess")
    @WebResult(name = "addTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTodAccess(
        @WebParam(name = "addTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTodAccess")
    @WebResult(name = "updateTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTodAccess(
        @WebParam(name = "updateTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTodAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTodAccess")
    @WebResult(name = "getTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTodAccessRes getTodAccess(
        @WebParam(name = "getTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTodAccess")
    @WebResult(name = "removeTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTodAccess(
        @WebParam(name = "removeTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTodAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTodAccess")
    @WebResult(name = "listTodAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTodAccessRes listTodAccess(
        @WebParam(name = "listTodAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTodAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVoiceMailPilot")
    @WebResult(name = "addVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVoiceMailPilot(
        @WebParam(name = "addVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVoiceMailPilot")
    @WebResult(name = "updateVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVoiceMailPilot(
        @WebParam(name = "updateVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVoiceMailPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVoiceMailPilot")
    @WebResult(name = "getVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVoiceMailPilotRes getVoiceMailPilot(
        @WebParam(name = "getVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVoiceMailPilot")
    @WebResult(name = "removeVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVoiceMailPilot(
        @WebParam(name = "removeVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVoiceMailPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVoiceMailPilot")
    @WebResult(name = "listVoiceMailPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVoiceMailPilotRes listVoiceMailPilot(
        @WebParam(name = "listVoiceMailPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVoiceMailPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addProcessNode")
    @WebResult(name = "addProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addProcessNode(
        @WebParam(name = "addProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateProcessNode")
    @WebResult(name = "updateProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateProcessNode(
        @WebParam(name = "updateProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetProcessNodeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getProcessNode")
    @WebResult(name = "getProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetProcessNodeRes getProcessNode(
        @WebParam(name = "getProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeProcessNode")
    @WebResult(name = "removeProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeProcessNode(
        @WebParam(name = "removeProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListProcessNodeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listProcessNode")
    @WebResult(name = "listProcessNodeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListProcessNodeRes listProcessNode(
        @WebParam(name = "listProcessNode", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListProcessNodeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCallerFilterList")
    @WebResult(name = "addCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCallerFilterList(
        @WebParam(name = "addCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallerFilterList")
    @WebResult(name = "updateCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallerFilterList(
        @WebParam(name = "updateCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallerFilterListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallerFilterList")
    @WebResult(name = "getCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallerFilterListRes getCallerFilterList(
        @WebParam(name = "getCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCallerFilterList")
    @WebResult(name = "removeCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCallerFilterList(
        @WebParam(name = "removeCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallerFilterListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallerFilterList")
    @WebResult(name = "listCallerFilterListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallerFilterListRes listCallerFilterList(
        @WebParam(name = "listCallerFilterList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallerFilterListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRoutePartition")
    @WebResult(name = "addRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRoutePartition(
        @WebParam(name = "addRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRoutePartition")
    @WebResult(name = "updateRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRoutePartition(
        @WebParam(name = "updateRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRoutePartitionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRoutePartition")
    @WebResult(name = "getRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRoutePartitionRes getRoutePartition(
        @WebParam(name = "getRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRoutePartition")
    @WebResult(name = "removeRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRoutePartition(
        @WebParam(name = "removeRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRoutePartitionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRoutePartition")
    @WebResult(name = "listRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRoutePartitionRes listRoutePartition(
        @WebParam(name = "listRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRoutePartitionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartRoutePartition")
    @WebResult(name = "restartRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartRoutePartition(
        @WebParam(name = "restartRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyRoutePartition")
    @WebResult(name = "applyRoutePartitionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyRoutePartition(
        @WebParam(name = "applyRoutePartition", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCss")
    @WebResult(name = "addCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCss(
        @WebParam(name = "addCss", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCss")
    @WebResult(name = "updateCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCss(
        @WebParam(name = "updateCss", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCssRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCss")
    @WebResult(name = "getCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCssRes getCss(
        @WebParam(name = "getCss", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCss")
    @WebResult(name = "removeCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCss(
        @WebParam(name = "removeCss", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCssRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCss")
    @WebResult(name = "listCssResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCssRes listCss(
        @WebParam(name = "listCss", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCssReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallManager")
    @WebResult(name = "updateCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallManager(
        @WebParam(name = "updateCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallManagerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallManager")
    @WebResult(name = "getCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallManagerRes getCallManager(
        @WebParam(name = "getCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallManagerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallManager")
    @WebResult(name = "listCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallManagerRes listCallManager(
        @WebParam(name = "listCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallManagerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCallManager")
    @WebResult(name = "resetCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCallManager(
        @WebParam(name = "resetCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCallManager")
    @WebResult(name = "restartCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCallManager(
        @WebParam(name = "restartCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCallManager")
    @WebResult(name = "applyCallManagerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCallManager(
        @WebParam(name = "applyCallManager", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMediaResourceGroup")
    @WebResult(name = "addMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMediaResourceGroup(
        @WebParam(name = "addMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMediaResourceGroup")
    @WebResult(name = "updateMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMediaResourceGroup(
        @WebParam(name = "updateMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMediaResourceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMediaResourceGroup")
    @WebResult(name = "getMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMediaResourceGroupRes getMediaResourceGroup(
        @WebParam(name = "getMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMediaResourceGroup")
    @WebResult(name = "removeMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMediaResourceGroup(
        @WebParam(name = "removeMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMediaResourceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMediaResourceGroup")
    @WebResult(name = "listMediaResourceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMediaResourceGroupRes listMediaResourceGroup(
        @WebParam(name = "listMediaResourceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMediaResourceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMediaResourceList")
    @WebResult(name = "addMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMediaResourceList(
        @WebParam(name = "addMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMediaResourceList")
    @WebResult(name = "updateMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMediaResourceList(
        @WebParam(name = "updateMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMediaResourceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMediaResourceList")
    @WebResult(name = "getMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMediaResourceListRes getMediaResourceList(
        @WebParam(name = "getMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMediaResourceList")
    @WebResult(name = "removeMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMediaResourceList(
        @WebParam(name = "removeMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMediaResourceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMediaResourceList")
    @WebResult(name = "listMediaResourceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMediaResourceListRes listMediaResourceList(
        @WebParam(name = "listMediaResourceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMediaResourceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRegion")
    @WebResult(name = "addRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRegion(
        @WebParam(name = "addRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRegion")
    @WebResult(name = "updateRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRegion(
        @WebParam(name = "updateRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRegionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRegion")
    @WebResult(name = "getRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRegionRes getRegion(
        @WebParam(name = "getRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRegion")
    @WebResult(name = "removeRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRegion(
        @WebParam(name = "removeRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRegionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRegion")
    @WebResult(name = "listRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRegionRes listRegion(
        @WebParam(name = "listRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRegionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartRegion")
    @WebResult(name = "restartRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartRegion(
        @WebParam(name = "restartRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyRegion")
    @WebResult(name = "applyRegionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyRegion(
        @WebParam(name = "applyRegion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAarGroup")
    @WebResult(name = "addAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAarGroup(
        @WebParam(name = "addAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAarGroup")
    @WebResult(name = "updateAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAarGroup(
        @WebParam(name = "updateAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAarGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAarGroup")
    @WebResult(name = "getAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAarGroupRes getAarGroup(
        @WebParam(name = "getAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAarGroup")
    @WebResult(name = "removeAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAarGroup(
        @WebParam(name = "removeAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAarGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAarGroup")
    @WebResult(name = "listAarGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAarGroupRes listAarGroup(
        @WebParam(name = "listAarGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAarGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPhysicalLocation")
    @WebResult(name = "addPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPhysicalLocation(
        @WebParam(name = "addPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePhysicalLocation")
    @WebResult(name = "updatePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePhysicalLocation(
        @WebParam(name = "updatePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhysicalLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhysicalLocation")
    @WebResult(name = "getPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhysicalLocationRes getPhysicalLocation(
        @WebParam(name = "getPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePhysicalLocation")
    @WebResult(name = "removePhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePhysicalLocation(
        @WebParam(name = "removePhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPhysicalLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPhysicalLocation")
    @WebResult(name = "listPhysicalLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPhysicalLocationRes listPhysicalLocation(
        @WebParam(name = "listPhysicalLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPhysicalLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRouteGroup")
    @WebResult(name = "addRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRouteGroup(
        @WebParam(name = "addRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRouteGroup")
    @WebResult(name = "updateRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRouteGroup(
        @WebParam(name = "updateRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRouteGroup")
    @WebResult(name = "getRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRouteGroupRes getRouteGroup(
        @WebParam(name = "getRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRouteGroup")
    @WebResult(name = "removeRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRouteGroup(
        @WebParam(name = "removeRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRouteGroup")
    @WebResult(name = "listRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRouteGroupRes listRouteGroup(
        @WebParam(name = "listRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDevicePool")
    @WebResult(name = "addDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDevicePool(
        @WebParam(name = "addDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDevicePool")
    @WebResult(name = "updateDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDevicePool(
        @WebParam(name = "updateDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDevicePoolRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDevicePool")
    @WebResult(name = "getDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDevicePoolRes getDevicePool(
        @WebParam(name = "getDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDevicePool")
    @WebResult(name = "removeDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDevicePool(
        @WebParam(name = "removeDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDevicePoolRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDevicePool")
    @WebResult(name = "listDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDevicePoolRes listDevicePool(
        @WebParam(name = "listDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDevicePoolReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetDevicePool")
    @WebResult(name = "resetDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetDevicePool(
        @WebParam(name = "resetDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartDevicePool")
    @WebResult(name = "restartDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartDevicePool(
        @WebParam(name = "restartDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyDevicePool")
    @WebResult(name = "applyDevicePoolResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyDevicePool(
        @WebParam(name = "applyDevicePool", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDeviceMobilityGroup")
    @WebResult(name = "addDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDeviceMobilityGroup(
        @WebParam(name = "addDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDeviceMobilityGroup")
    @WebResult(name = "updateDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDeviceMobilityGroup(
        @WebParam(name = "updateDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDeviceMobilityGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDeviceMobilityGroup")
    @WebResult(name = "getDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDeviceMobilityGroupRes getDeviceMobilityGroup(
        @WebParam(name = "getDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDeviceMobilityGroup")
    @WebResult(name = "removeDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDeviceMobilityGroup(
        @WebParam(name = "removeDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDeviceMobilityGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDeviceMobilityGroup")
    @WebResult(name = "listDeviceMobilityGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDeviceMobilityGroupRes listDeviceMobilityGroup(
        @WebParam(name = "listDeviceMobilityGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDeviceMobilityGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLocation")
    @WebResult(name = "addLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLocation(
        @WebParam(name = "addLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLocation")
    @WebResult(name = "updateLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLocation(
        @WebParam(name = "updateLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLocation")
    @WebResult(name = "getLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLocationRes getLocation(
        @WebParam(name = "getLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLocation")
    @WebResult(name = "removeLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLocation(
        @WebParam(name = "removeLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLocation")
    @WebResult(name = "listLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLocationRes listLocation(
        @WebParam(name = "listLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSoftKeyTemplate")
    @WebResult(name = "addSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSoftKeyTemplate(
        @WebParam(name = "addSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSoftKeyTemplate")
    @WebResult(name = "updateSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSoftKeyTemplate(
        @WebParam(name = "updateSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSoftKeyTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSoftKeyTemplate")
    @WebResult(name = "getSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSoftKeyTemplateRes getSoftKeyTemplate(
        @WebParam(name = "getSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSoftKeyTemplate")
    @WebResult(name = "removeSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSoftKeyTemplate(
        @WebParam(name = "removeSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSoftKeyTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSoftKeyTemplate")
    @WebResult(name = "listSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSoftKeyTemplateRes listSoftKeyTemplate(
        @WebParam(name = "listSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSoftKeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartSoftKeyTemplate")
    @WebResult(name = "restartSoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartSoftKeyTemplate(
        @WebParam(name = "restartSoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applySoftKeyTemplate")
    @WebResult(name = "applySoftKeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applySoftKeyTemplate(
        @WebParam(name = "applySoftKeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTranscoder")
    @WebResult(name = "addTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTranscoder(
        @WebParam(name = "addTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTranscoder")
    @WebResult(name = "updateTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTranscoder(
        @WebParam(name = "updateTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTranscoderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTranscoder")
    @WebResult(name = "getTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTranscoderRes getTranscoder(
        @WebParam(name = "getTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTranscoder")
    @WebResult(name = "removeTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTranscoder(
        @WebParam(name = "removeTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTranscoderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTranscoder")
    @WebResult(name = "listTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTranscoderRes listTranscoder(
        @WebParam(name = "listTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTranscoderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetTranscoder")
    @WebResult(name = "resetTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetTranscoder(
        @WebParam(name = "resetTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyTranscoder")
    @WebResult(name = "applyTranscoderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyTranscoder(
        @WebParam(name = "applyTranscoder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCommonDeviceConfig")
    @WebResult(name = "addCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCommonDeviceConfig(
        @WebParam(name = "addCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCommonDeviceConfig")
    @WebResult(name = "updateCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCommonDeviceConfig(
        @WebParam(name = "updateCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCommonDeviceConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCommonDeviceConfig")
    @WebResult(name = "getCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCommonDeviceConfigRes getCommonDeviceConfig(
        @WebParam(name = "getCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCommonDeviceConfig")
    @WebResult(name = "removeCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCommonDeviceConfig(
        @WebParam(name = "removeCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCommonDeviceConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCommonDeviceConfig")
    @WebResult(name = "listCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCommonDeviceConfigRes listCommonDeviceConfig(
        @WebParam(name = "listCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCommonDeviceConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCommonDeviceConfig")
    @WebResult(name = "resetCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCommonDeviceConfig(
        @WebParam(name = "resetCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCommonDeviceConfig")
    @WebResult(name = "applyCommonDeviceConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCommonDeviceConfig(
        @WebParam(name = "applyCommonDeviceConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addResourcePriorityNamespace")
    @WebResult(name = "addResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespace(
        @WebParam(name = "addResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateResourcePriorityNamespace")
    @WebResult(name = "updateResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespace(
        @WebParam(name = "updateResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetResourcePriorityNamespaceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getResourcePriorityNamespace")
    @WebResult(name = "getResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetResourcePriorityNamespaceRes getResourcePriorityNamespace(
        @WebParam(name = "getResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeResourcePriorityNamespace")
    @WebResult(name = "removeResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespace(
        @WebParam(name = "removeResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListResourcePriorityNamespaceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listResourcePriorityNamespace")
    @WebResult(name = "listResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListResourcePriorityNamespaceRes listResourcePriorityNamespace(
        @WebParam(name = "listResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetResourcePriorityNamespace")
    @WebResult(name = "resetResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetResourcePriorityNamespace(
        @WebParam(name = "resetResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ResetResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartResourcePriorityNamespace")
    @WebResult(name = "restartResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartResourcePriorityNamespace(
        @WebParam(name = "restartResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RestartResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyResourcePriorityNamespace")
    @WebResult(name = "applyResourcePriorityNamespaceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyResourcePriorityNamespace(
        @WebParam(name = "applyResourcePriorityNamespace", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ApplyResourcePriorityNamespaceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addResourcePriorityNamespaceList")
    @WebResult(name = "addResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addResourcePriorityNamespaceList(
        @WebParam(name = "addResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateResourcePriorityNamespaceList")
    @WebResult(name = "updateResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateResourcePriorityNamespaceList(
        @WebParam(name = "updateResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetResourcePriorityNamespaceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getResourcePriorityNamespaceList")
    @WebResult(name = "getResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetResourcePriorityNamespaceListRes getResourcePriorityNamespaceList(
        @WebParam(name = "getResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeResourcePriorityNamespaceList")
    @WebResult(name = "removeResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeResourcePriorityNamespaceList(
        @WebParam(name = "removeResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListResourcePriorityNamespaceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listResourcePriorityNamespaceList")
    @WebResult(name = "listResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListResourcePriorityNamespaceListRes listResourcePriorityNamespaceList(
        @WebParam(name = "listResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListResourcePriorityNamespaceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetResourcePriorityNamespaceList")
    @WebResult(name = "resetResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetResourcePriorityNamespaceList(
        @WebParam(name = "resetResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartResourcePriorityNamespaceList")
    @WebResult(name = "restartResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartResourcePriorityNamespaceList(
        @WebParam(name = "restartResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyResourcePriorityNamespaceList")
    @WebResult(name = "applyResourcePriorityNamespaceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyResourcePriorityNamespaceList(
        @WebParam(name = "applyResourcePriorityNamespaceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDeviceMobility")
    @WebResult(name = "addDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDeviceMobility(
        @WebParam(name = "addDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDeviceMobility")
    @WebResult(name = "updateDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDeviceMobility(
        @WebParam(name = "updateDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDeviceMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDeviceMobility")
    @WebResult(name = "getDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDeviceMobilityRes getDeviceMobility(
        @WebParam(name = "getDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDeviceMobility")
    @WebResult(name = "removeDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDeviceMobility(
        @WebParam(name = "removeDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDeviceMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDeviceMobility")
    @WebResult(name = "listDeviceMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDeviceMobilityRes listDeviceMobility(
        @WebParam(name = "listDeviceMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDeviceMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCmcInfo")
    @WebResult(name = "addCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCmcInfo(
        @WebParam(name = "addCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCmcInfo")
    @WebResult(name = "updateCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCmcInfo(
        @WebParam(name = "updateCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCmcInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCmcInfo")
    @WebResult(name = "getCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCmcInfoRes getCmcInfo(
        @WebParam(name = "getCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCmcInfo")
    @WebResult(name = "removeCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCmcInfo(
        @WebParam(name = "removeCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCmcInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCmcInfo")
    @WebResult(name = "listCmcInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCmcInfoRes listCmcInfo(
        @WebParam(name = "listCmcInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCmcInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCredentialPolicy")
    @WebResult(name = "addCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCredentialPolicy(
        @WebParam(name = "addCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCredentialPolicy")
    @WebResult(name = "updateCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCredentialPolicy(
        @WebParam(name = "updateCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCredentialPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCredentialPolicy")
    @WebResult(name = "getCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCredentialPolicyRes getCredentialPolicy(
        @WebParam(name = "getCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCredentialPolicy")
    @WebResult(name = "removeCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCredentialPolicy(
        @WebParam(name = "removeCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCredentialPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCredentialPolicy")
    @WebResult(name = "listCredentialPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCredentialPolicyRes listCredentialPolicy(
        @WebParam(name = "listCredentialPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCredentialPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addFacInfo")
    @WebResult(name = "addFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addFacInfo(
        @WebParam(name = "addFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFacInfo")
    @WebResult(name = "updateFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFacInfo(
        @WebParam(name = "updateFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFacInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFacInfo")
    @WebResult(name = "getFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFacInfoRes getFacInfo(
        @WebParam(name = "getFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeFacInfo")
    @WebResult(name = "removeFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeFacInfo(
        @WebParam(name = "removeFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListFacInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listFacInfo")
    @WebResult(name = "listFacInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListFacInfoRes listFacInfo(
        @WebParam(name = "listFacInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListFacInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addHuntList")
    @WebResult(name = "addHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addHuntList(
        @WebParam(name = "addHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateHuntList")
    @WebResult(name = "updateHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateHuntList(
        @WebParam(name = "updateHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetHuntListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getHuntList")
    @WebResult(name = "getHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetHuntListRes getHuntList(
        @WebParam(name = "getHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeHuntList")
    @WebResult(name = "removeHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeHuntList(
        @WebParam(name = "removeHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListHuntListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listHuntList")
    @WebResult(name = "listHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListHuntListRes listHuntList(
        @WebParam(name = "listHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListHuntListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetHuntList")
    @WebResult(name = "resetHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetHuntList(
        @WebParam(name = "resetHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyHuntList")
    @WebResult(name = "applyHuntListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyHuntList(
        @WebParam(name = "applyHuntList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addIvrUserLocale")
    @WebResult(name = "addIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addIvrUserLocale(
        @WebParam(name = "addIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateIvrUserLocale")
    @WebResult(name = "updateIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateIvrUserLocale(
        @WebParam(name = "updateIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetIvrUserLocaleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getIvrUserLocale")
    @WebResult(name = "getIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetIvrUserLocaleRes getIvrUserLocale(
        @WebParam(name = "getIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeIvrUserLocale")
    @WebResult(name = "removeIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeIvrUserLocale(
        @WebParam(name = "removeIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListIvrUserLocaleRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listIvrUserLocale")
    @WebResult(name = "listIvrUserLocaleResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListIvrUserLocaleRes listIvrUserLocale(
        @WebParam(name = "listIvrUserLocale", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListIvrUserLocaleReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLineGroup")
    @WebResult(name = "addLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLineGroup(
        @WebParam(name = "addLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLineGroup")
    @WebResult(name = "updateLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLineGroup(
        @WebParam(name = "updateLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLineGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLineGroup")
    @WebResult(name = "getLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLineGroupRes getLineGroup(
        @WebParam(name = "getLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLineGroup")
    @WebResult(name = "removeLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLineGroup(
        @WebParam(name = "removeLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLineGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLineGroup")
    @WebResult(name = "listLineGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLineGroupRes listLineGroup(
        @WebParam(name = "listLineGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLineGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRecordingProfile")
    @WebResult(name = "addRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRecordingProfile(
        @WebParam(name = "addRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRecordingProfile")
    @WebResult(name = "updateRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRecordingProfile(
        @WebParam(name = "updateRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRecordingProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRecordingProfile")
    @WebResult(name = "getRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRecordingProfileRes getRecordingProfile(
        @WebParam(name = "getRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRecordingProfile")
    @WebResult(name = "removeRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRecordingProfile(
        @WebParam(name = "removeRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRecordingProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRecordingProfile")
    @WebResult(name = "listRecordingProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRecordingProfileRes listRecordingProfile(
        @WebParam(name = "listRecordingProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRecordingProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRouteFilter")
    @WebResult(name = "addRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRouteFilter(
        @WebParam(name = "addRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRouteFilter")
    @WebResult(name = "updateRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRouteFilter(
        @WebParam(name = "updateRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRouteFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRouteFilter")
    @WebResult(name = "getRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRouteFilterRes getRouteFilter(
        @WebParam(name = "getRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRouteFilter")
    @WebResult(name = "removeRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRouteFilter(
        @WebParam(name = "removeRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRouteFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRouteFilter")
    @WebResult(name = "listRouteFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRouteFilterRes listRouteFilter(
        @WebParam(name = "listRouteFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRouteFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCallManagerGroup")
    @WebResult(name = "addCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCallManagerGroup(
        @WebParam(name = "addCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallManagerGroup")
    @WebResult(name = "updateCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallManagerGroup(
        @WebParam(name = "updateCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallManagerGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallManagerGroup")
    @WebResult(name = "getCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallManagerGroupRes getCallManagerGroup(
        @WebParam(name = "getCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCallManagerGroup")
    @WebResult(name = "removeCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCallManagerGroup(
        @WebParam(name = "removeCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallManagerGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallManagerGroup")
    @WebResult(name = "listCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallManagerGroupRes listCallManagerGroup(
        @WebParam(name = "listCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallManagerGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCallManagerGroup")
    @WebResult(name = "resetCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCallManagerGroup(
        @WebParam(name = "resetCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCallManagerGroup")
    @WebResult(name = "applyCallManagerGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCallManagerGroup(
        @WebParam(name = "applyCallManagerGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUserGroup")
    @WebResult(name = "addUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUserGroup(
        @WebParam(name = "addUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUserGroup")
    @WebResult(name = "updateUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUserGroup(
        @WebParam(name = "updateUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUserGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUserGroup")
    @WebResult(name = "getUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUserGroupRes getUserGroup(
        @WebParam(name = "getUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUserGroup")
    @WebResult(name = "removeUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUserGroup(
        @WebParam(name = "removeUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUserGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUserGroup")
    @WebResult(name = "listUserGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUserGroupRes listUserGroup(
        @WebParam(name = "listUserGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUserGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDialPlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDialPlan")
    @WebResult(name = "getDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDialPlanRes getDialPlan(
        @WebParam(name = "getDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDialPlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDialPlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDialPlan")
    @WebResult(name = "listDialPlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDialPlanRes listDialPlan(
        @WebParam(name = "listDialPlan", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDialPlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDialPlanTagRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDialPlanTag")
    @WebResult(name = "getDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDialPlanTagRes getDialPlanTag(
        @WebParam(name = "getDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDialPlanTagReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDialPlanTagRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDialPlanTag")
    @WebResult(name = "listDialPlanTagResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDialPlanTagRes listDialPlanTag(
        @WebParam(name = "listDialPlanTag", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDialPlanTagReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDdiRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDdi")
    @WebResult(name = "getDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDdiRes getDdi(
        @WebParam(name = "getDdi", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDdiReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDdiRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDdi")
    @WebResult(name = "listDdiResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDdiRes listDdi(
        @WebParam(name = "listDdi", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDdiReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMobileSmartClientProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMobileSmartClientProfile")
    @WebResult(name = "getMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMobileSmartClientProfileRes getMobileSmartClientProfile(
        @WebParam(name = "getMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMobileSmartClientProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMobileSmartClientProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMobileSmartClientProfile")
    @WebResult(name = "listMobileSmartClientProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMobileSmartClientProfileRes listMobileSmartClientProfile(
        @WebParam(name = "listMobileSmartClientProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMobileSmartClientProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateProcessNodeService")
    @WebResult(name = "updateProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateProcessNodeService(
        @WebParam(name = "updateProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetProcessNodeServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getProcessNodeService")
    @WebResult(name = "getProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetProcessNodeServiceRes getProcessNodeService(
        @WebParam(name = "getProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListProcessNodeServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listProcessNodeService")
    @WebResult(name = "listProcessNodeServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListProcessNodeServiceRes listProcessNodeService(
        @WebParam(name = "listProcessNodeService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListProcessNodeServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMohAudioSource")
    @WebResult(name = "updateMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMohAudioSource(
        @WebParam(name = "updateMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMohAudioSource")
    @WebResult(name = "getMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMohAudioSourceRes getMohAudioSource(
        @WebParam(name = "getMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMohAudioSource")
    @WebResult(name = "removeMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMohAudioSource(
        @WebParam(name = "removeMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMohAudioSource")
    @WebResult(name = "listMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMohAudioSourceRes listMohAudioSource(
        @WebParam(name = "listMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDhcpServer")
    @WebResult(name = "addDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDhcpServer(
        @WebParam(name = "addDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDhcpServer")
    @WebResult(name = "updateDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDhcpServer(
        @WebParam(name = "updateDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDhcpServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDhcpServer")
    @WebResult(name = "getDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDhcpServerRes getDhcpServer(
        @WebParam(name = "getDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDhcpServer")
    @WebResult(name = "removeDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDhcpServer(
        @WebParam(name = "removeDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDhcpServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDhcpServer")
    @WebResult(name = "listDhcpServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDhcpServerRes listDhcpServer(
        @WebParam(name = "listDhcpServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDhcpServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDhcpSubnet")
    @WebResult(name = "addDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDhcpSubnet(
        @WebParam(name = "addDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDhcpSubnet")
    @WebResult(name = "updateDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDhcpSubnet(
        @WebParam(name = "updateDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDhcpSubnetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDhcpSubnet")
    @WebResult(name = "getDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDhcpSubnetRes getDhcpSubnet(
        @WebParam(name = "getDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDhcpSubnet")
    @WebResult(name = "removeDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDhcpSubnet(
        @WebParam(name = "removeDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDhcpSubnetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDhcpSubnet")
    @WebResult(name = "listDhcpSubnetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDhcpSubnetRes listDhcpSubnet(
        @WebParam(name = "listDhcpSubnet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDhcpSubnetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCallPark")
    @WebResult(name = "addCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCallPark(
        @WebParam(name = "addCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallPark")
    @WebResult(name = "updateCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallPark(
        @WebParam(name = "updateCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallPark")
    @WebResult(name = "getCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallParkRes getCallPark(
        @WebParam(name = "getCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCallPark")
    @WebResult(name = "removeCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCallPark(
        @WebParam(name = "removeCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallPark")
    @WebResult(name = "listCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallParkRes listCallPark(
        @WebParam(name = "listCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDirectedCallPark")
    @WebResult(name = "addDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDirectedCallPark(
        @WebParam(name = "addDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDirectedCallPark")
    @WebResult(name = "updateDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDirectedCallPark(
        @WebParam(name = "updateDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDirectedCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDirectedCallPark")
    @WebResult(name = "getDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDirectedCallParkRes getDirectedCallPark(
        @WebParam(name = "getDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDirectedCallPark")
    @WebResult(name = "removeDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDirectedCallPark(
        @WebParam(name = "removeDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDirectedCallParkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDirectedCallPark")
    @WebResult(name = "listDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDirectedCallParkRes listDirectedCallPark(
        @WebParam(name = "listDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetDirectedCallPark")
    @WebResult(name = "resetDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetDirectedCallPark(
        @WebParam(name = "resetDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ResetDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyDirectedCallPark")
    @WebResult(name = "applyDirectedCallParkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyDirectedCallPark(
        @WebParam(name = "applyDirectedCallPark", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ApplyDirectedCallParkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMeetMe")
    @WebResult(name = "addMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMeetMe(
        @WebParam(name = "addMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMeetMe")
    @WebResult(name = "updateMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMeetMe(
        @WebParam(name = "updateMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMeetMeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMeetMe")
    @WebResult(name = "getMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMeetMeRes getMeetMe(
        @WebParam(name = "getMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMeetMe")
    @WebResult(name = "removeMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMeetMe(
        @WebParam(name = "removeMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMeetMeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMeetMe")
    @WebResult(name = "listMeetMeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMeetMeRes listMeetMe(
        @WebParam(name = "listMeetMe", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMeetMeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addConferenceNow")
    @WebResult(name = "addConferenceNowResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addConferenceNow(
        @WebParam(name = "addConferenceNow", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddConferenceNowReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateConferenceNow")
    @WebResult(name = "updateConferenceNowResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateConferenceNow(
        @WebParam(name = "updateConferenceNow", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateConferenceNowReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetConferenceNowRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getConferenceNow")
    @WebResult(name = "getConferenceNowResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetConferenceNowRes getConferenceNow(
        @WebParam(name = "getConferenceNow", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetConferenceNowReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeConferenceNow")
    @WebResult(name = "removeConferenceNowResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeConferenceNow(
        @WebParam(name = "removeConferenceNow", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveConferenceNowReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListConferenceNowRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listConferenceNow")
    @WebResult(name = "listConferenceNowResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListConferenceNowRes listConferenceNow(
        @WebParam(name = "listConferenceNow", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListConferenceNowReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMobileVoiceAccess")
    @WebResult(name = "addMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMobileVoiceAccess(
        @WebParam(name = "addMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMobileVoiceAccess")
    @WebResult(name = "updateMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMobileVoiceAccess(
        @WebParam(name = "updateMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMobileVoiceAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMobileVoiceAccess")
    @WebResult(name = "getMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMobileVoiceAccessRes getMobileVoiceAccess(
        @WebParam(name = "getMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMobileVoiceAccess")
    @WebResult(name = "removeMobileVoiceAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMobileVoiceAccess(
        @WebParam(name = "removeMobileVoiceAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveMobileVoiceAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRouteList")
    @WebResult(name = "addRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRouteList(
        @WebParam(name = "addRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRouteList")
    @WebResult(name = "updateRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRouteList(
        @WebParam(name = "updateRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRouteListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRouteList")
    @WebResult(name = "getRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRouteListRes getRouteList(
        @WebParam(name = "getRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRouteList")
    @WebResult(name = "removeRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRouteList(
        @WebParam(name = "removeRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRouteListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRouteList")
    @WebResult(name = "listRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRouteListRes listRouteList(
        @WebParam(name = "listRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRouteListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetRouteList")
    @WebResult(name = "resetRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetRouteList(
        @WebParam(name = "resetRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyRouteList")
    @WebResult(name = "applyRouteListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyRouteList(
        @WebParam(name = "applyRouteList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUser")
    @WebResult(name = "addUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUser(
        @WebParam(name = "addUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUser")
    @WebResult(name = "updateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUser(
        @WebParam(name = "updateUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUser")
    @WebResult(name = "getUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUserRes getUser(
        @WebParam(name = "getUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUser")
    @WebResult(name = "removeUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUser(
        @WebParam(name = "removeUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUser")
    @WebResult(name = "listUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUserRes listUser(
        @WebParam(name = "listUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAppUser")
    @WebResult(name = "addAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAppUser(
        @WebParam(name = "addAppUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAppUser")
    @WebResult(name = "updateAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAppUser(
        @WebParam(name = "updateAppUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAppUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAppUser")
    @WebResult(name = "getAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAppUserRes getAppUser(
        @WebParam(name = "getAppUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAppUser")
    @WebResult(name = "removeAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAppUser(
        @WebParam(name = "removeAppUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAppUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAppUser")
    @WebResult(name = "listAppUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAppUserRes listAppUser(
        @WebParam(name = "listAppUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAppUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipRealm")
    @WebResult(name = "addSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipRealm(
        @WebParam(name = "addSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipRealm")
    @WebResult(name = "updateSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipRealm(
        @WebParam(name = "updateSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipRealmRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipRealm")
    @WebResult(name = "getSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipRealmRes getSipRealm(
        @WebParam(name = "getSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipRealm")
    @WebResult(name = "removeSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipRealm(
        @WebParam(name = "removeSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipRealmRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipRealm")
    @WebResult(name = "listSipRealmResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipRealmRes listSipRealm(
        @WebParam(name = "listSipRealm", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipRealmReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPhoneNtp")
    @WebResult(name = "addPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPhoneNtp(
        @WebParam(name = "addPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePhoneNtp")
    @WebResult(name = "updatePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePhoneNtp(
        @WebParam(name = "updatePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneNtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhoneNtp")
    @WebResult(name = "getPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneNtpRes getPhoneNtp(
        @WebParam(name = "getPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePhoneNtp")
    @WebResult(name = "removePhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePhoneNtp(
        @WebParam(name = "removePhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemovePhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPhoneNtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPhoneNtp")
    @WebResult(name = "listPhoneNtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPhoneNtpRes listPhoneNtp(
        @WebParam(name = "listPhoneNtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPhoneNtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDateTimeGroup")
    @WebResult(name = "addDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDateTimeGroup(
        @WebParam(name = "addDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDateTimeGroup")
    @WebResult(name = "updateDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDateTimeGroup(
        @WebParam(name = "updateDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDateTimeGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDateTimeGroup")
    @WebResult(name = "getDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDateTimeGroupRes getDateTimeGroup(
        @WebParam(name = "getDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDateTimeGroup")
    @WebResult(name = "removeDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDateTimeGroup(
        @WebParam(name = "removeDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDateTimeGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDateTimeGroup")
    @WebResult(name = "listDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDateTimeGroupRes listDateTimeGroup(
        @WebParam(name = "listDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDateTimeGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetDateTimeGroup")
    @WebResult(name = "resetDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetDateTimeGroup(
        @WebParam(name = "resetDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyDateTimeGroup")
    @WebResult(name = "applyDateTimeGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyDateTimeGroup(
        @WebParam(name = "applyDateTimeGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPresenceGroup")
    @WebResult(name = "addPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPresenceGroup(
        @WebParam(name = "addPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePresenceGroup")
    @WebResult(name = "updatePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePresenceGroup(
        @WebParam(name = "updatePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPresenceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPresenceGroup")
    @WebResult(name = "getPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPresenceGroupRes getPresenceGroup(
        @WebParam(name = "getPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePresenceGroup")
    @WebResult(name = "removePresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePresenceGroup(
        @WebParam(name = "removePresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPresenceGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPresenceGroup")
    @WebResult(name = "listPresenceGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPresenceGroupRes listPresenceGroup(
        @WebParam(name = "listPresenceGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPresenceGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGeoLocation")
    @WebResult(name = "addGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGeoLocation(
        @WebParam(name = "addGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGeoLocation")
    @WebResult(name = "updateGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGeoLocation(
        @WebParam(name = "updateGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGeoLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGeoLocation")
    @WebResult(name = "getGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGeoLocationRes getGeoLocation(
        @WebParam(name = "getGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGeoLocation")
    @WebResult(name = "removeGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGeoLocation(
        @WebParam(name = "removeGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListGeoLocationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listGeoLocation")
    @WebResult(name = "listGeoLocationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListGeoLocationRes listGeoLocation(
        @WebParam(name = "listGeoLocation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListGeoLocationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSrst")
    @WebResult(name = "addSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSrst(
        @WebParam(name = "addSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSrst")
    @WebResult(name = "updateSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSrst(
        @WebParam(name = "updateSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSrstRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSrst")
    @WebResult(name = "getSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSrstRes getSrst(
        @WebParam(name = "getSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSrst")
    @WebResult(name = "removeSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSrst(
        @WebParam(name = "removeSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSrstRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSrst")
    @WebResult(name = "listSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSrstRes listSrst(
        @WebParam(name = "listSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSrstReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetSrst")
    @WebResult(name = "resetSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetSrst(
        @WebParam(name = "resetSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartSrst")
    @WebResult(name = "restartSrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartSrst(
        @WebParam(name = "restartSrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applySrst")
    @WebResult(name = "applySrstResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applySrst(
        @WebParam(name = "applySrst", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMlppDomain")
    @WebResult(name = "addMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMlppDomain(
        @WebParam(name = "addMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMlppDomain")
    @WebResult(name = "updateMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMlppDomain(
        @WebParam(name = "updateMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMlppDomainRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMlppDomain")
    @WebResult(name = "getMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMlppDomainRes getMlppDomain(
        @WebParam(name = "getMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMlppDomain")
    @WebResult(name = "removeMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMlppDomain(
        @WebParam(name = "removeMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMlppDomainRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMlppDomain")
    @WebResult(name = "listMlppDomainResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMlppDomainRes listMlppDomain(
        @WebParam(name = "listMlppDomain", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMlppDomainReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCumaServerSecurityProfile")
    @WebResult(name = "addCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCumaServerSecurityProfile(
        @WebParam(name = "addCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCumaServerSecurityProfile")
    @WebResult(name = "updateCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCumaServerSecurityProfile(
        @WebParam(name = "updateCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCumaServerSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCumaServerSecurityProfile")
    @WebResult(name = "getCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCumaServerSecurityProfileRes getCumaServerSecurityProfile(
        @WebParam(name = "getCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCumaServerSecurityProfile")
    @WebResult(name = "removeCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCumaServerSecurityProfile(
        @WebParam(name = "removeCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCumaServerSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCumaServerSecurityProfile")
    @WebResult(name = "listCumaServerSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCumaServerSecurityProfileRes listCumaServerSecurityProfile(
        @WebParam(name = "listCumaServerSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCumaServerSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addApplicationServer")
    @WebResult(name = "addApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addApplicationServer(
        @WebParam(name = "addApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateApplicationServer")
    @WebResult(name = "updateApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateApplicationServer(
        @WebParam(name = "updateApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetApplicationServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getApplicationServer")
    @WebResult(name = "getApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetApplicationServerRes getApplicationServer(
        @WebParam(name = "getApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeApplicationServer")
    @WebResult(name = "removeApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeApplicationServer(
        @WebParam(name = "removeApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListApplicationServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listApplicationServer")
    @WebResult(name = "listApplicationServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListApplicationServerRes listApplicationServer(
        @WebParam(name = "listApplicationServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListApplicationServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addApplicationUserCapfProfile")
    @WebResult(name = "addApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addApplicationUserCapfProfile(
        @WebParam(name = "addApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateApplicationUserCapfProfile")
    @WebResult(name = "updateApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateApplicationUserCapfProfile(
        @WebParam(name = "updateApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetApplicationUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getApplicationUserCapfProfile")
    @WebResult(name = "getApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetApplicationUserCapfProfileRes getApplicationUserCapfProfile(
        @WebParam(name = "getApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeApplicationUserCapfProfile")
    @WebResult(name = "removeApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeApplicationUserCapfProfile(
        @WebParam(name = "removeApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListApplicationUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listApplicationUserCapfProfile")
    @WebResult(name = "listApplicationUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListApplicationUserCapfProfileRes listApplicationUserCapfProfile(
        @WebParam(name = "listApplicationUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListApplicationUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addEndUserCapfProfile")
    @WebResult(name = "addEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addEndUserCapfProfile(
        @WebParam(name = "addEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateEndUserCapfProfile")
    @WebResult(name = "updateEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateEndUserCapfProfile(
        @WebParam(name = "updateEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetEndUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getEndUserCapfProfile")
    @WebResult(name = "getEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetEndUserCapfProfileRes getEndUserCapfProfile(
        @WebParam(name = "getEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeEndUserCapfProfile")
    @WebResult(name = "removeEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeEndUserCapfProfile(
        @WebParam(name = "removeEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListEndUserCapfProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listEndUserCapfProfile")
    @WebResult(name = "listEndUserCapfProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListEndUserCapfProfileRes listEndUserCapfProfile(
        @WebParam(name = "listEndUserCapfProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListEndUserCapfProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateServiceParameter")
    @WebResult(name = "updateServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateServiceParameter(
        @WebParam(name = "updateServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetServiceParameterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getServiceParameter")
    @WebResult(name = "getServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetServiceParameterRes getServiceParameter(
        @WebParam(name = "getServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListServiceParameterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listServiceParameter")
    @WebResult(name = "listServiceParameterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListServiceParameterRes listServiceParameter(
        @WebParam(name = "listServiceParameter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListServiceParameterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUserPhoneAssociation")
    @WebResult(name = "addUserPhoneAssociationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUserPhoneAssociation(
        @WebParam(name = "addUserPhoneAssociation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUserPhoneAssociationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGeoLocationFilter")
    @WebResult(name = "addGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGeoLocationFilter(
        @WebParam(name = "addGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGeoLocationFilter")
    @WebResult(name = "updateGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGeoLocationFilter(
        @WebParam(name = "updateGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGeoLocationFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGeoLocationFilter")
    @WebResult(name = "getGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGeoLocationFilterRes getGeoLocationFilter(
        @WebParam(name = "getGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGeoLocationFilter")
    @WebResult(name = "removeGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGeoLocationFilter(
        @WebParam(name = "removeGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListGeoLocationFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listGeoLocationFilter")
    @WebResult(name = "listGeoLocationFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListGeoLocationFilterRes listGeoLocationFilter(
        @WebParam(name = "listGeoLocationFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListGeoLocationFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVoiceMailProfile")
    @WebResult(name = "addVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVoiceMailProfile(
        @WebParam(name = "addVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVoiceMailProfile")
    @WebResult(name = "updateVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVoiceMailProfile(
        @WebParam(name = "updateVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVoiceMailProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVoiceMailProfile")
    @WebResult(name = "getVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVoiceMailProfileRes getVoiceMailProfile(
        @WebParam(name = "getVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVoiceMailProfile")
    @WebResult(name = "removeVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVoiceMailProfile(
        @WebParam(name = "removeVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVoiceMailProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVoiceMailProfile")
    @WebResult(name = "listVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVoiceMailProfileRes listVoiceMailProfile(
        @WebParam(name = "listVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVoiceMailProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetVoiceMailProfile")
    @WebResult(name = "resetVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetVoiceMailProfile(
        @WebParam(name = "resetVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartVoiceMailProfile")
    @WebResult(name = "restartVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartVoiceMailProfile(
        @WebParam(name = "restartVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyVoiceMailProfile")
    @WebResult(name = "applyVoiceMailProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyVoiceMailProfile(
        @WebParam(name = "applyVoiceMailProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVoiceMailPort")
    @WebResult(name = "addVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVoiceMailPort(
        @WebParam(name = "addVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVoiceMailPort")
    @WebResult(name = "updateVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVoiceMailPort(
        @WebParam(name = "updateVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVoiceMailPortRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVoiceMailPort")
    @WebResult(name = "getVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVoiceMailPortRes getVoiceMailPort(
        @WebParam(name = "getVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVoiceMailPort")
    @WebResult(name = "removeVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVoiceMailPort(
        @WebParam(name = "removeVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVoiceMailPortRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVoiceMailPort")
    @WebResult(name = "listVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVoiceMailPortRes listVoiceMailPort(
        @WebParam(name = "listVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVoiceMailPortReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetVoiceMailPort")
    @WebResult(name = "resetVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetVoiceMailPort(
        @WebParam(name = "resetVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartVoiceMailPort")
    @WebResult(name = "restartVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartVoiceMailPort(
        @WebParam(name = "restartVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyVoiceMailPort")
    @WebResult(name = "applyVoiceMailPortResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyVoiceMailPort(
        @WebParam(name = "applyVoiceMailPort", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatekeeper")
    @WebResult(name = "addGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatekeeper(
        @WebParam(name = "addGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatekeeper")
    @WebResult(name = "updateGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatekeeper(
        @WebParam(name = "updateGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatekeeperRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatekeeper")
    @WebResult(name = "getGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatekeeperRes getGatekeeper(
        @WebParam(name = "getGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatekeeper")
    @WebResult(name = "removeGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatekeeper(
        @WebParam(name = "removeGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListGatekeeperRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listGatekeeper")
    @WebResult(name = "listGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListGatekeeperRes listGatekeeper(
        @WebParam(name = "listGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListGatekeeperReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetGatekeeper")
    @WebResult(name = "resetGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetGatekeeper(
        @WebParam(name = "resetGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartGatekeeper")
    @WebResult(name = "restartGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartGatekeeper(
        @WebParam(name = "restartGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyGatekeeper")
    @WebResult(name = "applyGatekeeperResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyGatekeeper(
        @WebParam(name = "applyGatekeeper", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPhoneButtonTemplate")
    @WebResult(name = "addPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPhoneButtonTemplate(
        @WebParam(name = "addPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePhoneButtonTemplate")
    @WebResult(name = "updatePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePhoneButtonTemplate(
        @WebParam(name = "updatePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneButtonTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhoneButtonTemplate")
    @WebResult(name = "getPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneButtonTemplateRes getPhoneButtonTemplate(
        @WebParam(name = "getPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePhoneButtonTemplate")
    @WebResult(name = "removePhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePhoneButtonTemplate(
        @WebParam(name = "removePhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPhoneButtonTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPhoneButtonTemplate")
    @WebResult(name = "listPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPhoneButtonTemplateRes listPhoneButtonTemplate(
        @WebParam(name = "listPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPhoneButtonTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartPhoneButtonTemplate")
    @WebResult(name = "restartPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartPhoneButtonTemplate(
        @WebParam(name = "restartPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyPhoneButtonTemplate")
    @WebResult(name = "applyPhoneButtonTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyPhoneButtonTemplate(
        @WebParam(name = "applyPhoneButtonTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCommonPhoneConfig")
    @WebResult(name = "addCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCommonPhoneConfig(
        @WebParam(name = "addCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCommonPhoneConfig")
    @WebResult(name = "updateCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCommonPhoneConfig(
        @WebParam(name = "updateCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCommonPhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCommonPhoneConfig")
    @WebResult(name = "getCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCommonPhoneConfigRes getCommonPhoneConfig(
        @WebParam(name = "getCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCommonPhoneConfig")
    @WebResult(name = "removeCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCommonPhoneConfig(
        @WebParam(name = "removeCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCommonPhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCommonPhoneConfig")
    @WebResult(name = "listCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCommonPhoneConfigRes listCommonPhoneConfig(
        @WebParam(name = "listCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCommonPhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCommonPhoneConfig")
    @WebResult(name = "resetCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCommonPhoneConfig(
        @WebParam(name = "resetCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCommonPhoneConfig")
    @WebResult(name = "applyCommonPhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCommonPhoneConfig(
        @WebParam(name = "applyCommonPhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMessageWaiting")
    @WebResult(name = "addMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMessageWaiting(
        @WebParam(name = "addMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMessageWaiting")
    @WebResult(name = "updateMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMessageWaiting(
        @WebParam(name = "updateMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMessageWaitingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMessageWaiting")
    @WebResult(name = "getMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMessageWaitingRes getMessageWaiting(
        @WebParam(name = "getMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMessageWaiting")
    @WebResult(name = "removeMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMessageWaiting(
        @WebParam(name = "removeMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMessageWaitingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMessageWaiting")
    @WebResult(name = "listMessageWaitingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMessageWaitingRes listMessageWaiting(
        @WebParam(name = "listMessageWaiting", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMessageWaitingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addIpPhoneServices")
    @WebResult(name = "addIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addIpPhoneServices(
        @WebParam(name = "addIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateIpPhoneServices")
    @WebResult(name = "updateIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateIpPhoneServices(
        @WebParam(name = "updateIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetIpPhoneServicesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getIpPhoneServices")
    @WebResult(name = "getIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetIpPhoneServicesRes getIpPhoneServices(
        @WebParam(name = "getIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeIpPhoneServices")
    @WebResult(name = "removeIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeIpPhoneServices(
        @WebParam(name = "removeIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListIpPhoneServicesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listIpPhoneServices")
    @WebResult(name = "listIpPhoneServicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListIpPhoneServicesRes listIpPhoneServices(
        @WebParam(name = "listIpPhoneServices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListIpPhoneServicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCtiRoutePoint")
    @WebResult(name = "addCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCtiRoutePoint(
        @WebParam(name = "addCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCtiRoutePoint")
    @WebResult(name = "updateCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCtiRoutePoint(
        @WebParam(name = "updateCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCtiRoutePointRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCtiRoutePoint")
    @WebResult(name = "getCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCtiRoutePointRes getCtiRoutePoint(
        @WebParam(name = "getCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCtiRoutePoint")
    @WebResult(name = "removeCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCtiRoutePoint(
        @WebParam(name = "removeCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCtiRoutePointRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCtiRoutePoint")
    @WebResult(name = "listCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCtiRoutePointRes listCtiRoutePoint(
        @WebParam(name = "listCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCtiRoutePointReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCtiRoutePoint")
    @WebResult(name = "resetCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCtiRoutePoint(
        @WebParam(name = "resetCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCtiRoutePoint")
    @WebResult(name = "restartCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCtiRoutePoint(
        @WebParam(name = "restartCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCtiRoutePoint")
    @WebResult(name = "applyCtiRoutePointResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCtiRoutePoint(
        @WebParam(name = "applyCtiRoutePoint", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTransPattern")
    @WebResult(name = "addTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTransPattern(
        @WebParam(name = "addTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTransPattern")
    @WebResult(name = "updateTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTransPattern(
        @WebParam(name = "updateTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTransPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTransPattern")
    @WebResult(name = "getTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTransPatternRes getTransPattern(
        @WebParam(name = "getTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTransPattern")
    @WebResult(name = "removeTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTransPattern(
        @WebParam(name = "removeTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTransPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTransPattern")
    @WebResult(name = "listTransPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTransPatternRes listTransPattern(
        @WebParam(name = "listTransPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTransPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTransPatternOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTransPatternOptions")
    @WebResult(name = "getTransPatternOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTransPatternOptionsRes getTransPatternOptions(
        @WebParam(name = "getTransPatternOptions", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTransPatternOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCallingPartyTransformationPattern")
    @WebResult(name = "addCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCallingPartyTransformationPattern(
        @WebParam(name = "addCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallingPartyTransformationPattern")
    @WebResult(name = "updateCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallingPartyTransformationPattern(
        @WebParam(name = "updateCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallingPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallingPartyTransformationPattern")
    @WebResult(name = "getCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallingPartyTransformationPatternRes getCallingPartyTransformationPattern(
        @WebParam(name = "getCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCallingPartyTransformationPattern")
    @WebResult(name = "removeCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCallingPartyTransformationPattern(
        @WebParam(name = "removeCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallingPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallingPartyTransformationPattern")
    @WebResult(name = "listCallingPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallingPartyTransformationPatternRes listCallingPartyTransformationPattern(
        @WebParam(name = "listCallingPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallingPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipRoutePattern")
    @WebResult(name = "addSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipRoutePattern(
        @WebParam(name = "addSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipRoutePattern")
    @WebResult(name = "updateSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipRoutePattern(
        @WebParam(name = "updateSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipRoutePattern")
    @WebResult(name = "getSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipRoutePatternRes getSipRoutePattern(
        @WebParam(name = "getSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipRoutePattern")
    @WebResult(name = "removeSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipRoutePattern(
        @WebParam(name = "removeSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipRoutePattern")
    @WebResult(name = "listSipRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipRoutePatternRes listSipRoutePattern(
        @WebParam(name = "listSipRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addHuntPilot")
    @WebResult(name = "addHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addHuntPilot(
        @WebParam(name = "addHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateHuntPilot")
    @WebResult(name = "updateHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateHuntPilot(
        @WebParam(name = "updateHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetHuntPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getHuntPilot")
    @WebResult(name = "getHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetHuntPilotRes getHuntPilot(
        @WebParam(name = "getHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeHuntPilot")
    @WebResult(name = "removeHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeHuntPilot(
        @WebParam(name = "removeHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListHuntPilotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listHuntPilot")
    @WebResult(name = "listHuntPilotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListHuntPilotRes listHuntPilot(
        @WebParam(name = "listHuntPilot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListHuntPilotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRoutePattern")
    @WebResult(name = "addRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRoutePattern(
        @WebParam(name = "addRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRoutePattern")
    @WebResult(name = "updateRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRoutePattern(
        @WebParam(name = "updateRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRoutePattern")
    @WebResult(name = "getRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRoutePatternRes getRoutePattern(
        @WebParam(name = "getRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRoutePattern")
    @WebResult(name = "removeRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRoutePattern(
        @WebParam(name = "removeRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRoutePatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRoutePattern")
    @WebResult(name = "listRoutePatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRoutePatternRes listRoutePattern(
        @WebParam(name = "listRoutePattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRoutePatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addApplicationDialRules")
    @WebResult(name = "addApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addApplicationDialRules(
        @WebParam(name = "addApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateApplicationDialRules")
    @WebResult(name = "updateApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateApplicationDialRules(
        @WebParam(name = "updateApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetApplicationDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getApplicationDialRules")
    @WebResult(name = "getApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetApplicationDialRulesRes getApplicationDialRules(
        @WebParam(name = "getApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeApplicationDialRules")
    @WebResult(name = "removeApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeApplicationDialRules(
        @WebParam(name = "removeApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListApplicationDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listApplicationDialRules")
    @WebResult(name = "listApplicationDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListApplicationDialRulesRes listApplicationDialRules(
        @WebParam(name = "listApplicationDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListApplicationDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDirectoryLookupDialRules")
    @WebResult(name = "addDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDirectoryLookupDialRules(
        @WebParam(name = "addDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDirectoryLookupDialRules")
    @WebResult(name = "updateDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDirectoryLookupDialRules(
        @WebParam(name = "updateDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDirectoryLookupDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDirectoryLookupDialRules")
    @WebResult(name = "getDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDirectoryLookupDialRulesRes getDirectoryLookupDialRules(
        @WebParam(name = "getDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDirectoryLookupDialRules")
    @WebResult(name = "removeDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDirectoryLookupDialRules(
        @WebParam(name = "removeDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDirectoryLookupDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDirectoryLookupDialRules")
    @WebResult(name = "listDirectoryLookupDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDirectoryLookupDialRulesRes listDirectoryLookupDialRules(
        @WebParam(name = "listDirectoryLookupDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDirectoryLookupDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPhoneSecurityProfile")
    @WebResult(name = "addPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPhoneSecurityProfile(
        @WebParam(name = "addPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePhoneSecurityProfile")
    @WebResult(name = "updatePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePhoneSecurityProfile(
        @WebParam(name = "updatePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhoneSecurityProfile")
    @WebResult(name = "getPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneSecurityProfileRes getPhoneSecurityProfile(
        @WebParam(name = "getPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePhoneSecurityProfile")
    @WebResult(name = "removePhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePhoneSecurityProfile(
        @WebParam(name = "removePhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPhoneSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPhoneSecurityProfile")
    @WebResult(name = "listPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPhoneSecurityProfileRes listPhoneSecurityProfile(
        @WebParam(name = "listPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPhoneSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetPhoneSecurityProfile")
    @WebResult(name = "resetPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetPhoneSecurityProfile(
        @WebParam(name = "resetPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyPhoneSecurityProfile")
    @WebResult(name = "applyPhoneSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyPhoneSecurityProfile(
        @WebParam(name = "applyPhoneSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipDialRules")
    @WebResult(name = "addSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipDialRules(
        @WebParam(name = "addSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipDialRules")
    @WebResult(name = "updateSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipDialRules(
        @WebParam(name = "updateSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipDialRules")
    @WebResult(name = "getSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipDialRulesRes getSipDialRules(
        @WebParam(name = "getSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipDialRules")
    @WebResult(name = "removeSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipDialRules(
        @WebParam(name = "removeSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipDialRulesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipDialRules")
    @WebResult(name = "listSipDialRulesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipDialRulesRes listSipDialRules(
        @WebParam(name = "listSipDialRules", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipDialRulesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addConferenceBridge")
    @WebResult(name = "addConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addConferenceBridge(
        @WebParam(name = "addConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateConferenceBridge")
    @WebResult(name = "updateConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateConferenceBridge(
        @WebParam(name = "updateConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetConferenceBridgeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getConferenceBridge")
    @WebResult(name = "getConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetConferenceBridgeRes getConferenceBridge(
        @WebParam(name = "getConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeConferenceBridge")
    @WebResult(name = "removeConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeConferenceBridge(
        @WebParam(name = "removeConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListConferenceBridgeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listConferenceBridge")
    @WebResult(name = "listConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListConferenceBridgeRes listConferenceBridge(
        @WebParam(name = "listConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListConferenceBridgeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetConferenceBridge")
    @WebResult(name = "resetConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetConferenceBridge(
        @WebParam(name = "resetConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartConferenceBridge")
    @WebResult(name = "restartConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartConferenceBridge(
        @WebParam(name = "restartConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyConferenceBridge")
    @WebResult(name = "applyConferenceBridgeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyConferenceBridge(
        @WebParam(name = "applyConferenceBridge", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAnnunciator")
    @WebResult(name = "updateAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAnnunciator(
        @WebParam(name = "updateAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAnnunciatorRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAnnunciator")
    @WebResult(name = "getAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAnnunciatorRes getAnnunciator(
        @WebParam(name = "getAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAnnunciatorRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAnnunciator")
    @WebResult(name = "listAnnunciatorResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAnnunciatorRes listAnnunciator(
        @WebParam(name = "listAnnunciator", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAnnunciatorReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateInteractiveVoiceResponse")
    @WebResult(name = "updateInteractiveVoiceResponseResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateInteractiveVoiceResponse(
        @WebParam(name = "updateInteractiveVoiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateInteractiveVoiceResponseReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetInteractiveVoiceResponseRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getInteractiveVoiceResponse")
    @WebResult(name = "getInteractiveVoiceResponseResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetInteractiveVoiceResponseRes getInteractiveVoiceResponse(
        @WebParam(name = "getInteractiveVoiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetInteractiveVoiceResponseReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListInteractiveVoiceResponseRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listInteractiveVoiceResponse")
    @WebResult(name = "listInteractiveVoiceResponseResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListInteractiveVoiceResponseRes listInteractiveVoiceResponse(
        @WebParam(name = "listInteractiveVoiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListInteractiveVoiceResponseReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMtp")
    @WebResult(name = "addMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMtp(
        @WebParam(name = "addMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMtp")
    @WebResult(name = "updateMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMtp(
        @WebParam(name = "updateMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMtp")
    @WebResult(name = "getMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMtpRes getMtp(
        @WebParam(name = "getMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMtp")
    @WebResult(name = "removeMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMtp(
        @WebParam(name = "removeMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMtpRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMtp")
    @WebResult(name = "listMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMtpRes listMtp(
        @WebParam(name = "listMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMtpReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetMtp")
    @WebResult(name = "resetMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetMtp(
        @WebParam(name = "resetMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartMtp")
    @WebResult(name = "restartMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartMtp(
        @WebParam(name = "restartMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyMtp")
    @WebResult(name = "applyMtpResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyMtp(
        @WebParam(name = "applyMtp", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFixedMohAudioSource")
    @WebResult(name = "updateFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFixedMohAudioSource(
        @WebParam(name = "updateFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFixedMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFixedMohAudioSourceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFixedMohAudioSource")
    @WebResult(name = "getFixedMohAudioSourceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFixedMohAudioSourceRes getFixedMohAudioSource(
        @WebParam(name = "getFixedMohAudioSource", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFixedMohAudioSourceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAarGroupMatrix")
    @WebResult(name = "updateAarGroupMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAarGroupMatrix(
        @WebParam(name = "updateAarGroupMatrix", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAarGroupMatrixReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRemoteDestinationProfile")
    @WebResult(name = "addRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRemoteDestinationProfile(
        @WebParam(name = "addRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRemoteDestinationProfile")
    @WebResult(name = "updateRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRemoteDestinationProfile(
        @WebParam(name = "updateRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRemoteDestinationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRemoteDestinationProfile")
    @WebResult(name = "getRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRemoteDestinationProfileRes getRemoteDestinationProfile(
        @WebParam(name = "getRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRemoteDestinationProfile")
    @WebResult(name = "removeRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRemoteDestinationProfile(
        @WebParam(name = "removeRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRemoteDestinationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRemoteDestinationProfile")
    @WebResult(name = "listRemoteDestinationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRemoteDestinationProfileRes listRemoteDestinationProfile(
        @WebParam(name = "listRemoteDestinationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRemoteDestinationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLine")
    @WebResult(name = "addLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLine(
        @WebParam(name = "addLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLine")
    @WebResult(name = "updateLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLine(
        @WebParam(name = "updateLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLineRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLine")
    @WebResult(name = "getLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLineRes getLine(
        @WebParam(name = "getLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLine")
    @WebResult(name = "removeLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLine(
        @WebParam(name = "removeLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLineRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLine")
    @WebResult(name = "listLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLineRes listLine(
        @WebParam(name = "listLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetLine")
    @WebResult(name = "resetLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetLine(
        @WebParam(name = "resetLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ResetLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartLine")
    @WebResult(name = "restartLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartLine(
        @WebParam(name = "restartLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RestartLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyLine")
    @WebResult(name = "applyLineResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyLine(
        @WebParam(name = "applyLine", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ApplyLineReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLineOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLineOptions")
    @WebResult(name = "getLineOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLineOptionsRes getLineOptions(
        @WebParam(name = "getLineOptions", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLineOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDefaultDeviceProfile")
    @WebResult(name = "addDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDefaultDeviceProfile(
        @WebParam(name = "addDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDefaultDeviceProfile")
    @WebResult(name = "updateDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDefaultDeviceProfile(
        @WebParam(name = "updateDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDefaultDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDefaultDeviceProfile")
    @WebResult(name = "getDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDefaultDeviceProfileRes getDefaultDeviceProfile(
        @WebParam(name = "getDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDefaultDeviceProfile")
    @WebResult(name = "removeDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDefaultDeviceProfile(
        @WebParam(name = "removeDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDefaultDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDefaultDeviceProfile")
    @WebResult(name = "listDefaultDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDefaultDeviceProfileRes listDefaultDeviceProfile(
        @WebParam(name = "listDefaultDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDefaultDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addH323Phone")
    @WebResult(name = "addH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addH323Phone(
        @WebParam(name = "addH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateH323Phone")
    @WebResult(name = "updateH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateH323Phone(
        @WebParam(name = "updateH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetH323PhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getH323Phone")
    @WebResult(name = "getH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetH323PhoneRes getH323Phone(
        @WebParam(name = "getH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeH323Phone")
    @WebResult(name = "removeH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeH323Phone(
        @WebParam(name = "removeH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListH323PhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listH323Phone")
    @WebResult(name = "listH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListH323PhoneRes listH323Phone(
        @WebParam(name = "listH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListH323PhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetH323Phone")
    @WebResult(name = "resetH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetH323Phone(
        @WebParam(name = "resetH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartH323Phone")
    @WebResult(name = "restartH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartH323Phone(
        @WebParam(name = "restartH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyH323Phone")
    @WebResult(name = "applyH323PhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyH323Phone(
        @WebParam(name = "applyH323Phone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMohServer")
    @WebResult(name = "updateMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMohServer(
        @WebParam(name = "updateMohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMohServer")
    @WebResult(name = "getMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMohServerRes getMohServer(
        @WebParam(name = "getMohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMohServer")
    @WebResult(name = "listMohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMohServerRes listMohServer(
        @WebParam(name = "listMohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addH323Trunk")
    @WebResult(name = "addH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addH323Trunk(
        @WebParam(name = "addH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateH323Trunk")
    @WebResult(name = "updateH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateH323Trunk(
        @WebParam(name = "updateH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetH323TrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getH323Trunk")
    @WebResult(name = "getH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetH323TrunkRes getH323Trunk(
        @WebParam(name = "getH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeH323Trunk")
    @WebResult(name = "removeH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeH323Trunk(
        @WebParam(name = "removeH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListH323TrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listH323Trunk")
    @WebResult(name = "listH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListH323TrunkRes listH323Trunk(
        @WebParam(name = "listH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListH323TrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetH323Trunk")
    @WebResult(name = "resetH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetH323Trunk(
        @WebParam(name = "resetH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartH323Trunk")
    @WebResult(name = "restartH323TrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartH323Trunk(
        @WebParam(name = "restartH323Trunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPhone")
    @WebResult(name = "addPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPhone(
        @WebParam(name = "addPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePhone")
    @WebResult(name = "updatePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePhone(
        @WebParam(name = "updatePhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhone")
    @WebResult(name = "getPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneRes getPhone(
        @WebParam(name = "getPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePhone")
    @WebResult(name = "removePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePhone(
        @WebParam(name = "removePhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPhoneRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPhone")
    @WebResult(name = "listPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPhoneRes listPhone(
        @WebParam(name = "listPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPhoneReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetPhone")
    @WebResult(name = "resetPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetPhone(
        @WebParam(name = "resetPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartPhone")
    @WebResult(name = "restartPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartPhone(
        @WebParam(name = "restartPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyPhone")
    @WebResult(name = "applyPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyPhone(
        @WebParam(name = "applyPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 wipePhone")
    @WebResult(name = "wipePhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse wipePhone(
        @WebParam(name = "wipePhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 lockPhone")
    @WebResult(name = "lockPhoneResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse lockPhone(
        @WebParam(name = "lockPhone", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhoneOptions")
    @WebResult(name = "getPhoneOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneOptionsRes getPhoneOptions(
        @WebParam(name = "getPhoneOptions", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addH323Gateway")
    @WebResult(name = "addH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addH323Gateway(
        @WebParam(name = "addH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateH323Gateway")
    @WebResult(name = "updateH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateH323Gateway(
        @WebParam(name = "updateH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetH323GatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getH323Gateway")
    @WebResult(name = "getH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetH323GatewayRes getH323Gateway(
        @WebParam(name = "getH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeH323Gateway")
    @WebResult(name = "removeH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeH323Gateway(
        @WebParam(name = "removeH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListH323GatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listH323Gateway")
    @WebResult(name = "listH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListH323GatewayRes listH323Gateway(
        @WebParam(name = "listH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListH323GatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetH323Gateway")
    @WebResult(name = "resetH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetH323Gateway(
        @WebParam(name = "resetH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartH323Gateway")
    @WebResult(name = "restartH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartH323Gateway(
        @WebParam(name = "restartH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyH323Gateway")
    @WebResult(name = "applyH323GatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyH323Gateway(
        @WebParam(name = "applyH323Gateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDeviceProfile")
    @WebResult(name = "addDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDeviceProfile(
        @WebParam(name = "addDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDeviceProfile")
    @WebResult(name = "updateDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDeviceProfile(
        @WebParam(name = "updateDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDeviceProfile")
    @WebResult(name = "getDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDeviceProfileRes getDeviceProfile(
        @WebParam(name = "getDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDeviceProfile")
    @WebResult(name = "removeDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDeviceProfile(
        @WebParam(name = "removeDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDeviceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDeviceProfile")
    @WebResult(name = "listDeviceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDeviceProfileRes listDeviceProfile(
        @WebParam(name = "listDeviceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDeviceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDeviceProfileOptionsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDeviceProfileOptions")
    @WebResult(name = "getDeviceProfileOptionsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDeviceProfileOptionsRes getDeviceProfileOptions(
        @WebParam(name = "getDeviceProfileOptions", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDeviceProfileOptionsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRemoteDestination")
    @WebResult(name = "addRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRemoteDestination(
        @WebParam(name = "addRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRemoteDestination")
    @WebResult(name = "updateRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRemoteDestination(
        @WebParam(name = "updateRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRemoteDestinationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRemoteDestination")
    @WebResult(name = "getRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRemoteDestinationRes getRemoteDestination(
        @WebParam(name = "getRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRemoteDestination")
    @WebResult(name = "removeRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRemoteDestination(
        @WebParam(name = "removeRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRemoteDestinationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRemoteDestination")
    @WebResult(name = "listRemoteDestinationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRemoteDestinationRes listRemoteDestination(
        @WebParam(name = "listRemoteDestination", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRemoteDestinationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVg224")
    @WebResult(name = "addVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVg224(
        @WebParam(name = "addVg224", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVg224")
    @WebResult(name = "updateVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVg224(
        @WebParam(name = "updateVg224", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVg224Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVg224")
    @WebResult(name = "getVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVg224Res getVg224(
        @WebParam(name = "getVg224", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVg224")
    @WebResult(name = "removeVg224Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVg224(
        @WebParam(name = "removeVg224", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveVg224Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGateway")
    @WebResult(name = "addGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGateway(
        @WebParam(name = "addGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGateway")
    @WebResult(name = "updateGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGateway(
        @WebParam(name = "updateGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGateway")
    @WebResult(name = "getGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewayRes getGateway(
        @WebParam(name = "getGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGateway")
    @WebResult(name = "removeGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGateway(
        @WebParam(name = "removeGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listGateway")
    @WebResult(name = "listGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListGatewayRes listGateway(
        @WebParam(name = "listGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetGateway")
    @WebResult(name = "resetGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetGateway(
        @WebParam(name = "resetGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ResetGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyGateway")
    @WebResult(name = "applyGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyGateway(
        @WebParam(name = "applyGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ApplyGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewayEndpointAnalogAccess")
    @WebResult(name = "addGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointAnalogAccess(
        @WebParam(name = "addGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatewayEndpointAnalogAccess")
    @WebResult(name = "updateGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointAnalogAccess(
        @WebParam(name = "updateGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewayEndpointAnalogAccessRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatewayEndpointAnalogAccess")
    @WebResult(name = "getGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewayEndpointAnalogAccessRes getGatewayEndpointAnalogAccess(
        @WebParam(name = "getGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewayEndpointAnalogAccessReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewayEndpointAnalogAccess")
    @WebResult(name = "removeGatewayEndpointAnalogAccessResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointAnalogAccess(
        @WebParam(name = "removeGatewayEndpointAnalogAccess", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewayEndpointDigitalAccessPri")
    @WebResult(name = "addGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessPri(
        @WebParam(name = "addGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatewayEndpointDigitalAccessPri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessPri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatewayEndpointDigitalAccessPri")
    @WebResult(name = "getGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessPriRes getGatewayEndpointDigitalAccessPri(
        @WebParam(name = "getGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewayEndpointDigitalAccessPri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessPri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewayEndpointDigitalAccessBri")
    @WebResult(name = "addGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessBri(
        @WebParam(name = "addGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatewayEndpointDigitalAccessBri")
    @WebResult(name = "updateGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessBri(
        @WebParam(name = "updateGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessBriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatewayEndpointDigitalAccessBri")
    @WebResult(name = "getGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessBriRes getGatewayEndpointDigitalAccessBri(
        @WebParam(name = "getGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessBriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewayEndpointDigitalAccessBri")
    @WebResult(name = "removeGatewayEndpointDigitalAccessBriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessBri(
        @WebParam(name = "removeGatewayEndpointDigitalAccessBri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewayEndpointDigitalAccessT1")
    @WebResult(name = "addGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewayEndpointDigitalAccessT1(
        @WebParam(name = "addGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatewayEndpointDigitalAccessT1")
    @WebResult(name = "updateGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatewayEndpointDigitalAccessT1(
        @WebParam(name = "updateGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewayEndpointDigitalAccessT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatewayEndpointDigitalAccessT1")
    @WebResult(name = "getGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewayEndpointDigitalAccessT1Res getGatewayEndpointDigitalAccessT1(
        @WebParam(name = "getGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewayEndpointDigitalAccessT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewayEndpointDigitalAccessT1")
    @WebResult(name = "removeGatewayEndpointDigitalAccessT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewayEndpointDigitalAccessT1(
        @WebParam(name = "removeGatewayEndpointDigitalAccessT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "addCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "addCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "updateCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "updateCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCiscoCatalyst600024PortFXSGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "getCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCiscoCatalyst600024PortFXSGatewayRes getCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "getCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "removeCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "removeCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCiscoCatalyst600024PortFXSGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "listCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCiscoCatalyst600024PortFXSGatewayRes listCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "listCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCiscoCatalyst600024PortFXSGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "resetCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "resetCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "restartCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "restartCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCiscoCatalyst600024PortFXSGateway")
    @WebResult(name = "applyCiscoCatalyst600024PortFXSGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst600024PortFXSGateway(
        @WebParam(name = "applyCiscoCatalyst600024PortFXSGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "addCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "addCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "updateCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "updateCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCiscoCatalyst6000E1VoIPGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "getCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCiscoCatalyst6000E1VoIPGatewayRes getCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "getCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "removeCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "removeCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCiscoCatalyst6000E1VoIPGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "listCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCiscoCatalyst6000E1VoIPGatewayRes listCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "listCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCiscoCatalyst6000E1VoIPGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "resetCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "resetCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "restartCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "restartCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCiscoCatalyst6000E1VoIPGateway")
    @WebResult(name = "applyCiscoCatalyst6000E1VoIPGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000E1VoIPGateway(
        @WebParam(name = "applyCiscoCatalyst6000E1VoIPGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayPriRes getCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayPriRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayPriRes listCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayPriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "resetCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "resetCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "restartCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "restartCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCiscoCatalyst6000T1VoIPGatewayPri")
    @WebResult(name = "applyCiscoCatalyst6000T1VoIPGatewayPriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000T1VoIPGatewayPri(
        @WebParam(name = "applyCiscoCatalyst6000T1VoIPGatewayPri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "addCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "addCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "updateCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "updateCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCiscoCatalyst6000T1VoIPGatewayT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "getCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCiscoCatalyst6000T1VoIPGatewayT1Res getCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "getCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "removeCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "removeCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCiscoCatalyst6000T1VoIPGatewayT1Res
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "listCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCiscoCatalyst6000T1VoIPGatewayT1Res listCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "listCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCiscoCatalyst6000T1VoIPGatewayT1Req axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "resetCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "resetCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "restartCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "restartCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 applyCiscoCatalyst6000T1VoIPGatewayT1")
    @WebResult(name = "applyCiscoCatalyst6000T1VoIPGatewayT1Response", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse applyCiscoCatalyst6000T1VoIPGatewayT1(
        @WebParam(name = "applyCiscoCatalyst6000T1VoIPGatewayT1", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCallPickupGroup")
    @WebResult(name = "addCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCallPickupGroup(
        @WebParam(name = "addCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCallPickupGroup")
    @WebResult(name = "updateCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCallPickupGroup(
        @WebParam(name = "updateCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCallPickupGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCallPickupGroup")
    @WebResult(name = "getCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCallPickupGroupRes getCallPickupGroup(
        @WebParam(name = "getCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCallPickupGroup")
    @WebResult(name = "removeCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCallPickupGroup(
        @WebParam(name = "removeCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCallPickupGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCallPickupGroup")
    @WebResult(name = "listCallPickupGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCallPickupGroupRes listCallPickupGroup(
        @WebParam(name = "listCallPickupGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCallPickupGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRoutePlanRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRoutePlan")
    @WebResult(name = "listRoutePlanResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRoutePlanRes listRoutePlan(
        @WebParam(name = "listRoutePlan", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRoutePlanReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGeoLocationPolicy")
    @WebResult(name = "addGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGeoLocationPolicy(
        @WebParam(name = "addGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGeoLocationPolicy")
    @WebResult(name = "updateGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGeoLocationPolicy(
        @WebParam(name = "updateGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGeoLocationPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGeoLocationPolicy")
    @WebResult(name = "getGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGeoLocationPolicyRes getGeoLocationPolicy(
        @WebParam(name = "getGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGeoLocationPolicy")
    @WebResult(name = "removeGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGeoLocationPolicy(
        @WebParam(name = "removeGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListGeoLocationPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listGeoLocationPolicy")
    @WebResult(name = "listGeoLocationPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListGeoLocationPolicyRes listGeoLocationPolicy(
        @WebParam(name = "listGeoLocationPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListGeoLocationPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSipTrunk")
    @WebResult(name = "addSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSipTrunk(
        @WebParam(name = "addSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSipTrunk")
    @WebResult(name = "updateSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSipTrunk(
        @WebParam(name = "updateSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSipTrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSipTrunk")
    @WebResult(name = "getSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSipTrunkRes getSipTrunk(
        @WebParam(name = "getSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSipTrunk")
    @WebResult(name = "removeSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSipTrunk(
        @WebParam(name = "removeSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSipTrunkRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSipTrunk")
    @WebResult(name = "listSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSipTrunkRes listSipTrunk(
        @WebParam(name = "listSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSipTrunkReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 resetSipTrunk")
    @WebResult(name = "resetSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse resetSipTrunk(
        @WebParam(name = "resetSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 restartSipTrunk")
    @WebResult(name = "restartSipTrunkResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse restartSipTrunk(
        @WebParam(name = "restartSipTrunk", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRegionMatrix")
    @WebResult(name = "updateRegionMatrixResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRegionMatrix(
        @WebParam(name = "updateRegionMatrix", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRegionMatrixReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCalledPartyTransformationPattern")
    @WebResult(name = "addCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCalledPartyTransformationPattern(
        @WebParam(name = "addCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCalledPartyTransformationPattern")
    @WebResult(name = "updateCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCalledPartyTransformationPattern(
        @WebParam(name = "updateCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCalledPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCalledPartyTransformationPattern")
    @WebResult(name = "getCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCalledPartyTransformationPatternRes getCalledPartyTransformationPattern(
        @WebParam(name = "getCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCalledPartyTransformationPattern")
    @WebResult(name = "removeCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCalledPartyTransformationPattern(
        @WebParam(name = "removeCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCalledPartyTransformationPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCalledPartyTransformationPattern")
    @WebResult(name = "listCalledPartyTransformationPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCalledPartyTransformationPatternRes listCalledPartyTransformationPattern(
        @WebParam(name = "listCalledPartyTransformationPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCalledPartyTransformationPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addExternalCallControlProfile")
    @WebResult(name = "addExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addExternalCallControlProfile(
        @WebParam(name = "addExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateExternalCallControlProfile")
    @WebResult(name = "updateExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateExternalCallControlProfile(
        @WebParam(name = "updateExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetExternalCallControlProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getExternalCallControlProfile")
    @WebResult(name = "getExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetExternalCallControlProfileRes getExternalCallControlProfile(
        @WebParam(name = "getExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeExternalCallControlProfile")
    @WebResult(name = "removeExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeExternalCallControlProfile(
        @WebParam(name = "removeExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListExternalCallControlProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listExternalCallControlProfile")
    @WebResult(name = "listExternalCallControlProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListExternalCallControlProfileRes listExternalCallControlProfile(
        @WebParam(name = "listExternalCallControlProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListExternalCallControlProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSafSecurityProfile")
    @WebResult(name = "addSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSafSecurityProfile(
        @WebParam(name = "addSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSafSecurityProfile")
    @WebResult(name = "updateSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSafSecurityProfile(
        @WebParam(name = "updateSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSafSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSafSecurityProfile")
    @WebResult(name = "getSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSafSecurityProfileRes getSafSecurityProfile(
        @WebParam(name = "getSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSafSecurityProfile")
    @WebResult(name = "removeSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSafSecurityProfile(
        @WebParam(name = "removeSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSafSecurityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSafSecurityProfile")
    @WebResult(name = "listSafSecurityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSafSecurityProfileRes listSafSecurityProfile(
        @WebParam(name = "listSafSecurityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSafSecurityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSafForwarder")
    @WebResult(name = "addSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSafForwarder(
        @WebParam(name = "addSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSafForwarder")
    @WebResult(name = "updateSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSafForwarder(
        @WebParam(name = "updateSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSafForwarderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSafForwarder")
    @WebResult(name = "getSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSafForwarderRes getSafForwarder(
        @WebParam(name = "getSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSafForwarder")
    @WebResult(name = "removeSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSafForwarder(
        @WebParam(name = "removeSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSafForwarderRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSafForwarder")
    @WebResult(name = "listSafForwarderResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSafForwarderRes listSafForwarder(
        @WebParam(name = "listSafForwarder", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSafForwarderReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCcdHostedDN")
    @WebResult(name = "addCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCcdHostedDN(
        @WebParam(name = "addCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCcdHostedDN")
    @WebResult(name = "updateCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCcdHostedDN(
        @WebParam(name = "updateCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCcdHostedDNRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCcdHostedDN")
    @WebResult(name = "getCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCcdHostedDNRes getCcdHostedDN(
        @WebParam(name = "getCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCcdHostedDN")
    @WebResult(name = "removeCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCcdHostedDN(
        @WebParam(name = "removeCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCcdHostedDNRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCcdHostedDN")
    @WebResult(name = "listCcdHostedDNResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCcdHostedDNRes listCcdHostedDN(
        @WebParam(name = "listCcdHostedDN", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCcdHostedDNReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCcdHostedDNGroup")
    @WebResult(name = "addCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCcdHostedDNGroup(
        @WebParam(name = "addCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCcdHostedDNGroup")
    @WebResult(name = "updateCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCcdHostedDNGroup(
        @WebParam(name = "updateCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCcdHostedDNGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCcdHostedDNGroup")
    @WebResult(name = "getCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCcdHostedDNGroupRes getCcdHostedDNGroup(
        @WebParam(name = "getCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCcdHostedDNGroup")
    @WebResult(name = "removeCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCcdHostedDNGroup(
        @WebParam(name = "removeCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCcdHostedDNGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCcdHostedDNGroup")
    @WebResult(name = "listCcdHostedDNGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCcdHostedDNGroupRes listCcdHostedDNGroup(
        @WebParam(name = "listCcdHostedDNGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCcdHostedDNGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCcdRequestingService")
    @WebResult(name = "addCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCcdRequestingService(
        @WebParam(name = "addCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCcdRequestingService")
    @WebResult(name = "updateCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCcdRequestingService(
        @WebParam(name = "updateCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCcdRequestingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCcdRequestingService")
    @WebResult(name = "getCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCcdRequestingServiceRes getCcdRequestingService(
        @WebParam(name = "getCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCcdRequestingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCcdRequestingService")
    @WebResult(name = "removeCcdRequestingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCcdRequestingService(
        @WebParam(name = "removeCcdRequestingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateInterClusterServiceProfile")
    @WebResult(name = "updateInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateInterClusterServiceProfile(
        @WebParam(name = "updateInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateInterClusterServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetInterClusterServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getInterClusterServiceProfile")
    @WebResult(name = "getInterClusterServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetInterClusterServiceProfileRes getInterClusterServiceProfile(
        @WebParam(name = "getInterClusterServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetInterClusterServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addRemoteCluster")
    @WebResult(name = "addRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addRemoteCluster(
        @WebParam(name = "addRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRemoteCluster")
    @WebResult(name = "updateRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRemoteCluster(
        @WebParam(name = "updateRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getRemoteCluster")
    @WebResult(name = "getRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetRemoteClusterRes getRemoteCluster(
        @WebParam(name = "getRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeRemoteCluster")
    @WebResult(name = "removeRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeRemoteCluster(
        @WebParam(name = "removeRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listRemoteCluster")
    @WebResult(name = "listRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListRemoteClusterRes listRemoteCluster(
        @WebParam(name = "listRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCcdAdvertisingService")
    @WebResult(name = "addCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCcdAdvertisingService(
        @WebParam(name = "addCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCcdAdvertisingService")
    @WebResult(name = "updateCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCcdAdvertisingService(
        @WebParam(name = "updateCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCcdAdvertisingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCcdAdvertisingService")
    @WebResult(name = "getCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCcdAdvertisingServiceRes getCcdAdvertisingService(
        @WebParam(name = "getCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCcdAdvertisingService")
    @WebResult(name = "removeCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCcdAdvertisingService(
        @WebParam(name = "removeCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCcdAdvertisingServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCcdAdvertisingService")
    @WebResult(name = "listCcdAdvertisingServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCcdAdvertisingServiceRes listCcdAdvertisingService(
        @WebParam(name = "listCcdAdvertisingService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCcdAdvertisingServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUnitsToGateway")
    @WebResult(name = "addUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUnitsToGateway(
        @WebParam(name = "addUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUnitsToGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewaySubunits")
    @WebResult(name = "addGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewaySubunits(
        @WebParam(name = "addGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewaySubunitsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLdapDirectory")
    @WebResult(name = "addLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLdapDirectory(
        @WebParam(name = "addLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLdapDirectory")
    @WebResult(name = "updateLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLdapDirectory(
        @WebParam(name = "updateLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapDirectoryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapDirectory")
    @WebResult(name = "getLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapDirectoryRes getLdapDirectory(
        @WebParam(name = "getLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLdapDirectory")
    @WebResult(name = "removeLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLdapDirectory(
        @WebParam(name = "removeLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLdapDirectoryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLdapDirectory")
    @WebResult(name = "listLdapDirectoryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLdapDirectoryRes listLdapDirectory(
        @WebParam(name = "listLdapDirectory", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLdapDirectoryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateEmccFeatureConfig")
    @WebResult(name = "updateEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateEmccFeatureConfig(
        @WebParam(name = "updateEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateEmccFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetEmccFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getEmccFeatureConfig")
    @WebResult(name = "getEmccFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetEmccFeatureConfigRes getEmccFeatureConfig(
        @WebParam(name = "getEmccFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetEmccFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "addSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "addSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "updateSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "updateSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSafCcdPurgeBlockLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "getSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSafCcdPurgeBlockLearnedRoutesRes getSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "getSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "removeSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "removeSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSafCcdPurgeBlockLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSafCcdPurgeBlockLearnedRoutes")
    @WebResult(name = "listSafCcdPurgeBlockLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSafCcdPurgeBlockLearnedRoutesRes listSafCcdPurgeBlockLearnedRoutes(
        @WebParam(name = "listSafCcdPurgeBlockLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSafCcdPurgeBlockLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVpnGateway")
    @WebResult(name = "addVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVpnGateway(
        @WebParam(name = "addVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVpnGateway")
    @WebResult(name = "updateVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVpnGateway(
        @WebParam(name = "updateVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVpnGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVpnGateway")
    @WebResult(name = "getVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVpnGatewayRes getVpnGateway(
        @WebParam(name = "getVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVpnGateway")
    @WebResult(name = "removeVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVpnGateway(
        @WebParam(name = "removeVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVpnGatewayRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVpnGateway")
    @WebResult(name = "listVpnGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVpnGatewayRes listVpnGateway(
        @WebParam(name = "listVpnGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVpnGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVpnGroup")
    @WebResult(name = "addVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVpnGroup(
        @WebParam(name = "addVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVpnGroup")
    @WebResult(name = "updateVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVpnGroup(
        @WebParam(name = "updateVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVpnGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVpnGroup")
    @WebResult(name = "getVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVpnGroupRes getVpnGroup(
        @WebParam(name = "getVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVpnGroup")
    @WebResult(name = "removeVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVpnGroup(
        @WebParam(name = "removeVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVpnGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVpnGroup")
    @WebResult(name = "listVpnGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVpnGroupRes listVpnGroup(
        @WebParam(name = "listVpnGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVpnGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVpnProfile")
    @WebResult(name = "addVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVpnProfile(
        @WebParam(name = "addVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVpnProfile")
    @WebResult(name = "updateVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVpnProfile(
        @WebParam(name = "updateVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVpnProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVpnProfile")
    @WebResult(name = "getVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVpnProfileRes getVpnProfile(
        @WebParam(name = "getVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVpnProfile")
    @WebResult(name = "removeVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVpnProfile(
        @WebParam(name = "removeVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVpnProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVpnProfile")
    @WebResult(name = "listVpnProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVpnProfileRes listVpnProfile(
        @WebParam(name = "listVpnProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVpnProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeServer")
    @WebResult(name = "addImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeServer(
        @WebParam(name = "addImeServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeServer")
    @WebResult(name = "updateImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeServer(
        @WebParam(name = "updateImeServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeServer")
    @WebResult(name = "getImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeServerRes getImeServer(
        @WebParam(name = "getImeServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeServer")
    @WebResult(name = "removeImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeServer(
        @WebParam(name = "removeImeServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeServer")
    @WebResult(name = "listImeServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeServerRes listImeServer(
        @WebParam(name = "listImeServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeRouteFilterGroup")
    @WebResult(name = "addImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeRouteFilterGroup(
        @WebParam(name = "addImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeRouteFilterGroup")
    @WebResult(name = "updateImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeRouteFilterGroup(
        @WebParam(name = "updateImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeRouteFilterGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeRouteFilterGroup")
    @WebResult(name = "getImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeRouteFilterGroupRes getImeRouteFilterGroup(
        @WebParam(name = "getImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeRouteFilterGroup")
    @WebResult(name = "removeImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeRouteFilterGroup(
        @WebParam(name = "removeImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeRouteFilterGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeRouteFilterGroup")
    @WebResult(name = "listImeRouteFilterGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeRouteFilterGroupRes listImeRouteFilterGroup(
        @WebParam(name = "listImeRouteFilterGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeRouteFilterGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeRouteFilterElement")
    @WebResult(name = "addImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeRouteFilterElement(
        @WebParam(name = "addImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeRouteFilterElement")
    @WebResult(name = "updateImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeRouteFilterElement(
        @WebParam(name = "updateImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeRouteFilterElementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeRouteFilterElement")
    @WebResult(name = "getImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeRouteFilterElementRes getImeRouteFilterElement(
        @WebParam(name = "getImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeRouteFilterElement")
    @WebResult(name = "removeImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeRouteFilterElement(
        @WebParam(name = "removeImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeRouteFilterElementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeRouteFilterElement")
    @WebResult(name = "listImeRouteFilterElementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeRouteFilterElementRes listImeRouteFilterElement(
        @WebParam(name = "listImeRouteFilterElement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeRouteFilterElementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeClient")
    @WebResult(name = "addImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeClient(
        @WebParam(name = "addImeClient", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeClient")
    @WebResult(name = "updateImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeClient(
        @WebParam(name = "updateImeClient", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeClientRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeClient")
    @WebResult(name = "getImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeClientRes getImeClient(
        @WebParam(name = "getImeClient", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeClient")
    @WebResult(name = "removeImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeClient(
        @WebParam(name = "removeImeClient", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeClientRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeClient")
    @WebResult(name = "listImeClientResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeClientRes listImeClient(
        @WebParam(name = "listImeClient", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeClientReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeEnrolledPattern")
    @WebResult(name = "addImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeEnrolledPattern(
        @WebParam(name = "addImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeEnrolledPattern")
    @WebResult(name = "updateImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeEnrolledPattern(
        @WebParam(name = "updateImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeEnrolledPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeEnrolledPattern")
    @WebResult(name = "getImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeEnrolledPatternRes getImeEnrolledPattern(
        @WebParam(name = "getImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeEnrolledPattern")
    @WebResult(name = "removeImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeEnrolledPattern(
        @WebParam(name = "removeImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeEnrolledPatternRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeEnrolledPattern")
    @WebResult(name = "listImeEnrolledPatternResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeEnrolledPatternRes listImeEnrolledPattern(
        @WebParam(name = "listImeEnrolledPattern", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeEnrolledPatternReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeEnrolledPatternGroup")
    @WebResult(name = "addImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeEnrolledPatternGroup(
        @WebParam(name = "addImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeEnrolledPatternGroup")
    @WebResult(name = "updateImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeEnrolledPatternGroup(
        @WebParam(name = "updateImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeEnrolledPatternGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeEnrolledPatternGroup")
    @WebResult(name = "getImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeEnrolledPatternGroupRes getImeEnrolledPatternGroup(
        @WebParam(name = "getImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeEnrolledPatternGroup")
    @WebResult(name = "removeImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeEnrolledPatternGroup(
        @WebParam(name = "removeImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeEnrolledPatternGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeEnrolledPatternGroup")
    @WebResult(name = "listImeEnrolledPatternGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeEnrolledPatternGroupRes listImeEnrolledPatternGroup(
        @WebParam(name = "listImeEnrolledPatternGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeEnrolledPatternGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeExclusionNumber")
    @WebResult(name = "addImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeExclusionNumber(
        @WebParam(name = "addImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeExclusionNumber")
    @WebResult(name = "updateImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeExclusionNumber(
        @WebParam(name = "updateImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeExclusionNumberRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeExclusionNumber")
    @WebResult(name = "getImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeExclusionNumberRes getImeExclusionNumber(
        @WebParam(name = "getImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeExclusionNumber")
    @WebResult(name = "removeImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeExclusionNumber(
        @WebParam(name = "removeImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeExclusionNumberRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeExclusionNumber")
    @WebResult(name = "listImeExclusionNumberResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeExclusionNumberRes listImeExclusionNumber(
        @WebParam(name = "listImeExclusionNumber", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeExclusionNumberReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeExclusionNumberGroup")
    @WebResult(name = "addImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeExclusionNumberGroup(
        @WebParam(name = "addImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeExclusionNumberGroup")
    @WebResult(name = "updateImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeExclusionNumberGroup(
        @WebParam(name = "updateImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeExclusionNumberGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeExclusionNumberGroup")
    @WebResult(name = "getImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeExclusionNumberGroupRes getImeExclusionNumberGroup(
        @WebParam(name = "getImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeExclusionNumberGroup")
    @WebResult(name = "removeImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeExclusionNumberGroup(
        @WebParam(name = "removeImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeExclusionNumberGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeExclusionNumberGroup")
    @WebResult(name = "listImeExclusionNumberGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeExclusionNumberGroupRes listImeExclusionNumberGroup(
        @WebParam(name = "listImeExclusionNumberGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeExclusionNumberGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeFirewall")
    @WebResult(name = "addImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeFirewall(
        @WebParam(name = "addImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeFirewall")
    @WebResult(name = "updateImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeFirewall(
        @WebParam(name = "updateImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeFirewallRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeFirewall")
    @WebResult(name = "getImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeFirewallRes getImeFirewall(
        @WebParam(name = "getImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeFirewall")
    @WebResult(name = "removeImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeFirewall(
        @WebParam(name = "removeImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeFirewallRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeFirewall")
    @WebResult(name = "listImeFirewallResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeFirewallRes listImeFirewall(
        @WebParam(name = "listImeFirewall", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeFirewallReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImeE164Transformation")
    @WebResult(name = "addImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImeE164Transformation(
        @WebParam(name = "addImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeE164Transformation")
    @WebResult(name = "updateImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeE164Transformation(
        @WebParam(name = "updateImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeE164TransformationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeE164Transformation")
    @WebResult(name = "getImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeE164TransformationRes getImeE164Transformation(
        @WebParam(name = "getImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeE164Transformation")
    @WebResult(name = "removeImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeE164Transformation(
        @WebParam(name = "removeImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImeE164TransformationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImeE164Transformation")
    @WebResult(name = "listImeE164TransformationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImeE164TransformationRes listImeE164Transformation(
        @WebParam(name = "listImeE164Transformation", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImeE164TransformationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addTransformationProfile")
    @WebResult(name = "addTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addTransformationProfile(
        @WebParam(name = "addTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTransformationProfile")
    @WebResult(name = "updateTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTransformationProfile(
        @WebParam(name = "updateTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTransformationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTransformationProfile")
    @WebResult(name = "getTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTransformationProfileRes getTransformationProfile(
        @WebParam(name = "getTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeTransformationProfile")
    @WebResult(name = "removeTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeTransformationProfile(
        @WebParam(name = "removeTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTransformationProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTransformationProfile")
    @WebResult(name = "listTransformationProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTransformationProfileRes listTransformationProfile(
        @WebParam(name = "listTransformationProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTransformationProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addFallbackProfile")
    @WebResult(name = "addFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addFallbackProfile(
        @WebParam(name = "addFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFallbackProfile")
    @WebResult(name = "updateFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFallbackProfile(
        @WebParam(name = "updateFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFallbackProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFallbackProfile")
    @WebResult(name = "getFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFallbackProfileRes getFallbackProfile(
        @WebParam(name = "getFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeFallbackProfile")
    @WebResult(name = "removeFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeFallbackProfile(
        @WebParam(name = "removeFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListFallbackProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listFallbackProfile")
    @WebResult(name = "listFallbackProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListFallbackProfileRes listFallbackProfile(
        @WebParam(name = "listFallbackProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListFallbackProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLdapFilter")
    @WebResult(name = "addLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLdapFilter(
        @WebParam(name = "addLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLdapFilter")
    @WebResult(name = "updateLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLdapFilter(
        @WebParam(name = "updateLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapFilter")
    @WebResult(name = "getLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapFilterRes getLdapFilter(
        @WebParam(name = "getLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLdapFilter")
    @WebResult(name = "removeLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLdapFilter(
        @WebParam(name = "removeLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLdapFilterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLdapFilter")
    @WebResult(name = "listLdapFilterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLdapFilterRes listLdapFilter(
        @WebParam(name = "listLdapFilter", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLdapFilterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAppServerInfo")
    @WebResult(name = "addAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAppServerInfo(
        @WebParam(name = "addAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAppServerInfo")
    @WebResult(name = "updateAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAppServerInfo(
        @WebParam(name = "updateAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateTvsCertificate")
    @WebResult(name = "updateTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateTvsCertificate(
        @WebParam(name = "updateTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetTvsCertificateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getTvsCertificate")
    @WebResult(name = "getTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetTvsCertificateRes getTvsCertificate(
        @WebParam(name = "getTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListTvsCertificateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listTvsCertificate")
    @WebResult(name = "listTvsCertificateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListTvsCertificateRes listTvsCertificate(
        @WebParam(name = "listTvsCertificate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListTvsCertificateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addFeatureControlPolicy")
    @WebResult(name = "addFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addFeatureControlPolicy(
        @WebParam(name = "addFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFeatureControlPolicy")
    @WebResult(name = "updateFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFeatureControlPolicy(
        @WebParam(name = "updateFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFeatureControlPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFeatureControlPolicy")
    @WebResult(name = "getFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFeatureControlPolicyRes getFeatureControlPolicy(
        @WebParam(name = "getFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeFeatureControlPolicy")
    @WebResult(name = "removeFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeFeatureControlPolicy(
        @WebParam(name = "removeFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListFeatureControlPolicyRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listFeatureControlPolicy")
    @WebResult(name = "listFeatureControlPolicyResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListFeatureControlPolicyRes listFeatureControlPolicy(
        @WebParam(name = "listFeatureControlPolicy", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListFeatureControlPolicyReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMobilityProfile")
    @WebResult(name = "addMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMobilityProfile(
        @WebParam(name = "addMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMobilityProfile")
    @WebResult(name = "updateMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMobilityProfile(
        @WebParam(name = "updateMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMobilityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMobilityProfile")
    @WebResult(name = "getMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMobilityProfileRes getMobilityProfile(
        @WebParam(name = "getMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeMobilityProfile")
    @WebResult(name = "removeMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeMobilityProfile(
        @WebParam(name = "removeMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListMobilityProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listMobilityProfile")
    @WebResult(name = "listMobilityProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListMobilityProfileRes listMobilityProfile(
        @WebParam(name = "listMobilityProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListMobilityProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "addEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "addEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "updateEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "updateEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetEnterpriseFeatureAccessConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "getEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetEnterpriseFeatureAccessConfigurationRes getEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "getEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "removeEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "removeEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListEnterpriseFeatureAccessConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listEnterpriseFeatureAccessConfiguration")
    @WebResult(name = "listEnterpriseFeatureAccessConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListEnterpriseFeatureAccessConfigurationRes listEnterpriseFeatureAccessConfiguration(
        @WebParam(name = "listEnterpriseFeatureAccessConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListEnterpriseFeatureAccessConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addHandoffConfiguration")
    @WebResult(name = "addHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addHandoffConfiguration(
        @WebParam(name = "addHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateHandoffConfiguration")
    @WebResult(name = "updateHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateHandoffConfiguration(
        @WebParam(name = "updateHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetHandoffConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getHandoffConfiguration")
    @WebResult(name = "getHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetHandoffConfigurationRes getHandoffConfiguration(
        @WebParam(name = "getHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeHandoffConfiguration")
    @WebResult(name = "removeHandoffConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeHandoffConfiguration(
        @WebParam(name = "removeHandoffConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveHandoffConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCalledPartyTracing")
    @WebResult(name = "addCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCalledPartyTracing(
        @WebParam(name = "addCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCalledPartyTracing")
    @WebResult(name = "removeCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCalledPartyTracing(
        @WebParam(name = "removeCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCalledPartyTracingRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCalledPartyTracing")
    @WebResult(name = "listCalledPartyTracingResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCalledPartyTracingRes listCalledPartyTracing(
        @WebParam(name = "listCalledPartyTracing", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCalledPartyTracingReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSIPNormalizationScript")
    @WebResult(name = "addSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSIPNormalizationScript(
        @WebParam(name = "addSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSIPNormalizationScript")
    @WebResult(name = "updateSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSIPNormalizationScript(
        @WebParam(name = "updateSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSIPNormalizationScriptRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSIPNormalizationScript")
    @WebResult(name = "getSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSIPNormalizationScriptRes getSIPNormalizationScript(
        @WebParam(name = "getSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSIPNormalizationScript")
    @WebResult(name = "removeSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSIPNormalizationScript(
        @WebParam(name = "removeSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSIPNormalizationScriptRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSIPNormalizationScript")
    @WebResult(name = "listSIPNormalizationScriptResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSIPNormalizationScriptRes listSIPNormalizationScript(
        @WebParam(name = "listSIPNormalizationScript", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSIPNormalizationScriptReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCustomUserField")
    @WebResult(name = "addCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCustomUserField(
        @WebParam(name = "addCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCustomUserField")
    @WebResult(name = "updateCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCustomUserField(
        @WebParam(name = "updateCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCustomUserFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCustomUserField")
    @WebResult(name = "getCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCustomUserFieldRes getCustomUserField(
        @WebParam(name = "getCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCustomUserField")
    @WebResult(name = "removeCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCustomUserField(
        @WebParam(name = "removeCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCustomUserFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCustomUserField")
    @WebResult(name = "listCustomUserFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCustomUserFieldRes listCustomUserField(
        @WebParam(name = "listCustomUserField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCustomUserFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addGatewaySccpEndpoints")
    @WebResult(name = "addGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addGatewaySccpEndpoints(
        @WebParam(name = "addGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateGatewaySccpEndpoints")
    @WebResult(name = "updateGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateGatewaySccpEndpoints(
        @WebParam(name = "updateGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetGatewaySccpEndpointsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getGatewaySccpEndpoints")
    @WebResult(name = "getGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetGatewaySccpEndpointsRes getGatewaySccpEndpoints(
        @WebParam(name = "getGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetGatewaySccpEndpointsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewaySccpEndpoints")
    @WebResult(name = "removeGatewaySccpEndpointsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewaySccpEndpoints(
        @WebParam(name = "removeGatewaySccpEndpoints", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addBillingServer")
    @WebResult(name = "addBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addBillingServer(
        @WebParam(name = "addBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListBillingServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listBillingServer")
    @WebResult(name = "listBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListBillingServerRes listBillingServer(
        @WebParam(name = "listBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLbmGroup")
    @WebResult(name = "addLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLbmGroup(
        @WebParam(name = "addLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLbmGroup")
    @WebResult(name = "updateLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLbmGroup(
        @WebParam(name = "updateLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLbmGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLbmGroup")
    @WebResult(name = "getLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLbmGroupRes getLbmGroup(
        @WebParam(name = "getLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLbmGroup")
    @WebResult(name = "removeLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLbmGroup(
        @WebParam(name = "removeLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLbmGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLbmGroup")
    @WebResult(name = "listLbmGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLbmGroupRes listLbmGroup(
        @WebParam(name = "listLbmGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLbmGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAnnouncement")
    @WebResult(name = "addAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAnnouncement(
        @WebParam(name = "addAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAnnouncement")
    @WebResult(name = "updateAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAnnouncement(
        @WebParam(name = "updateAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAnnouncementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAnnouncement")
    @WebResult(name = "getAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAnnouncementRes getAnnouncement(
        @WebParam(name = "getAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAnnouncement")
    @WebResult(name = "removeAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAnnouncement(
        @WebParam(name = "removeAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAnnouncementRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAnnouncement")
    @WebResult(name = "listAnnouncementResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAnnouncementRes listAnnouncement(
        @WebParam(name = "listAnnouncement", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAnnouncementReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addServiceProfile")
    @WebResult(name = "addServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addServiceProfile(
        @WebParam(name = "addServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateServiceProfile")
    @WebResult(name = "updateServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateServiceProfile(
        @WebParam(name = "updateServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getServiceProfile")
    @WebResult(name = "getServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetServiceProfileRes getServiceProfile(
        @WebParam(name = "getServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeServiceProfile")
    @WebResult(name = "removeServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeServiceProfile(
        @WebParam(name = "removeServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListServiceProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listServiceProfile")
    @WebResult(name = "listServiceProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListServiceProfileRes listServiceProfile(
        @WebParam(name = "listServiceProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListServiceProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLdapSyncCustomField")
    @WebResult(name = "addLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLdapSyncCustomField(
        @WebParam(name = "addLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLdapSyncCustomField")
    @WebResult(name = "updateLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLdapSyncCustomField(
        @WebParam(name = "updateLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapSyncCustomFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapSyncCustomField")
    @WebResult(name = "getLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapSyncCustomFieldRes getLdapSyncCustomField(
        @WebParam(name = "getLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLdapSyncCustomField")
    @WebResult(name = "removeLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLdapSyncCustomField(
        @WebParam(name = "removeLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAudioCodecPreferenceList")
    @WebResult(name = "addAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAudioCodecPreferenceList(
        @WebParam(name = "addAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAudioCodecPreferenceList")
    @WebResult(name = "updateAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAudioCodecPreferenceList(
        @WebParam(name = "updateAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAudioCodecPreferenceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAudioCodecPreferenceList")
    @WebResult(name = "getAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAudioCodecPreferenceListRes getAudioCodecPreferenceList(
        @WebParam(name = "getAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAudioCodecPreferenceList")
    @WebResult(name = "removeAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAudioCodecPreferenceList(
        @WebParam(name = "removeAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAudioCodecPreferenceListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAudioCodecPreferenceList")
    @WebResult(name = "listAudioCodecPreferenceListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAudioCodecPreferenceListRes listAudioCodecPreferenceList(
        @WebParam(name = "listAudioCodecPreferenceList", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAudioCodecPreferenceListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUcService")
    @WebResult(name = "addUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUcService(
        @WebParam(name = "addUcService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUcService")
    @WebResult(name = "updateUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUcService(
        @WebParam(name = "updateUcService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUcServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUcService")
    @WebResult(name = "getUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUcServiceRes getUcService(
        @WebParam(name = "getUcService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUcService")
    @WebResult(name = "removeUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUcService(
        @WebParam(name = "removeUcService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUcServiceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUcService")
    @WebResult(name = "listUcServiceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUcServiceRes listUcService(
        @WebParam(name = "listUcService", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUcServiceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLbmHubGroup")
    @WebResult(name = "addLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLbmHubGroup(
        @WebParam(name = "addLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLbmHubGroup")
    @WebResult(name = "updateLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLbmHubGroup(
        @WebParam(name = "updateLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLbmHubGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLbmHubGroup")
    @WebResult(name = "getLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLbmHubGroupRes getLbmHubGroup(
        @WebParam(name = "getLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLbmHubGroup")
    @WebResult(name = "removeLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLbmHubGroup(
        @WebParam(name = "removeLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLbmHubGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLbmHubGroup")
    @WebResult(name = "listLbmHubGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLbmHubGroupRes listLbmHubGroup(
        @WebParam(name = "listLbmHubGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLbmHubGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addImportedDirectoryUriCatalogs")
    @WebResult(name = "addImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addImportedDirectoryUriCatalogs(
        @WebParam(name = "addImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImportedDirectoryUriCatalogs")
    @WebResult(name = "updateImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImportedDirectoryUriCatalogs(
        @WebParam(name = "updateImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImportedDirectoryUriCatalogsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImportedDirectoryUriCatalogs")
    @WebResult(name = "getImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImportedDirectoryUriCatalogsRes getImportedDirectoryUriCatalogs(
        @WebParam(name = "getImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImportedDirectoryUriCatalogs")
    @WebResult(name = "removeImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImportedDirectoryUriCatalogs(
        @WebParam(name = "removeImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListImportedDirectoryUriCatalogsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listImportedDirectoryUriCatalogs")
    @WebResult(name = "listImportedDirectoryUriCatalogsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListImportedDirectoryUriCatalogsRes listImportedDirectoryUriCatalogs(
        @WebParam(name = "listImportedDirectoryUriCatalogs", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListImportedDirectoryUriCatalogsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addVohServer")
    @WebResult(name = "addVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addVohServer(
        @WebParam(name = "addVohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateVohServer")
    @WebResult(name = "updateVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateVohServer(
        @WebParam(name = "updateVohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetVohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getVohServer")
    @WebResult(name = "getVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetVohServerRes getVohServer(
        @WebParam(name = "getVohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeVohServer")
    @WebResult(name = "removeVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeVohServer(
        @WebParam(name = "removeVohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListVohServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listVohServer")
    @WebResult(name = "listVohServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListVohServerRes listVohServer(
        @WebParam(name = "listVohServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListVohServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSdpTransparencyProfile")
    @WebResult(name = "addSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addSdpTransparencyProfile(
        @WebParam(name = "addSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSdpTransparencyProfile")
    @WebResult(name = "updateSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSdpTransparencyProfile(
        @WebParam(name = "updateSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSdpTransparencyProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSdpTransparencyProfile")
    @WebResult(name = "getSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSdpTransparencyProfileRes getSdpTransparencyProfile(
        @WebParam(name = "getSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSdpTransparencyProfile")
    @WebResult(name = "removeSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeSdpTransparencyProfile(
        @WebParam(name = "removeSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListSdpTransparencyProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listSdpTransparencyProfile")
    @WebResult(name = "listSdpTransparencyProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListSdpTransparencyProfileRes listSdpTransparencyProfile(
        @WebParam(name = "listSdpTransparencyProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListSdpTransparencyProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addFeatureGroupTemplate")
    @WebResult(name = "addFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addFeatureGroupTemplate(
        @WebParam(name = "addFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFeatureGroupTemplate")
    @WebResult(name = "updateFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFeatureGroupTemplate(
        @WebParam(name = "updateFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFeatureGroupTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFeatureGroupTemplate")
    @WebResult(name = "getFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFeatureGroupTemplateRes getFeatureGroupTemplate(
        @WebParam(name = "getFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeFeatureGroupTemplate")
    @WebResult(name = "removeFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeFeatureGroupTemplate(
        @WebParam(name = "removeFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListFeatureGroupTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listFeatureGroupTemplate")
    @WebResult(name = "listFeatureGroupTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListFeatureGroupTemplateRes listFeatureGroupTemplate(
        @WebParam(name = "listFeatureGroupTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListFeatureGroupTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addDirNumberAliasLookupandSync")
    @WebResult(name = "addDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addDirNumberAliasLookupandSync(
        @WebParam(name = "addDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateDirNumberAliasLookupandSync")
    @WebResult(name = "updateDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateDirNumberAliasLookupandSync(
        @WebParam(name = "updateDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetDirNumberAliasLookupandSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getDirNumberAliasLookupandSync")
    @WebResult(name = "getDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetDirNumberAliasLookupandSyncRes getDirNumberAliasLookupandSync(
        @WebParam(name = "getDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeDirNumberAliasLookupandSync")
    @WebResult(name = "removeDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeDirNumberAliasLookupandSync(
        @WebParam(name = "removeDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListDirNumberAliasLookupandSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listDirNumberAliasLookupandSync")
    @WebResult(name = "listDirNumberAliasLookupandSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListDirNumberAliasLookupandSyncRes listDirNumberAliasLookupandSync(
        @WebParam(name = "listDirNumberAliasLookupandSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListDirNumberAliasLookupandSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addLocalRouteGroup")
    @WebResult(name = "addLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addLocalRouteGroup(
        @WebParam(name = "addLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLocalRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLocalRouteGroup")
    @WebResult(name = "getLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLocalRouteGroupRes getLocalRouteGroup(
        @WebParam(name = "getLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLocalRouteGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLocalRouteGroup")
    @WebResult(name = "listLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLocalRouteGroupRes listLocalRouteGroup(
        @WebParam(name = "listLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addAdvertisedPatterns")
    @WebResult(name = "addAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addAdvertisedPatterns(
        @WebParam(name = "addAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateAdvertisedPatterns")
    @WebResult(name = "updateAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateAdvertisedPatterns(
        @WebParam(name = "updateAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAdvertisedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAdvertisedPatterns")
    @WebResult(name = "getAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAdvertisedPatternsRes getAdvertisedPatterns(
        @WebParam(name = "getAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAdvertisedPatterns")
    @WebResult(name = "removeAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAdvertisedPatterns(
        @WebParam(name = "removeAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAdvertisedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAdvertisedPatterns")
    @WebResult(name = "listAdvertisedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAdvertisedPatternsRes listAdvertisedPatterns(
        @WebParam(name = "listAdvertisedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAdvertisedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addBlockedLearnedPatterns")
    @WebResult(name = "addBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addBlockedLearnedPatterns(
        @WebParam(name = "addBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateBlockedLearnedPatterns")
    @WebResult(name = "updateBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateBlockedLearnedPatterns(
        @WebParam(name = "updateBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetBlockedLearnedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getBlockedLearnedPatterns")
    @WebResult(name = "getBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetBlockedLearnedPatternsRes getBlockedLearnedPatterns(
        @WebParam(name = "getBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeBlockedLearnedPatterns")
    @WebResult(name = "removeBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeBlockedLearnedPatterns(
        @WebParam(name = "removeBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListBlockedLearnedPatternsRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listBlockedLearnedPatterns")
    @WebResult(name = "listBlockedLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListBlockedLearnedPatternsRes listBlockedLearnedPatterns(
        @WebParam(name = "listBlockedLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListBlockedLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addCCAProfiles")
    @WebResult(name = "addCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addCCAProfiles(
        @WebParam(name = "addCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCCAProfiles")
    @WebResult(name = "updateCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCCAProfiles(
        @WebParam(name = "updateCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCCAProfilesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCCAProfiles")
    @WebResult(name = "getCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCCAProfilesRes getCCAProfiles(
        @WebParam(name = "getCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeCCAProfiles")
    @WebResult(name = "removeCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeCCAProfiles(
        @WebParam(name = "removeCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListCCAProfilesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listCCAProfiles")
    @WebResult(name = "listCCAProfilesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListCCAProfilesRes listCCAProfiles(
        @WebParam(name = "listCCAProfiles", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListCCAProfilesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUniversalDeviceTemplate")
    @WebResult(name = "addUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUniversalDeviceTemplate(
        @WebParam(name = "addUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUniversalDeviceTemplate")
    @WebResult(name = "updateUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUniversalDeviceTemplate(
        @WebParam(name = "updateUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUniversalDeviceTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUniversalDeviceTemplate")
    @WebResult(name = "getUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUniversalDeviceTemplateRes getUniversalDeviceTemplate(
        @WebParam(name = "getUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUniversalDeviceTemplate")
    @WebResult(name = "removeUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUniversalDeviceTemplate(
        @WebParam(name = "removeUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUniversalDeviceTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUniversalDeviceTemplate")
    @WebResult(name = "listUniversalDeviceTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUniversalDeviceTemplateRes listUniversalDeviceTemplate(
        @WebParam(name = "listUniversalDeviceTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUniversalDeviceTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUserProfileProvision")
    @WebResult(name = "addUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUserProfileProvision(
        @WebParam(name = "addUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUserProfileProvision")
    @WebResult(name = "updateUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUserProfileProvision(
        @WebParam(name = "updateUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUserProfileProvisionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUserProfileProvision")
    @WebResult(name = "getUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUserProfileProvisionRes getUserProfileProvision(
        @WebParam(name = "getUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUserProfileProvision")
    @WebResult(name = "removeUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUserProfileProvision(
        @WebParam(name = "removeUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUserProfileProvisionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUserProfileProvision")
    @WebResult(name = "listUserProfileProvisionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUserProfileProvisionRes listUserProfileProvision(
        @WebParam(name = "listUserProfileProvision", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUserProfileProvisionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addPresenceRedundancyGroup")
    @WebResult(name = "addPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addPresenceRedundancyGroup(
        @WebParam(name = "addPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePresenceRedundancyGroup")
    @WebResult(name = "updatePresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePresenceRedundancyGroup(
        @WebParam(name = "updatePresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPresenceRedundancyGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPresenceRedundancyGroup")
    @WebResult(name = "getPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPresenceRedundancyGroupRes getPresenceRedundancyGroup(
        @WebParam(name = "getPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removePresenceRedundancyGroup")
    @WebResult(name = "removePresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removePresenceRedundancyGroup(
        @WebParam(name = "removePresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListPresenceRedundancyGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listPresenceRedundancyGroup")
    @WebResult(name = "listPresenceRedundancyGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListPresenceRedundancyGroupRes listPresenceRedundancyGroup(
        @WebParam(name = "listPresenceRedundancyGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListPresenceRedundancyGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAssignedPresenceServersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAssignedPresenceServers")
    @WebResult(name = "listAssignedPresenceServersResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAssignedPresenceServersRes listAssignedPresenceServers(
        @WebParam(name = "listAssignedPresenceServers", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAssignedPresenceServersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUnassignedPresenceServersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUnassignedPresenceServers")
    @WebResult(name = "listUnassignedPresenceServersResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUnassignedPresenceServersRes listUnassignedPresenceServers(
        @WebParam(name = "listUnassignedPresenceServers", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUnassignedPresenceServersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListAssignedPresenceUsersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listAssignedPresenceUsers")
    @WebResult(name = "listAssignedPresenceUsersResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListAssignedPresenceUsersRes listAssignedPresenceUsers(
        @WebParam(name = "listAssignedPresenceUsers", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListAssignedPresenceUsersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUnassignedPresenceUsersRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUnassignedPresenceUsers")
    @WebResult(name = "listUnassignedPresenceUsersResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUnassignedPresenceUsersRes listUnassignedPresenceUsers(
        @WebParam(name = "listUnassignedPresenceUsers", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUnassignedPresenceUsersReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addWifiHotspot")
    @WebResult(name = "addWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addWifiHotspot(
        @WebParam(name = "addWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateWifiHotspot")
    @WebResult(name = "updateWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateWifiHotspot(
        @WebParam(name = "updateWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetWifiHotspotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getWifiHotspot")
    @WebResult(name = "getWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetWifiHotspotRes getWifiHotspot(
        @WebParam(name = "getWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeWifiHotspot")
    @WebResult(name = "removeWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeWifiHotspot(
        @WebParam(name = "removeWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListWifiHotspotRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listWifiHotspot")
    @WebResult(name = "listWifiHotspotResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListWifiHotspotRes listWifiHotspot(
        @WebParam(name = "listWifiHotspot", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListWifiHotspotReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addWlanProfileGroup")
    @WebResult(name = "addWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addWlanProfileGroup(
        @WebParam(name = "addWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateWlanProfileGroup")
    @WebResult(name = "updateWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateWlanProfileGroup(
        @WebParam(name = "updateWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetWlanProfileGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getWlanProfileGroup")
    @WebResult(name = "getWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetWlanProfileGroupRes getWlanProfileGroup(
        @WebParam(name = "getWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeWlanProfileGroup")
    @WebResult(name = "removeWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeWlanProfileGroup(
        @WebParam(name = "removeWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListWlanProfileGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listWlanProfileGroup")
    @WebResult(name = "listWlanProfileGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListWlanProfileGroupRes listWlanProfileGroup(
        @WebParam(name = "listWlanProfileGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListWlanProfileGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addWLANProfile")
    @WebResult(name = "addWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addWLANProfile(
        @WebParam(name = "addWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateWLANProfile")
    @WebResult(name = "updateWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateWLANProfile(
        @WebParam(name = "updateWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetWLANProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getWLANProfile")
    @WebResult(name = "getWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetWLANProfileRes getWLANProfile(
        @WebParam(name = "getWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeWLANProfile")
    @WebResult(name = "removeWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeWLANProfile(
        @WebParam(name = "removeWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListWLANProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listWLANProfile")
    @WebResult(name = "listWLANProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListWLANProfileRes listWLANProfile(
        @WebParam(name = "listWLANProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListWLANProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addUniversalLineTemplate")
    @WebResult(name = "addUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addUniversalLineTemplate(
        @WebParam(name = "addUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateUniversalLineTemplate")
    @WebResult(name = "updateUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateUniversalLineTemplate(
        @WebParam(name = "updateUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetUniversalLineTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getUniversalLineTemplate")
    @WebResult(name = "getUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetUniversalLineTemplateRes getUniversalLineTemplate(
        @WebParam(name = "getUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUniversalLineTemplate")
    @WebResult(name = "removeUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUniversalLineTemplate(
        @WebParam(name = "removeUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUniversalLineTemplateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUniversalLineTemplate")
    @WebResult(name = "listUniversalLineTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUniversalLineTemplateRes listUniversalLineTemplate(
        @WebParam(name = "listUniversalLineTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUniversalLineTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addNetworkAccessProfile")
    @WebResult(name = "addNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addNetworkAccessProfile(
        @WebParam(name = "addNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateNetworkAccessProfile")
    @WebResult(name = "updateNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateNetworkAccessProfile(
        @WebParam(name = "updateNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetNetworkAccessProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getNetworkAccessProfile")
    @WebResult(name = "getNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetNetworkAccessProfileRes getNetworkAccessProfile(
        @WebParam(name = "getNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeNetworkAccessProfile")
    @WebResult(name = "removeNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeNetworkAccessProfile(
        @WebParam(name = "removeNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListNetworkAccessProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listNetworkAccessProfile")
    @WebResult(name = "listNetworkAccessProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListNetworkAccessProfileRes listNetworkAccessProfile(
        @WebParam(name = "listNetworkAccessProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListNetworkAccessProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLicensedUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLicensedUser")
    @WebResult(name = "getLicensedUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLicensedUserRes getLicensedUser(
        @WebParam(name = "getLicensedUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLicensedUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLicensedUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLicensedUser")
    @WebResult(name = "listLicensedUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLicensedUserRes listLicensedUser(
        @WebParam(name = "listLicensedUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLicensedUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addHttpProfile")
    @WebResult(name = "addHttpProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addHttpProfile(
        @WebParam(name = "addHttpProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddHttpProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateHttpProfile")
    @WebResult(name = "updateHttpProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateHttpProfile(
        @WebParam(name = "updateHttpProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateHttpProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetHttpProfileRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getHttpProfile")
    @WebResult(name = "getHttpProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetHttpProfileRes getHttpProfile(
        @WebParam(name = "getHttpProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetHttpProfileReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeHttpProfile")
    @WebResult(name = "removeHttpProfileResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeHttpProfile(
        @WebParam(name = "removeHttpProfile", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addElinGroup")
    @WebResult(name = "addElinGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addElinGroup(
        @WebParam(name = "addElinGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddElinGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateElinGroup")
    @WebResult(name = "updateElinGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateElinGroup(
        @WebParam(name = "updateElinGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateElinGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetElinGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getElinGroup")
    @WebResult(name = "getElinGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetElinGroupRes getElinGroup(
        @WebParam(name = "getElinGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetElinGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeElinGroup")
    @WebResult(name = "removeElinGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeElinGroup(
        @WebParam(name = "removeElinGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        NameAndGUIDRequest axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListElinGroupRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listElinGroup")
    @WebResult(name = "listElinGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListElinGroupRes listElinGroup(
        @WebParam(name = "listElinGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListElinGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSecureConfig")
    @WebResult(name = "updateSecureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSecureConfig(
        @WebParam(name = "updateSecureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSecureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSecureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSecureConfig")
    @WebResult(name = "getSecureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSecureConfigRes getSecureConfig(
        @WebParam(name = "getSecureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSecureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListUnassignedDeviceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listUnassignedDevice")
    @WebResult(name = "listUnassignedDeviceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListUnassignedDeviceRes listUnassignedDevice(
        @WebParam(name = "listUnassignedDevice", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListUnassignedDeviceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ExecuteSQLQueryRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 executeSQLQuery")
    @WebResult(name = "executeSQLQueryResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ExecuteSQLQueryRes executeSQLQuery(
        @WebParam(name = "executeSQLQuery", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ExecuteSQLQueryReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ExecuteSQLUpdateRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 executeSQLUpdate")
    @WebResult(name = "executeSQLUpdateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ExecuteSQLUpdateRes executeSQLUpdate(
        @WebParam(name = "executeSQLUpdate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ExecuteSQLUpdateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoAuthenticateUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doAuthenticateUser")
    @WebResult(name = "doAuthenticateUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoAuthenticateUserRes doAuthenticateUser(
        @WebParam(name = "doAuthenticateUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoAuthenticateUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoDeviceLoginRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doDeviceLogin")
    @WebResult(name = "doDeviceLoginResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoDeviceLoginRes doDeviceLogin(
        @WebParam(name = "doDeviceLogin", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoDeviceLoginReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoDeviceLogoutRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doDeviceLogout")
    @WebResult(name = "doDeviceLogoutResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoDeviceLogoutRes doDeviceLogout(
        @WebParam(name = "doDeviceLogout", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoDeviceLogoutReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoDeviceResetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doDeviceReset")
    @WebResult(name = "doDeviceResetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoDeviceResetRes doDeviceReset(
        @WebParam(name = "doDeviceReset", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoDeviceResetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetOSVersionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getOSVersion")
    @WebResult(name = "getOSVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetOSVersionRes getOSVersion(
        @WebParam(name = "getOSVersion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetOSVersionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetNumDevicesResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getNumDevices")
    @WebResult(name = "getNumDevicesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetNumDevicesResponse getNumDevices(
        @WebParam(name = "getNumDevices", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetNumDevicesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addMobility")
    @WebResult(name = "addMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addMobility(
        @WebParam(name = "addMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateMobility")
    @WebResult(name = "updateMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateMobility(
        @WebParam(name = "updateMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetMobilityRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getMobility")
    @WebResult(name = "getMobilityResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetMobilityRes getMobility(
        @WebParam(name = "getMobility", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetMobilityReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetEnterprisePhoneConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getEnterprisePhoneConfig")
    @WebResult(name = "getEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetEnterprisePhoneConfigRes getEnterprisePhoneConfig(
        @WebParam(name = "getEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetEnterprisePhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateEnterprisePhoneConfig")
    @WebResult(name = "updateEnterprisePhoneConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateEnterprisePhoneConfig(
        @WebParam(name = "updateEnterprisePhoneConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateEnterprisePhoneConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapSystemRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapSystem")
    @WebResult(name = "getLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapSystemRes getLdapSystem(
        @WebParam(name = "getLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapSystemReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLdapSystem")
    @WebResult(name = "updateLdapSystemResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLdapSystem(
        @WebParam(name = "updateLdapSystem", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLdapSystemReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapAuthenticationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapAuthentication")
    @WebResult(name = "getLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapAuthenticationRes getLdapAuthentication(
        @WebParam(name = "getLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapAuthenticationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLdapAuthentication")
    @WebResult(name = "updateLdapAuthenticationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLdapAuthentication(
        @WebParam(name = "updateLdapAuthentication", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLdapAuthenticationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addApplicationToSoftkeyTemplate")
    @WebResult(name = "addApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse addApplicationToSoftkeyTemplate(
        @WebParam(name = "addApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddApplicationToSoftkeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeApplicationToSoftkeyTemplate")
    @WebResult(name = "removeApplicationToSoftkeyTemplateResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeApplicationToSoftkeyTemplate(
        @WebParam(name = "removeApplicationToSoftkeyTemplate", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveApplicationToSoftkeyTemplateReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCCMVersionRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCCMVersion")
    @WebResult(name = "getCCMVersionResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCCMVersionRes getCCMVersion(
        @WebParam(name = "getCCMVersion", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCCMVersionReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeUnitsToGateway")
    @WebResult(name = "removeUnitsToGatewayResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeUnitsToGateway(
        @WebParam(name = "removeUnitsToGateway", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveUnitsToGatewayReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeGatewaySubunits")
    @WebResult(name = "removeGatewaySubunitsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeGatewaySubunits(
        @WebParam(name = "removeGatewaySubunits", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveGatewaySubunitsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeFeatureConfig")
    @WebResult(name = "updateImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeFeatureConfig(
        @WebParam(name = "updateImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateFallbackFeatureConfig")
    @WebResult(name = "updateFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateFallbackFeatureConfig(
        @WebParam(name = "updateFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateFallbackFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeImeLearnedRoutes")
    @WebResult(name = "removeImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeImeLearnedRoutes(
        @WebParam(name = "removeImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateImeLearnedRoutes")
    @WebResult(name = "updateImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateImeLearnedRoutes(
        @WebParam(name = "updateImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeLearnedRoutesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeLearnedRoutes")
    @WebResult(name = "getImeLearnedRoutesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeLearnedRoutesRes getImeLearnedRoutes(
        @WebParam(name = "getImeLearnedRoutes", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeLearnedRoutesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetImeFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getImeFeatureConfig")
    @WebResult(name = "getImeFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetImeFeatureConfigRes getImeFeatureConfig(
        @WebParam(name = "getImeFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetImeFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetFallbackFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getFallbackFeatureConfig")
    @WebResult(name = "getFallbackFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetFallbackFeatureConfigRes getFallbackFeatureConfig(
        @WebParam(name = "getFallbackFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetFallbackFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetAppServerInfoRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getAppServerInfo")
    @WebResult(name = "getAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetAppServerInfoRes getAppServerInfo(
        @WebParam(name = "getAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeAppServerInfo")
    @WebResult(name = "removeAppServerInfoResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeAppServerInfo(
        @WebParam(name = "removeAppServerInfo", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveAppServerInfoReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoLdapSyncRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doLdapSync")
    @WebResult(name = "doLdapSyncResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoLdapSyncRes doLdapSync(
        @WebParam(name = "doLdapSync", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoLdapSyncReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetLdapSyncStatusRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getLdapSyncStatus")
    @WebResult(name = "getLdapSyncStatusResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetLdapSyncStatusRes getLdapSyncStatus(
        @WebParam(name = "getLdapSyncStatus", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetLdapSyncStatusReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSoftKeySet")
    @WebResult(name = "updateSoftKeySetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSoftKeySet(
        @WebParam(name = "updateSoftKeySet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSoftKeySetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSoftKeySetRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSoftKeySet")
    @WebResult(name = "getSoftKeySetResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSoftKeySetRes getSoftKeySet(
        @WebParam(name = "getSoftKeySet", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSoftKeySetReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoUpdateRemoteClusterRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doUpdateRemoteCluster")
    @WebResult(name = "doUpdateRemoteClusterResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoUpdateRemoteClusterRes doUpdateRemoteCluster(
        @WebParam(name = "doUpdateRemoteCluster", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoUpdateRemoteClusterReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.UpdateSyslogConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSyslogConfiguration")
    @WebResult(name = "updateSyslogConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public UpdateSyslogConfigurationRes updateSyslogConfiguration(
        @WebParam(name = "updateSyslogConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSyslogConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSyslogConfigurationRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSyslogConfiguration")
    @WebResult(name = "getSyslogConfigurationResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSyslogConfigurationRes getSyslogConfiguration(
        @WebParam(name = "getSyslogConfiguration", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSyslogConfigurationReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListLdapSyncCustomFieldRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listLdapSyncCustomField")
    @WebResult(name = "listLdapSyncCustomFieldResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListLdapSyncCustomFieldRes listLdapSyncCustomField(
        @WebParam(name = "listLdapSyncCustomField", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListLdapSyncCustomFieldReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPhoneTypeDisplayInstanceRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPhoneTypeDisplayInstance")
    @WebResult(name = "getPhoneTypeDisplayInstanceResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPhoneTypeDisplayInstanceRes getPhoneTypeDisplayInstance(
        @WebParam(name = "getPhoneTypeDisplayInstance", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPhoneTypeDisplayInstanceReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateInterClusterDirectoryUri")
    @WebResult(name = "updateInterClusterDirectoryUriResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateInterClusterDirectoryUri(
        @WebParam(name = "updateInterClusterDirectoryUri", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateInterClusterDirectoryUriReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateIlsConfig")
    @WebResult(name = "updateIlsConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateIlsConfig(
        @WebParam(name = "updateIlsConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateIlsConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetIlsConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getIlsConfig")
    @WebResult(name = "getIlsConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetIlsConfigRes getIlsConfig(
        @WebParam(name = "getIlsConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetIlsConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.AddSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSNMPCommunityString")
    @WebResult(name = "addSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public AddSNMPCommunityStringRes addSNMPCommunityString(
        @WebParam(name = "addSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.RemoveSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSNMPCommunityString")
    @WebResult(name = "removeSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public RemoveSNMPCommunityStringRes removeSNMPCommunityString(
        @WebParam(name = "removeSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSNMPCommunityString")
    @WebResult(name = "getSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSNMPCommunityStringRes getSNMPCommunityString(
        @WebParam(name = "getSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.UpdateSNMPCommunityStringRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSNMPCommunityString")
    @WebResult(name = "updateSNMPCommunityStringResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public UpdateSNMPCommunityStringRes updateSNMPCommunityString(
        @WebParam(name = "updateSNMPCommunityString", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSNMPCommunityStringReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.AddSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 addSNMPUser")
    @WebResult(name = "addSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public AddSNMPUserRes addSNMPUser(
        @WebParam(name = "addSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AddSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSNMPUser")
    @WebResult(name = "getSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSNMPUserRes getSNMPUser(
        @WebParam(name = "getSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.RemoveSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeSNMPUser")
    @WebResult(name = "removeSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public RemoveSNMPUserRes removeSNMPUser(
        @WebParam(name = "removeSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.UpdateSNMPUserRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSNMPUser")
    @WebResult(name = "updateSNMPUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public UpdateSNMPUserRes updateSNMPUser(
        @WebParam(name = "updateSNMPUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSNMPUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetSNMPMIB2ListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getSNMPMIB2List")
    @WebResult(name = "getSNMPMIB2ListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetSNMPMIB2ListRes getSNMPMIB2List(
        @WebParam(name = "getSNMPMIB2List", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetSNMPMIB2ListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.UpdateSNMPMIB2ListRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSNMPMIB2List")
    @WebResult(name = "updateSNMPMIB2ListResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public UpdateSNMPMIB2ListRes updateSNMPMIB2List(
        @WebParam(name = "updateSNMPMIB2List", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSNMPMIB2ListReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateBillingServer")
    @WebResult(name = "updateBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateBillingServer(
        @WebParam(name = "updateBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetBillingServerRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getBillingServer")
    @WebResult(name = "getBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetBillingServerRes getBillingServer(
        @WebParam(name = "getBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeBillingServer")
    @WebResult(name = "removeBillingServerResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeBillingServer(
        @WebParam(name = "removeBillingServer", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveBillingServerReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.UpdateCcdFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCcdFeatureConfig")
    @WebResult(name = "updateCcdFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public UpdateCcdFeatureConfigRes updateCcdFeatureConfig(
        @WebParam(name = "updateCcdFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCcdFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCcdFeatureConfigRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCcdFeatureConfig")
    @WebResult(name = "getCcdFeatureConfigResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCcdFeatureConfigRes getCcdFeatureConfig(
        @WebParam(name = "getCcdFeatureConfig", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCcdFeatureConfigReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateRoutePartitionsForLearnedPatterns")
    @WebResult(name = "updateRoutePartitionsForLearnedPatternsResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateRoutePartitionsForLearnedPatterns(
        @WebParam(name = "updateRoutePartitionsForLearnedPatterns", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateRoutePartitionsForLearnedPatternsReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateLocalRouteGroup")
    @WebResult(name = "updateLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateLocalRouteGroup(
        @WebParam(name = "updateLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 removeLocalRouteGroup")
    @WebResult(name = "removeLocalRouteGroupResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse removeLocalRouteGroup(
        @WebParam(name = "removeLocalRouteGroup", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        RemoveLocalRouteGroupReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updatePageLayoutPreferences")
    @WebResult(name = "updatePageLayoutPreferencesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updatePageLayoutPreferences(
        @WebParam(name = "updatePageLayoutPreferences", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdatePageLayoutPreferencesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetPageLayoutPreferencesRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getPageLayoutPreferences")
    @WebResult(name = "getPageLayoutPreferencesResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetPageLayoutPreferencesRes getPageLayoutPreferences(
        @WebParam(name = "getPageLayoutPreferences", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetPageLayoutPreferencesReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 assignPresenceUser")
    @WebResult(name = "assignPresenceUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse assignPresenceUser(
        @WebParam(name = "assignPresenceUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        AssignPresenceUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 unassignPresenceUser")
    @WebResult(name = "unassignPresenceUserResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse unassignPresenceUser(
        @WebParam(name = "unassignPresenceUser", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UnassignPresenceUserReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.GetCredentialPolicyDefaultRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 getCredentialPolicyDefault")
    @WebResult(name = "getCredentialPolicyDefaultResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public GetCredentialPolicyDefaultRes getCredentialPolicyDefault(
        @WebParam(name = "getCredentialPolicyDefault", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        GetCredentialPolicyDefaultReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateCredentialPolicyDefault")
    @WebResult(name = "updateCredentialPolicyDefaultResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateCredentialPolicyDefault(
        @WebParam(name = "updateCredentialPolicyDefault", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateCredentialPolicyDefaultReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.StandardResponse
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 updateSelfProvisioning")
    @WebResult(name = "updateSelfProvisioningResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public StandardResponse updateSelfProvisioning(
        @WebParam(name = "updateSelfProvisioning", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        UpdateSelfProvisioningReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.ListChangeRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 listChange")
    @WebResult(name = "listChangeResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public ListChangeRes listChange(
        @WebParam(name = "listChange", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        ListChangeReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoChangeDNDStatusRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doChangeDNDStatus")
    @WebResult(name = "doChangeDNDStatusResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoChangeDNDStatusRes doChangeDNDStatus(
        @WebParam(name = "doChangeDNDStatus", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoChangeDNDStatusReq axlParams)
        throws AXLError
    ;

    /**
     * 
     * @param axlParams
     * @return
     *     returns com.cisco.axl.api._11.DoUpdateLicenseUsageRes
     * @throws AXLError
     */
    @WebMethod(action = "CUCM:DB ver=11.0 doUpdateLicenseUsage")
    @WebResult(name = "doUpdateLicenseUsageResponse", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
    public DoUpdateLicenseUsageRes doUpdateLicenseUsage(
        @WebParam(name = "doUpdateLicenseUsage", targetNamespace = "http://www.cisco.com/AXL/API/11.0", partName = "axlParams")
        DoUpdateLicenseUsageReq axlParams)
        throws AXLError
    ;

}
