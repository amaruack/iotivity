/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCLink {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCLink(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCLink obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCollectionUtilJNI.delete_OCLink(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNext(OCLink value) {
    OCCollectionUtilJNI.OCLink_next_set(swigCPtr, this, OCLink.getCPtr(value), value);
  }

  public OCLink getNext() {
    long cPtr = OCCollectionUtilJNI.OCLink_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLink(cPtr, false);
  }

  public void setResource(OCResource value) {
    OCCollectionUtilJNI.OCLink_resource_set(swigCPtr, this, OCResource.getCPtr(value), value);
  }

  public OCResource getResource() {
    long cPtr = OCCollectionUtilJNI.OCLink_resource_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCResource(cPtr, false);
  }

  public void setInterfaces(int value) {
    OCCollectionUtilJNI.OCLink_interfaces_set(swigCPtr, this, value);
  }

  public int getInterfaces() { return OCCollectionUtilJNI.OCLink_interfaces_get(swigCPtr, this); }

  public void setIns(long value) {
    OCCollectionUtilJNI.OCLink_ins_set(swigCPtr, this, value);
  }

  public long getIns() {
    return OCCollectionUtilJNI.OCLink_ins_get(swigCPtr, this);
  }

  public void setRel(String[] value) {
    OCCollectionUtilJNI.OCLink_rel_set(swigCPtr, this, value);
  }

  public String[] getRel() {
    return OCCollectionUtilJNI.OCLink_rel_get(swigCPtr, this);
}

  public OCLinkParams getParamsListHead() {
    long cPtr = OCCollectionUtilJNI.OCLink_getParamsListHead(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLinkParams(cPtr, false);
  }

}
