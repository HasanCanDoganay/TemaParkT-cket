package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas, yasli, yetiskin, cocuk, ktoplam, toplam;
        String grup;
        System.out.println("Yasinizi giriniz");
        Scanner reader = new Scanner(System.in);
        yas = reader.nextInt();
        if (yas > 60) {
            System.out.println("Grup ile mi geldiniz?");
            grup = reader.next();
            if (grup.equals("evet")) {
                System.out.println("60 yas ustu misafir sayisini giriniz.");
                yasli = reader.nextInt();
                System.out.println("Yetiskin misafir sayisini giriniz.");
                yetiskin = reader.nextInt();
                System.out.println("13 yas altı misafir sayisini giriniz.");
                cocuk = reader.nextInt();
                ktoplam=yasli + yetiskin;
                if (ktoplam >4) {
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5)-10;
                }
                else{
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5);
                }}
            else{
                toplam=8;
                }}
        else if(yas>13 && yas<60){
            System.out.println("Grup ile mi geldiniz?");
            grup = reader.next();
            if (grup.equals("evet")) {
                System.out.println("60 yas ustu misafir sayisini giriniz.");
                yasli = reader.nextInt();
                System.out.println("Yetiskin misafir sayisini giriniz.");
                yetiskin = reader.nextInt();
                System.out.println("13 yas altı misafir sayisini giriniz.");
                cocuk = reader.nextInt();
                ktoplam=yasli + yetiskin;
                if (ktoplam >4) {
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5)-10;
                }
                else{
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5);
                }}
            else{
                toplam=10;
            }}
        else{
            System.out.println("Grup ile mi geldiniz?");
            grup = reader.next();
            if (grup.equals("evet")) {
                System.out.println("60 yas ustu misafir sayisini giriniz.");
                yasli = reader.nextInt();
                System.out.println("Yetiskin misafir sayisini giriniz.");
                yetiskin = reader.nextInt();
                System.out.println("13 yas altı misafir sayisini giriniz.");
                cocuk = reader.nextInt();
                ktoplam=yasli + yetiskin;
                if (ktoplam >4) {
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5)-10;
                }
                else{
                    toplam=(yasli*8)+(yetiskin*10)+(cocuk*5);
                }}
            else{
                toplam=5;
            }}
        System.out.println("toplam odenmesi gereken tutar : " +toplam +" tl");
                }
            }
