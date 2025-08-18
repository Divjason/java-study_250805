package array;

public class Array7 {
    public static void main(String[] args) {
       // 2차원 배열 => 2행 3열
        // int[] arr1 = new int[3];

//        int[][] arr = new int[2][3];
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

//        System.out.printf("%d", arr[0][0]);
//        System.out.printf("%d", arr[0][1]);
//        System.out.printf("%d", arr[0][2]);
//        System.out.println();
//
//        System.out.printf("%d", arr[1][0]);
//        System.out.printf("%d", arr[1][1]);
//        System.out.printf("%d", arr[1][2]);
//        System.out.println();

//        for (int row = 0; row < 2; row++) {
//            System.out.printf("%d", arr[row][0]);
//            System.out.printf("%d", arr[row][1]);
//            System.out.printf("%d", arr[row][2]);
//            System.out.println();
//        }

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int row = 0; row < 2; row++) {
            for(int column = 0; column < 3; column++) {
                System.out.printf("%d", arr[row][column]);
            }
            System.out.println();
        }
    }
}
