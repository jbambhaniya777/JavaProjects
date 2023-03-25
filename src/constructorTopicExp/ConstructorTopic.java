package constructorTopicExp;

public class ConstructorTopic {
    // Constructor - block of statement, must have name as same as class name
    // Method - block of statement, choose any name as method name
    public void myMethod (){
        System.out.println("Radhe Radhe");
    }
    public void ConstructorTopic (){
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        // object
        ConstructorTopic constructorTopic = new ConstructorTopic();
        constructorTopic.myMethod();
    }
}
