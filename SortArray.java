import java.util.HashSet;
import java.util.Set;

public class SortArray extends Array {
    public SortArray(int[] A) {
        super(A);
    }

    public Array add(Array B) {
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<A.length;i++) {
            set.add(A[i]);
        }
        for (int i=0;i<B.getElements().length;i++ ) {
            set.add(B.getElements()[i]);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (int element : set) {
            result[index++] = element;
        }
        return new SortArray(result);
    }

    public void processElements() {
        // Сортировка пузырьком
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}