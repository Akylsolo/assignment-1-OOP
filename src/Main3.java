import  java.io.*;

public static void main(String[] args) {

    double sum = 0;
    for(int i = 0; i < 1; i++) {
        Scanner as = new Scanner(System.in);
        int a = as.nextInt();


        if(a>25){
            Scanner ar = new Scanner(System.in);
            int y = ar.nextInt();

            if(y>25){

                int n = ar.nextInt();
                if(n>25&&(a+y)/2>50){
                    sum=(((a+y)/2)*0.6)+n*0.4;
                    System.out.println(sum);

                }
                else{
                    System.out.println("letkabro");
                    return;
                }
            }
            else{
                System.out.println("letkabro");
                return;
            }
        }
        else{
            System.out.println("letkabro");
            return;
        }




    }
}
