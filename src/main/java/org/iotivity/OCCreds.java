/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCCreds {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCCreds(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCCreds obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCredUtilJNI.delete_OCCreds(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRowneruuid(OCUuid value) {
    OCCredUtilJNI.OCCreds_rowneruuid_set(swigCPtr, this, OCUuid.getCPtr(value), value);
  }

  public OCUuid getRowneruuid() {
    long cPtr = OCCredUtilJNI.OCCreds_rowneruuid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCUuid(cPtr, false);
  }

  public OCCred getCredsListHead() {
    long cPtr = OCCredUtilJNI.OCCreds_getCredsListHead(swigCPtr, this);
    return (cPtr == 0) ? null : new OCCred(cPtr, false);
  }

}