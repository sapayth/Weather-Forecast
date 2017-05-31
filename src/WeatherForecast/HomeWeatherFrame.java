/*
 * Sapayth Hossain
 */
package WeatherDB;

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
    }

    // fetching weather info
    private void getCurrentWeather() {
        lblTodayW.setText( 
                FetchWeatherInfo.fetchCurrent(
                        TFlocation.getText(), lblWarning, lblMinW, lblMaxW) );
    }
    
    // fetching weather info
    private void getMinWeather() {
        //lblMinW.setText( FetchWeatherInfo.fetchMinimum(TFlocation.getText(), lblWarning) );
    }
    
    // display all the info
    private void showWeather() {
        lblTodayC.setText("°C");
        lblToday.setText("TODAY");
        lblMin.setText("Min");
        lblMax.setText("Max");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFG = new javax.swing.JPanel();
        lblSaturday = new javax.swing.JLabel();
        lblSunday = new javax.swing.JLabel();
        lblMonday = new javax.swing.JLabel();
        lblTuesday = new javax.swing.JLabel();
        lblWednesday = new javax.swing.JLabel();
        lblThursday = new javax.swing.JLabel();
        lblFriday = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTodayW = new javax.swing.JLabel();
        lblTodayC = new javax.swing.JLabel();
        lblToday = new javax.swing.JLabel();
        lblSatW = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblSunW = new javax.swing.JLabel();
        lblMonW = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTueW = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblFriW = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblWedW = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblThuW = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TFlocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnShowInfo = new javax.swing.JButton();
        lblWarning = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMax = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblMaxW = new javax.swing.JLabel();
        lblMinW = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PanelBG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaturday.setBackground(new java.awt.Color(204, 204, 204));
        lblSaturday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblSaturday.setForeground(new java.awt.Color(102, 102, 102));
        lblSaturday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaturday.setText("SAT");
        PanelFG.add(lblSaturday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        lblSunday.setBackground(new java.awt.Color(204, 204, 204));
        lblSunday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblSunday.setForeground(new java.awt.Color(102, 102, 102));
        lblSunday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSunday.setText("SUN");
        PanelFG.add(lblSunday, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        lblMonday.setBackground(new java.awt.Color(204, 204, 204));
        lblMonday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblMonday.setForeground(new java.awt.Color(102, 102, 102));
        lblMonday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMonday.setText("MON");
        PanelFG.add(lblMonday, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        lblTuesday.setBackground(new java.awt.Color(204, 204, 204));
        lblTuesday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblTuesday.setForeground(new java.awt.Color(102, 102, 102));
        lblTuesday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTuesday.setText("TUE");
        PanelFG.add(lblTuesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        lblWednesday.setBackground(new java.awt.Color(204, 204, 204));
        lblWednesday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblWednesday.setForeground(new java.awt.Color(102, 102, 102));
        lblWednesday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWednesday.setText("WED");
        PanelFG.add(lblWednesday, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        lblThursday.setBackground(new java.awt.Color(204, 204, 204));
        lblThursday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblThursday.setForeground(new java.awt.Color(102, 102, 102));
        lblThursday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThursday.setText("THU");
        PanelFG.add(lblThursday, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        lblFriday.setBackground(new java.awt.Color(204, 204, 204));
        lblFriday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblFriday.setForeground(new java.awt.Color(102, 102, 102));
        lblFriday.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFriday.setText("FRI");
        PanelFG.add(lblFriday, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("°C");
        PanelFG.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 10, -1));

        lblTodayW.setFont(new java.awt.Font("Open Sans", 1, 48)); // NOI18N
        lblTodayW.setForeground(new java.awt.Color(102, 102, 102));
        lblTodayW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelFG.add(lblTodayW, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        lblTodayC.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblTodayC.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblTodayC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));

        lblToday.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblToday.setForeground(new java.awt.Color(102, 102, 102));
        lblToday.setText("TODAY");
        PanelFG.add(lblToday, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        lblSatW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblSatW.setForeground(new java.awt.Color(102, 102, 102));
        lblSatW.setText("32");
        PanelFG.add(lblSatW, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, -1, -1));

        jLabel17.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("°C");
        PanelFG.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 10, -1));

        lblSunW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblSunW.setForeground(new java.awt.Color(102, 102, 102));
        lblSunW.setText("32");
        PanelFG.add(lblSunW, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        lblMonW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblMonW.setForeground(new java.awt.Color(102, 102, 102));
        lblMonW.setText("32");
        PanelFG.add(lblMonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel20.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("°C");
        PanelFG.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 10, -1));

        lblTueW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblTueW.setForeground(new java.awt.Color(102, 102, 102));
        lblTueW.setText("32");
        PanelFG.add(lblTueW, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel22.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("°C");
        PanelFG.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 10, -1));

        lblFriW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblFriW.setForeground(new java.awt.Color(102, 102, 102));
        lblFriW.setText("32");
        PanelFG.add(lblFriW, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jLabel24.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(102, 102, 102));
        jLabel24.setText("°C");
        PanelFG.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 10, -1));

        lblWedW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblWedW.setForeground(new java.awt.Color(102, 102, 102));
        lblWedW.setText("32");
        PanelFG.add(lblWedW, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel26.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setText("°C");
        PanelFG.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 10, -1));

        lblThuW.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblThuW.setForeground(new java.awt.Color(102, 102, 102));
        lblThuW.setText("32");
        PanelFG.add(lblThuW, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        jLabel28.setFont(new java.awt.Font("Open Sans", 0, 10)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("°C");
        PanelFG.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, 10, -1));

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

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(50, 100));
        PanelFG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 3, 50));

        lblMax.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblMax.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lblMin.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblMin.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        lblMaxW.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblMaxW.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblMaxW, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        lblMinW.setFont(new java.awt.Font("Open Sans", 1, 13)); // NOI18N
        lblMinW.setForeground(new java.awt.Color(102, 102, 102));
        PanelFG.add(lblMinW, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/sapaythhossain/NetBeansProjects/WeatherDB/images/gradient-tumblr-wallpaper-4.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        PanelFG.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 170));

        getContentPane().add(PanelFG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 750, 150));

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
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/sapaythhossain/NetBeansProjects/WeatherDB/images/Huawei-Mate-9-Walls-7-1.jpg")); // NOI18N
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFriW;
    private javax.swing.JLabel lblFriday;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMaxW;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblMinW;
    private javax.swing.JLabel lblMonW;
    private javax.swing.JLabel lblMonday;
    private javax.swing.JLabel lblSatW;
    private javax.swing.JLabel lblSaturday;
    private javax.swing.JLabel lblSunW;
    private javax.swing.JLabel lblSunday;
    private javax.swing.JLabel lblThuW;
    private javax.swing.JLabel lblThursday;
    private javax.swing.JLabel lblToday;
    private javax.swing.JLabel lblTodayC;
    private javax.swing.JLabel lblTodayW;
    private javax.swing.JLabel lblTueW;
    private javax.swing.JLabel lblTuesday;
    private javax.swing.JLabel lblWarning;
    private javax.swing.JLabel lblWedW;
    private javax.swing.JLabel lblWednesday;
    // End of variables declaration//GEN-END:variables
}