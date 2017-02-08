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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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

    private JPieMenu pieMenuClock;
    private JPieMenuItem winnipegMenuItem;
    private JPieMenuItem montrealMenuItem;
    private JPieMenuItem londonMenuItem;
    private JPieMenuItem stockholmMenuItem;
    
    private JPieMenu pieMenuTimer;
    private JPieMenuItem startMenuItem;
    private JPieMenuItem stopMenuItem;
    private JPieMenuItem resetMenuItem;
    
    private enum StatesTimer  {
        IDLE, COUNTING
    };
    
    private StatesTimer stateTimer;
    
    private Timer timerTimer;
    private int timerValue;
    
    
    private ZoneId zoneId;
    
    private Timer timerClock;

    /**
     * Creates new form DemoFrame
     */
    public DemoFrame() {
        initComponents();        
        try {
            pieMenuClock = new JPieMenu();
            winnipegMenuItem = new JPieMenuItem("YWG");
            winnipegMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("CST", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(YWG);
                }
            });

            pieMenuClock.addPieMenuItem(winnipegMenuItem);

            montrealMenuItem = new JPieMenuItem("YUL");
            montrealMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("EST", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(YUL);
                }
            });
            pieMenuClock.addPieMenuItem(montrealMenuItem);
            londonMenuItem = new JPieMenuItem("LHR");
            londonMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("GMT", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(LHR);
                }
            });
            pieMenuClock.addPieMenuItem(londonMenuItem);
            stockholmMenuItem = new JPieMenuItem("ARL");
            stockholmMenuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    zoneId = ZoneId.of("ECT", ZoneId.SHORT_IDS);
                    timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                    airportName.setText(ARL);
                }
            });
            pieMenuClock.addPieMenuItem(stockholmMenuItem);            
        } catch (TooManyItemsException ex) {
            Logger.getLogger(DemoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        timerClock = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            }
        });
        
        
        timerValue = 0;
        stateTimer = StatesTimer.IDLE;
        timerTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                switch (stateTimer){
                    case IDLE:
                        //forbidden
                        break;
                    case COUNTING:
                        timerValue++;
                        counterLabel.setText(stringTimer(timerValue));
                        //counterLabel.setText(stringTimer(timerValue));
                        break;
                }
            }
        });
        
        try {
        pieMenuTimer = new JPieMenu();
        startMenuItem = new JPieMenuItem("START");
        startMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (stateTimer){
                    case IDLE:
                        stateTimer = StatesTimer.COUNTING;
                        timerTimer.start();
                        break;
                    case COUNTING:
                        break;                    
                }
            }
        });
        pieMenuTimer.addPieMenuItem(startMenuItem);
        
        stopMenuItem = new JPieMenuItem("STOP");
        stopMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (stateTimer){
                    case IDLE:
                        break;
                    case COUNTING:
                        stateTimer = StatesTimer.IDLE;
                        timerTimer.stop();
                        break;
                }
            }
        });
        pieMenuTimer.addPieMenuItem(stopMenuItem);
        
        resetMenuItem = new JPieMenuItem("RESET");
        resetMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (stateTimer){
                    case IDLE:
                        stateTimer = StatesTimer.IDLE;
                        timerTimer.stop();
                        timerValue = 0;
                        counterLabel.setText(stringTimer(timerValue));
                        break;
                    case COUNTING:
                        stateTimer = StatesTimer.COUNTING;
                        timerValue = 0;
                        counterLabel.setText(stringTimer(timerValue));
                        break;
                }
            }
        });
        pieMenuTimer.addPieMenuItem(resetMenuItem);
        
        } catch (TooManyItemsException ex){
            Logger.getLogger(DemoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        init();
    }
    
    private String stringTimer(int value){
        Date date = new Date();
        date.setTime(timerValue*10);
        String result = new SimpleDateFormat("mm:ss:SS").format(date);
        return result;
    }

    private void init(){
        zoneId = ZoneId.of("ECT", ZoneId.SHORT_IDS);
        airportName.setText(ARL);
        timeLabel.setText(LocalTime.now(zoneId).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        timerClock.start();  
        counterLabel.setText(stringTimer(timerValue));
        
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
        counterLabel = new javax.swing.JLabel();

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

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        counterLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        counterLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(counterLabel)
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(counterLabel)
                .addGap(113, 113, 113))
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void airportTimePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_airportTimePanelMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            pieMenuClock.show(this, evt.getXOnScreen(), evt.getYOnScreen());
        }else if(evt.getButton() == MouseEvent.BUTTON1){
            pieMenuClock.hide();
        }
    }//GEN-LAST:event_airportTimePanelMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            pieMenuTimer.show(this, evt.getXOnScreen(), evt.getYOnScreen());
        }else if(evt.getButton() == MouseEvent.BUTTON1){
            pieMenuTimer.hide();
        }
    }//GEN-LAST:event_jPanel2MouseClicked

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
    private javax.swing.JLabel counterLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel timeLabel;
    // End of variables declaration//GEN-END:variables
}
