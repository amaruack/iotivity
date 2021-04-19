/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCObtJNI {

  static {
    try {
        System.loadLibrary("iotivity-lite-jni");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native int init();
  public final static native void shutdown();
  public final static native int discoverUnownedDevices(OCObtDiscoveryHandler jarg1);
  public final static native int discoverUnownedDevicesRealmLocalIPv6(OCObtDiscoveryHandler jarg1);
  public final static native int discoverUnownedDevicesSiteLocalIPv6(OCObtDiscoveryHandler jarg1);
  public final static native int discoverOwnedDevices(OCObtDiscoveryHandler jarg1);
  public final static native int discoverOwnedDevicesRealmLocalIPv6(OCObtDiscoveryHandler jarg1);
  public final static native int discoverOwnedDevicesSiteLocalIPv6(OCObtDiscoveryHandler jarg1);
  public final static native int discoverAllResources(long jarg1, OCUuid jarg1_, OCDiscoveryAllHandler jarg2);
  public final static native int performJustWorksOtm(long jarg1, OCUuid jarg1_, OCObtDeviceStatusHandler jarg2);
  public final static native int requestRandomPin(long jarg1, OCUuid jarg1_, OCObtDeviceStatusHandler jarg2);
  public final static native int performRandomPinOtm(long jarg1, OCUuid jarg1_, String jarg2, OCObtDeviceStatusHandler jarg4);
  public final static native int performCertOtm(long jarg1, OCUuid jarg1_, OCObtDeviceStatusHandler jarg2);
  public final static native long addRoleId(long jarg1, OCRole jarg1_, String jarg2, String jarg3);
  public final static native void freeRoleId(long jarg1, OCRole jarg1_);
  public final static native int deviceHardReset(long jarg1, OCUuid jarg1_, OCObtDeviceStatusHandler jarg2);
  public final static native int provisionPairwiseCredentials(long jarg1, OCUuid jarg1_, long jarg2, OCUuid jarg2_, OCObtStatusHandler jarg3);
  public final static native int provisionIdentityCertificate(long jarg1, OCUuid jarg1_, OCObtStatusHandler jarg2);
  public final static native int provisionRoleCertificate(long jarg1, OCRole jarg1_, long jarg2, OCUuid jarg2_, OCObtStatusHandler jarg3);
  public final static native int jni_oc_obt_provision_trust_anchor(String jarg1, long jarg2, String jarg3, long jarg4, OCUuid jarg4_, OCObtStatusHandler jarg5);
  public final static native long newAceForSubject(long jarg1, OCUuid jarg1_);
  public final static native long newAceForConnection(int jarg1);
  public final static native long newAceForRole(String jarg1, String jarg2);
  public final static native long aceNewResource(long jarg1, OCSecurityAce jarg1_);
  public final static native void aceResourceSetHref(long jarg1, OCAceResource jarg1_, String jarg2);
  public final static native void aceResourceSetWc(long jarg1, OCAceResource jarg1_, int jarg2);
  public final static native void aceAddPermission(long jarg1, OCSecurityAce jarg1_, int jarg2);
  public final static native int provisionAce(long jarg1, OCUuid jarg1_, long jarg2, OCSecurityAce jarg2_, OCObtDeviceStatusHandler jarg3);
  public final static native void freeAce(long jarg1, OCSecurityAce jarg1_);
  public final static native int provisionRoleWildcardAce(long jarg1, OCUuid jarg1_, String jarg2, String jarg3, OCObtDeviceStatusHandler jarg4);
  public final static native int provisionAuthWildcardAce(long jarg1, OCUuid jarg1_, OCObtDeviceStatusHandler jarg2);
  public final static native long retrieveOwnCreds();
  public final static native int deleteOwnCredByCredId(int jarg1);
  public final static native int retrieveCreds(long jarg1, OCUuid jarg1_, OCObtCredsHandler jarg2);
  public final static native void freeCreds(long jarg1, OCCreds jarg1_);
  public final static native int deleteCredByCredId(long jarg1, OCUuid jarg1_, int jarg2, OCObtStatusHandler jarg3);
  public final static native int retrieveAcl(long jarg1, OCUuid jarg1_, OCObtAclHandler jarg2);
  public final static native void freeAcl(long jarg1, OCSecurityAcl jarg1_);
  public final static native int deleteAceByAceId(long jarg1, OCUuid jarg1_, int jarg2, OCObtStatusHandler jarg3);
  public final static native void OCSecurityAcl_rowneruuid_set(long jarg1, OCSecurityAcl jarg1_, long jarg2, OCUuid jarg2_);
  public final static native long OCSecurityAcl_rowneruuid_get(long jarg1, OCSecurityAcl jarg1_);
  public final static native long OCSecurityAcl_getSubjectsListHead(long jarg1, OCSecurityAcl jarg1_);
  public final static native void delete_OCSecurityAcl(long jarg1);
  public final static native void OCAceResource_next_set(long jarg1, OCAceResource jarg1_, long jarg2, OCAceResource jarg2_);
  public final static native long OCAceResource_next_get(long jarg1, OCAceResource jarg1_);
  public final static native void OCAceResource_href_set(long jarg1, OCAceResource jarg1_, String jarg2);
  public final static native String OCAceResource_href_get(long jarg1, OCAceResource jarg1_);
  public final static native void OCAceResource_interfaces_set(long jarg1, OCAceResource jarg1_, int jarg2);
  public final static native int OCAceResource_interfaces_get(long jarg1, OCAceResource jarg1_);
  public final static native void OCAceResource_types_set(long jarg1, OCAceResource jarg1_, String[] jarg2);
  public final static native String[] OCAceResource_types_get(long jarg1, OCAceResource jarg1_);
  public final static native void OCAceResource_wildcard_set(long jarg1, OCAceResource jarg1_, int jarg2);
  public final static native int OCAceResource_wildcard_get(long jarg1, OCAceResource jarg1_);
  public final static native void OCAceSubject_uuid_set(long jarg1, OCAceSubject jarg1_, long jarg2, OCUuid jarg2_);
  public final static native long OCAceSubject_uuid_get(long jarg1, OCAceSubject jarg1_);
  public final static native void OCAceSubject_conn_set(long jarg1, OCAceSubject jarg1_, int jarg2);
  public final static native int OCAceSubject_conn_get(long jarg1, OCAceSubject jarg1_);
  public final static native String OCAceSubject_getRole(long jarg1, OCAceSubject jarg1_);
  public final static native String OCAceSubject_getAuthority(long jarg1, OCAceSubject jarg1_);
  public final static native void OCSecurityAce_next_set(long jarg1, OCSecurityAce jarg1_, long jarg2, OCSecurityAce jarg2_);
  public final static native long OCSecurityAce_next_get(long jarg1, OCSecurityAce jarg1_);
  public final static native void OCSecurityAce_subjectType_set(long jarg1, OCSecurityAce jarg1_, int jarg2);
  public final static native int OCSecurityAce_subjectType_get(long jarg1, OCSecurityAce jarg1_);
  public final static native void OCSecurityAce_subject_set(long jarg1, OCSecurityAce jarg1_, long jarg2, OCAceSubject jarg2_);
  public final static native long OCSecurityAce_subject_get(long jarg1, OCSecurityAce jarg1_);
  public final static native void OCSecurityAce_aceid_set(long jarg1, OCSecurityAce jarg1_, int jarg2);
  public final static native int OCSecurityAce_aceid_get(long jarg1, OCSecurityAce jarg1_);
  public final static native void OCSecurityAce_permission_set(long jarg1, OCSecurityAce jarg1_, int jarg2);
  public final static native int OCSecurityAce_permission_get(long jarg1, OCSecurityAce jarg1_);
  public final static native long OCSecurityAce_getResourcesListHead(long jarg1, OCSecurityAce jarg1_);
  public final static native int oc_obt_provision_pairwise_oscore_contexts(long jarg1, OCUuid jarg1_, long jarg2, OCUuid jarg2_, long jarg3, long jarg4);
  public final static native int oc_obt_provision_client_group_oscore_context(long jarg1, OCUuid jarg1_, String jarg2, long jarg3, long jarg4);
  public final static native int oc_obt_provision_server_group_oscore_context(long jarg1, OCUuid jarg1_, long jarg2, OCUuid jarg2_, String jarg3, long jarg4, long jarg5);
  public final static native int oc_obt_update_cloud_conf_device(long jarg1, OCUuid jarg1_, String jarg2, String jarg3, String jarg4, String jarg5, String jarg6, long jarg7, long jarg8);
  public final static native int oc_obt_retrieve_cloud_conf_device(long jarg1, OCUuid jarg1_, String jarg2, long jarg3, long jarg4);
  public final static native void oc_obt_set_sd_info(String jarg1, boolean jarg2);
}