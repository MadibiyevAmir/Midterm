public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartDevice light = factory.createLight();
        SmartDevice thermostat = factory.createThermostat();

        SmartDevice scheduledLight = new ScheduledOperationDecorator(light);

        Room livingRoom = new Room();
        livingRoom.addDevice(light);
        livingRoom.addDevice(thermostat);

        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(scheduledLight);

        OldLockSystem oldLock = new OldLockSystem();
        LegacyLockSystem adaptedLock = new LockAdapter(oldLock);
        adaptedLock.unlock();

        controller.operateAll();
    }
}
