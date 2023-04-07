
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Kutuphane {
    
    
    private File dosya;
    private ArrayList<Kitap> kitaplistesi;
    
    public Kutuphane(){
        kitaplistesi = new ArrayList<>();
        dosya = new File("kutuphane.txt");
    }
    
    Scanner scanner = new Scanner(System.in);
    
    public void kitapekle(Kitap yeni_kitap){
      kitaplistesi.add(yeni_kitap);
       
    }
    public void kitapsil(Kitap kitap){
        
       kitaplistesi.remove(kitap);
        
    }
    public Kitap kitapAra(String kitapAdi) {
        for (Kitap kitap : kitaplistesi) {
            if (kitap.getKitapAdi().equals(kitapAdi)) {
                return kitap;
            }
        }
        return null;
    }
    public void kitaplarigoruntule(){
        
        for(Kitap kitap : kitaplistesi){
            System.out.println(kitap.toString());
        }
    }
    
    
    public void stokarttir(Kitap kitap,int adet){
        
        int yeni_stok = kitap.getStokAdedi() + adet;
        kitap.setStokAdedi(yeni_stok);
    }
    
    public void stokazalt(Kitap kitap,int adet){
        
        int yeni_stok = kitap.getStokAdedi() - adet;
        kitap.setStokAdedi(yeni_stok);
    }

    
    
}
