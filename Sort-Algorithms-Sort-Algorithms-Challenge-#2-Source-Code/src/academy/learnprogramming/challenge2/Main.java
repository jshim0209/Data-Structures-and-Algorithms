package academy.learnprogramming.challenge2;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertionSort(intArray, intArray.length);


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void insertionSort(int[] input, int numberOfItems) {
        if (numberOfItems < 2) {
            return;
        }

        insertionSort(input, numberOfItems - 1);

        int newElement = input[numberOfItems - 1];

        int i;

        for (i = numberOfItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }
        input[i] = newElement;

        System.out.println("Result of call when number of items = " + numberOfItems);
        for (i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("--------------------------------");
    }
}
