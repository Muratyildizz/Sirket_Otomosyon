
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class İzinIslemleri {
    private Connection con = null;
    
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public ArrayList<İzin> izinleriGetir()
    {
        ArrayList<İzin> cikti=new ArrayList<İzin>();
        //Databes den yemekler tablosundaki 
        try {
            statement=con.createStatement();
            String sorgu= "Select * From izinler";
            
            java.sql.ResultSet rs= statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id=rs.getInt("id");
                String Ad=rs.getString("Ad");
                String Tarih=rs.getString("Tarih");

                cikti.add(new İzin(id,Ad,Tarih));
            }
           return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(İzinIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
        public void izinGuncelle(int id,String yeni_Ad,String yeni_Tarih)
    {
        String sorgu="Update izinler set Ad=? , Tarih=? where id=?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeni_Ad);
            preparedStatement.setString(2,yeni_Tarih);
            
            preparedStatement.setInt(3,id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(İzinIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
  
   
    //Databes kısmı
    public İzinIslemleri() {
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            con = java.sql.DriverManager.getConnection(url, Database.kullanici_adi, Database.parola);
            System.out.println("Baglanti Basarili...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
    }
    public static void main(String[] args)
    {                                                                           
        İzinIslemleri islemler=new İzinIslemleri();
    }
}