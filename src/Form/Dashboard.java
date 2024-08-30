package Form;

import static Config.Koneksi.getConnection;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alfian and Winton
 */
public class Dashboard extends javax.swing.JFrame {
    
    private Connection conn;
   
    public Dashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_tahuna = new javax.swing.JMenu();
        mn_exit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mn_dsiswa = new javax.swing.JMenuItem();
        mn_kelas = new javax.swing.JMenuItem();
        mn_tahun = new javax.swing.JMenuItem();
        mn_kelas1 = new javax.swing.JMenuItem();
        mn_kelas2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mn_transaksi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mn_laporan = new javax.swing.JMenuItem();
        mn_laporan1 = new javax.swing.JMenuItem();
        mn_laporan2 = new javax.swing.JMenuItem();
        mn_laporan3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bnr.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(838, 546));

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        mn_tahuna.setForeground(new java.awt.Color(102, 102, 102));
        mn_tahuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder.png"))); // NOI18N
        mn_tahuna.setText("FILE");
        mn_tahuna.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mn_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_exit.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        mn_exit.setText("EXIT");
        mn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_exitActionPerformed(evt);
            }
        });
        mn_tahuna.add(mn_exit);

        jMenuBar1.add(mn_tahuna);

        jMenu1.setForeground(new java.awt.Color(102, 102, 102));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/file.png"))); // NOI18N
        jMenu1.setText("DATA");
        jMenu1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mn_dsiswa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mn_dsiswa.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_dsiswa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/users1.png"))); // NOI18N
        mn_dsiswa.setText("SISWA");
        mn_dsiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_dsiswaActionPerformed(evt);
            }
        });
        jMenu1.add(mn_dsiswa);

        mn_kelas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mn_kelas.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_kelas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/class1.png"))); // NOI18N
        mn_kelas.setText("KELAS");
        mn_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_kelasActionPerformed(evt);
            }
        });
        jMenu1.add(mn_kelas);

        mn_tahun.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mn_tahun.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_tahun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jurusan1.png"))); // NOI18N
        mn_tahun.setText("JURUSAN");
        mn_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_tahunActionPerformed(evt);
            }
        });
        jMenu1.add(mn_tahun);

        mn_kelas1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_kelas1.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_kelas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pencil.png"))); // NOI18N
        mn_kelas1.setText("JENIS STUDI");
        mn_kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_kelas1ActionPerformed(evt);
            }
        });
        jMenu1.add(mn_kelas1);

        mn_kelas2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mn_kelas2.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_kelas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1680.jpg"))); // NOI18N
        mn_kelas2.setText("TAHUN AJARAN");
        mn_kelas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_kelas2ActionPerformed(evt);
            }
        });
        jMenu1.add(mn_kelas2);

        jMenuBar1.add(jMenu1);

        jMenu3.setForeground(new java.awt.Color(102, 102, 102));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1489178800_23.png"))); // NOI18N
        jMenu3.setText("TRANSAKSI");
        jMenu3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mn_transaksi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_transaksi.setFont(new java.awt.Font("Agency FB", 1, 17)); // NOI18N
        mn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money-bag.png"))); // NOI18N
        mn_transaksi.setText("PEMBAYARAN");
        mn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_transaksiActionPerformed(evt);
            }
        });
        jMenu3.add(mn_transaksi);

        jMenuBar1.add(jMenu3);

        jMenu2.setForeground(new java.awt.Color(102, 102, 102));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        jMenu2.setText("LAPORAN");
        jMenu2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N

        mn_laporan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_laporan.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money-bag.png"))); // NOI18N
        mn_laporan.setText("SPP");
        mn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_laporanActionPerformed(evt);
            }
        });
        jMenu2.add(mn_laporan);

        mn_laporan1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_laporan1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mn_laporan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/users1.png"))); // NOI18N
        mn_laporan1.setText("SISWA");
        mn_laporan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_laporan1ActionPerformed(evt);
            }
        });
        jMenu2.add(mn_laporan1);

        mn_laporan2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_laporan2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mn_laporan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/class1.png"))); // NOI18N
        mn_laporan2.setText("KELAS");
        mn_laporan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_laporan2ActionPerformed(evt);
            }
        });
        jMenu2.add(mn_laporan2);

        mn_laporan3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mn_laporan3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        mn_laporan3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/jurusan1.png"))); // NOI18N
        mn_laporan3.setText("JURUSAN");
        mn_laporan3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_laporan3ActionPerformed(evt);
            }
        });
        jMenu2.add(mn_laporan3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mn_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_kelasActionPerformed
        new FormKelas().show();
        this.dispose();
    }//GEN-LAST:event_mn_kelasActionPerformed

    private void mn_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_tahunActionPerformed
        new FormJurusan().show();
        this.dispose();
    }//GEN-LAST:event_mn_tahunActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jLabel2.setLocation((this.getWidth() / 2) - jLabel2.getWidth() / 2, ((this.getHeight() / 2) - jLabel2.getHeight() / 2) - jMenuBar1.getHeight());
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bnr.png")));
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        javax.swing.GroupLayout DesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(DesktopPaneLayout);
    }//GEN-LAST:event_formComponentShown

    private void mn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_transaksiActionPerformed
        new FormTransaksi().show();
        this.dispose();
    }//GEN-LAST:event_mn_transaksiActionPerformed

    private void mn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_laporanActionPerformed

        try {
        String reportPath = "src/Laporan/SPP.jasper";
        Connection conn = getConnection();
        
        HashMap<String, Object> parameters = new HashMap<>();
        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
        JasperViewer viewer = new JasperViewer(print, false);
        
        viewer.setVisible(true);
        
//        Locale locale = new Locale ("id", "ID");
//        Locale.setDefault(locale);
        
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi error : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_mn_laporanActionPerformed

    private void mn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_exitActionPerformed
        new Login().show();
        this.dispose();
    }//GEN-LAST:event_mn_exitActionPerformed

    private void mn_dsiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_dsiswaActionPerformed
        new FormSiswa().show();
        this.dispose();
    }//GEN-LAST:event_mn_dsiswaActionPerformed

    private void mn_kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_kelas1ActionPerformed
        new FormJenisStudi().show();
        this.dispose();
    }//GEN-LAST:event_mn_kelas1ActionPerformed

    private void mn_kelas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_kelas2ActionPerformed
        new FormTahunAjaran().show();
        this.dispose();
    }//GEN-LAST:event_mn_kelas2ActionPerformed

    private void mn_laporan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_laporan1ActionPerformed
        try {
        String reportPath = "src/Laporan/Siswa.jasper";
        Connection conn = getConnection();
        
        HashMap<String, Object> parameters = new HashMap<>();
        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi error : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_mn_laporan1ActionPerformed

    private void mn_laporan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_laporan2ActionPerformed
        try {
        String reportPath = "src/Laporan/Kelas.jasper";
        Connection conn = getConnection();
        
        HashMap<String, Object> parameters = new HashMap<>();
        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi error : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_mn_laporan2ActionPerformed

    private void mn_laporan3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_laporan3ActionPerformed
        try {
        String reportPath = "src/Laporan/Jurusan.jasper";
        Connection conn = getConnection();
        
        HashMap<String, Object> parameters = new HashMap<>();
        JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
        JasperViewer viewer = new JasperViewer(print, false);
        viewer.setVisible(true);
       }catch(Exception e) {
        JOptionPane.showMessageDialog(this, "Terjadi error : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_mn_laporan3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JMenuItem mn_dsiswa;
    private javax.swing.JMenuItem mn_exit;
    private javax.swing.JMenuItem mn_kelas;
    private javax.swing.JMenuItem mn_kelas1;
    private javax.swing.JMenuItem mn_kelas2;
    private javax.swing.JMenuItem mn_laporan;
    private javax.swing.JMenuItem mn_laporan1;
    private javax.swing.JMenuItem mn_laporan2;
    private javax.swing.JMenuItem mn_laporan3;
    private javax.swing.JMenuItem mn_tahun;
    private javax.swing.JMenu mn_tahuna;
    private javax.swing.JMenuItem mn_transaksi;
    // End of variables declaration//GEN-END:variables
}
