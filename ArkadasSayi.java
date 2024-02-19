import java.util.Scanner;

public class ArkadasSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();

        if (arkadasSayiMi(sayi1, sayi2)) {
            System.out.println("Bu iki sayı arkadaştır");
        } else {
            System.out.println("Bu iki sayı arkadaş değildir.");
        }
    }

    public static boolean arkadasSayiMi(int sayi1, int sayi2) {
        return (bolenToplami(sayi1) == sayi2) && (bolenToplami(sayi2) == sayi1);
    }

    public static int bolenToplami(int sayi) {
        int toplam = 0;
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        return toplam;
    }
}
