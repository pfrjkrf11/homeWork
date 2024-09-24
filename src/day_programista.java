import java.util.Scanner;

public class day_programista {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер года нашей эры:");
        int N = scanner.nextInt();

        int day = 0;

        if (N%400==0){
            day = 12;
        } else if(N%4==0 & N%100!=0) {
            day = 12;
        }else {
            day = 13;
        }
        System.out.print(day+"/"+"09"+"/"+N);


    }
}
