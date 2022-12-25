package week14.annotations.example1;


import java.lang.annotation.Documented;

@Documented
public @interface ClassInfo {
    // annotation methods cannot have parameters

    String author();
    String date();
    String lastModified() default "N/A";
    String[] reviews(); // array!

}
