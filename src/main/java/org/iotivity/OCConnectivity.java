/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCConnectivity {
  public static int init(long device) {
    return OCConnectivityJNI.init(device);
  }

  public static void shutdown(long device) {
    OCConnectivityJNI.shutdown(device);
  }

}
