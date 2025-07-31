package demos;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            // 1. NegativeArraySizeException
            //int[] arr = new int[-5];

            // 2. ArrayIndexOutOfBoundsException
             int[] arr = new int[3];
             System.out.println(arr[5]);

            // 3. StringIndexOutOfBoundsException
            // String str = "Java";
            // System.out.println(str.charAt(10));

            // 4. IndexOutOfBoundsException (generic for lists or arrays)
            // java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
            // list.add(1);
            // System.out.println(list.get(5));

            // 5. NullPointerException
            // String s = null;
            // System.out.println(s.length());

            // 6. ArithmeticException
            // int a = 10 / 0;

        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Caught General Exception");
            e.printStackTrace();
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*
 * Caught ArrayIndexOutOfBoundsException
java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	at Wipro/demos.MultipleCatchDemo.main(MultipleCatchDemo.java:14)
Program continues after exception handling.
*/
