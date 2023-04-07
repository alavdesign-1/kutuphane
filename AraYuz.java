
import java.util.InputMismatchException;
import java.util.Scanner;


public class AraYuz {
    
    public static void islemler(){
        String islemler = "islemler: \n"
                + "1.islem: kitaplari goruntule \n"
                + "2.islem: kitap ekle \n"
                + "3.islem: kitap sil \n"
                + "4.islem: kitap ara \n"
                + "5.islem: stok adedi arttir \n"
                + "6.islem: stok adedi azalt \n"
                + "7.islem: islemleri bastir\n"
                + "q.islem: cikis yap";
        System.out.println(islemler);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kutuphane kutuphane = new Kutuphane();
        
        
        System.out.println("kutuphaneye hosgeldiniz....");
        islemler();
        
        try {
            while(true){
            System.out.println("******************");
            System.out.println("bir islem giriniz:");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("kutuphaneden cikiliyor...");
                break;
            }
            
            else if(islem.equals("1")){
                
                System.out.println("kitaplar goruntuleniyor...");
                kutuphane.kitaplarigoruntule();
            }
            
            else if(islem.equals("2")){
                System.out.println("kitabin adini giriniz:");
                String kitaP_adi = scanner.nextLine();
                
                System.out.println("yazarin adini giriniz:");
                String yazar_adi = scanner.nextLine();
                
                System.out.println("yayinevi adi giriniz:");
                String yayinevi = scanner.nextLine();
                
                System.out.println("yayin yilini giriniz:");
                int yayinyili= scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("ISBN no:");
                int ISBN_no = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("stok adedi giriniz:");
                int stokadedi = scanner.nextInt();
                scanner.nextLine();
                
                Kitap kitap = new Kitap(kitaP_adi, yazar_adi, yayinevi, yayinyili, ISBN_no, stokadedi);
                
                kutuphane.kitapekle(kitap);
                
                System.out.println("kitabiniz eklenmistir...");
                kutuphane.kitaplarigoruntule();
                
            }
            
            else if(islem.equals("3")){
                System.out.println("silmek istediginiz kitabi yaziniz:");
                String kitapadi = scanner.nextLine();
                
                Kitap kitap = kutuphane.kitapAra(kitapadi);
                 
                if(kitap==null){
                    System.out.println("kitap bulunamadi...");
                    return;
                }else {
                    kutuphane.kitapsil(kitap);
                    System.out.println("kitap silinmistir...");
                }
                
                
            }
            
            else if(islem.equals("4")){
                System.out.println("aramak istediginiz kitabin adini giriniz:");
                String kitapadi = scanner.nextLine();
                
                Kitap kitap = kutuphane.kitapAra(kitapadi);
                
                if(kitap == null){
                    System.out.println("aradiginiz kitap mevcut degil...");
                }else {
                    System.out.println("kitap hakkindaki bilgiler...");
                    System.out.println(kitap.toString());
                }
                
            }
            
            else if(islem.equals("5")){
                System.out.println("hangi kitabin stogunu arttirmak istiyorsunuz ? ");
                String kitapadi = scanner.nextLine();
                
                Kitap kitap = kutuphane.kitapAra(kitapadi);
                if(kitap == null){
                    System.out.println("kitap bulunamadi...");
                    return;
                }else {
                    System.out.println("kac adet arttirmak istersiniz:");
                    int adet = scanner.nextInt();
                    scanner.nextLine();
                    if(adet < 0){
                        System.out.println("gecersiz adet sayisi...");
                        return;
                    }else {
                        kutuphane.stokarttir(kitap, adet);
                        System.out.println("stok arttirilmistir...");
                    }
                }
                
            }
            
            else if(islem.equals("6")){
                System.out.println("hangi kitabin stogunu azaltmak istersiniz:");
                String kitapadi = scanner.nextLine();
                
                Kitap kitap = kutuphane.kitapAra(kitapadi);
                
                if(kitap==null){
                    System.out.println("kitap bulunamadi...");
                    return;
                }else {
                    System.out.println("kac edet azaltacaksiniz:");
                    
                    int adet =scanner.nextInt();
                    scanner.nextLine();
                    
                    if(adet<0){
                        System.out.println("gecersiz adet sayisi");
                    }else {
                        kutuphane.stokazalt(kitap, adet);
                    }
                }
                
                
            }
            
            else if(islem.equals("7")){
                
                islemler();
                
            }
            
            else {
                System.out.println("yanlis bir islem girdiniz:");
                islemler();
            }
            
            
        }
        } catch (InputMismatchException e) {
            System.out.println("lutfen inputlari dogru bir sekilde girin...");
        }
        
    }
}
