package SOLID_PRINCIPLES;

public class DependencyInversionPrinciple {
    interface Switchable {
        void turnOn();
        void turnOff();
    }

    static class LightBulb implements Switchable {
        public void turnOn() { /* ... */ }
        public void turnOff() { /* ... */ }
    }

    static class Fan implements Switchable {
        public void turnOn() { /* ... */ }
        public void turnOff() { /* ... */ }
    }

    static class Switch {
        private Switchable device;

        public Switch(Switchable device) { // Depends on abstraction
            this.device = device;
        }

        public void operate() {
            // toggle device
        }
    }
}
