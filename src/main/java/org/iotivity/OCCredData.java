/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCCredData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCCredData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCCredData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCredUtilJNI.delete_OCCredData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setData(String value) {
    OCCredUtilJNI.OCCredData_data_set(swigCPtr, this, value);
  }

  public String getData() {
    return OCCredUtilJNI.OCCredData_data_get(swigCPtr, this);
  }

  public void setEncoding(OCEncoding value) {
    OCCredUtilJNI.OCCredData_encoding_set(swigCPtr, this, value.swigValue());
  }

  public OCEncoding getEncoding() {
    return OCEncoding.swigToEnum(OCCredUtilJNI.OCCredData_encoding_get(swigCPtr, this));
  }

  public OCCredData() {
    this(OCCredUtilJNI.new_OCCredData(), true);
  }

}