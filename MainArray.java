public class MainArray {
    public static void main(String[] args) {
        // Тестирование SortArray
        SortArray sortArray1 = new SortArray(new int[]{3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5});
        SortArray sortArray2 = new SortArray(new int[]{2, 7, 1, 8, 2, 8, 1, 8, 2, 8, 4});

        System.out.println("Start SortArray:");
        sortArray1.printArray();

        sortArray1.processElements();
        System.out.println("Process SortArray:");
        sortArray1.printArray();

        Array sortArraySum = sortArray1.add(sortArray2);
        System.out.println("Add SortArray:");
        sortArraySum.printArray();

        XorArray xorArray1 = new XorArray(new int[]{1, 2, 3, 4, 5});
        XorArray xorArray2 = new XorArray(new int[]{5, 4, 3, 2, 1});

        System.out.println("\nStart XorArray:");
        xorArray1.printArray();

        xorArray1.processElements();
        System.out.println("Process XorArray:");
        xorArray1.printArray();

        Array xorArraySum = xorArray1.add(xorArray2);
        System.out.println("Add XorArray:");
        xorArraySum.printArray();
    }
}
