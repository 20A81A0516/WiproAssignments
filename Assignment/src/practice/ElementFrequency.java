package practice;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {

        int[] arr = {5, 3, 5, 2, 3, 5, 7, 2, 3, 1};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Element Frequencies in the Array:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}




/*
Element Frequencies in the Array:
Element 1 occurs 1 times.
Element 2 occurs 2 times.
Element 3 occurs 3 times.
Element 5 occurs 3 times.
Element 7 occurs 1 times.*/