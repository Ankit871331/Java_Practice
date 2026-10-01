import java.lang.reflect.Array;
import java.util.*;

public class ArrayQuestoin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1
        // int[] num = new int[10];
        // System.out.print("Enter 10 number with spaces");
        // num[0] = scanner.nextInt();
        // num[1] = scanner.nextInt();
        // num[2] = scanner.nextInt();
        // num[3] = scanner.nextInt();
        // num[4] = scanner.nextInt();
        // num[5] = scanner.nextInt();
        // num[6] = scanner.nextInt();
        // num[7] = scanner.nextInt();
        // num[8] = scanner.nextInt();
        // num[9] = scanner.nextInt();

        // Arrays.sort(num);
        // System.out.println(num);
        // System.out.println("Gratedst value "+ num[9]);

        // 2.take 10 no. from user and find minimum number.

        // int[] num = new int[10];
        // System.out.print("Enter 10 number with spaces");
        // num[0] = scanner.nextInt();
        // num[1] = scanner.nextInt();
        // num[2] = scanner.nextInt();
        // num[3] = scanner.nextInt();
        // num[4] = scanner.nextInt();
        // num[5] = scanner.nextInt();
        // num[6] = scanner.nextInt();
        // num[7] = scanner.nextInt();
        // num[8] = scanner.nextInt();
        // num[9] = scanner.nextInt();

        // Arrays.sort(num);
        // System.out.println("Minium value "+ num[0]);

        // 3.take 10 no. from user and take a number to search from array and find the
        // index of that number.(linear search)

        // int[] num = new int[10];
        // System.out.print("Enter 10 number with spaces: ");
        // num[0] = scanner.nextInt();
        // num[1] = scanner.nextInt();
        // num[2] = scanner.nextInt();
        // num[3] = scanner.nextInt();
        // num[4] = scanner.nextInt();
        // num[5] = scanner.nextInt();
        // num[6] = scanner.nextInt();
        // num[7] = scanner.nextInt();
        // num[8] = scanner.nextInt();
        // num[9] = scanner.nextInt();

        // System.out.println("-----------------You have entered ----------------- ");

        // for(int n: num){
        // System.out.println(" "+n);
        // }

        // System.out.println("Which no.'s index do you want to find ");
        // int findIndex = scanner.nextInt();

        // for(int i= 0; i<num.length; i++){
        // if(findIndex == num[i]){
        // System.out.println("The index of " + findIndex + "is " + i);
        // }
        // }

        // 4.copy one array's elements to another array.

        // int[] arr1 = new int[] {1,2,3,4,5,6,7,8,9};
        // int[] arr2 = new int[arr1.length];

        // for(int i=0; i<arr1.length; i++){
        // arr2[i] = arr1[i];

        // }

        // System.out.println("now printing arr2 ");
        // for(int n: arr2){
        // System.out.print(" "+n);
        // }

        // 5.copy one array's elements to another array in reverse order.

//         int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         int[] arrRev1 = new int[arr1.length];

//         for(int i= 0; i<arr1.length; i++){
//             arrRev1[arr1.length-1-i] = arr1[i];
//         }

// System.out.println("Reversed array");
//         for(int n: arrRev1){
//             System.out.print(" "+ n);
//         }


// 6.Write a java program to find the common elements between two arrays of integers.  

// ask to sir i only need 2 space in the common array how to do that

// int[] arr1 = new int[] {1,2,3,4,5};
// int[] arr2 = new int[] {4,5,6,7};
// int count = 0;
// int[] common = new int[10];

// for(int i= 0; i<arr1.length; i++){
//     for(int j = 0; j<arr2.length; j++){
//         if(arr1[i] == arr2[j]){
//             common[count] = arr1[i];
//             count++;
//         }
//     }
// }

// for(int n: common){
//     System.out.println(n);
// }

// System.out.println(count);


// 7.Write a java program to find the second largest element in an array.  

// int[] arr = new int[]{1,2,3,4,5,6};

// int fistLarge = Integer.MIN_VALUE;
// int secoLarge = Integer.MIN_VALUE;

// for(int n: arr){

//     if(fistLarge<n){
//          secoLarge = fistLarge;
//         fistLarge = n;
       
//     }else if(secoLarge<n && fistLarge != n){
//         secoLarge = n;
//     }

// }

// System.out.println(secoLarge);





// 8.Write a java program to test the equality of two arrays.  



// int[] arr1 = new int[] {1,2,3,4,5};
// int[] arr2 = new int[] {5,4,3,2,1};

// Arrays.sort(arr2);
// Arrays.sort(arr1);

// if(Arrays.equals(arr2,arr1))
//     System.out.println("Arrary is iqual");

// else
//     System.out.println("Array is not euqual");

// for(int n: arr2){
//     System.out.println(n);
// }


// 9. Write a java program to find the number of even and odd integers in a given array of integers.  



// int[] arr = {1, 2, 3, 4, 5};

// int[] even = new int[arr.length];
// int[] odd  = new int[arr.length];
// int e = 0, o = 0;

// for (int i = 0; i < arr.length; i++) {
//     if (arr[i] % 2 == 0) {
//         even[e++] = arr[i];   // use current index, then increment
//     } else {
//         odd[o++]  = arr[i];
//     }
// }




// System.out.println("Even count: " + e + " -> " + Arrays.toString(Arrays.copyOf(even, e)));
// System.out.println("Odd  count: " + o + " -> " + Arrays.toString(Arrays.copyOf(odd,  o)));



// 10.Write a java program to get the difference between the largest and smallest values in an array of integers.



// int[] arr = {1, 2, 3, 4, 5};


// fi array is not short so sor the array

// System.out.println(arr[arr.length-1]- arr[0]);











        scanner.close();
    }

}
