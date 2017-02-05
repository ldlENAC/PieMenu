/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.masterihm.component;

import fr.masterihm.component.piemenu.menu.JPieMenu;
import fr.masterihm.component.piemenu.menu.JPieMenuItem;
import fr.masterihm.component.piemenu.menu.TooManyItemsException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/**
 *
 * @author Geekette
 */
public class DemoFrame extends javax.swing.JFrame {

    private final static String YWG = "Winnipeg James Armstrong Richardson International Airport";
    private final static String YUL = "Montréal–Pierre Elliott Trudeau International Airport";
    private final static String LHR = "Heathrow Airport";
    private final static String ARL = "Stockholm Arlanda Airport";

    private JPieMenu pieMenu;
    private JPieMenuItem winnipegMenuItem;
    private JPieMenuItem montrealMenuItem;
    private JPieMenuItem londonMenuItem;
    private JPieMenuItem stockholmMenuItem;
    
    private ZoneId zoneId;
    
    private Timer timer;

    /**
     * Creates new form DemoFrame
     */
    public DemoFrame() {
        initComponents();        
        try {
            pieMenu = new JPieMenu();
            winnipegMenuItem = new JPieMenuItem("YWG");
            winnipegMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("CST", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(YWG);
                }
            });

            pieMenu.addPieMenuItem(winnipegMenuItem);

            montrealMenuItem = new JPieMenuItem("YUL");
            montrealMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("EST", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(YUL);
                }
            });
            pieMenu.addPieMenuItem(montrealMenuItem);
            londonMenuItem = new JPieMenuItem("LHR");
            londonMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("GMT", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(LHR);
                }
            });
            pieMenu.addPieMenuItem(londonMenuItem);
            stockholmMenuItem = new JPieMenuItem("ARL");
            stockholmMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("ECT", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(ARL);
                }
            });
            pieMenu.addPieMenuItem(stockholmMenuItem);            
        } catch (TooManyItemsException ex) {
            Logger.getLogger(DemoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        });
        init();
    }

    private void init(){
        zoneId = ZoneId.of("ECT", ZoneId.SHORT_IDS);
        airportName.setText(ARL);
        timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        timer.start();        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        airportTimePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        airportName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        airportTimePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                airportTimePanelMouseClicked(evt);
            }
        });

        jLabel1.setText("Right click in this window to select the displayed airport");

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        timeLabel.setText("00:00:00");

        airportName.setText("Airport Name");

        javax.swing.GroupLayout airportTimePanelLayout = new javax.swing.GroupLayout(airportTimePanel);
        airportTimePanel.setLayout(airportTimePanelLayout);
        airportTimePanelLayout.setHorizontalGroup(
            airportTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(airportTimePanelLayout.createSequentialGroup()
                .addGroup(airportTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(airportTimePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(airportName))
                    .addGroup(airportTimePanelLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(airportTimePanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(timeLabel)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        airportTimePanelLayout.setVerticalGroup(
            airportTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(airportTimePanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(airportName)
                .addGap(8, 8, 8)
                .addComponent(timeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jTabbedPane1.addTab("Airport time", airportTimePanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void airportTimePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_airportTimePanelMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            pieMenu.show(this, evt.getXOnScreen(), evt.getYOnScreen());
        }else if(evt.getButton() == MouseEvent.BUTTON1){
            pieMenu.hide();
        }
    }//GEN-LAST:event_airportTimePanelMouseClicked

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
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel airportName;
    private javax.swing.JPanel airportTimePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
