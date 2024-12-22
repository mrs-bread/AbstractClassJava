public class XorArray extends Array {
    public XorArray(int[] A) {
        super(A);
    }
    public Array add(Array other) {
        int[] otherElements = other.getElements();
        int maxLength = Math.max(A.length, otherElements.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int thisElement = A[i];
            int otherElement = otherElements[i];
            if(i>A.length)
                thisElement=0;
            if(i>otherElements.length)
                otherElement=0;
            result[i] = thisElement ^ otherElement;
        }

        return new XorArray(result);
    }
    public void processElements() {
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.sqrt(A[i]);
        }
    }
}