package week13.lambda.example1;
@FunctionalInterface
//acts like @Override
//Makes sure that you will only have ONE SINGLE ABSTRACT METHOD

public interface Instrument {
    //ONLY ONE ABSTRACT METHOD IS ALLOWED TO BE A FUNCTIONAL INTERFACE
    void play();

}
