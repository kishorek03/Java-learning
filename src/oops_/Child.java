package oops_;

public class Child extends Parent {
    public void m2(){
        System.out.println("Print m2");
    }
    public static void main(String [] args){
        Parent p = new Parent();
        p.m1();
        Child C = new Child();
        C.m2();
        C.m1();
    }

}
