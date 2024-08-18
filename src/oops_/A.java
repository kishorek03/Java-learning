package oops_;

public class A {
    private int x=10;

}
class B extends A{
     int y=20;
}
class C extends A{
    private int z=20;
    public static void main(String [] args) {
    B objB = new B();
    C objC = new C();
    //need to add x and y
        int sum = objC.z+objB.y;
}
}


