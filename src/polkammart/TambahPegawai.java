/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.invoke.MethodHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.FileInputStream;

/**
 *
 * @author oryza
 */
public class TambahPegawai extends javax.swing.JInternalFrame {

    /**
     * Creates new form TambahPegawai
     */
            String id_pengguna="";
            String namafile = null;
    
    
    
    public TambahPegawai() {
        initComponents();
        this.setTitle("Tambah Data Pegawai");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sandi = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();
        image = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 225));
        setIconifiable(true);
        setMaximizable(true);

        jPanel3.setBackground(new java.awt.Color(102, 102, 225));

        jLabel6.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/polkammart/icons8-gender-neutral-employee-group-100.png"))); // NOI18N
        jLabel6.setText("TAMBAH PEGAWAI");

        jPanel2.setBackground(new java.awt.Color(153, 153, 225));

        jLabel2.setText("Nama : ");

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sandi : ");

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        jLabel3.setText("Level : ");

        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Owner", "Pegawai", "Kasir" }));
        level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelActionPerformed(evt);
            }
        });

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_img.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lbl_img.setText("DISINI DAPAT DITAMBAHKAN GAMBAR");

        image.setText("Upload ");
        image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(50, 50, 50)
                                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(51, 51, 51)
                                .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(52, 52, 52)
                                .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lbl_img))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1))
                            .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambah)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(image)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        Enkripsi s=new Enkripsi();
        String z=nama.getText();
        String y=s.encryptPasswordMD5(sandi.getText());
        String l=Integer.toString(level.getSelectedIndex()+1);
        System.out.println("Nama : "+z+" Sandi : "+y+" "+l);
        Pegawai peg=new Pegawai();
        try {
            //membuat statemen pemanggilan data pada table tblGaji dari database
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            String query="Select * from pengguna, level where pengguna.level=level.no";
            ResultSet res = stat.executeQuery(query);
            String id_pengguna="";
            while(res.next()){
                id_pengguna=Integer.toString(Integer.parseInt(res.getString("id"))+1);
            }
            String sql = "INSERT INTO pengguna VALUES ('"+id_pengguna+"' , '"+z+"', '"+y+"', '"+l+"')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Penambahan Data Berhasil ");
            
            peg.AmbilData();
            this.getParent().add(peg);
            peg.setVisible(true);
            peg.setSize(this.getWidth(),this.getHeight());
            peg.setLocation(0,0);
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(TambahPegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_tambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pegawai peg=new Pegawai();
         peg.AmbilData();
            this.getParent().add(peg);
            peg.setVisible(true);
            peg.setSize(this.getWidth(),this.getHeight());
            peg.setLocation(0,0);
            this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void levelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelActionPerformed

    private void imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        namafile = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon (new ImageIcon(namafile).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageIcon);
        try{
            File image = new File(namafile);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum;(readNum=fis.read(buf))!=-1;)
                    bos.write(buf,0,readNum);
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }




















// TODO add your handling code here:
    }//GEN-LAST:event_imageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton image;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JComboBox level;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField sandi;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
