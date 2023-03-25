package methodOverriding;

public class ClassB extends ClassA{
    public void myMethod () {
        System.out.println("This is class A");
    }
    public static void main(String[] args) {
        ClassB classB = new ClassB();
      //  ClassB.myMethod();


    }

}
