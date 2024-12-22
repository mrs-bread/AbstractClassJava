public abstract class Array {
    protected int[] A;
    public Array(int[] A) {
        this.A = A;
    }
    public abstract Array add(Array other);
    public abstract void processElements();
    public int[] getElements() {
        return A;
    }
    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
            if (i < A.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}