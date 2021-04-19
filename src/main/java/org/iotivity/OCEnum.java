/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCEnum {
  OC_ENUM_ABORTED(1),
  OC_ENUM_ACTIVE,
  OC_ENUM_AIRDRY,
  OC_ENUM_ARMEDAWAY,
  OC_ENUM_ARMEDINSTANT,
  OC_ENUM_ARMEDMAXIMUM,
  OC_ENUM_ARMEDNIGHTSTAY,
  OC_ENUM_ARMEDSTAY,
  OC_ENUM_AROMA,
  OC_ENUM_AI,
  OC_ENUM_AUTO,
  OC_ENUM_BOILING,
  OC_ENUM_BREWING,
  OC_ENUM_CANCELLED,
  OC_ENUM_CIRCULATING,
  OC_ENUM_CLEANING,
  OC_ENUM_CLOTHES,
  OC_ENUM_COMPLETED,
  OC_ENUM_COOL,
  OC_ENUM_DELICATE,
  OC_ENUM_DISABLED,
  OC_ENUM_DOWN,
  OC_ENUM_DUAL,
  OC_ENUM_DRY,
  OC_ENUM_ENABLED,
  OC_ENUM_EXTENDED,
  OC_ENUM_FAN,
  OC_ENUM_FAST,
  OC_ENUM_FILTERMATERIAL,
  OC_ENUM_FOCUSED,
  OC_ENUM_GRINDING,
  OC_ENUM_HEATING,
  OC_ENUM_HEAVY,
  OC_ENUM_IDLE,
  OC_ENUM_INK,
  OC_ENUM_INKBLACK,
  OC_ENUM_INKCYAN,
  OC_ENUM_INKMAGENTA,
  OC_ENUM_INKTRICOLOUR,
  OC_ENUM_INKYELLOW,
  OC_ENUM_KEEPWARM,
  OC_ENUM_NORMAL,
  OC_ENUM_NOTSUPPORTED,
  OC_ENUM_PAUSE,
  OC_ENUM_PENDING,
  OC_ENUM_PENDINGHELD,
  OC_ENUM_PERMAPRESS,
  OC_ENUM_PREWASH,
  OC_ENUM_PROCESSING,
  OC_ENUM_PURE,
  OC_ENUM_QUICK,
  OC_ENUM_QUIET,
  OC_ENUM_RINSE,
  OC_ENUM_SECTORED,
  OC_ENUM_SILENT,
  OC_ENUM_SLEEP,
  OC_ENUM_SMART,
  OC_ENUM_SPOT,
  OC_ENUM_STEAM,
  OC_ENUM_STOPPED,
  OC_ENUM_SPIN,
  OC_ENUM_TESTING,
  OC_ENUM_TONER,
  OC_ENUM_TONERBLACK,
  OC_ENUM_TONERCYAN,
  OC_ENUM_TONERMAGENTA,
  OC_ENUM_TONERYELLOW,
  OC_ENUM_WARM,
  OC_ENUM_WASH,
  OC_ENUM_WET,
  OC_ENUM_WIND,
  OC_ENUM_WRINKLEPREVENT,
  OC_ENUM_ZIGZAG;

  public final int swigValue() {
    return swigValue;
  }

  public static OCEnum swigToEnum(int swigValue) {
    OCEnum[] swigValues = OCEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCEnum(OCEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

