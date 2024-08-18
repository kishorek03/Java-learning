package oops_;

public final class ImmutableClass {
    private final int age;
    private final String name;

    private ImmutableClass(int age , String name){
        this.name= name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public  void setAge(int age){


    }
    public void main (String[] args){
        setAge(3);
    }
}
