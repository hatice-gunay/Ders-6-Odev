package org.example;


public class calisan {

    String ad;
    String soyad;

    Integer gelinenGun;

    public void kisiAdSoyad() {
        System.out.println("Kisi Ad Soyad :" + ad + " " + soyad);
    }

    public void calculatePrim() {
        if(gelinenGun > 25) {
            Integer dayCount = gelinenGun - 25;

            Integer totalPrim = 1000 * dayCount;
            System.out.println(ad + " " + soyad + " isimli kişi " + gelinenGun + " gün şirkete geldiği için toplam " + totalPrim + " TL kadar prim almayı hak etmiştir.");

        } else {
            System.out.println(ad + " " + soyad + " isimli kişi " + gelinenGun + " gün şirkete geldiği için prim almaya hak kazanmamıştır.");
        }
    }

}
