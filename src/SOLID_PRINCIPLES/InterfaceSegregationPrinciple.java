package SOLID_PRINCIPLES;

public class InterfaceSegregationPrinciple {
    interface Workable {
        void work();
    }

    interface Eatable {
        void eat();
    }

    interface Sleepable {
        void sleep();
    }

    static class HumanWorker implements Workable, Eatable, Sleepable {
        public void work() { /* ... */ }
        public void eat() { /* ... */ }
        public void sleep() { /* ... */ }
    }

    static class RobotWorker implements Workable {
        public void work() { /* ... */ }
    }
}
