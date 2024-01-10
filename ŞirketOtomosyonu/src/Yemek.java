
public class Yemek {
    private int id;
    private String Tarih;
    private String Menu;
   
     public Yemek(int id,String Tarih,String Menu)
    {
        this.id=id;
        this.Tarih=Tarih;
        this.Menu=Menu;
    }
        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarih() {
        return Tarih;
    }

    public void setAd(String Tarih) {
        this.Tarih = Tarih;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }
}
