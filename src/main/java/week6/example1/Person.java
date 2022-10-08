package week6.example1;

public class Person <T>{
    int z;
    Object z1;

    //-------------------------------------------------

    T x;

    public Person() {

    }

    public Person (T x) { this.x =x ;}

    public void printX(T x){
        System.out.println(x);
    }
    public T printX () { return x;}

    public T getX(){ return x;}

    public void setX(T x) { this.x=x;}
}
