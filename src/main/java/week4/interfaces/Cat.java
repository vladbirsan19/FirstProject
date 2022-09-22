package week4.interfaces;

public class Cat implements Animal {


    // classes implement interfaces
// classes extend other classes
// interface extend other interfaces


        @Override
        // only public modifier is permitted
        // when overriding from an INTERFACE
        public void eat(){
            System.out.println("Eating from Cat");
        }

        @Override
        public void sleep(){
            System.out.println("Sleeping cat");
        }

        @Override
        public void live(int age){
            System.out.println("Cat - La vida loca!" + age);
        }

    }
