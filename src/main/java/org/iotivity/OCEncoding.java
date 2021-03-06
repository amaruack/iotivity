/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCEncoding {
  OC_ENCODING_UNSUPPORTED(0),
  OC_ENCODING_BASE64,
  OC_ENCODING_RAW,
  OC_ENCODING_PEM,
  OC_ENCODING_HANDLE;

  public final int swigValue() {
    return swigValue;
  }

  public static OCEncoding swigToEnum(int swigValue) {
    OCEncoding[] swigValues = OCEncoding.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCEncoding swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCEncoding.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCEncoding() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCEncoding(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCEncoding(OCEncoding swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

