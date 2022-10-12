package practice;

public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfInts = {32,87,3,589,12,107,2000,8,622,127};
        int searchfor=12;
        int i;
        boolean foundIt = false;

        for(i=0; i <arrayOfInts.length; i++){
            if (arrayOfInts[i]==searchfor){
                foundIt=true;
                break;
            }
        }
        if(foundIt){
            System.out.println("Found "+ searchfor +" at index " +1);

        }else{
            System.out.println(searchfor+"not in the array");
        }
    }
}
