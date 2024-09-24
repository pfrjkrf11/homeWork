import java.util.Scanner;

public class banditi {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество банок простреленных Гарри и Ларри:");
        int Gari = scanner.nextInt();
        int Lari = scanner.nextInt();

        int neGari = Lari - 1;
        int neLari = Gari - 1;
        System.out.print(neGari + " " + neLari);
    }
}
