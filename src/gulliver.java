import java.util.Scanner;

public class gulliver {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение K и M:");
        int K = scanner.nextInt();
        int M = scanner.nextInt();

        int otvet = (int) Math.pow(K,2)*M;
        System.out.println(otvet);



    }

}
