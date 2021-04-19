package org.iotivity.oc;

/**
 * Callback for all discovered devices.
 *
 * @see org.iotivity.oc.OcUtils#discoverAllDevices
 */
public interface OcDeviceDiscoveryHandler {

    /**
     * Called after a discovered device has been populated with its discovered resources.
     *
     * @param remoteDevice  the discovered device
     *
     * @see org.iotivity.oc.OcUtils#discoverAllDevices
     * @see org.iotivity.oc.OcRemoteDevice
     * @see org.iotivity.oc.OcRemoteResource
     */
    public void discoveredDevice(OcRemoteDevice remoteDevice);
}
