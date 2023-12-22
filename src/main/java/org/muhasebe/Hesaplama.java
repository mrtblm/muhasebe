package org.muhasebe;

import java.util.Scanner;

public class Hesaplama {
    void maas() {
        Scanner input = new Scanner(System.in);
        int calismaGun;
        int gunlukFiyat = 400;
        int gun = 25;
        int prim = 1000;
        int extra;
        int extraGun;
        int maas;
        int extraliMaas;

        System.out.print("Personel Çalışma Gün Sayınızı Giriniz : ");
        calismaGun = input.nextInt();
        if (calismaGun > 31 || calismaGun <=0 ) {
            System.out.println("Lütfen Aylık Maaş Hesaplaması İçin Gün Sayısını 1-30 Arasında Sayı Giriniz. ");
           } else if (calismaGun > 25) {
            maas = calismaGun * gunlukFiyat;
            extraGun = calismaGun - gun;
            extra = extraGun * prim;
            extraliMaas = maas + extra;
            System.out.println("Çalışma Gün Sayısı " + calismaGun + " Gün Olduğu İçin Maaşı " + "( " + calismaGun + "*" + gunlukFiyat + " ) = " + maas + " ₺ dir.");
            System.out.println("Bu Ay Extra " + extraGun + " Gün Çalıştığı İçin " + extra + " ₺ Prim ile Personel Toplam Maaşı : " + extraliMaas + " ₺ dir.");
        } else {
            maas = calismaGun * gunlukFiyat;
            System.out.println("Personel Çalışma Gün Sayı " + "( " + calismaGun + "*" + gunlukFiyat + " )" + "Gün Olduğu İçin Personel Maaşı " + maas + "₺ dir.");
        }
    }

}


