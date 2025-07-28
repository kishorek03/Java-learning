package SOLID_PRINCIPLES;

public class OpenClosedPrinciple {
    public interface Shape {
        double calculateArea();
    }

    public static class Rectangle implements Shape {
        private double width;
        private double height;

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    public static class Circle implements Shape {
        private double radius;

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }
}
