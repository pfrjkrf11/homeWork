import java.util.Scanner;

public class orexi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N,M и K:");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int orexi = N*M;

        if(orexi>=K){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
