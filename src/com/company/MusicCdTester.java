package com.company;

/**
 * Created by venkatasaiharsharavuri on 5/11/17.
 */
public class MusicCdTester {
    public static void main(String[] args){
       MusicCd mcd1 = new MusicCd();
        MusicCd mcd2 = new MusicCd("us" , "Sai");


        System.out.println(mcd2.getTitle());
        System.out.println(mcd2.getArtist());
        System.out.println(mcd1.getArtist());
        System.out.println(mcd1.getTitle());
        mcd1.setTitle("My Tile");
        mcd1.setArtist("It's me");
        System.out.println(mcd1.getTitle());
        System.out.println(mcd1.getArtist());


       /*MusicCd dylan = new MusicCd("Love and Theft", "Bob Dylan");
        MusicCd cash = new MusicCd();

        System.out.println(dylan.getTitle());
        System.out.println(dylan.getArtist());

        System.out.println(cash.getTitle());
        System.out.println(cash.getArtist());

        cash.setTitle("American IV: The Man Comes Around");
        cash.setArtist("Johnny Cash");
        System.out.println(cash.getTitle());
        System.out.println(cash.getArtist());*/
    }
}

