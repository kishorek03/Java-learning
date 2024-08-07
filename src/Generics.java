public class Generics<t> {
t printGenerics;
    public Generics (t printGenerics){
        this.printGenerics=printGenerics;
}

    public void printGenerics(){
        System.out.println(printGenerics);
    }

    public static void main(String[] args) {
        Generics<Integer> c=new Generics<>(24);
        c.printGenerics();
    }
}
