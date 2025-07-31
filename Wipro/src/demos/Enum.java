package demos;
public class Enum {
 
    enum PaperCurrency {
        ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED
    }

    public static void main(String[] args) {
        System.out.println("Currency values:");
        for (PaperCurrency bill : PaperCurrency.values()) {
            System.out.println(bill);
        }

        System.out.println("\nCurrency descriptions:");
        PaperCurrency example = PaperCurrency.TEN; 
        
        switch (example) {
            case ONE:
                System.out.println("$1 - George Washington");
                break;
            case FIVE:
                System.out.println("$5 - Abraham Lincoln");
                break;
            case TEN:
                System.out.println("$10 - Alexander Hamilton");
                break;
            case TWENTY:
                System.out.println("$20 - Andrew Jackson");
                break;
            case FIFTY:
                System.out.println("$50 - Ulysses S. Grant");
                break;
            case HUNDRED:
                System.out.println("$100 - Benjamin Franklin");
                break;
        }
    }
}