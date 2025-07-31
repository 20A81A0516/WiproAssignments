package practice;

public class RethrowExample {

    static void someMethod2() throws Exception {
        throw new Exception("Original Exception from someMethod2");
    }

    static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Caught in someMethod: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("Caught in main:");
            e.printStackTrace();
        }
    }
}


/*
java.lang.Exception: Original Exception from someMethod2
Caught in someMethod: Original Exception from someMethod2
Caught in main:
	at Assignment/practice.RethrowExample.someMethod2(RethrowExample.java:6)
	at Assignment/practice.RethrowExample.someMethod(RethrowExample.java:11)
	at Assignment/practice.RethrowExample.main(RethrowExample.java:20)
*/