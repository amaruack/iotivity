/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCLinkParams {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCLinkParams(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCLinkParams obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCollectionUtilJNI.delete_OCLinkParams(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNext(OCLinkParams value) {
    OCCollectionUtilJNI.OCLinkParams_next_set(swigCPtr, this, OCLinkParams.getCPtr(value), value);
  }

  public OCLinkParams getNext() {
    long cPtr = OCCollectionUtilJNI.OCLinkParams_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLinkParams(cPtr, false);
  }

  public void setKey(String value) {
    OCCollectionUtilJNI.OCLinkParams_key_set(swigCPtr, this, value);
  }

  public String getKey() {
    return OCCollectionUtilJNI.OCLinkParams_key_get(swigCPtr, this);
  }

  public void setValue(String value) {
    OCCollectionUtilJNI.OCLinkParams_value_set(swigCPtr, this, value);
  }

  public String getValue() {
    return OCCollectionUtilJNI.OCLinkParams_value_get(swigCPtr, this);
  }

  public OCLinkParams() {
    this(OCCollectionUtilJNI.new_OCLinkParams(), true);
  }

}
