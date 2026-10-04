import java.util.*;

import javax.lang.model.util.Elements;

public class TwoDimArrayQuestions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Print a Matrix
        // Input: matrix = {{1, 2}, {3, 4}}
        // Output:
        // 1 2
        // 3 4

        // System.out.println("Enter no. of row: ");
        // int row = scanner.nextInt();

        // System.out.println("Enter no. of col");
        // int col = scanner.nextInt();

        // int[][] matrix = new int[row][col];

        // System.out.println("Enter " + col * row + " elements");
        // for (int i = 0; i < row; i++) {
        //     for (int j = 0; j < col; j++) {

        //         matrix[i][j] = scanner.nextInt();
        //     }

        // }

        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println();
        // }

// 2.Sum of All Elements
// Input: matrix = {{1, 2}, {3, 4}}
// Output: 10


// int[][] matrix = {{1,2},{3,4}};
// int sum =0;

// for(int i=0; i<matrix.length;i++){
//     for(int j = 0; j<matrix[i].length; j++){
//         sum += matrix[i][j];
//     }
// }

// System.out.println("total sum is: " + sum);






// 3.Find Maximum Element
// Input: matrix = {{5, 9}, {2, 1}}
// Output: 9


// int[][] matrix = {{5, 9}, {2, 1}};

// int max = 0;

// for(int i=0; i<matrix.length; i++){
//     for(int j = 0; j<matrix[i].length; j++){
//         if(matrix[i][j] > max){
//             max = matrix[i][j];
//         }
//     }
// }


// System.out.println(max);






// 4.Count Even and Odd Numbers
// Input: matrix = {{1, 2}, {3, 4}}
// Output: Even = 2, Odd = 2

// int[][] matrix = {{1, 2}, {3, 4}};
// int even = 0;
// int odd = 0;

// for(int i =0; i<matrix.length; i++){
//     for(int j = 0; j<matrix[i].length; j++){
//         if(matrix[i][j]%2 == 0)
//             even++;
//         else
//             odd++;
//     }
// }

// System.out.println("Odd values are : " + odd + " Even values are : " + even);










// 5.Count Zeros
// Input: matrix = {{0, 1}, {0, 2}}
// Output: 2



// Same as 4



// 6. Add Two Matrices
// Input: A = {{1, 2}, {3, 4}}, B = {{5, 6}, {7, 8}}
// Output:
// 6 8
// 10 12

// int[][] A = {{1, 2}, {3, 4}};
// int[][] B = {{5, 6}, {7, 8}};
// int[][] C = new int[A.length][A[0].length];

// for(int i = 0; i<A.length; i++){
//     for(int j = 0; j<A[i].length; j++){
//         C[i][j] = A[i][j]+B[i][j];
//     }
// }


// for(int[] row: C){
//     for(int c: row){
//         System.out.print(c + " ");
//     }
//     System.out.println();
// }









// 7.Multiply Matrix by a Scalar
// Input: matrix = {{1, 2}, {3, 4}}, k = 2
// Output:
// 2 4
// 6 8


//easy



// 8.Row-wise Sum
// Input: matrix = {{1, 2}, {3, 4}}
// Output: 3 7


















































    }

}
