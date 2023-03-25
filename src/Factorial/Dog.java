package Factorial;

public class Dog {
    // state
    String colour = "White";
    int age = 11;
    int weight = 16;
    static int height = 4;
    static String breed = "desi";
     // Behaviour
     public static void main(String[] args) {
         Dog dog = new Dog();
         System.out.println("Dog can bark");
         System.out.println("Dog can eat");
         System.out.println(dog.colour);
         System.out.println(dog.age);
         System.out.println(dog.weight);
         System.out.println(height);
         System.out.println(breed);
     }

    public static void barking(String[] args) {
        System.out.println("Dog - barking");
    }

    public static void eating(String[] args) {
        System.out.println("Dog - eating");
    }



    }


