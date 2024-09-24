import java.util.Scanner;

public class task_4_10 {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус круга[м]:");
        double rad = scanner.nextDouble();

        System.out.print("Введите сторону квадрата[м]:");
        double a = scanner.nextDouble();

        double raz = 0;
        double sKryg = Math.PI*Math.pow(rad,2);
        double sKvad = Math.pow(a,2);

        if (sKryg>sKvad){
            raz = sKryg/sKvad;
            System.out.printf("Площадь круга больше площади квадрата в %.3f раз(а) \n",raz);
        }else {
            raz = sKvad/sKryg;
            System.out.printf("Площадь квадрата больше площали круга в %.3f раз(а) \n",raz);

        }


    }
}
