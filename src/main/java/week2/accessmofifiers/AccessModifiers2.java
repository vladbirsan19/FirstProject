package week2.accessmofifiers;

import week2.accessmofifiers.AccessModifiers1;

public class AccessModifiers2 {
    public static void main(String[] args) {

        //works because .m1() is a public method
        AccessModifiers1.m1();

        //doesn't work because .m2() has private access
        // AccessModifiers.m2();

        // works because .m3() is default and is in the same package
        AccessModifiers1.m3();

        //acts as default visibility because it's in the sam package
        AccessModifiers1.m4();

    }
}


