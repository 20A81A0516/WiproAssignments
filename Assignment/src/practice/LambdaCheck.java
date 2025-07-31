package practice;

interface PerformOperation {
    boolean check(int a);
}

public class LambdaCheck {

    public static PerformOperation isOdd() {
        return a -> a % 2 != 0;
    }

    public static PerformOperation isPrime() {
        return a -> {
            if (a < 2) return false;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        };
    }

    public static PerformOperation isPalindrome() {
        return a -> {
            String str = String.valueOf(a);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }

    public static void main(String[] args) {
        System.out.println("Is 5 Odd? " + isOdd().check(5));         
        System.out.println("Is 11 Prime? " + isPrime().check(11));   
        System.out.println("Is 121 Palindrome? " + isPalindrome().check(121)); 
        System.out.println("Is 123 Palindrome? " + isPalindrome().check(123)); 
    }
}



/*
Is 5 Odd? true
Is 11 Prime? true
Is 121 Palindrome? true
Is 123 Palindrome? false
*/