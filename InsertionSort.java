public class InsertionSort {

    private static void sort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String temp = array[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < array[j].length()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    private static void print(String[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {
        String[] array = {"Reddy", "I", "Vishnu", "Am"};
        InsertionSort.sort(array);
        System.out.println("By using insertion array output is ");
        InsertionSort.print(array);
    }

}