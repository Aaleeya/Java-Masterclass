package ControlFlow;

public class WhileLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        //while loop
        int j = 1;
        while(true){
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }

        //do-while loop
        int m = 1;
        boolean isReady = false;
        do{
            if(m > 3){
                break;
            }
            System.out.println(m);
            m++;
            isReady = (m > 0);
        }while(isReady);
    }
}
