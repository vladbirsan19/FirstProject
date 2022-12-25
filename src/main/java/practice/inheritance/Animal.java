package practice.inheritance;

public class Animal implements LivingBeing {


    void walk(){
        System.out.println("I'm walking");
    }

    @Override
    public void live() {
        System.out.println("Animal is alive" );
    }
}
