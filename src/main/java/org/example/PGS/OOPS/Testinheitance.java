package org.example.PGS.OOPS;

class Animal{

    void eat(){
        System.out.println("Eating in the Animal Class");
    }
}

class Dog extends Animal{

    void Bark(){
        System.out.println("Barking in the Barking Class");
    }
    void eat(){
        System.out.println("Eating in the Dog Class");
    }
}

class BabyDog extends Dog{

    void weep(){
        System.out.println("Weeping");
    }
}

public class Testinheitance {
    public static void main(String[] args) {
        // Reusability of Code //
       BabyDog babyDog = new BabyDog();
       babyDog.eat();
    }
}
