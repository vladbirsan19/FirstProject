package week3.polimorphism;

public class Dog extends Animal  {

    //DOG is child class of ANIMAL


        // override annotation enforces that you respect the parent
        // method signature .eat()
        @Override
        // when you override you must maintain the same method signature
        // as it is defined in the parent class
        public String eat() {
            String eatMessage = super.eat();
            String message = eatMessage.replace("Animal", "Dog");
            return  message ;
        }

        //overload
        // having the same method with different signature
        public void eat(String food){
            System.out.println("Eating " + food);
        }

        @Override
        public void move(){
            System.out.println("Dog moving");
        }

        public void sleep(){
            System.out.println("Dog sleeping");
        }

    }
