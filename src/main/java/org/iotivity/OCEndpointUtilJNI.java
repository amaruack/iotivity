/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.iotivity;
import java.lang.String;
public class OCEndpointUtilJNI {

  static {
    try {
        System.loadLibrary("iotivity-lite-jni");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native void freeEndpoint(long jarg1, OCEndpoint jarg1_);
  public final static native String toString(long jarg1, OCEndpoint jarg1_);
  public final static native long stringToEndpoint__SWIG_0(String jarg1, String[] jarg2) throws OCEndpointParseException;
  public final static native long stringToEndpoint__SWIG_1(String jarg1) throws OCEndpointParseException;
  public final static native String endpointStringParsePath(String jarg1);
  public final static native long copy(long jarg1, OCEndpoint jarg1_);
  public final static native long listCopy(long jarg1, OCEndpoint jarg1_);
  public final static native int OCF_VER_1_0_0_get();
  public final static native int OIC_VER_1_1_0_get();
  public final static native void OCIPv6Addr_port_set(long jarg1, OCIPv6Addr jarg1_, int jarg2);
  public final static native int OCIPv6Addr_port_get(long jarg1, OCIPv6Addr jarg1_);
  public final static native void OCIPv6Addr_address_set(long jarg1, OCIPv6Addr jarg1_, short[] jarg2);
  public final static native short[] OCIPv6Addr_address_get(long jarg1, OCIPv6Addr jarg1_);
  public final static native void OCIPv6Addr_scope_set(long jarg1, OCIPv6Addr jarg1_, short jarg2);
  public final static native short OCIPv6Addr_scope_get(long jarg1, OCIPv6Addr jarg1_);
  public final static native long new_OCIPv6Addr();
  public final static native void delete_OCIPv6Addr(long jarg1);
  public final static native void OCIPv4Addr_port_set(long jarg1, OCIPv4Addr jarg1_, int jarg2);
  public final static native int OCIPv4Addr_port_get(long jarg1, OCIPv4Addr jarg1_);
  public final static native void OCIPv4Addr_address_set(long jarg1, OCIPv4Addr jarg1_, short[] jarg2);
  public final static native short[] OCIPv4Addr_address_get(long jarg1, OCIPv4Addr jarg1_);
  public final static native long new_OCIPv4Addr();
  public final static native void delete_OCIPv4Addr(long jarg1);
  public final static native void OCLEAddr_type_set(long jarg1, OCLEAddr jarg1_, short jarg2);
  public final static native short OCLEAddr_type_get(long jarg1, OCLEAddr jarg1_);
  public final static native void OCLEAddr_address_set(long jarg1, OCLEAddr jarg1_, short[] jarg2);
  public final static native short[] OCLEAddr_address_get(long jarg1, OCLEAddr jarg1_);
  public final static native long new_OCLEAddr();
  public final static native void delete_OCLEAddr(long jarg1);
  public final static native void OCEndpoint_addr_set(long jarg1, OCEndpoint jarg1_, long jarg2, DevAddr jarg2_);
  public final static native long OCEndpoint_addr_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_addrLocal_set(long jarg1, OCEndpoint jarg1_, long jarg2, DevAddr jarg2_);
  public final static native long OCEndpoint_addrLocal_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_next_set(long jarg1, OCEndpoint jarg1_, long jarg2, OCEndpoint jarg2_);
  public final static native long OCEndpoint_next_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_device_set(long jarg1, OCEndpoint jarg1_, long jarg2);
  public final static native long OCEndpoint_device_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_flags_set(long jarg1, OCEndpoint jarg1_, int jarg2);
  public final static native int OCEndpoint_flags_get(long jarg1, OCEndpoint jarg1_);
  public final static native long OCEndpoint_di_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_interfaceIndex_set(long jarg1, OCEndpoint jarg1_, int jarg2);
  public final static native int OCEndpoint_interfaceIndex_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_priority_set(long jarg1, OCEndpoint jarg1_, short jarg2);
  public final static native short OCEndpoint_priority_get(long jarg1, OCEndpoint jarg1_);
  public final static native void OCEndpoint_version_set(long jarg1, OCEndpoint jarg1_, int jarg2);
  public final static native int OCEndpoint_version_get(long jarg1, OCEndpoint jarg1_);
  public final static native long new_OCEndpoint__SWIG_0();
  public final static native long new_OCEndpoint__SWIG_1(String jarg1) throws OCEndpointParseException;
  public final static native void delete_OCEndpoint(long jarg1);
  public final static native void OCEndpoint_setDi(long jarg1, OCEndpoint jarg1_, long jarg2, OCUuid jarg2_);
  public final static native String OCEndpoint_toString(long jarg1, OCEndpoint jarg1_);
  public final static native boolean OCEndpoint_isIPv6LinkLocal(long jarg1, OCEndpoint jarg1_);
  public final static native boolean OCEndpoint_compare(long jarg1, OCEndpoint jarg1_, long jarg2, OCEndpoint jarg2_);
  public final static native boolean OCEndpoint_compareAddress(long jarg1, OCEndpoint jarg1_, long jarg2, OCEndpoint jarg2_);
  public final static native void OCEndpoint_setLocalAddress(long jarg1, OCEndpoint jarg1_, int jarg2);
  public final static native long OCEndpoint_copy(long jarg1, OCEndpoint jarg1_);
  public final static native void DevAddr_ipv6_set(long jarg1, DevAddr jarg1_, long jarg2, OCIPv6Addr jarg2_);
  public final static native long DevAddr_ipv6_get(long jarg1, DevAddr jarg1_);
  public final static native void DevAddr_ipv4_set(long jarg1, DevAddr jarg1_, long jarg2, OCIPv4Addr jarg2_);
  public final static native long DevAddr_ipv4_get(long jarg1, DevAddr jarg1_);
  public final static native void DevAddr_bt_set(long jarg1, DevAddr jarg1_, long jarg2, OCLEAddr jarg2_);
  public final static native long DevAddr_bt_get(long jarg1, DevAddr jarg1_);
  public final static native long new_DevAddr();
  public final static native void delete_DevAddr(long jarg1);
  public final static native long newEndpoint();
  public final static native void setDi(long jarg1, OCEndpoint jarg1_, long jarg2, OCUuid jarg2_);
  public final static native int ipv6EndpointIsLinkLocal(long jarg1, OCEndpoint jarg1_);
  public final static native int compare(long jarg1, OCEndpoint jarg1_, long jarg2, OCEndpoint jarg2_);
  public final static native int compareAddress(long jarg1, OCEndpoint jarg1_, long jarg2, OCEndpoint jarg2_);
  public final static native void setLocalAddress(long jarg1, OCEndpoint jarg1_, int jarg2);
}
