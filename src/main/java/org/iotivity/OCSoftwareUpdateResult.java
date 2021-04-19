/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public enum OCSoftwareUpdateResult {
  OC_SWUPDATE_RESULT_IDLE(0),
  OC_SWUPDATE_RESULT_SUCCESS,
  OC_SWUPDATE_RESULT_LESS_RAM,
  OC_SWUPDATE_RESULT_LESS_FLASH,
  OC_SWUPDATE_RESULT_CONN_FAIL,
  OC_SWUPDATE_RESULT_SVV_FAIL,
  OC_SWUPDATE_RESULT_INVALID_URL,
  OC_SWUPDATE_RESULT_UPGRADE_FAIL;

  public final int swigValue() {
    return swigValue;
  }

  public static OCSoftwareUpdateResult swigToEnum(int swigValue) {
    OCSoftwareUpdateResult[] swigValues = OCSoftwareUpdateResult.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (OCSoftwareUpdateResult swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + OCSoftwareUpdateResult.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private OCSoftwareUpdateResult() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private OCSoftwareUpdateResult(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private OCSoftwareUpdateResult(OCSoftwareUpdateResult swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
