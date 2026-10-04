public class ImportantTopics {
    public static void main(String[] args) {
        

//---------------------------------------------------Introduction java------------------------------------------------------
//USP of java --> Java is simple, Java is strongly based on OOPS, Java is platform indepedent, Java is secure because it do not allow direct pointer manipulation and provide several security and varify bytecode, Java has garbage collection , Mutlithreading , it is fast because jvm and jit, provide many package mainly used for backend system, portable, dynamic, 

//JVM --> java virtual machine , JVM is a engin that runs bytecode , Hello.java ---> Javac ---> Hello.class here .class cotains the bytecode here JVM takes the bycode and execute it like -- Java bytecode ----> JVM -----> machine code.
//JRE --> Java Runtime Environment , provide the environment to run java application , JRE = JVM + Java runtime libraries, 
//JDK --> Java Development Kit , it is used to develop java application , JDK = JRE + Development Tool, 


//------------------------------------------------ Java Language Fundamentals ---------------------------------------------------------
// Identifiers ---> It is a name we give to something, like class Student here student is identifiers.
// Keyword ---> Is a reserved word in java that has spacial meaning to the compilor like let , String , Boolean, char, Integer, class ,public etc.
//Literals ---> A fixed value written in the java program like int age = 33; so here 33 is literals
// Data type --> It tells the java which kind of value a variable can store like in age - 33; so here age can store only Integer value only, types of data type --> premitive or referance data type, java had 8 premitive data type = byte, short, int , long, float, double , char , boolean , referance data type
// Loop statement/ conditional statement




//---------------------------------------------------------  OOP Implementation ---------------------------------------------------

//class --> class is a set of object which share common strecture and behaviour just like template.
//object --> object is a real instance of class 
//Reference Variable --> It is a variable that stores the referance of the object or allow us to ue the mehods or fields of object.likeL Student s1 = new Student(); here Student is type/class and s1 is reverence variable and new Student() is a object.
//Insance variable (Non-Static) --> variable that declared inside a class without using static keyword.like in class String name; int roll_no; so here each each object get its own seperate copy 
//Insance variable (Static) -->variable that declared inside a class using static keyword. Like Static String name; static belongs to class and non static belongs to object , like Static String College = "AB" so every obj have the same college name 
//This keyword --> this refers variable that refer to the current object of the class. uses fo this keywords is refer to the current object's instance variable , call the current object's method , class another constructor of the same class, 
//Premitive Data Type --> Primitive  data type are data type that store simple values, they do not store the object referance, they have no method , they have no object , they can not be null. there are 8 built in primitive data type that stores simple values data type are byte, sort, int, long, float, dupble, char, boolean.
//Non-Primitive Data Type --> they are created form classes and store a reference to an object not the actual value directly.It also called Object type, reference Type, Derived Type,

//Has-A-Relationship --> One class contains the object of the other class as field(Instance variable).Example Car is a class na Engin is a class now Car class has a field called Engin so it is Has a relationship.
//Uses-A-Relationship --> It means one class temporarily use another class, usually through method , parameters, local variable, or return type
// Example:
// class Pen {
//     void write() {
//         System.out.println("Writing...");
//     }
// }
// class Person {
//     void writeWith(Pen pen) {   // Person USES-A Pen
//         pen.write();
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Pen pen = new Pen();
//         Person person = new Person();
//         person.writeWith(pen);   // Person uses Pen
//     }
// }



//Is-A-Relationship --> It means one class is a type of another classes, it implements using inheritance (extends), or interface(implemets).




//so are they different ?? It is also called composition, aggregation, or association depending on how strong the relationship is





    }
}
