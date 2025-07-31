package practice;
import static java.lang.System.out;

class Hall {
    void show() {
        out.println("This is the first room while entering the house");
    }
}

class Kitchen {
    void showAppliances() {
        String[] appliances = {"Fridge", "Oven", "Mixer", "Toaster"};

        System.out.println("Appliances in the kitchen:");
        for (String appliance : appliances) {
            System.out.println(appliance);
        }

        String[] copiedAppliances = new String[appliances.length];
        for (int i = 0; i < appliances.length; i++) {
            copiedAppliances[i] = appliances[i];
        }

        System.out.println("Copied appliances:");
        for (String item : copiedAppliances) {
            System.out.println(item);
        }
    }
}

public class HouseDemo {
    public static void main(String[] args) {
        Hall hall = new Hall();
        hall.show();

        Kitchen kitchen = new Kitchen();
        kitchen.showAppliances();
    }
}


/*
This is the first room while entering the house
Appliances in the kitchen:
Fridge
Oven
Mixer
Toaster
Copied appliances:
Fridge
Oven
Mixer
Toaster
*/