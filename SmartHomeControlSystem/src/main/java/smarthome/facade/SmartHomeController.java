class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void operateAll() {
        for (SmartDevice device : devices) {
            device.operate();
        }
    }
}
