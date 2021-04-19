/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCAceSubject {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCAceSubject(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCAceSubject obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public void setUuid(OCUuid value) {
    OCObtJNI.OCAceSubject_uuid_set(swigCPtr, this, OCUuid.getCPtr(value), value);
  }

  public OCUuid getUuid() {
    long cPtr = OCObtJNI.OCAceSubject_uuid_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCUuid(cPtr, false);
  }

  public void setConn(OCAceConnectionType value) {
    OCObtJNI.OCAceSubject_conn_set(swigCPtr, this, value.swigValue());
  }

  public OCAceConnectionType getConn() {
    return OCAceConnectionType.swigToEnum(OCObtJNI.OCAceSubject_conn_get(swigCPtr, this));
  }

  public String getRole() {
    return OCObtJNI.OCAceSubject_getRole(swigCPtr, this);
  }

  public String getAuthority() {
    return OCObtJNI.OCAceSubject_getAuthority(swigCPtr, this);
  }

}
