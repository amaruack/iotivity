/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCCloudContext {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OCCloudContext(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OCCloudContext obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OCCloudJNI.delete_OCCloudContext(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNext(OCCloudContext value) {
    OCCloudJNI.OCCloudContext_next_set(swigCPtr, this, OCCloudContext.getCPtr(value), value);
  }

  public OCCloudContext getNext() {
    long cPtr = OCCloudJNI.OCCloudContext_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCCloudContext(cPtr, false);
  }

  public void setDevice(long value) {
    OCCloudJNI.OCCloudContext_device_set(swigCPtr, this, value);
  }

  public long getDevice() {
    return OCCloudJNI.OCCloudContext_device_get(swigCPtr, this);
  }

  public void setStore(OCCloudStore value) {
    OCCloudJNI.OCCloudContext_store_set(swigCPtr, this, OCCloudStore.getCPtr(value), value);
  }

  public OCCloudStore getStore() {
    long cPtr = OCCloudJNI.OCCloudContext_store_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCCloudStore(cPtr, false);
  }

  public void setCloudEndpointState(OCSessionState value) {
    OCCloudJNI.OCCloudContext_cloudEndpointState_set(swigCPtr, this, value.swigValue());
  }

  public OCSessionState getCloudEndpointState() {
    return OCSessionState.swigToEnum(OCCloudJNI.OCCloudContext_cloudEndpointState_get(swigCPtr, this));
  }

  public void setCloudEndpoint(OCEndpoint value) {
    OCCloudJNI.OCCloudContext_cloudEndpoint_set(swigCPtr, this, OCEndpoint.getCPtr(value), value);
  }

  public OCEndpoint getCloudEndpoint() {
    long cPtr = OCCloudJNI.OCCloudContext_cloudEndpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCEndpoint(cPtr, false);
  }

  public void setRetryCount(short value) {
    OCCloudJNI.OCCloudContext_retryCount_set(swigCPtr, this, value);
  }

  public short getRetryCount() {
    return OCCloudJNI.OCCloudContext_retryCount_get(swigCPtr, this);
  }

  public void setRetryRefreshTokenCount(short value) {
    OCCloudJNI.OCCloudContext_retryRefreshTokenCount_set(swigCPtr, this, value);
  }

  public short getRetryRefreshTokenCount() {
    return OCCloudJNI.OCCloudContext_retryRefreshTokenCount_get(swigCPtr, this);
  }

  public void setLastError(OCCloudError value) {
    OCCloudJNI.OCCloudContext_lastError_set(swigCPtr, this, value.swigValue());
  }

  public OCCloudError getLastError() {
    return OCCloudError.swigToEnum(OCCloudJNI.OCCloudContext_lastError_get(swigCPtr, this));
  }

  public void setExpiresIn(int value) {
    OCCloudJNI.OCCloudContext_expiresIn_set(swigCPtr, this, value);
  }

  public int getExpiresIn() {
    return OCCloudJNI.OCCloudContext_expiresIn_get(swigCPtr, this);
  }

  public void setRdPublishResources(OCLink value) {
    OCCloudJNI.OCCloudContext_rdPublishResources_set(swigCPtr, this, OCLink.getCPtr(value), value);
  }

  public OCLink getRdPublishResources() {
    long cPtr = OCCloudJNI.OCCloudContext_rdPublishResources_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLink(cPtr, false);
  }

  public void setRdPublishedResources(OCLink value) {
    OCCloudJNI.OCCloudContext_rdPublishedResources_set(swigCPtr, this, OCLink.getCPtr(value), value);
  }

  public OCLink getRdPublishedResources() {
    long cPtr = OCCloudJNI.OCCloudContext_rdPublishedResources_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLink(cPtr, false);
  }

  public void setRdDeleteResources(OCLink value) {
    OCCloudJNI.OCCloudContext_rdDeleteResources_set(swigCPtr, this, OCLink.getCPtr(value), value);
  }

  public OCLink getRdDeleteResources() {
    long cPtr = OCCloudJNI.OCCloudContext_rdDeleteResources_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCLink(cPtr, false);
  }

  public void setRdDeleteAll(boolean value) {
    OCCloudJNI.OCCloudContext_rdDeleteAll_set(swigCPtr, this, value);
  }

  public boolean getRdDeleteAll() {
    return OCCloudJNI.OCCloudContext_rdDeleteAll_get(swigCPtr, this);
  }

  public void setCloudConf(OCResource value) {
    OCCloudJNI.OCCloudContext_cloudConf_set(swigCPtr, this, OCResource.getCPtr(value), value);
  }

  public OCResource getCloudConf() {
    long cPtr = OCCloudJNI.OCCloudContext_cloudConf_get(swigCPtr, this);
    return (cPtr == 0) ? null : new OCResource(cPtr, false);
  }

  public void setCloudManager(boolean value) {
    OCCloudJNI.OCCloudContext_cloudManager_set(swigCPtr, this, value);
  }

  public boolean getCloudManager() {
    return OCCloudJNI.OCCloudContext_cloudManager_get(swigCPtr, this);
  }

  public OCCloudContext() {
    this(OCCloudJNI.new_OCCloudContext(), true);
  }

}
