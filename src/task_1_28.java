import java.util.Scanner;

public class task_1_28 {
    public static void main (String[] args){

        //ЗАДАНИЕ: Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.//

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра куба:");
        double dlinaRebra = scanner.nextDouble();

        double V = Math.pow(dlinaRebra,3);
        double S = 4*Math.pow(dlinaRebra,2);

        System.out.printf("Объем куба: %.3f[м^3];Площадь боковой поверхности: %.3f[м^2] \n", V, S);

    }
}
