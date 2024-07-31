import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double para;
        Scanner inp = new Scanner(System.in);
        System.out.print("Para tutarını giriniz:");
        para = inp.nextDouble();

        boolean tutar = para > 1000;

        double kdv = tutar ? para * 0.08 :  para * 0.18;
        System.out.println("KDV'siz fiyat :" +para);
        System.out.println("KDV'li fiyat:" +(para+kdv));
        System.out.println("kdv tutarı:" + kdv);

    }
}