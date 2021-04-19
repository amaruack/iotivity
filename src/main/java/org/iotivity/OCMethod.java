/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCMethod {
  OC_GET(1),
  OC_POST,
  OC_PUT,
  OC_DELETE,
  OC_FETCH;

  public final int swigValue() {
    return swigValue;
  }

  public static OCMethod swigToEnum(int swigValue) {
    OCMethod[] swigValues = OCMethod.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCMethod swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCMethod.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCMethod() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCMethod(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCMethod(OCMethod swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
