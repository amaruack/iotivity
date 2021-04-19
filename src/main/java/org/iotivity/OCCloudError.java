/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCCloudError {
  CLOUD_OK(0),
  CLOUD_ERROR_RESPONSE(1),
  CLOUD_ERROR_CONNECT(2),
  CLOUD_ERROR_REFRESH_ACCESS_TOKEN(3);

  public final int swigValue() {
    return swigValue;
  }

  public static OCCloudError swigToEnum(int swigValue) {
    OCCloudError[] swigValues = OCCloudError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCCloudError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCCloudError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCCloudError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCCloudError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCCloudError(OCCloudError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
