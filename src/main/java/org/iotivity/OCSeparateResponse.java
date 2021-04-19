/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCSeparateResponse {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCSeparateResponse(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCSeparateResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCMainJNI.delete_OCSeparateResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setActive(int value) {
    OCMainJNI.OCSeparateResponse_active_set(swigCPtr, this, value);
  }

  public int getActive() {
    return OCMainJNI.OCSeparateResponse_active_get(swigCPtr, this);
  }

}
