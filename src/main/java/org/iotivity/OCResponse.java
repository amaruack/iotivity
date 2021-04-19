/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCResponse {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCResponse(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCResponse obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCMainJNI.delete_OCResponse(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setSeparateResponse(OCSeparateResponse value) {
    OCMainJNI.OCResponse_separateResponse_set(swigCPtr, this, OCSeparateResponse.getCPtr(value), value);
  }

  public OCSeparateResponse getSeparateResponse() {
    long cPtr = OCMainJNI.OCResponse_separateResponse_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCSeparateResponse(cPtr, false);
  }

  public void setResponseBuffer(OCResponseBuffer value) {
    OCMainJNI.OCResponse_responseBuffer_set(swigCPtr, this, OCResponseBuffer.getCPtr(value), value);
  }

  public OCResponseBuffer getResponseBuffer() {
    long cPtr = OCMainJNI.OCResponse_responseBuffer_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCResponseBuffer(cPtr, false);
  }

  public OCResponse() {
    this(OCMainJNI.new_OCResponse(), true);
  }

}