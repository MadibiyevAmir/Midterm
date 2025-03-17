class Room implements SmartDevice {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void operate() {
        for (SmartDevice device : devices) {
            device.operate();
        }
    }
}
