import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // for-each , while, do while, for
        Scanner scanner = new Scanner(System.in);

        // 1.

        // for(int i= 1; i<=100; i++ ){
        // System.out.println(i);
        // }

        // 3.

        // System.out.print("Enter the value: ");
        // int val = scanner.nextInt();
        // int total = 0;
        // for(int i = 1; i<=val; i++){
        // total = total+i;
        // }
        // System.out.println("value is : "+ total);

        // 2.

        // int total = 0;
        // for(int i = 1; i<=10 ; i++){
        // total = total+i;
        // }

        // System.out.println("Total value is: " + total);

        // 4.

        // System.out.print("Enter the 10 no. with gap: ");
        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        // int num3 = scanner.nextInt();
        // int num4 = scanner.nextInt();
        // int num5 = scanner.nextInt();
        // int num6 = scanner.nextInt();
        // int num7 = scanner.nextInt();
        // int num8 = scanner.nextInt();
        // int num9 = scanner.nextInt();
        // int num10 = scanner.nextInt();

        // int sum = num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
        // double avg = sum/10;

        // System.out.println("The of 10 no. is "+ sum);
        // System.out.println("The average of 10 no. is: " + avg);

        // 5.

        // System.out.print("Enter the value: ");
        // int num = scanner.nextInt();

        // for(int i = 0; i<=num; i++){
        // System.out.println("Number is: " + i + "and cube of "+ i + " is " + i*i*i);
        // }

        // 6.

        // System.out.print("Which table do you want ot print: ");
        // int val = scanner.nextInt();

        // for(int i = 1; i<=10; i++){
        // System.out.println(val + " x " + i + " = " + (val*i));
        // }

        // 7.

        // for(int i = 1; i<=8; i++){
        // for(int j = 1; j <=10; j++){
        // System.out.println(i + " x " + j + " = " + (i*j));
        // }
        // }

        // 8

        // System.out.print("Enter the number: ");
        // int num = scanner.nextInt();
        // int sum = 0;

        // for(int i =1; i<=num; i++){
        // int oddNum = 2*i-1;
        // System.out.println("Odd no. is: "+ oddNum);
        // sum+=oddNum;
        // }

        // System.out.print("Sum of total odd no. is: " + sum);

        // 9

        // System.out.print("Enter a number for find factroil: ");
        // int num = scanner.nextInt();
        // int factorial = 1;
        // while(num>0){
        // factorial = num *factorial;
        // num--;
        // }

        // System.out.print("factorial: "+factorial);

        // 10

        // int first = 0;
        // int second = 1;

        // for (int i = 0; i <= 10; i++) {
        //     System.out.println(first);

        //     int next = first + second;
        //     first = second;
        //     second = next;

        // }






// 11
// int num = 153;
// int original = num;
// int sum = 0;
// while(num>0){
// int digit = num%10;
// num = num/10;
// sum = sum + digit*digit*digit;


// }

// if(original == (sum)){
//     System.out.println("anagram "+ sum);
    
// }else{
//     System.out.println("not anagram "+ sum);
// }





// 12

// int digit = 1234;
// int count = 0;
// while(digit > 0){

//     digit = digit/10;
//     count++;
    


// }

// System.out.println(count);




// 13

// int digits = 1234567893;
// int oddGigit = 0;
// while(digits >  0){

// int digit = digits%10; 
// digits = digits/10;
// if(digit%2 != 0){
//     oddGigit++;
// }

// }

// System.out.println(oddGigit);



// 14 same as 13

//15 and 16 similar kind logic like 13

//17

// int a = 10;
// int d = 3;
// int n =6;



// for(int i = 0;  i<n; i++){
//     System.out.print(" "+ (a+d*i));
//}



// 18 (tomorrow)

//19.

// int num = 123456789;
// int sumEven = 0;
// int sumOdd = 0;
// int count = 0;

// while(num > 0){
//     int n = num%10;
//     if(n%2 == 0){
//         sumEven += n;
//     }else{
//         sumOdd+= n;
//     }

//     num = num/10;
//     count++;
// }

// System.out.println("Count:  "+ count + " Odd number sum : " + sumOdd + " even number sum :  "+ sumEven);


// System.out.println("----------------Fibonachi series------------------ ");

// int first = sumOdd;
// int second = sumEven;
// for(int i = 0; i<count; i++){
//     System.out.println(first);

//     int sum = first+second;
//     first = second;
//     second = sum;

// }



// 20

// int  num = 123456;
// int rev = 0;

// while(num>0){
//     int lastDigit = num%10;
//     num = num/10;
//     rev = rev  * 10 + lastDigit;
// }

// System.out.println(" " + rev);



//21

// int num = 221;
// int original= num;
// int pelpalindrome = 0;

// while (num>0) {
//     int lastDigit = num%10;
//     num = num/10;
//     pelpalindrome = pelpalindrome*10+lastDigit;
// }

// if(original == pelpalindrome)
//     System.out.print("palindrome");

//     else
//         System.out.println("Not palindrome");



//22.



// for(int num =1; num<= 1000; num++){
//     int sum = 0;

//     for(int i = 1; i< num; i++){
//     if(num%i == 0){
//         sum += i;
//     }

// }

// if(sum == num){
//         System.out.println("Match " + num);
//     }


// }





//23 tomorrow


// 24. Write a java program to find the least common multiple of two numbers.

































    }

}


