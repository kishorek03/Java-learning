package SOLID_PRINCIPLES;

public class LiskovSubstitutionPrinciple {
    abstract class Shape {
        abstract int calculateArea();
    }

    class Rectangle extends Shape {
        private int width;
        private int height;

        // constructor, getters, setters

        @Override
        public int calculateArea() {
            return width * height;
        }
    }

    class Square extends Shape {
        private int side;

        // constructor, getter, setter

        @Override
        public int calculateArea() {
            return side * side;
        }
    }
}
