/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCUuid {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCUuid(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCUuid obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCUuidUtilJNI.delete_OCUuid(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof OCUuid) {
        String objectUuid = OCUuidUtil.uuidToString((OCUuid)obj);
        String thisUuid = OCUuidUtil.uuidToString(this);
        equal = objectUuid.equals(thisUuid);
    }
    return equal;
  }
  public int hashCode() {
     return java.util.UUID.fromString(OCUuidUtil.uuidToString(this)).hashCode();
  }

  public void setId(byte[] value) {
    OCUuidUtilJNI.OCUuid_id_set(swigCPtr, this, value);
  }

  public byte[] getId() {
  return OCUuidUtilJNI.OCUuid_id_get(swigCPtr, this);
}

  public OCUuid() {
    this(OCUuidUtilJNI.new_OCUuid(), true);
  }

}