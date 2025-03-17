# Smart Home Control System

## Project Description
The **Smart Home Control System** project demonstrates managing smart devices (e.g., lights, thermostats, security cameras) using various design patterns: Composite, Decorator, Abstract Factory, Facade, and Adapter.

## Implemented Design Patterns

### Composite
- Organize devices (Leaf) and groups of devices (Composite), such as rooms or floors.
- Example: Multiple lights and a thermostat in a single room.

### Decorator
- Dynamically add functionality to devices (e.g., logging or scheduling operations).
- Example: Scheduled light operation using `ScheduledOperationDecorator`.

### Abstract Factory
- Create families of related devices (standard and advanced).
- Example: `BasicSmartHomeFactory` for basic devices and `AdvancedSmartHomeFactory` for high-end devices.

### Facade
- Simplified interface for system management through `SmartHomeController`.
- Example: Turn on all lights or set a global temperature.

### Adapter
- Integration with legacy systems or external APIs.
- Example: Adapting an old lock system with `LockAdapter`.

## Project Structure
```
SmartHomeControlSystem/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── smarthome/
│   │           ├── composite/
│   │           ├── decorator/
│   │           ├── factory/
│   │           ├── facade/
│   │           ├── adapter/
│   │           └── SmartHomeSystem.java
│
└── README.md
```

## How to Run the Project

1. Clone the repository:
```bash
git clone https://github.com/your-username/SmartHomeControlSystem.git
```

2. Navigate to the project root:
```bash
cd SmartHomeControlSystem
```

3. Compile the project:
```bash
javac src/main/java/smarthome/SmartHomeSystem.java
```

4. Run the program:
```bash
java src/main/java/smarthome/SmartHomeSystem
```

## Version Control
The repository is divided into branches for each design pattern:
- `feature/composite-pattern`
- `feature/decorator-pattern`
- `feature/abstract-factory`
- `feature/facade-pattern`
- `feature/adapter-pattern`

## License
MIT License

