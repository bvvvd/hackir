package c.v.interviewpreparationkit.arrays;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        int r = 4;
        int[] array = {1, 2, 3, 4, 5};

        assert Arrays.equals(new int[]{5, 1, 2, 3, 4},
                rotateLeft(array, r));

        r = 10;
        array = new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};

        assert Arrays.equals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77},
                rotateLeft(array, r));
    }

    private static int[] rotateLeft(int[] sourceArray, int rotateFactor) {
        int length = sourceArray.length;
        int rotateIndex = length - rotateFactor;
        int[] destinationArray = new int[length];

        System.arraycopy(sourceArray, rotateFactor, destinationArray, 0, rotateIndex);
        System.arraycopy(sourceArray, 0, destinationArray, rotateIndex, rotateFactor);

        return destinationArray;
    }
}
