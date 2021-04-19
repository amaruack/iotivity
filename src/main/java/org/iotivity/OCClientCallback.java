/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCClientCallback {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCClientCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCClientCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCMainJNI.delete_OCClientCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNext(OCClientCallback value) {
    OCMainJNI.OCClientCallback_next_set(swigCPtr, this, OCClientCallback.getCPtr(value), value);
  }

  public OCClientCallback getNext() {
    long cPtr = OCMainJNI.OCClientCallback_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCClientCallback(cPtr, false);
  }

  public void setUri(String value) {
    OCMainJNI.OCClientCallback_uri_set(swigCPtr, this, value);
  }

  public String getUri() {
    return OCMainJNI.OCClientCallback_uri_get(swigCPtr, this);
  }

  public void setQuery(String value) {
    OCMainJNI.OCClientCallback_query_set(swigCPtr, this, value);
  }

  public String getQuery() {
    return OCMainJNI.OCClientCallback_query_get(swigCPtr, this);
  }

  public void setEndpoint(OCEndpoint value) {
    OCMainJNI.OCClientCallback_endpoint_set(swigCPtr, this, OCEndpoint.getCPtr(value), value);
  }

  public OCEndpoint getEndpoint() {
    long cPtr = OCMainJNI.OCClientCallback_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCEndpoint(cPtr, false);
  }

  public void setObserveSeq(int value) {
    OCMainJNI.OCClientCallback_observeSeq_set(swigCPtr, this, value);
  }

  public int getObserveSeq() {
    return OCMainJNI.OCClientCallback_observeSeq_get(swigCPtr, this);
  }

  public void setTimestamp(long value) {
    OCMainJNI.OCClientCallback_timestamp_set(swigCPtr, this, value);
  }

  public long getTimestamp() {
    return OCMainJNI.OCClientCallback_timestamp_get(swigCPtr, this);
  }

  public void setQos(OCQos value) {
    OCMainJNI.OCClientCallback_qos_set(swigCPtr, this, value.swigValue());
  }

  public OCQos getQos() {
    return OCQos.swigToEnum(OCMainJNI.OCClientCallback_qos_get(swigCPtr, this));
  }

  public void setMethod(OCMethod value) {
    OCMainJNI.OCClientCallback_method_set(swigCPtr, this, value.swigValue());
  }

  public OCMethod getMethod() {
    return OCMethod.swigToEnum(OCMainJNI.OCClientCallback_method_get(swigCPtr, this));
  }

  public void setMid(int value) {
    OCMainJNI.OCClientCallback_mid_set(swigCPtr, this, value);
  }

  public int getMid() {
    return OCMainJNI.OCClientCallback_mid_get(swigCPtr, this);
  }

  public void setToken(short[] value) {
    OCMainJNI.OCClientCallback_token_set(swigCPtr, this, value);
  }

  public short[] getToken() {
    return OCMainJNI.OCClientCallback_token_get(swigCPtr, this);
  }

  public void setTokenLen(short value) {
    OCMainJNI.OCClientCallback_tokenLen_set(swigCPtr, this, value);
  }

  public short getTokenLen() {
    return OCMainJNI.OCClientCallback_tokenLen_get(swigCPtr, this);
  }

  public void setDiscovery(boolean value) {
    OCMainJNI.OCClientCallback_discovery_set(swigCPtr, this, value);
  }

  public boolean getDiscovery() {
    return OCMainJNI.OCClientCallback_discovery_get(swigCPtr, this);
  }

  public void setMulticast(boolean value) {
    OCMainJNI.OCClientCallback_multicast_set(swigCPtr, this, value);
  }

  public boolean getMulticast() {
    return OCMainJNI.OCClientCallback_multicast_get(swigCPtr, this);
  }

  public void setStopMulticastReceive(boolean value) {
    OCMainJNI.OCClientCallback_stopMulticastReceive_set(swigCPtr, this, value);
  }

  public boolean getStopMulticastReceive() {
    return OCMainJNI.OCClientCallback_stopMulticastReceive_get(swigCPtr, this);
  }

  public void setRefCount(short value) {
    OCMainJNI.OCClientCallback_refCount_set(swigCPtr, this, value);
  }

  public short getRefCount() {
    return OCMainJNI.OCClientCallback_refCount_get(swigCPtr, this);
  }

  public void setSeparate(short value) {
    OCMainJNI.OCClientCallback_separate_set(swigCPtr, this, value);
  }

  public short getSeparate() {
    return OCMainJNI.OCClientCallback_separate_get(swigCPtr, this);
  }

  public OCClientCallback() {
    this(OCMainJNI.new_OCClientCallback(), true);
  }

}