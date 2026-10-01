import java.util.*;


public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int row = 5;

        // for(int i = 1; i<=row; i++){
        // for(int j = row-1; j>=i; j--){
        // System.out.print(" ");
        // }
        // for(int k = 1; k<= i*2-1; k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 1

        // ********
        // ********
        // ********
        // ********
        // ********

        // int row = 5;
        // int col = 8;

        // for(int i = 0; i< row; i++){
        // for(int j = 0; j < col; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 2

        // *
        // **
        // ***
        // ****
        // *****

        // int row = 5;

        // for(int i = 0; i<5; i++){
        // for(int j = 0; j<i+1; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 3.
        // *****
        // ****
        // ***
        // **
        // *

        // int row = 5;

        // for(int i = 0; i<row; i++){
        // for(int j = row-1; j > i; j--){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 4.
        // 1
        // 22
        // 333
        // 4444
        // 55555

        // int row = 5;

        // for(int i = 1; i<=row; i++ ){
        // for(int j = 0; j<i; j++){
        // System.out.print(i);
        // }
        // System.out.println();
        // }

        // 5.
        // 1
        // 12
        // 123
        // 1234
        // 12345

        // int row = 5;

        // for(int i = 1; i<=row; i++){
        // for(int j = 1; j<i+1; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 6.
        // 54321
        // 4321
        // 321
        // 21
        // 1

        // int row = 5;

        // for(int i = row; i>0; i--){

        // for(int j = i; j>0; j--){
        // System.out.print(j);
        // row--;
        // }
        // System.out.println();
        // }

        // 7.
        // 12345
        // 1234
        // 123
        // 12
        // 1

        // int row = 5;

        // for(int i= 0; i<row ; i++){
        // for(int j = 1; j<=row-i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // 8.
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE

        // int row = 5;

        // for(int i = 0; i<row; i++){
        // for(int j = 65; j<=65+i; j++){
        // System.out.print((char) j);
        // }
        // System.out.println();
        // }

        // 9.
        // ***********
        // * *
        // * *
        // * *
        // * *
        // * *
        // * *
        // ***********

        // int row = 8;
        // int col = 11;
        // int num = 6;

        // for (int a = 1; a <= row; a++) {
        // if (a == 1) {
        // for (int i = 1; i <= col; i++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // } else if (a == 2) {
        // while (num > 0) {

        // for (int b = 1; b <= col; b++) {
        // if (b == 1 || b == 11)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // num--;
        // }
        // } else if (a == 8) {
        // for (int i = 1; i <= col; i++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // }

        // 10.
        // *****
        // ****
        // ***
        // **
        // *

        // int row = 5;

        // for(int i= 0; i<row; i++){
        // for(int j = 0; j<i; j++){
        // System.out.print(" ");
        // }

        // for(int k = row; k>i; k-- ){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 11.
        // *
        // **
        // ***
        // ****
        // *****

        // int row = 5;

        // for(int i = 0 ; i< row; i++){
        // for(int j = row; j>i; j-- ){
        // System.out.print(' ');
        // }
        // for(int k = 0; k<=i; k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

// 12.1 
//     *
//    ***
//   *****
//  *******
// *********




        // int row = 10;

        // for(int i = 1; i<=row; i++){
        // for(int j = row; j>i; j--){
        // System.out.print(" ");
        // }
        // for(int k = 0; k<i*2-1; k++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

      











// 12.
//      *
//     * *
//    * * *
//   * * * *
//  * * * * * 


// int row = 5;

// for(int i = 0; i<row; i++){
//     for(int j = row; j>i; j--){
//         System.out.print(" ");
//     }
//     for(int k = 0; k<=i; k++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }





// 13.
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *



// int row = 5;

// for(int i =0; i<row; i++){
//     for(int j = 0; j<i; j++){
//         System.out.print(" ");
//     }
//     for(int k = row; k>i; k--){
//         System.out.print(" *");
//     }
//     System.out.println();
// }








// 14.
//     1
//    121
//   12321
//  1234321
// 123454321

// int row = 5;
// for(int i = 1; i<=row; i++){
//     for(int j = row; j>=i; j--){
//         System.out.print(" ");
//     }
//     for(int k = 1; k<= i; k++ ){
//         System.out.print(k);
//     }
//     for(int l = i; l>1; l--){
//         System.out.print(l-1);
//     }
//     System.out.println();
// }




















// 15.
//        *
//       * * 
//      * * *
//     * * * *
//      * * * 
//     * * * *
//    * * * * *
//   * * * * * *
//    * * * * * 
//   * * * * * *
//  * * * * * * *
// * * * * * * * *
//     * * * *
//     * * * *
//     * * * *
//     * * * *


// int row = 16;
// int col = 8;

// for(int i = 1; i<=row; i++ ){
//     int space;

//     if(i<=4){
//         space = 8-i;
//     }else if(i <= 8){
//         space = 10 -i;

//     }else if(i<=12){
//         space = 12-i;
//     }else{
//         space = 4;
//     }

//     for(int j = space; j>=0; j--){
//         System.out.print(' ');
//     }
//     for(int k = 0; k< col -space; k++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }



// 16.
// **********
// *        *
// * *    * *
// *  *  *  *
// *   *    *
// *  *  *  *
// * *    * *
// *        *
// **********

// int row = 9;

// for(int i = 1; i<= row; i++ ){
//     if(i==1 || i == 9){
//         for(int k = 1; k<=10; k++){
//             System.out.print("*");
//         }

//     }else if(i==2 || i == 8){
//         System.out.print("*");
//         for(int j = 1; j<=8; j++){
//             System.out.print(" ");
//         }
//         System.out.print("*");
//     }else if(i== 3 || i == 7){
//         System.out.print("*");
//         System.out.print(" ");
//         System.out.print("*");
//         for(int l = 1; l<= 4; l++){
//             System.out.print(" ");
//         }
//         System.out.print("*");
//         System.out.print(" ");
//         System.out.print("*");


//     }else if(i == 4 || i == 6){
//         int o = 4;
//         while(o>0){
//             System.out.print("*");
//             System.out.print(" ");
//             System.out.print(" ");
//             o--;
//         }
//     }else{
//         int p = 3;
//         while(p>0){
//             System.out.print("*");
//             System.out.print(" ");
//             System.out.print(" ");
//             System.out.print(" ");
            
//             p--;
//         }
//     }

//     System.out.println();

// }







// 17.

// *********************
// *********************
// ***     ******     **
// ***     ******     **
// *********************
// *********************
// *****          ******
// *****          ******
// *********************
// *********************


// int row = 10;

// for(int i= 1; i<=10; i++){
//     if(i ==1 || i == 2|| i == 9 || i ==10 || i==5 || i== 6){
//         for(int j = 1; j<=21; j++){
//             System.out.print("*");
//         }
//     }else if(i == 3 || i == 4){
//         for(int k = 1; k <=3; k++){
//             System.out.print("*");
//         }
//         for(int l = 1; l<=5; l++){
//             System.out.print(" ");
//         }
//         for(int l = 1; l<=6; l++){
//             System.out.print("*");
//         }  

//         for(int l = 1; l<=5; l++){
//             System.out.print(" ");
//         }        
        
//         for(int l = 1; l<=2; l++){
//             System.out.print("*");
//         }        

//     }else {
//         for(int j = 1; j<= 5; j++){
//             System.out.print("*");
//         }
//         for(int j= 1; j<=10; j++){
//             System.out.print(" ");
//         }
//         for(int j = 1; j<=6; j++){
//             System.out.print("*");
//         }
//     }

//     System.out.println();
// }

        

















        scanner.close();

    }
}
