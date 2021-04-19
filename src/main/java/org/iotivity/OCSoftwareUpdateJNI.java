/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCSoftwareUpdateJNI {

  static {
    try {
        System.loadLibrary("iotivity-lite-jni");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native void notifyNewVersionAvailable(long jarg1, String jarg2, int jarg3);
  public final static native void notifyDownload(long jarg1, String jarg2, int jarg3);
  public final static native void notifyUpgrading(long jarg1, String jarg2, long jarg3, int jarg4);
  public final static native void notifyDone(long jarg1, int jarg2);
  public final static native void setImpl(OCSoftwareUpdateHandler jarg1);
}