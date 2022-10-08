package week5.array.reference;


import week5.array.Hired;
import week5.array.Person;
import week5.array.Student;
import week5.array.Unemployed;

public class ArrayReferenceDemo2 {

        public static void main(String[] args) {

            Person[] personArray = {
                    new Unemployed("Alex"),
                    new Hired("Vlad"),
                    new Student("Andrei")};

            for (int i = 0; i < personArray.length; i++) {
                System.out.println(personArray[i]);
            }
        }
}
