package practice;

public class EnumDemo {
		    enum Currency {
		        TEN, TWENTY, FIFTY, HUNDRED, FIVE_HUNDRED, TWO_THOUSAND
		    }

		    public static void main(String[] args) {
		        for (Currency note : Currency.values()) {
		            System.out.println("Currency: " + note);
		            switch (note) {
		                case TEN:
		                    System.out.println("Description: Smallest paper currency.");
		                    break;
		                case TWENTY:
		                    System.out.println("Description: Used for small purchases.");
		                    break;
		                case FIFTY:
		                    System.out.println("Description: Handy for moderate transactions.");
		                    break;
		                case HUNDRED:
		                    System.out.println("Description: Most commonly used note.");
		                    break;
		                case FIVE_HUNDRED:
		                    System.out.println("Description: Used for higher transactions.");
		                    break;
		                case TWO_THOUSAND:
		                    System.out.println("Description: High-value note, less in circulation.");
		                    break;
		            }

		            System.out.println();
		        }
		    }	
}


/*
Currency: TEN
Description: Smallest paper currency.

Currency: TWENTY
Description: Used for small purchases.

Currency: FIFTY
Description: Handy for moderate transactions.

Currency: HUNDRED
Description: Most commonly used note.

Currency: FIVE_HUNDRED
Description: Used for higher transactions.

Currency: TWO_THOUSAND
Description: High-value note, less in circulation.

*/
