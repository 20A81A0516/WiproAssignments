package demos;

public class CommandLineArguments {

    public static void main(String[] args) {

        System.out.println("Total Arguments: " + args.length); 

        if (args.length < 2) { 
            System.out.println("Please provide two numbers as arguments."); 
            return; 
        }

        System.out.println("Argument[0]: " + args[0]);
        System.out.println("Argument[1]: " + args[1]); 

        System.out.println("Concatenated: " + args[0] + args[1]); 

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);


        int product = num1 * num2; 

        System.out.println("Multiplication: " + product);
    }
}



/*
Total Arguments: 2
Argument[0]: 4
Argument[1]: 5
Concatenated: 45
Multiplication: 20
*/