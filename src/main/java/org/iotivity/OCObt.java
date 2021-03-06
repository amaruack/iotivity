/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCObt implements OCObtConstants {
  public static int init() {
    return OCObtJNI.init();
  }

  public static void shutdown() {
    OCObtJNI.shutdown();
  }

  public static int discoverUnownedDevices(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverUnownedDevices(callback);
  }

  public static int discoverUnownedDevicesRealmLocalIPv6(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverUnownedDevicesRealmLocalIPv6(callback);
  }

  public static int discoverUnownedDevicesSiteLocalIPv6(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverUnownedDevicesSiteLocalIPv6(callback);
  }

  public static int discoverOwnedDevices(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverOwnedDevices(callback);
  }

  public static int discoverOwnedDevicesRealmLocalIPv6(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverOwnedDevicesRealmLocalIPv6(callback);
  }

  public static int discoverOwnedDevicesSiteLocalIPv6(OCObtDiscoveryHandler callback) {
    return OCObtJNI.discoverOwnedDevicesSiteLocalIPv6(callback);
  }

  public static int discoverAllResources(OCUuid uuid, OCDiscoveryAllHandler handler) {
    return OCObtJNI.discoverAllResources(OCUuid.getCPtr(uuid), uuid, handler);
  }

  public static int performJustWorksOtm(OCUuid uuid, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.performJustWorksOtm(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static int requestRandomPin(OCUuid uuid, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.requestRandomPin(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static int performRandomPinOtm(OCUuid uuid, String pin, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.performRandomPinOtm(OCUuid.getCPtr(uuid), uuid, pin, callback);
  }

  public static int performCertOtm(OCUuid uuid, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.performCertOtm(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static OCRole addRoleId(OCRole roles, String role, String authority) {
    long cPtr = OCObtJNI.addRoleId(OCRole.getCPtr(roles), roles, role, authority);
    return (cPtr == 0) ? null : new OCRole(cPtr, false);
  }

  public static void freeRoleId(OCRole roles) {
    OCObtJNI.freeRoleId(OCRole.getCPtr(roles), roles);
  }

  public static int deviceHardReset(OCUuid uuid, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.deviceHardReset(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static int provisionPairwiseCredentials(OCUuid uuid1, OCUuid uuid2, OCObtStatusHandler callback) {
    return OCObtJNI.provisionPairwiseCredentials(OCUuid.getCPtr(uuid1), uuid1, OCUuid.getCPtr(uuid2), uuid2, callback);
  }

  public static int provisionIdentityCertificate(OCUuid uuid, OCObtStatusHandler callback) {
    return OCObtJNI.provisionIdentityCertificate(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static int provisionRoleCertificate(OCRole roles, OCUuid uuid, OCObtStatusHandler callback) {
    return OCObtJNI.provisionRoleCertificate(OCRole.getCPtr(roles), roles, OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static int jni_oc_obt_provision_trust_anchor(String certificate, long certificate_size, String subject, OCUuid uuid, OCObtStatusHandler callback) {
    return OCObtJNI.jni_oc_obt_provision_trust_anchor(certificate, certificate_size, subject, OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static OCSecurityAce newAceForSubject(OCUuid uuid) {
    long cPtr = OCObtJNI.newAceForSubject(OCUuid.getCPtr(uuid), uuid);
    return (cPtr == 0) ? null : new OCSecurityAce(cPtr, false);
  }

  public static OCSecurityAce newAceForConnection(OCAceConnectionType conn) {
    long cPtr = OCObtJNI.newAceForConnection(conn.swigValue());
    return (cPtr == 0) ? null : new OCSecurityAce(cPtr, false);
  }

  public static OCSecurityAce newAceForRole(String role, String authority) {
    long cPtr = OCObtJNI.newAceForRole(role, authority);
    return (cPtr == 0) ? null : new OCSecurityAce(cPtr, false);
  }

  public static OCAceResource aceNewResource(OCSecurityAce ace) {
    long cPtr = OCObtJNI.aceNewResource(OCSecurityAce.getCPtr(ace), ace);
    return (cPtr == 0) ? null : new OCAceResource(cPtr, false);
  }

  public static void aceResourceSetHref(OCAceResource resource, String href) {
    OCObtJNI.aceResourceSetHref(OCAceResource.getCPtr(resource), resource, href);
  }

  public static void aceResourceSetWc(OCAceResource resource, OCAceWildcard wc) {
    OCObtJNI.aceResourceSetWc(OCAceResource.getCPtr(resource), resource, wc.swigValue());
  }

  public static void aceAddPermission(OCSecurityAce ace, int permission) {
    OCObtJNI.aceAddPermission(OCSecurityAce.getCPtr(ace), ace, permission);
  }

  public static int provisionAce(OCUuid subject, OCSecurityAce ace, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.provisionAce(OCUuid.getCPtr(subject), subject, OCSecurityAce.getCPtr(ace), ace, callback);
  }

  public static void freeAce(OCSecurityAce ace) {
    OCObtJNI.freeAce(OCSecurityAce.getCPtr(ace), ace);
  }

  public static int provisionRoleWildcardAce(OCUuid subject, String role, String authority, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.provisionRoleWildcardAce(OCUuid.getCPtr(subject), subject, role, authority, callback);
  }

  public static int provisionAuthWildcardAce(OCUuid subject, OCObtDeviceStatusHandler callback) {
    return OCObtJNI.provisionAuthWildcardAce(OCUuid.getCPtr(subject), subject, callback);
  }

  public static OCCreds retrieveOwnCreds() {
    long cPtr = OCObtJNI.retrieveOwnCreds();
    return (cPtr == 0) ? null : new OCCreds(cPtr, false);
  }

  public static int deleteOwnCredByCredId(int credid) {
    return OCObtJNI.deleteOwnCredByCredId(credid);
  }

  public static int retrieveCreds(OCUuid subject, OCObtCredsHandler callback) {
    return OCObtJNI.retrieveCreds(OCUuid.getCPtr(subject), subject, callback);
  }

  public static void freeCreds(OCCreds creds) {
    OCObtJNI.freeCreds(OCCreds.getCPtr(creds), creds);
  }

  public static int deleteCredByCredId(OCUuid uuid, int credid, OCObtStatusHandler callback) {
    return OCObtJNI.deleteCredByCredId(OCUuid.getCPtr(uuid), uuid, credid, callback);
  }

  public static int retrieveAcl(OCUuid uuid, OCObtAclHandler callback) {
    return OCObtJNI.retrieveAcl(OCUuid.getCPtr(uuid), uuid, callback);
  }

  public static void freeAcl(OCSecurityAcl acl) {
    OCObtJNI.freeAcl(OCSecurityAcl.getCPtr(acl), acl);
  }

  public static int deleteAceByAceId(OCUuid uuid, int aceid, OCObtStatusHandler callback) {
    return OCObtJNI.deleteAceByAceId(OCUuid.getCPtr(uuid), uuid, aceid, callback);
  }

  public static int oc_obt_provision_pairwise_oscore_contexts(OCUuid uuid1, OCUuid uuid2, SWIGTYPE_p_f_int_p_void__void cb, SWIGTYPE_p_void data) {
    return OCObtJNI.oc_obt_provision_pairwise_oscore_contexts(OCUuid.getCPtr(uuid1), uuid1, OCUuid.getCPtr(uuid2), uuid2, SWIGTYPE_p_f_int_p_void__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(data));
  }

  public static int oc_obt_provision_client_group_oscore_context(OCUuid uuid, String desc, SWIGTYPE_p_f_p_oc_uuid_t_int_p_void__void cb, SWIGTYPE_p_void data) {
    return OCObtJNI.oc_obt_provision_client_group_oscore_context(OCUuid.getCPtr(uuid), uuid, desc, SWIGTYPE_p_f_p_oc_uuid_t_int_p_void__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(data));
  }

  public static int oc_obt_provision_server_group_oscore_context(OCUuid uuid, OCUuid subjectuuid, String desc, SWIGTYPE_p_f_p_oc_uuid_t_int_p_void__void cb, SWIGTYPE_p_void data) {
    return OCObtJNI.oc_obt_provision_server_group_oscore_context(OCUuid.getCPtr(uuid), uuid, OCUuid.getCPtr(subjectuuid), subjectuuid, desc, SWIGTYPE_p_f_p_oc_uuid_t_int_p_void__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(data));
  }

  public static int oc_obt_update_cloud_conf_device(OCUuid uuid, String url, String at, String apn, String cis, String sid, SWIGTYPE_p_f_p_oc_client_response_t__void cb, SWIGTYPE_p_void user_data) {
    return OCObtJNI.oc_obt_update_cloud_conf_device(OCUuid.getCPtr(uuid), uuid, url, at, apn, cis, sid, SWIGTYPE_p_f_p_oc_client_response_t__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(user_data));
  }

  public static int oc_obt_retrieve_cloud_conf_device(OCUuid uuid, String url, SWIGTYPE_p_f_p_oc_client_response_t__void cb, SWIGTYPE_p_void user_data) {
    return OCObtJNI.oc_obt_retrieve_cloud_conf_device(OCUuid.getCPtr(uuid), uuid, url, SWIGTYPE_p_f_p_oc_client_response_t__void.getCPtr(cb), SWIGTYPE_p_void.getCPtr(user_data));
  }

  public static void oc_obt_set_sd_info(String name, boolean priv) {
    OCObtJNI.oc_obt_set_sd_info(name, priv);
  }

}
