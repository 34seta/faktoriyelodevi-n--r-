import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        System.out.println("n sayisini giriniz: ");
        n = scanner.nextInt();
        System.out.println("r sayisini giriniz: ");
        r = scanner.nextInt();
        int totalr = 1;     //işlem sonucunda r! ifade etmektedir.
        int totaln = 1;     //işlem sonucunda n! ifade etmektedir.
        int totaln_r = 1;   //işlem sonucunda (n-r)! ifade etmektedir.


        //n! hesabı
        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;


        }
        System.out.println(n + "! sayinin faktoriyeli=  " + totaln);

        //r! hesabı
        for (int i = 1; i <= r; i++) {
            totalr = totalr * i;


        }
        System.out.println(r + "! sayinin faktoriyeli=  " + totalr);

        //(n-r)! hesabı
        for (int i = 1; i <= (n - r); i++) {
            totaln_r = totaln_r * i;


        }
        System.out.println("(n-r)!" + " sayinin faktoriyeli=  " + totaln_r);

        //C(n,r) = n! / (r! * (n-r)!)

        double C = totaln / (totalr * (totaln_r));

        System.out.println("C(n,r) kombinasyonu sonuc= " + C);

    }
}