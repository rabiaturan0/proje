package sanslikullanici;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
    static LocalDateTime kullaniciDate;

    public static LinkedList
    kayitOl() {

        LinkedList<String> kayıt = new LinkedList<>();

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Adınızı giriniz");
            String ad = input.nextLine();
            System.out.println("Soyadınızı giriniz");
            String soyad = input.nextLine();
            System.out.println("kayıt olma icin e ye cıkmak icin h ye basınız");
            char ch = input.next().charAt(0);

            kullaniciDate = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mm:ss");
            String tıme = dtf.format(kullaniciDate);

            if (ch == 'e' || ch == 'E') {
                kayıt.add("" + " " + soyad + ":" + tıme);
            } else
                break;


        } while (true);
          return kayıt;
    }

    public static void main(String[] args) {
        LinkedList list =kayitOl();
        SansliKullanici sansliKullanici = new SansliKullanici();
        sansliKullanici.sansliKullanicilar(list);
    }

}
