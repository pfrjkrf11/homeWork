import java.util.Scanner;

public class zarplata {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите зарплаты:");
        int zp1 = scanner.nextInt();
        int zp2 = scanner.nextInt();
        int zp3 = scanner.nextInt();

        int maxZp = 0;
        int minZp = 0;

        if (zp1>zp2){
            maxZp = zp1;
        }else {
            maxZp = zp2;
        }

        if (zp3>maxZp){
            maxZp = zp3;
        }


        if (zp1>zp2){
            minZp = zp2;
        }else{
            minZp = zp1;
        }

        if(zp3<minZp){
            minZp = zp3;
        }



        System.out.println(maxZp - minZp);

    }
}
