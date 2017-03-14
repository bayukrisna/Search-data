
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setDate(); setTime();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JLabel();
        idbar = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        b3 = new javax.swing.JLabel();
        b10 = new javax.swing.JLabel();
        b4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jumbar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        labeltanggal = new javax.swing.JLabel();
        labeljam = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 204, 0));
        jPanel5.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 255, 153));
        jPanel3.setLayout(null);

        tabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID BARANG", "NAMA BARANG", "HARGA BARANG", "JUMLAH BARANG", "TOTAL HARGA"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 620, 170);

        jPanel5.add(jPanel3);
        jPanel3.setBounds(350, 130, 640, 190);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ISIAN DATA BARANG", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Traditional Arabic", 1, 12))); // NOI18N
        jPanel1.setLayout(null);

        b1.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b1.setText("ID Barang");
        jPanel1.add(b1);
        b1.setBounds(10, 40, 90, 30);

        idbar.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        idbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idbarActionPerformed(evt);
            }
        });
        jPanel1.add(idbar);
        idbar.setBounds(120, 40, 190, 30);

        nama.setFont(new java.awt.Font("Sitka Banner", 0, 14)); // NOI18N
        jPanel1.add(nama);
        nama.setBounds(120, 90, 190, 30);

        b3.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b3.setText("Jumlah Barang");
        jPanel1.add(b3);
        b3.setBounds(10, 190, 110, 30);

        b10.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b10.setText("Nama Barang");
        jPanel1.add(b10);
        b10.setBounds(10, 90, 110, 30);

        b4.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        b4.setText("Harga Barang");
        jPanel1.add(b4);
        b4.setBounds(10, 140, 110, 30);
        jPanel1.add(harga);
        harga.setBounds(120, 140, 190, 30);

        jumbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumbarActionPerformed(evt);
            }
        });
        jPanel1.add(jumbar);
        jumbar.setBounds(120, 190, 190, 30);

        jPanel5.add(jPanel1);
        jPanel1.setBounds(20, 70, 320, 250);

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setLayout(null);

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save);
        save.setBounds(20, 10, 90, 30);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete);
        delete.setBounds(120, 10, 90, 30);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear);
        clear.setBounds(220, 10, 90, 30);

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh);
        refresh.setBounds(320, 10, 90, 30);

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit);
        edit.setBounds(420, 10, 90, 30);

        btnprint.setText("Print");
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });
        jPanel2.add(btnprint);
        btnprint.setBounds(520, 10, 90, 30);

        jPanel5.add(jPanel2);
        jPanel2.setBounds(350, 70, 640, 50);

        jButton1.setFont(new java.awt.Font("Square721 BT", 3, 24)); // NOI18N
        jButton1.setText("EXIT FROM THE PROGRAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(20, 410, 980, 50);

        labeltanggal.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        labeltanggal.setText("Tanggal");
        jPanel5.add(labeltanggal);
        labeltanggal.setBounds(750, 20, 80, 30);

        labeljam.setFont(new java.awt.Font("Lao UI", 1, 14)); // NOI18N
        labeljam.setText("Jam");
        jPanel5.add(labeljam);
        labeljam.setBounds(830, 20, 150, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("The Best Place To Spend Your Money");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(320, 30, 290, 40);

        jLabel1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 18)); // NOI18N
        jLabel1.setText("TOKO CETAR JAYA");
        jPanel5.add(jLabel1);
        jLabel1.setBounds(350, 0, 460, 40);

        tot.setFont(new java.awt.Font("Swis721 Hv BT", 1, 24)); // NOI18N
        tot.setText("0");
        jPanel5.add(tot);
        tot.setBounds(340, 330, 130, 50);

        jLabel4.setFont(new java.awt.Font("Swis721 Hv BT", 1, 24)); // NOI18N
        jLabel4.setText("BAYAR :");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(120, 330, 140, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("KASIR : BAYU KRISNA");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(30, 20, 210, 40);

        jLabel5.setFont(new java.awt.Font("Swis721 Hv BT", 1, 24)); // NOI18N
        jLabel5.setText("Rp. ");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(260, 330, 70, 50);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1010, 480);

        setBounds(0, 0, 1025, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
 // TODO add your handling code here:
        if ("".equals(idbar.getText()) || "".equals(nama.getText()) || "".equals(harga.getText()) || "".equals(jumbar.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int a = Integer.parseInt(harga.getText());
            int b = Integer.parseInt(jumbar.getText());
            int total = Integer.parseInt(tot.getText());
            int hasil = (a*b)+total;
            String ab = Integer.toString(hasil);
            String SQL = "INSERT INTO tabel_barang VALUES "
                    + "('" + idbar.getText() + "','" 
                    + nama.getText() + "','" 
                    + harga.getText() + "','"
                    + jumbar.getText() + "','"
                    + hasil + "')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan","Sukses",JOptionPane.INFORMATION_MESSAGE);
                tot.setText(ab); selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();
        if (baris != -1) {
            String id_barang = tabel.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tabel_barang WHERE id_barang='"+id_barang+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Sukses",JOptionPane.INFORMATION_MESSAGE);
                 
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Barisnya Terlebih Dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        nama.setText("");
        idbar.setText("");
        harga.setText("");
        jumbar.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       selectData();
    }//GEN-LAST:event_refreshActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int baris = tabel.getSelectedRow();
        String id_barang = tabel.getValueAt(baris, 0).toString();       
        if ("".equals(idbar.getText()) || "".equals(nama.getText()) || "".equals(harga.getText()) || "".equals(jumbar.getText()) ) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            int a = Integer.parseInt(harga.getText());
            int b = Integer.parseInt(jumbar.getText());
            int total = Integer.parseInt(tot.getText());
            int hasil = (a*b)+total;
            String ab = Integer.toString(hasil);
            
            String SQL = "UPDATE tabel_barang SET `id_barang`='"+idbar.getText()
                    +"',`nama_barang`='"+nama.getText()
                    +"',`harga_barang`='"+harga.getText()
                    +"',`jumlah`='"+jumbar.getText()
                    +"',`total_harga`='"+ hasil
                    +"' WHERE id_barang="+id_barang;
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
   
    }//GEN-LAST:event_editActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SQL = "DELETE FROM tabel_barang";
        int status = KoneksiDB.execute(SQL);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        MessageFormat header = new MessageFormat("TOKO CETAR JAYA");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}       ");
        try {
            tabel.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        } catch (java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n", e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnprintActionPerformed

    private void idbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbarActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.getSelectedRow();
        if (baris != -1) {
            idbar.setText(tabel.getValueAt(baris, 0).toString());
            nama.setText(tabel.getValueAt(baris, 1).toString());
            harga.setText(tabel.getValueAt(baris, 2).toString());
            jumbar.setText(tabel.getValueAt(baris, 3).toString());
            
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void jumbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumbarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b10;
    private javax.swing.JLabel b3;
    private javax.swing.JLabel b4;
    private javax.swing.JButton btnprint;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField idbar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jumbar;
    private javax.swing.JLabel labeljam;
    private javax.swing.JLabel labeltanggal;
    private javax.swing.JTextField nama;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel;
    private javax.swing.JLabel tot;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
    String kolom[] = {"id_barang","nama_barang","harga_barang","jumlah","total_harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tabel_barang";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try{
            while(rs.next()){
                String idbar = rs.getString(1);
                String nama = rs.getString(2);
                String harga = rs.getString(3);
                String jumbar = rs.getString(4);
                String hasil = rs.getString(5);
                String data[] = {idbar,nama,harga,jumbar,hasil};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabel.setModel(dtm);
    }   
       
    private void setDate() {
        java.util.Date now = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        labeltanggal.setText(kal.format(now));
    }

    private void setTime() {
         ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                
            Date dt = new Date();
            int nilai_jam = dt.getHours();
            int nilai_menit = dt.getMinutes();
            int nilai_detik = dt.getSeconds();
            
            if (nilai_jam <= 9) {
            nol_jam = "0";
        }
            if (nilai_menit <= 9) {
            nol_menit = "0";
        }
            if (nilai_detik <= 9) {
            nol_detik = "0";
        }
            String jam = nol_jam + Integer.toString(nilai_jam);
            String menit = nol_menit + Integer.toString(nilai_menit);
            String detik = nol_detik + Integer.toString(nilai_detik);
            labeljam.setText(jam + ";" + menit + ";" + detik);
        }
    };
        new Timer(100, taskPerformer).start();
    }      
}
