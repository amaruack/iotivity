/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCClock implements OCClockConstants {
  public static void clockInit() {
    OCClockJNI.clockInit();
  }

  public static long clockTime() {
    return OCClockJNI.clockTime();
  }

  public static long clockSeconds() {
    return OCClockJNI.clockSeconds();
  }

  public static void clockWait(long t) {
    OCClockJNI.clockWait(t);
  }

}