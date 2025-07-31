package zoo;

import org.animals.*;

public class VandalurZoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Golden", 190.5, 8);
        Tiger tiger = new Tiger("Orange", 210.2, 7);
        Deer deer = new Deer("Brown", 100.0, 4);
        Monkey monkey = new Monkey("Grey", 40.5, 5);
        Elephant elephant = new Elephant("Grey", 540.0, 25);
        Giraffe giraffe = new Giraffe("Yellow", 300.0, 15);

        printAnimal("Lion", lion.getColor(), lion.getWeight(), lion.getAge(), lion.isVegetarian(), lion.canClimb(), lion.sound());
        printAnimal("Tiger", tiger.getColor(), tiger.getWeight(), tiger.getAge(), tiger.isVegetarian(), tiger.canClimb(), tiger.sound());
        printAnimal("Deer", deer.getColor(), deer.getWeight(), deer.getAge(), deer.isVegetarian(), deer.canClimb(), deer.sound());
        printAnimal("Monkey", monkey.getColor(), monkey.getWeight(), monkey.getAge(), monkey.isVegetarian(), monkey.canClimb(), monkey.sound());
        printAnimal("Elephant", elephant.getColor(), elephant.getWeight(), elephant.getAge(), elephant.isVegetarian(), elephant.canClimb(), elephant.sound());
        printAnimal("Giraffe", giraffe.getColor(), giraffe.getWeight(), giraffe.getAge(), giraffe.isVegetarian(), giraffe.canClimb(), giraffe.sound());
    }

    public static void printAnimal(String name, String color, double weight, int age, boolean isVeg, boolean canClimb, String sound) {
        System.out.println("=== " + name + " ===");
        System.out.println("Color      : " + color);
        System.out.println("Weight     : " + weight + " kg");
        System.out.println("Age        : " + age + " years");
        System.out.println("Vegetarian : " + isVeg);
        System.out.println("Can Climb  : " + canClimb);
        System.out.println("Sound      : " + sound);
        System.out.println();
    }
}


/*
=== Lion ===
Color      : Golden
Weight     : 190.5 kg
Age        : 8 years
Vegetarian : false
Can Climb  : false
Sound      : Roar

=== Tiger ===
Color      : Orange
Weight     : 210.2 kg
Age        : 7 years
Vegetarian : false
Can Climb  : true
Sound      : Growl

=== Deer ===
Color      : Brown
Weight     : 100.0 kg
Age        : 4 years
Vegetarian : true
Can Climb  : false
Sound      : Bleat

=== Monkey ===
Color      : Grey
Weight     : 40.5 kg
Age        : 5 years
Vegetarian : true
Can Climb  : true
Sound      : Chatter

=== Elephant ===
Color      : Grey
Weight     : 540.0 kg
Age        : 25 years
Vegetarian : true
Can Climb  : false
Sound      : Trumpet

=== Giraffe ===
Color      : Yellow
Weight     : 300.0 kg
Age        : 15 years
Vegetarian : true
Can Climb  : false
Sound      : Hum

*/
