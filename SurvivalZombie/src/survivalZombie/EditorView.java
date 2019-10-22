/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survivalZombie;

import javax.swing.JButton;
import model.ImagesDB;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author Jose Suresh
 */
public class EditorView extends javax.swing.JFrame {

    /**
     * Creates new form EditorView
     */
    private final ImagesDB image;

    public EditorView() {
        initComponents();
        image = new ImagesDB();
        skin1.setPath(image.getImage(1));
        skin2.setPath(image.getImage(6));
        /**
         * Background
         * -----------------------------------------------------------
         */
        ImageIcon backgrnd = new ImageIcon(image.getImage(7).toString());
        bgrnd = new JLabel("", backgrnd, JLabel.CENTER);
        bgrnd.setBounds(0, 0, getWidth(), getHeight());

        //------------------------------------------------------------
        vel2.setSelected(true);
        skinRadio1.setSelected(true);
        skin1.setOpaque(false);
        skin2.setOpaque(false);
        vel1.setOpaque(false);
        vel2.setOpaque(false);
        vel3.setOpaque(false);
        skinRadio1.setOpaque(false);
        skinRadio2.setOpaque(false);
        add(bgrnd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        skin1 = new jComponents.JPlayer();
        skin2 = new jComponents.JPlayer();
        skinRadio1 = new javax.swing.JRadioButton();
        skinRadio2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vel1 = new javax.swing.JCheckBox();
        vel2 = new javax.swing.JCheckBox();
        vel3 = new javax.swing.JCheckBox();
        startBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        bgrnd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(568, 568));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("SURVIVAL ZOMBIE");

        skin1.setBackground(new java.awt.Color(255, 102, 204));

        javax.swing.GroupLayout skin1Layout = new javax.swing.GroupLayout(skin1);
        skin1.setLayout(skin1Layout);
        skin1Layout.setHorizontalGroup(
            skin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        skin1Layout.setVerticalGroup(
            skin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        skin2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout skin2Layout = new javax.swing.GroupLayout(skin2);
        skin2.setLayout(skin2Layout);
        skin2Layout.setHorizontalGroup(
            skin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        skin2Layout.setVerticalGroup(
            skin2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        skinRadio1.setForeground(new java.awt.Color(255, 255, 255));
        skinRadio1.setText("skin1");

        skinRadio2.setForeground(new java.awt.Color(255, 255, 255));
        skinRadio2.setText("skin2");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SKIN");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MOVEMENT SPEED");

        vel1.setForeground(new java.awt.Color(255, 255, 255));
        vel1.setText("Fast");

        vel2.setForeground(new java.awt.Color(255, 255, 255));
        vel2.setText("Medium");

        vel3.setForeground(new java.awt.Color(255, 255, 255));
        vel3.setText("Slow");

        startBtn.setForeground(new java.awt.Color(0, 0, 0));
        startBtn.setText("START");
        startBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exitBtn.setForeground(new java.awt.Color(0, 0, 0));
        exitBtn.setText("EXIT");
        exitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(skin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(startBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(vel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(vel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(vel3))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(skinRadio1)
                                .addGap(114, 114, 114)
                                .addComponent(skin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(skinRadio2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgrnd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(skinRadio1))
                            .addComponent(skin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(75, 75, 75)
                        .addComponent(skinRadio2)))
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vel1)
                    .addComponent(vel2)
                    .addComponent(vel3))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startBtn)
                    .addComponent(exitBtn))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgrnd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private jComponents.JPlayer skin1;
    private jComponents.JPlayer skin2;
    private javax.swing.JRadioButton skinRadio1;
    private javax.swing.JRadioButton skinRadio2;
    private javax.swing.JButton startBtn;
    private javax.swing.JCheckBox vel1;
    private javax.swing.JCheckBox vel2;
    private javax.swing.JCheckBox vel3;
    // End of variables declaration//GEN-END:variables

    public JButton getExitBtn() {
        return exitBtn;
    }

    public JButton getStartBtn() {
        return startBtn;
    }

    public JRadioButton getSkinRadio1() {
        return skinRadio1;
    }

    public JRadioButton getSkinRadio2() {
        return skinRadio2;
    }

    public void setGroupRadioSkin(boolean radio) {

        if (radio) {
            skinRadio1.setSelected(false);
        } else {
            skinRadio2.setSelected(false);
        }

    }

    public void setGroupCheckBoxVel(int check) {
        switch (check) {
            case 1:
                vel1.setSelected(false);
                break;
            case 2:
                vel2.setSelected(false);
                break;
            case 3:
                vel3.setSelected(false);
                break;
        }
    }

    public JCheckBox getVel1() {
        return vel1;
    }

    public JCheckBox getVel2() {
        return vel2;
    }

    public JCheckBox getVel3() {
        return vel3;
    }

}
