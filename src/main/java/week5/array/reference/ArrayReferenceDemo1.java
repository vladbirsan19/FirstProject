package week5.array.reference;
import week5.array.Animal;



    public class ArrayReferenceDemo1 {

        public static void main(String[] args) {

            //v1
            Animal[] animal1 = new Animal[2];
            animal1[0] = new Animal();
            animal1[1] = new Animal();

            //v2
            Animal[] animal2 = {new Animal(), new Animal()};
        }
    }


