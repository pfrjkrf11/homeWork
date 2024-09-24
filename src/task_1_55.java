import java.util.Scanner;

public class task_1_55 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        //ЗАДАНИЕ: Два автомобиля едут навстречу друг другу с постоянными скоростями V1 и V2 км/ч. Определить, через какое время автомобили встретятся, если расстояние между ними было S км. //

        System.out.print("Введите скорость первого автомобиля[км/ч]:");
        double v1 = scanner.nextDouble();

        System.out.print("Введите скорость второго автомобиля[км/ч]:");
        double v2 = scanner.nextDouble();

        System.out.print("Введите расстояние между ними[км]:");
        double s = scanner.nextDouble();

        double vSovmest = v1+v2;
        double time = s/vSovmest;

        System.out.printf("Автомобили встретятся через %.2f часа \n", time);


    }
}
