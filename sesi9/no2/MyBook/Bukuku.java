package com.pbo.sesi9.no2.MyBook;
import java.util.ArrayList;
/**
 *
 * @author jembar
 */
public class Bukuku {
     public static void main(String[] args) {
        Buku buku1=new Buku("Sherlock Holmes", "Arthur Conan Doyle", 1892);
        Buku buku2=new Buku("Sherlock Begins: A Study in Scarlet by Sir Arthur Conan Doyle", "Sir Arthur Conan Doyle", 2012);
        Buku buku3=new Buku("Sang Pemimpi", "Andrea Hirata", 2006);
        Buku buku4=new Buku("Harry Potter and The Half-Blood Prince", "J.K Rowling", 2006);

        ArrayList<Buku> BukuAku=new ArrayList<Buku>();
        BukuAku.add(buku1);
        BukuAku.add(buku2);
        BukuAku.add(buku3);
        BukuAku.add(buku4);

        for(Buku buku: BukuAku){
          buku.infoBuku();
        }
    }
}
