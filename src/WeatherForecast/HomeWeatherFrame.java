/*
 * Sapayth Hossain
 */
package WeatherForecast;

import java.awt.event.KeyEvent;


/**
 *
 * @author sapaythhossain
 */
public class HomeWeatherFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeJFrame
     */
    public HomeWeatherFrame() {
        initComponents();
        setLocationRelativeTo(this);
    }

    // fetching weather info
    private void getCurrentWeather() {
        lblTodayW.setText( 
                FetchWeatherInfo.fetchCurrent(
                        TFlocation.getText(), lblWarning, lblDescription) );
    }
    
    // fetching weather info
    private void getMinWeather() {
        //lblMinW.setText( FetchWeatherInfo.fetchMinimum(TFlocation.getText(), lblWarning) );
    }
    
    // display all the info
    private void showWeather() {
        lblTodayC.setText("°C");
        lblToday.setText("NOW");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFG = new javax.swing.JPanel();
        TFlocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnShowInfo = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        lblTodayW = new javax.swing.JLabel();
        lblTodayC = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblToday = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelBG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TFlocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFlocationKeyPressed(evt);
            }
        });
        PanelFG.add(TFlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 90, -1));

        jLabel4.setText("Location");
        PanelFG.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        btnShowInfo.setBackground(new java.awt.Color(51, 51, 51));
        btnShowInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnShowInfo.setText("Show");
        btnShowInfo.setBorder(null);
        btnShowInfo.setBorderPainted(false);
        btnShowInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnShowInfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShowInfo.setPreferredSize(new java.awt.Dimension(90, 30));
        btnShowInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInfoActionPerformed(evt);
            }
        });
        PanelFG.add(btnShowInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, 30));

        lblWarning.setForeground(new java.awt.Color(255, 51, 51));
        lblWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelFG.add(lblWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 20));

        lblTodayW.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        lblTodayW.setForeground(new java.awt.Color(102, 102, 102));
        lblTodayW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelFG.add(lblTodayW, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        lblTodayC.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblTodayC.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblTodayC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        lblDescription.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblDescription.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        lblToday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblToday.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/sapaythhossain/NetBeansProjects/WeatherForecast/images/gradient-tumblr-wallpaper-4.jpg")); // NOI18N
        PanelFG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 150));

        getContentPane().add(PanelFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 150));

        PanelBG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Weather");
        PanelBG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel15.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Forecast");
        PanelBG.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sapaythhossain/NetBeansProjects/WeatherForecast/images/Huawei-Mate-9-Walls-7-1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        PanelBG.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 450));

        getContentPane().add(PanelBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 3, 750, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInfoActionPerformed
        getCurrentWeather();
        showWeather();
    }//GEN-LAST:event_btnShowInfoActionPerformed

    private void TFlocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFlocationKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
                getCurrentWeather();
                showWeather();
            }
    }//GEN-LAST:event_TFlocationKeyPressed

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
            java.util.logging.Logger.getLogger(HomeWeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeWeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeWeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeWeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeWeatherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBG;
    private javax.swing.JPanel PanelFG;
    private javax.swing.JTextField TFlocation;
    private javax.swing.JButton btnShowInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblToday;
    private javax.swing.JLabel lblTodayC;
    private javax.swing.JLabel lblTodayW;
    private javax.swing.JLabel lblWarning;
    // End of variables declaration//GEN-END:variables
}