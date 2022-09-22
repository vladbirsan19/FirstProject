package week1;
//a clas should start only with capital letter -> Animal. DataTypes, MyClass
// a class name always matches the file name

public class DataTypes {
    //PRIMITIVES
    // bigger integer
    // default value -> 0L
    long l = 1L;

    //integer
    //default value->0
    int i = 1;

    //small integer
    //default value-> 0
    short s = 5;

    //default value-> 0
    byte b = 5;

    //decimal numbers
    //default value ->0.0
    double d = 10.0;

    //smaller decimal numbers
    //default value -> 0.0f
    float f = 10.0f;

    //char
    //default value ->u0000
    char c = 'c';

    //true || false
    //default value = false;
    boolean bool = true;

    //index start from 0
    //numbers[0] = 10, number[1] = 20
    int[] numbers = {10, 20, 30, 40, 50};

    //PRIMITIVES

    //REFERENCE TYPES
    // char sequence
    // default value -> NULL
    String str = "My String";
    //REFERENCE TYPES

    // this is a special method
    // this is the starting point of any application
    // this signature cannot change
    public static void main(String[]args){
        //body of a method
    }
    // methods follow the camelCase naming convention -> method1(), myMethod(), computeSomething()
    public static void method1(){

    }
}
