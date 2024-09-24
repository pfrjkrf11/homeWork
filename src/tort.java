import java.util.Scanner;

public class tort {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество гостей:");
        int N = scanner.nextInt();

        int razrez = 0;

        if (N%2==0){
            razrez = N/2;
            System.out.print(razrez);
        }else {
            razrez = N;
            System.out.print(razrez);
        }
    }
}
