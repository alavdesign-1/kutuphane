
public class Kitap {
    private String KitapAdi ;
    private String YazarAdi ;
    private String YayinEvi ;
    private int YayinYili ;
    private int ISBNnumarasi ;
    private int StokAdedi ;

    public Kitap(String KitapAdi, String YazarAdi, String YayinEvi, int YayinYili, int ISBNnumarasi, int StokAdedi) {
        this.KitapAdi = KitapAdi;
        this.YazarAdi = YazarAdi;
        this.YayinEvi = YayinEvi;
        this.YayinYili = YayinYili;
        this.ISBNnumarasi = ISBNnumarasi;
        this.StokAdedi = StokAdedi;
    }

    public String getKitapAdi() {
        return KitapAdi;
    }

    public void setKitapAdi(String KitapAdi) {
        this.KitapAdi = KitapAdi;
    }

    public String getYazarAdi() {
        return YazarAdi;
    }

    public void setYazarAdi(String YazarAdi) {
        this.YazarAdi = YazarAdi;
    }

    public String getYayinEvi() {
        return YayinEvi;
    }

    public void setYayinEvi(String YayinEvi) {
        this.YayinEvi = YayinEvi;
    }

    public int getYayinYili() {
        return YayinYili;
    }

    public void setYayinYili(int YayinYili) {
        this.YayinYili = YayinYili;
    }

    public int getISBNnumarasi() {
        return ISBNnumarasi;
    }

    public void setISBNnumarasi(int ISBNnumarasi) {
        this.ISBNnumarasi = ISBNnumarasi;
    }

    public int getStokAdedi() {
        return StokAdedi;
    }

    public void setStokAdedi(int StokAdedi) {
        this.StokAdedi = StokAdedi;
    }

    @Override
    public String toString() {
        
      return "kitap adi: " + KitapAdi 
              + "\n"+"yazar adi: " + YazarAdi 
              + "\n" + "yayınevi: " + YayinEvi 
              + "\n" + "yayin yili: " + YayinYili 
              + "\n" + "ISBN no: " + ISBNnumarasi 
              + "\n" + "stok adedi: " + StokAdedi;

        
        
    }

   
    
    
    
}
