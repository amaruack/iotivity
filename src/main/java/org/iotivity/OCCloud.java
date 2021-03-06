/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;

public class OCCloud {
  public static OCCloudContext getContext(long device) {
    long cPtr = OCCloudJNI.getContext(device);
    return (cPtr == 0) ? null : new OCCloudContext(cPtr, false);
  }

  public static int managerStart(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.managerStart(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int managerStop(OCCloudContext ctx) {
    return OCCloudJNI.managerStop(OCCloudContext.getCPtr(ctx), ctx);
  }

  public static int registerCloud(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.registerCloud(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int login(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.login(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int logout(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.logout(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int deregisterCloud(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.deregisterCloud(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int refreshToken(OCCloudContext ctx, OCCloudHandler callback) {
    return OCCloudJNI.refreshToken(OCCloudContext.getCPtr(ctx), ctx, callback);
  }

  public static int getTokenExpiry(OCCloudContext ctx) {
    return OCCloudJNI.getTokenExpiry(OCCloudContext.getCPtr(ctx), ctx);
  }

  public static int addResource(OCResource resource) {
    return OCCloudJNI.addResource(OCResource.getCPtr(resource), resource);
  }

  public static void deleteResource(OCResource resource) {
    OCCloudJNI.deleteResource(OCResource.getCPtr(resource), resource);
  }

  public static int publishResources(long device) {
    return OCCloudJNI.publishResources(device);
  }

  public static int discoverResources(OCCloudContext ctx, OCDiscoveryAllHandler handler) {
    return OCCloudJNI.discoverResources(OCCloudContext.getCPtr(ctx), ctx, handler);
  }

  public static int provisionConfResource(OCCloudContext ctx, String server, String accessToken, String serverId, String authProvider) {
    return OCCloudJNI.provisionConfResource(OCCloudContext.getCPtr(ctx), ctx, server, accessToken, serverId, authProvider);
  }

}
