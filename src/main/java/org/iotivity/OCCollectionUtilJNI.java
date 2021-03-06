/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCCollectionUtilJNI {
  public final static native void OCLinkParams_next_set(long jarg1, OCLinkParams jarg1_, long jarg2, OCLinkParams jarg2_);
  public final static native long OCLinkParams_next_get(long jarg1, OCLinkParams jarg1_);
  public final static native void OCLinkParams_key_set(long jarg1, OCLinkParams jarg1_, String jarg2);
  public final static native String OCLinkParams_key_get(long jarg1, OCLinkParams jarg1_);
  public final static native void OCLinkParams_value_set(long jarg1, OCLinkParams jarg1_, String jarg2);
  public final static native String OCLinkParams_value_get(long jarg1, OCLinkParams jarg1_);
  public final static native long new_OCLinkParams();
  public final static native void delete_OCLinkParams(long jarg1);
  public final static native void OCLink_next_set(long jarg1, OCLink jarg1_, long jarg2, OCLink jarg2_);
  public final static native long OCLink_next_get(long jarg1, OCLink jarg1_);
  public final static native void OCLink_resource_set(long jarg1, OCLink jarg1_, long jarg2, OCResource jarg2_);
  public final static native long OCLink_resource_get(long jarg1, OCLink jarg1_);
  public final static native void OCLink_interfaces_set(long jarg1, OCLink jarg1_, int jarg2);
  public final static native int OCLink_interfaces_get(long jarg1, OCLink jarg1_);
  public final static native void OCLink_ins_set(long jarg1, OCLink jarg1_, long jarg2);
  public final static native long OCLink_ins_get(long jarg1, OCLink jarg1_);
  public final static native void OCLink_rel_set(long jarg1, OCLink jarg1_, String[] jarg2);
  public final static native String[] OCLink_rel_get(long jarg1, OCLink jarg1_);
  public final static native long OCLink_getParamsListHead(long jarg1, OCLink jarg1_);
  public final static native void delete_OCLink(long jarg1);
  public final static native void OCResourceType_next_set(long jarg1, OCResourceType jarg1_, long jarg2, OCResourceType jarg2_);
  public final static native long OCResourceType_next_get(long jarg1, OCResourceType jarg1_);
  public final static native void OCResourceType_rt_set(long jarg1, OCResourceType jarg1_, String jarg2);
  public final static native String OCResourceType_rt_get(long jarg1, OCResourceType jarg1_);
  public final static native long new_OCResourceType();
  public final static native void delete_OCResourceType(long jarg1);
  public final static native void OCCollection_res_set(long jarg1, OCCollection jarg1_, long jarg2, OCResource jarg2_);
  public final static native long OCCollection_res_get(long jarg1, OCCollection jarg1_);
  public final static native long OCCollection_getMandatoryResourceTypesListHead(long jarg1, OCCollection jarg1_);
  public final static native long OCCollection_getSupportedResourceTypesListHead(long jarg1, OCCollection jarg1_);
  public final static native long OCCollection_getLinksListHead(long jarg1, OCCollection jarg1_);
  public final static native void delete_OCCollection(long jarg1);
  public final static native void oc_link_set_interfaces(long jarg1, OCLink jarg1_, int jarg2);
  public final static native boolean handleCollectionRequest(int jarg1, long jarg2, OCRequest jarg2_, int jarg3, long jarg4, OCResource jarg4_);
  public final static native long newCollection();
  public final static native void freeCollection(long jarg1, OCCollection jarg1_);
  public final static native long getNextCollectionWithLink(long jarg1, OCResource jarg1_, long jarg2, OCCollection jarg2_);
  public final static native long getCollectionByUri(String jarg1, long jarg2, long jarg3);
  public final static native long collectionGetAll();
  public final static native long getLinkByUri(long jarg1, OCCollection jarg1_, String jarg2, int jarg3);
  public final static native boolean checkIfCollection(long jarg1, OCResource jarg1_);
  public final static native void collectionAdd(long jarg1, OCCollection jarg1_);
}
