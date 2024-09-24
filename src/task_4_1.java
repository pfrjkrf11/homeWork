import java.util.Scanner;

public class task_4_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение x:");
        double x = scanner.nextDouble();
        double y = 0;

        if(x>0){
            y=Math.pow(Math.sin(x),2);
        }else {
            y=1-2*Math.sin(Math.pow(x,2));
        }

        System.out.printf("Значение y=%.3f при x=%.3f \n",y,x);




    }
}
