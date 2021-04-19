/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCCredType {
  OC_CREDTYPE_NULL(0),
  OC_CREDTYPE_PSK(1),
  OC_CREDTYPE_CERT(8),
  OC_CREDTYPE_OSCORE(64),
  OC_CREDTYPE_OSCORE_MCAST_CLIENT(128),
  OC_CREDTYPE_OSCORE_MCAST_SERVER(256);

  public final int swigValue() {
    return swigValue;
  }

  public static OCCredType swigToEnum(int swigValue) {
    OCCredType[] swigValues = OCCredType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCCredType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCCredType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCCredType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCCredType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCCredType(OCCredType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

