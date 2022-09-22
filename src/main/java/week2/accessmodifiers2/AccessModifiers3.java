package week2.accessmodifiers2;

import week2.accessmofifiers.AccessModifiers1;

public class AccessModifiers3 {

        public static void main(String[] args) {

            AccessModifiers1.m1();

            //AccessModifiers.m2();

            //AccessModifiers.m3():

            //even if it's in another package it works because protected means
            // it is visible in package + all children classes (to be explained later)
           // AccessModifiers1.m4();


        }

    }


