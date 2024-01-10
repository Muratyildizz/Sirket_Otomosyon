
public class İzin {
    private int id;
    private String Ad;
    private String Tarih;
   
     public İzin(int id,String Ad,String Tarih)
    {
        this.id=id;
        this.Ad=Ad;
        this.Tarih=Tarih;
    }
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getTarih() {
        return Tarih;
    }

    public void setTarih(String Tarih) {
        this.Tarih = Tarih;
    }
}


