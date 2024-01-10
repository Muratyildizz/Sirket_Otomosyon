
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author hp
 */
public class PersonelEkran extends javax.swing.JDialog {
     DefaultTableModel model;
     CalisanIslemleri islemler=new CalisanIslemleri();
     
     
    
    public PersonelEkran(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model=(DefaultTableModel) personel_tablosu.getModel();
        personelGoruntule();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        personel_tablosu = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_text = new javax.swing.JTextField();
        soyad_text = new javax.swing.JTextField();
        Departman_text = new javax.swing.JTextField();
        maas_text = new javax.swing.JTextField();
        mesaj_yazisi = new javax.swing.JLabel();
        personelEkle = new javax.swing.JButton();
        personelGuncelle = new javax.swing.JButton();
        personelSil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));

        personel_tablosu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        personel_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "ad", "soyad", "departman", "maas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personel_tablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personel_tablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personel_tablosu);
        if (personel_tablosu.getColumnModel().getColumnCount() > 0) {
            personel_tablosu.getColumnModel().getColumn(1).setResizable(false);
            personel_tablosu.getColumnModel().getColumn(2).setResizable(false);
            personel_tablosu.getColumnModel().getColumn(3).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Adı:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Soyadı:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Departman:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Maaş:");

        mesaj_yazisi.setForeground(new java.awt.Color(255, 0, 0));

        personelEkle.setBackground(new java.awt.Color(204, 255, 204));
        personelEkle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personelEkle.setText("Yeni Personel Ekle");
        personelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelEkleActionPerformed(evt);
            }
        });

        personelGuncelle.setBackground(new java.awt.Color(204, 204, 255));
        personelGuncelle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personelGuncelle.setText("Personel Güncelle");
        personelGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelGuncelleActionPerformed(evt);
            }
        });

        personelSil.setBackground(new java.awt.Color(204, 255, 255));
        personelSil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personelSil.setText("Personel Sil");
        personelSil.setMaximumSize(new java.awt.Dimension(125, 23));
        personelSil.setMinimumSize(new java.awt.Dimension(125, 23));
        personelSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelSilActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Arama:");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("~ Personel Bilgileri ~");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ad_text)
                                    .addComponent(soyad_text)
                                    .addComponent(Departman_text)
                                    .addComponent(maas_text, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(personelEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(personelGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(personelSil, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ad_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soyad_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Departman_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(maas_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personelGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(personelSil, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesaj_yazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara)
    {
      TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
      
      personel_tablosu.setRowSorter(tr);
      tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
      
        String ara = arama_cubugu.getText();
        
        dinamikAra(ara);
        
        
    }//GEN-LAST:event_arama_cubuguKeyReleased
   
    private void personelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelEkleActionPerformed
        mesaj_yazisi.setText("");
        String ad=ad_text.getText();
        String soyad=soyad_text.getText();
        String departman=Departman_text.getText();
        String maas=maas_text.getText();
        
        islemler.personelEkle(ad,soyad,departman,maas);
        
        personelGoruntule();
        mesaj_yazisi.setText("Yeni personel başarıyla eklendi");
    }//GEN-LAST:event_personelEkleActionPerformed

    private void personel_tablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personel_tablosuMouseClicked
      int seciliSatir=personel_tablosu.getSelectedRow();
      ad_text.setText(model.getValueAt(seciliSatir,1).toString());
      soyad_text.setText(model.getValueAt(seciliSatir,2).toString());
      Departman_text.setText(model.getValueAt(seciliSatir,3).toString());
      maas_text.setText(model.getValueAt(seciliSatir,4).toString());
      
      
    }//GEN-LAST:event_personel_tablosuMouseClicked

    private void personelGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelGuncelleActionPerformed
       String ad=ad_text.getText();
       String soyad=soyad_text.getText();
       String departman=Departman_text.getText();
       String maas=maas_text.getText();
       
       int secilenSatir=personel_tablosu.getSelectedRow();
       if(secilenSatir==-1)
       {
           if(model.getRowCount()==0)
           {
               mesaj_yazisi.setText("Personeller tablosu şu an boş");
           }
           else
           {
               mesaj_yazisi.setText("Güncellenecek bir personel seçin");
           }
       }
       else
       {
           int id=(int)model.getValueAt(secilenSatir,0);
           
           
           islemler.personelGuncelle(id,ad,soyad,departman,maas);
           personelGoruntule();
           mesaj_yazisi.setText("Personel başarıyla güncellendi.");
       }
       
       
    }//GEN-LAST:event_personelGuncelleActionPerformed

    private void personelSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelSilActionPerformed
        mesaj_yazisi.setText("");
        int secilenSatir=personel_tablosu.getSelectedRow();
        if( secilenSatir==-1)
        {
            if(model.getRowCount()==0)
            {
                mesaj_yazisi.setText("Personel tablosu boş");
            }
            else
            {
                mesaj_yazisi.setText("Silinecek bir personel seçin.");
            }
        }
        else
        {
            int id=(int)model.getValueAt(secilenSatir,0);
            islemler.personelSil(id);
            personelGoruntule();
            mesaj_yazisi.setText("Personel başarıyla silindi");
        }
        
        
        
        
        
    }//GEN-LAST:event_personelSilActionPerformed

    /**
     * @param args the command line arguments
     */
    public void personelGoruntule()
    {
        model.setRowCount(0);
        ArrayList<Personel> personeller=new ArrayList<Personel>();
        personeller=islemler.personelleriGetir();
        if (personeller!=null){
            for(Personel personel :personeller){
                 Object[] eklenecek={personel.getId(),personel.getAd(),personel.getSoyad(),personel.getDepartman(),personel.getMaas()};
            model.addRow(eklenecek);
            
            }
               
        }
        
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PersonelEkran dialog = new PersonelEkran(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Departman_text;
    private javax.swing.JTextField ad_text;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maas_text;
    private javax.swing.JLabel mesaj_yazisi;
    private javax.swing.JButton personelEkle;
    private javax.swing.JButton personelGuncelle;
    private javax.swing.JButton personelSil;
    private javax.swing.JTable personel_tablosu;
    private javax.swing.JTextField soyad_text;
    // End of variables declaration//GEN-END:variables
}
