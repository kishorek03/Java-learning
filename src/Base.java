
public class Base {
    static int i=10;
    static {
        method();{
            System.out.println("First static block");
        }

    }
    public static void main(String [] args){
        method();
        System.out.println("Main method");
    }
    public static void method(){
        System.out.println(j);
    }
    static {
        System.out.println("Second static block");
    }
    static int j=20;
}

