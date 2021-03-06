/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCType {
  OC_REP_NIL(0),
  OC_REP_INT(0x01),
  OC_REP_DOUBLE(0x02),
  OC_REP_BOOL(0x03),
  OC_REP_BYTE_STRING(0x04),
  OC_REP_STRING(0x05),
  OC_REP_OBJECT(0x06),
  OC_REP_ARRAY(0x08),
  OC_REP_INT_ARRAY(0x09),
  OC_REP_DOUBLE_ARRAY(0x0A),
  OC_REP_BOOL_ARRAY(0x0B),
  OC_REP_BYTE_STRING_ARRAY(0x0C),
  OC_REP_STRING_ARRAY(0x0D),
  OC_REP_OBJECT_ARRAY(0x0E);

  public final int swigValue() {
    return swigValue;
  }

  public static OCType swigToEnum(int swigValue) {
    OCType[] swigValues = OCType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCType(OCType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

