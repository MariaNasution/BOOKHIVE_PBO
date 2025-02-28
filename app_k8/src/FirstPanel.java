
import com.formdev.flatlaf.FlatIntelliJLaf;
import javax.swing.UIManager;
import repository.MyBookRepository;
import repository.MyBookRepositoryImpl;
import service.MyBookService;
import service.MyBookServiceImpl;
import ui.AppFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MARIA
 */
public class FirstPanel extends javax.swing.JFrame {

    private MyBookService myBookService;

    /**
     * Creates new form FirstPanel
     */
    public FirstPanel() {
        initComponents();
    }
    
    public void setMyBookService(MyBookService myBookService) {
       
    this.myBookService = myBookService;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btnStart4 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Your personalized digital bookshelf for endless literary adventures.");

        btnStart4.setBackground(new java.awt.Color(255, 153, 102));
        btnStart4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnStart4.setForeground(new java.awt.Color(255, 255, 255));
        btnStart4.setText("Get Started!");
        btnStart4.setBorderPainted(false);
        btnStart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("YouYuan", 1, 70)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 102));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/honeycomb.png"))); // NOI18N
        jLabel12.setText("BookHive");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel12)
                .addGap(0, 147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnStart4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btnStart4)
                .addGap(258, 258, 258))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnStart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart4ActionPerformed
        try {
            
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            System.out.println("Gagal mengubah desain tampilan");
        }
        
       
        MyBookRepository myBookRepository = new MyBookRepositoryImpl();

        MyBookService myBookService = new MyBookServiceImpl(myBookRepository);

        AppFrame app = new AppFrame();

        app.setMyBookService(myBookService);

        app.setVisible(true);
        

 this.dispose();
    }//GEN-LAST:event_btnStart4ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    // End of variables declaration//GEN-END:variables

    
}
