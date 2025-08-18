package array;

public class Array8 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        int i = 1;

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++;
            }
        }

        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.printf("%d",arr[row][column]);
            }
            System.out.println();
        }
    }
}
