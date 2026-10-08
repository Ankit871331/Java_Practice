import java.lang.reflect.Array;
import java.util.*;

public class ArrayStringQuestions {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);


// 1. Write a java program to sort a numeric array and a string array.

// int[] numaric = new int[] {2,4,1,4,7,3};
// char[] str = new char[] {'r','w','c','b','a'};

// int[] revNumaric = new int[numaric.length];
// char[] revString = new char[str.length];

// for(int i = 0; i<numaric.length; i++){
//     revNumaric[numaric.length-1-i] = numaric[i];
    
// }

// for(int n: revNumaric){
//     System.out.println(" "+ n);
// }

// System.out.println("----------------------------------------");

// for(int i = 0; i< str.length; i++ ){
//     revString[str.length-1-i] = str[i];
// }


// for(char c: revString){
//     System.out.print(" "+c );
// }


// 2. Write a java program to sum values of an array.


// int[] arr = new int[] {3,2,4,5};
// int sum = 0;
// for(int n: arr){
//     sum+=n;
// }
// System.out.println(sum);




// 4. Write a java program to calculate the average value of array elements.


// int[] arr = new int[] {2,2,2,2,2};

// int avg = 0;
// int len = arr.length;
// int sum = 0;

// for(int n: arr){
//     sum+=n;
// }

// System.out.println("Average "+ sum/arr.length);





// 5. Write a java program to test if an array contains a specific value.


// int[] arr = new int[] {3,2,4,5};

// int target = 2;

// for(int i = 0; i<arr.length; i++){
//     if(arr[i] == target){
//         System.out.println("target is gound at index  "+ i);
//     }
// }








// 6. Write a java program to find the index of an array element.

// same as 5


// 7. Write a java program to remove a specific element from an array.

// int[] arr = new int[] {3,2,4,5};
// int target = 5;
// int[] newArr = new int[arr.length-1];

// for(int i = 0; i< arr.length; i++){
//     if(arr[i] == target){
//         continue;
//     }else{
//         newArr[i] = arr[i];
//     }
// }

// for(int n: newArr){
// System.out.println(" "+n);
// }






// 8. Write a java program to copy an array by iterating the array.

//easy


// 9. Write a java program to insert an element (specific position) into an array.

// int[] arr1 =new int[] {1,3,4,5,6,7};
// int[] arr2 =new int[arr1.length+1];
// int targetValue = 2;
// int targetIndex = 1; 

// for(int i = 0; i<targetIndex; i++){
//     arr2[i] = arr1[i];
// }

// arr2[targetIndex] = targetValue;

// for(int i = targetIndex+1; i< arr2.length; i++){
//     arr2[i] = arr1[i-1];
// }

// for(int n: arr2){
//     System.out.print(" "+n);
// }













// 10. Write a java program to find the maximum and minimum value of an array.

//easey

// 11. Write a java program to reverse an array of integer values.

//easey

// 12. Write a java program to find the duplicate values of an array of integer values.

//easey

// 13. Write a java program to find the duplicate values of an array of string values.

// char[] ch = new char[] {'a', 'b', 'c','a'};

// for(int i  = 0 ; i< ch.length; i++){
//     for(int j = 1; j<ch.length; j++ ){
//         if(i!= j && ch[i] == ch[j]){
//             System.out.print("duplicat found "+ ch[i]);
//         }
//     }
// }






// 14. Write a java program to find the common elements between two arrays (string values).

// char[] ch = new char[] {'a','b','c','d','e','f'};
// char[] ch1 = new char[] {'a','b','c'};


// for(int i= 0; i<ch.length; i++){
//     for(int j = 0; j<ch1.length; j++){
//         if(ch[i] == ch1[j]){
//             System.out.println(" "+ ch[i]);
//         }
//     }
// }










// 15. Write a java program to find the common elements between two arrays of integers.

//ease

// 16. Write a java program to remove duplicate elements from an array.
//easy


// 17. Write a java program to find the second largest element in an array.
//solved in array question


// 18. Write a java program to find the second smallest element in an array.
//reverse of 17

// 19. Write a java program to add two matrices of the same size.

// int[][] matrix1 = {{1,2,3,4}, {5,6,7,8}};
// int[][] matrix2 = {{9,10,11,12},{13,14,15,16}};
// int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

// for(int i = 0; i<matrix1.length; i++){
//     for(int j = 0; j<matrix1[0].length; j++){
//         sumMatrix[i][j] = matrix1[i][j]+ matrix2[i][j];
//     }
// }

// for(int[] n : sumMatrix){
//     for(int k: n){
//         System.out.print(k + " " );
//     }
//     System.out.println();
// }



//20. Write a java program to convert an array to ArrayList.


// int[] arr = {1,2,3,4,5};

// List<Integer>arraylist = new ArrayList<>();

// for(int n : arr){
//     arraylist.add(n);
// }
// System.out.println("List created");


// for(int n: arraylist){
//     System.out.println(n);
// }






// 21. Write a java program to convert an ArrayList to an array.

// List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

// int[] arr = new int[list.size()];
// int i = 0;
// for(int n: list){
//     arr[i] = n;
//     i++;
// }

// System.out.println("Array created");
// for(int n: arr){
//     System.out.println(n);
// }




// 22. Write a java program to find all pairs of elements in an array whose sum is equal to a specified number.

int[] arr = {0,1,2,3,4,5,6,7};
int target = 3;

List<Integer>list =new ArrayList<>();


for(int i = 1; i<arr.length; i++){

    if(arr[i-1]+arr[i] == target){
        list.add(i-1, i);
    }
}

System.out.println("List created");























    }
}
