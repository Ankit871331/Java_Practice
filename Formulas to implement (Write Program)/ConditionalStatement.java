import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter months: ");
        // int months = scanner.nextInt();

        // if(months >=1 && months <=12){
        // System.out.println("Valid month , You entered " + months);
        // } else {
        // System.out.println("Invalid month");
        // }

        // 1.

        // System.out.print("Enter number1: ");
        // float num1 = scanner.nextFloat();

        // System.out.print("Enter number2: ");
        // float num2 = scanner.nextFloat();

        // if(num1 == num2){
        // System.out.print("num1 and num2 are equal");
        // }else{
        // System.out.print("Not equal");
        // }

        // 2.
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();

        // if(num%2 == 0){
        // System.out.println("The number is even");
        // }else{
        // System.out.println("The number is odd");
        // }

        // 3.
        // System.out.print("Enter a number: ");
        // int num = scanner.nextInt();

        // if(num > 0){

        // System.out.println("The number is positive");
        // }else if(num < 0){

        // System.out.println("The number is negative");
        // }else{
        // System.out.println("The number is zero");

        // }

        // 4.

        // System.out.print("Enter a year: ");
        // int year = scanner.nextInt();

        // if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){

        // System.out.println("The year is a leap year");

        // }else {

        // System.out.println("The year is not a leap year");
        // }

        // 7.

        // System.out.print("Enter your height in cm: ");
        // int height = scanner.nextInt();

        // if(height < 150){
        // System.out.println("You are Dwarf");
        // }else if(height >= 150 && height < 180){
        // System.out.println("You are average height");
        // }else{
        // System.out.println("You are tall");
        // }

        // 8.
        // System.out.print("Enter first number: ");
        // int num1 = scanner.nextInt();
        // System.out.print("Enter second number: ");
        // int num2 = scanner.nextInt();
        // System.out.print("Enter third number: ");
        // int num3 = scanner.nextInt();

        // if(num1 > num2 && num1> num3){

        // System.out.println("The largest number is: " + num1);
        // }else if(num2 > num1 && num2 > num3){

        // System.out.println("The largest number is: " + num2);
        // }else{

        // System.out.println("The largest number is: " + num3);
        // }

        // 9.
        // System.out.print("Enter x cordinate: ");
        // int x = scanner.nextInt();

        // System.out.print("Enter y cordinate: ");
        // int y = scanner.nextInt();

        // if(x > 0 && y > 0){
        // System.out.println("The point is in first quadrant");
        // }else if(x < 0 && y > 0){
        // System.out.println("The point is in second quadrant");
        // }else if(x < 0 && y < 0){
        // System.out.println("The point is in third quadrant");
        // }else if(x > 0 && y < 0){
        // System.out.println("The point is in fourth quadrant");
        // }else if(x == 0 && y != 0){
        // System.out.println("The point is on y axis");
        // }else if(x != 0 && y == 0){
        // System.out.println("The point is on x axis");
        // }else {

        // System.out.println("The point is at origin");
        // }

        // 10.

        // System.out.print("Enter marks of Maths: ");
        // float Maths = scanner.nextFloat();

        // System.out.print("Enter marks of Physics: ");
        // float Physics = scanner.nextFloat();

        // System.out.print("Enter marks of Chemistry: ");
        // float Chemistry = scanner.nextFloat();

        // float totalMarks = Maths + Physics + Chemistry;

        // if(totalMarks >= 170 && Maths >= 65 && Physics >= 55 && Chemistry >= 50){
        // System.out.println("The student is eligible for admission");
        // }else{

        // System.out.println("The student is not eligible for admission");
        // }

        // 11.

        // System.out.print("Enteer value of a: ");
        // int a = scanner.nextInt();
        // System.out.print("Enteer value of b: ");
        // int b = scanner.nextInt();
        // System.out.print("Enteer value of c: ");
        // int c = scanner.nextInt();

        // int D = b*b-4*a*c;
        // if(D == 0){
        // System.out.println("Roots are real and equal");
        // }else if(D > 0){
        // System.out.println("Roots are real and distinct");
        // }else if(D<0){
        // System.out.print("Roots are imaginary");
        // }

        // 12.

        // System.out.print("Enter Roll no. of student: ");
        // int rollNo = scanner.nextInt();

        // System.out.print("Enter the marks of Physics, Chemistry and Maths: ");
        // float Physics = scanner.nextFloat();
        // float Chemistry = scanner.nextFloat();
        // float Maths = scanner.nextFloat();

        // float totalMarks = Physics + Chemistry + Maths;
        // float percentage = (totalMarks / 300) * 100;
        // String division = "";
        // if (percentage >= 60) {
        // division = "First Division";
        // } else if (percentage >= 50 && percentage < 60) {
        // division = "Second Division";
        // } else if (percentage >= 40 && percentage < 50) {
        // division = "Third Division";
        // } else {
        // division = "Fail";
        // }

        // System.out.println("Roll no. of student: " + rollNo);
        // System.out.println("Total marks: " + totalMarks);
        // System.out.println("Percentage: " + percentage);
        // System.out.println("Division: " + division);

        // 19.

        // System.out.print("Enter User ID: ");
        // int userId = scanner.nextInt();
        // System.out.print("Enter Unit: ");
        // int unit = scanner.nextInt();
        // double amountCharge = 0;
        // double surchAmount = 0;
        // double totalAmount = 0;

        // if(unit <=199){
        // amountCharge = 3.20;
        // totalAmount = unit * amountCharge;

        // }else if(unit >= 200 && unit < 400){
        // amountCharge = 5.50;
        // totalAmount = unit * amountCharge;
        // if(totalAmount > 1000){
        // surchAmount = totalAmount * 0.15;
        // }

        // }else if(unit >= 400 && unit < 600){
        // amountCharge = 8.80;
        // totalAmount = unit * amountCharge;
        // if(totalAmount > 2000){
        // surchAmount = totalAmount * 0.15;
        // }

        // }else{
        // amountCharge = 9.00;
        // totalAmount = unit * amountCharge;
        // if(totalAmount > 1000){
        // surchAmount = totalAmount * 0.15;
        // }
        // }

        // System.out.println("Customer ID NO : " + userId);
        // System.out.println("unit Consumed : "+ unit);
        // System.out.println("Amount Charge @Rs." + amountCharge + " per unit : "+
        // totalAmount);
        // System.out.println("Surchage Amount : "+ surchAmount);
        // System.out.println("Net Amount Paid By the Customer : "+ (totalAmount +
        // surchAmount));

        // 20

        // System.out.print("Enter the char: ");
        // char ch = scanner.next().charAt(0);

        // switch(ch){
        // case 'E':
        // System.out.println("You choose Excellent");
        // break;

        // case 'V':
        // System.out.println("You choose Very Good");
        // break;
        // case 'G':
        // System.out.println("You choose Good");
        // break;
        // case 'A':
        // System.out.println("You choose Average");
        // break;
        // case 'F':
        // System.out.println("You choose Fail");
        // break;

        // }

        // 21. seme as 22 seme 23
        // switch ke hel se hoga

        // 25.

        // System.out.println(
        //         "*********** Menu ************\n1. Area of Circle\n2. Area of Square\n3. Area of Rectangle\n4. Area of Triangle\n5. Exit");
        // System.out.print("Enter your choice: ");
        // int choice = scanner.nextInt();

        // switch (choice) {
        //     case 1:
        //         System.out.print("Enter the radius of circle: ");
        //         int r = scanner.nextInt();
        //         double areaOfCircle = 2 * 3.14 * r * r;
        //         System.out.println("Area of Circle is: " + areaOfCircle);
        //         break;

        //     case 2:
        //         System.out.print("Enter the side of squre: ");
        //         int side = scanner.nextInt();
        //         double areaOfSquare = side * side;
        //         System.out.println("Area of Square is: " + areaOfSquare);
        //         break;

        //     case 3:
        //         System.out.print("Enter lenght and wedth of rectangle: ");
        //         int len = scanner.nextInt();
        //         int wid = scanner.nextInt();

        //         System.out.print("Area of rectangle is: " + len * wid);
        //         break;

        //     case 4:
        //         System.out.print("Enter the bereth and height: ");
        //         int breght = scanner.nextInt();
        //         int height = scanner.nextInt();

        //         System.out.println("Area of triangle is:  " + (breght * height) / 2);
        //         break;

        //     case 5:
        //         System.out.print("You are Exit now: ");
        //         break;
        // }


// 26. same as 25






















    }
}