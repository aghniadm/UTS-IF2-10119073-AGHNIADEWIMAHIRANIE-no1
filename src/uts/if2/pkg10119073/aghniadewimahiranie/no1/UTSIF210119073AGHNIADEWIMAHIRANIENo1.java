package uts.if2.pkg10119073.aghniadewimahiranie.no1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 *
 */
public class UTSIF210119073AGHNIADEWIMAHIRANIENo1 {

    public static void main(String[] args) {
        Age age = new Age(Calendar.getInstance().get(Calendar.YEAR));
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        Scanner scan = new Scanner(System.in);
        age.setYearBirth(scan.nextInt());
        
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun Lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
    
}
