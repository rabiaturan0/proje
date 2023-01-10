package sanslikullanici;

import java.util.LinkedList;
import java.util.List;

public class SansliKullanici {
    public void sansliKullanicilar(LinkedList a){
        System.out.println("kazananlar listesi:  ");

        for (int i = 0; i < a.size(); i++) {
           int length = a.get(i).toString().length();
           Integer son = Integer.valueOf(a.get(i).toString().substring(length-2));

           if (son<10){
               System.out.println(a.get(i));
           }
        }
    }


    public void sansliKullaniciYazdir(List<String> listKullaniciID, List<Integer> listKullaniciSaniye) {
    }
}
