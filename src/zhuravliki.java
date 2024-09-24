import java.util.Scanner;

public class zhuravliki {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество журавликов:");
        int S = scanner.nextInt();

        int x = S/6;

        System.out.print(x + " " + 4*x + " " + x);

        //немного странная задача будто. (S=x+x+4x); (x=S/6); Но при этом мы не любое значение S записать можем (условно если записать нечетное то данные задачи странные, не могут же сделать к примеру 3.3 журавлика :((( //
    }
}
