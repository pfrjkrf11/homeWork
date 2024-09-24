import java.util.Scanner;

public class task_1_35 {
    public static void main (String[] args){

        //ЗАДАНИЕ: Даны катеты прямоугольного треугольника. Найти его гипотенузу.//

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого катета:");
        double a = scanner.nextDouble();

        System.out.print("Введите длину второго катета:");
        double b = scanner.nextDouble();

        double gip =Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.printf("Гипотенуза равна:%.2f \n",gip);

    }
}
