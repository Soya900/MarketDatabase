package marketdatabase;
import java.util.*;

public class MarketDatabase {
    static Scanner kb = new Scanner(System.in);
    static ArrayList<Integer> kode = new ArrayList<Integer>();
    static ArrayList<String> barang = new ArrayList<String>();
    
    public static void main(String[] args) {
        int sel = 0;
        while (sel != 5) {
            System.out.println("Menu: ");
            System.out.print("1.\tTambah kode dan barang\n2.\tLihat kode dan barang\n3.\tHapus kode dan barang\n4.\tCari kode dan barang\n5.\tKeluar\nPilih Menu: ");
            sel = kb.nextInt();
            
            switch(sel) {
                case 1:
                    System.out.println("Masukan kode barang: ");
                    int code = kb.nextInt();
                    System.out.println("Masukan nama barang: ");
                    String prod = kb.next();
                    AddKode(code);
                    AddBarang(prod);
                    System.out.println("");
                    break;
                case 2:
                    ViewList();
                    break;
                case 3:
                    System.out.println("Hapus Produk: ");
                    int del = kb.nextInt();
                    DelProdCode(del);
                    break;
                case 4:
                    
                    break;
                default:
                    System.out.println("Error");
            }
        }
        
    }
    
    static void AddKode(int code) {
        kode.add(code);
    }
    
    static void AddBarang(String prod) {
        barang.add(prod);
    }
    
    static void DelProdCode(int d) {
        for(int i = 0; i < kode.size(); i++) {
            if(kode.get(i) == d) {
                kode.remove(i);
                barang.remove(i);
           }
        }
        System.out.println("");
    }
    
    static void ViewList() {
        System.out.println("Kode\tBarang");
        System.out.println("===================");
        for(int i = 0; i < kode.size(); i++) {
            System.out.println(kode.get(i) + "\t" + barang.get(i));
        }
        System.out.println("");
    }
    
}
