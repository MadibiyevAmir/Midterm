class ScheduledOperationDecorator extends DeviceDecorator {
    public ScheduledOperationDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void operate() {
        System.out.println("Scheduled operation: ");
        super.operate();
    }
}
