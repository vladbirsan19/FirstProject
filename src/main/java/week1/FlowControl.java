package week1;

public class FlowControl {

    public static void main(String[] args){

        //only one of branches is executed
        if (Integer.parseInt(args[0]) == 1){
            System.out.println("number from if is:");
        }
        else{
            System.out.println("Unknown number from if");
        }

        switch (Integer.parseInt(args[0])){
            case 1:
                System.out.println("Number from switch is:" + args[0]);
                //if it's not mentioned, execution will pass to bellow option(s)
                break;
            default:
                System.out.println("Unknown number from switch");

        }
    }
}
