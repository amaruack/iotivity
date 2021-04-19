/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCUuidUtilJNI {

  static {
    try {
        System.loadLibrary("iotivity-lite-jni");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native long stringToUuid(String jarg1);
  public final static native String uuidToString(long jarg1, OCUuid jarg1_);
  public final static native long generateUuid();
  public final static native int OC_UUID_LEN_get();
  public final static native void OCUuid_id_set(long jarg1, OCUuid jarg1_, byte[] jarg2);
  public final static native byte[] OCUuid_id_get(long jarg1, OCUuid jarg1_);
  public final static native long new_OCUuid();
  public final static native void delete_OCUuid(long jarg1);
}