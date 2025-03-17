class BasicSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight() {
        return new Light();
    }

    public SmartDevice createThermostat() {
        return new Thermostat();
    }
}
