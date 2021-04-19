/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCIPv6Addr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCIPv6Addr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCIPv6Addr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCEndpointUtilJNI.delete_OCIPv6Addr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPort(int value) {
    OCEndpointUtilJNI.OCIPv6Addr_port_set(swigCPtr, this, value);
  }

  public int getPort() {
    return OCEndpointUtilJNI.OCIPv6Addr_port_get(swigCPtr, this);
  }

  public void setAddress(short[] value) {
    OCEndpointUtilJNI.OCIPv6Addr_address_set(swigCPtr, this, value);
  }

  public short[] getAddress() {
    return OCEndpointUtilJNI.OCIPv6Addr_address_get(swigCPtr, this);
  }

  public void setScope(short value) {
    OCEndpointUtilJNI.OCIPv6Addr_scope_set(swigCPtr, this, value);
  }

  public short getScope() {
    return OCEndpointUtilJNI.OCIPv6Addr_scope_get(swigCPtr, this);
  }

  public OCIPv6Addr() {
    this(OCEndpointUtilJNI.new_OCIPv6Addr(), true);
  }

}