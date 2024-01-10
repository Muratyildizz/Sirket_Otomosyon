
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class YemekIslemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<Yemek> yemekleriGetir()
    {
        ArrayList<Yemek> cikti=new ArrayList<Yemek>();
        //Databes den yemekler tablosundaki 
        try {
            statement=con.createStatement();
            String sorgu= "Select * From yemekler";
            
            ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id=rs.getInt("id");
                String Tarih=rs.getString("Tarih");
                String Menu=rs.getString("Menu");

                cikti.add(new Yemek(id,Tarih,Menu));
            }
           return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(YemekIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    public void yemekGuncelle(int id,String yeni_Tarih,String yeni_Menu)
    {
        String sorgu="Update yemekler set Tarih=? , Menu=? where id=?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeni_Tarih);
            preparedStatement.setString(2,yeni_Menu);
            
            preparedStatement.setInt(3,id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YemekIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void yemekEkle(String Tarih,String Menu)
    {
        String sorgu="Insert Into yemekler(Tarih,Menu) Values(?,?)";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,Tarih);
            preparedStatement.setString(2,Menu);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(YemekIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Databes kısmı
    public YemekIslemleri() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Baglanti Basarili...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {                                                                           
        YemekIslemleri islemler=new YemekIslemleri();
    }
}
