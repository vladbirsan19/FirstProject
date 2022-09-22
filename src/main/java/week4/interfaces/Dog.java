package week4.interfaces;

public class Dog implements  Animal {
    @Override
    public void eat(){
        System.out.println("Eating from Dog");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping dog");
    }

    @Override
    public void live(int age){
        System.out.println("Dog - La vida loca!" + age);
    }
}
