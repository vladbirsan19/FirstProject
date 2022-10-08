package week5.array.primitive;

public class ArrayPrimitiveDemo {

    public static void main(String[] args) {

        // v1 - most extended
        int[] array1 = new int[3];
        array1[0] = 5;
        array1[1] = 10;
        array1[2] = 15;
//        will show an exception at runtime because the
//        size of the array is smaller than the positions filled
//        array1[3] = 20;


        // v2 - semi extended
        int[] array2 = new int[]{5, 10, 15};

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Array2 values are: " + array2[i]);
        }

        // v3 - shorter version
        int[] array3 = {5, 10, 15};

        // multi dimensional array
        // index           0  1  2    0    1   2     0   1   2
        int[][] array4 = {{5, 6, 7}, {10, 11, 12}, {15, 16, 17}};
        // array index        0            1             2

        for (int row = 0; row < array4.length; row++) {
            System.out.println("I am on row:" + row);

            for (int column = 0; column < array4[row].length; column++) {
                System.out.println(array4[row][column]);
            }
        }

    }

}


