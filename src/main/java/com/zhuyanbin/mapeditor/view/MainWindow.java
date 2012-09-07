/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.view;

import com.zhuyanbin.mapeditor.NotiConst;
import org.puremvc.java.patterns.facade.Facade;
import org.puremvc.java.patterns.observer.Notification;

/**
 *
 * @author flavor
 */
public class MainWindow extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() 
    {
        initComponents();
        setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPenGroup = new javax.swing.ButtonGroup();
        btOpenImage = new javax.swing.JButton();
        btLoadMap = new javax.swing.JButton();
        btLoadMonsterData = new javax.swing.JButton();
        cbMaskType = new javax.swing.JComboBox();
        cbShowGrid = new javax.swing.JCheckBox();
        btClear = new javax.swing.JButton();
        btSaveMap = new javax.swing.JButton();
        btSaveMonsterData = new javax.swing.JButton();
        btExportServerMapData = new javax.swing.JButton();
        btSystemSetting = new javax.swing.JButton();
        btAbout = new javax.swing.JButton();
        lbRealLocation = new javax.swing.JLabel();
        lbX = new javax.swing.JLabel();
        tfX = new javax.swing.JTextField();
        lbY = new javax.swing.JLabel();
        tfY = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lbPX = new javax.swing.JLabel();
        tfPX = new javax.swing.JTextField();
        lbPY = new javax.swing.JLabel();
        tfPY = new javax.swing.JTextField();
        btLockLocation = new javax.swing.JButton();
        lbLayer = new javax.swing.JLabel();
        cbBaseLayer = new javax.swing.JCheckBox();
        cbMonsterLayer = new javax.swing.JCheckBox();
        lbPenSize = new javax.swing.JLabel();
        sPenSize = new javax.swing.JSlider();
        rbPen = new javax.swing.JRadioButton();
        rbEarse = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        bgPenGroup.add(rbPen);
        bgPenGroup.add(rbEarse);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btOpenImage.setText("打开图片");

        btLoadMap.setText("载入地图");

        btLoadMonsterData.setText("载入怪物数据");

        cbMaskType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "不可走动-1", "透明区域-2", "怪物区域1-10", "怪物区域2-20", "怪物区域3-40" }));

        cbShowGrid.setText("显示网格");
        cbShowGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowGridActionPerformed(evt);
            }
        });

        btClear.setText("清除");

        btSaveMap.setText("保存地图");

        btSaveMonsterData.setText("保存怪物数据");

        btExportServerMapData.setText("导出服务器地图");

        btSystemSetting.setText("系统配置");

        btAbout.setText("关于");
        btAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAboutActionPerformed(evt);
            }
        });

        lbRealLocation.setText("真实坐标");

        lbX.setText("X:");

        tfX.setEditable(false);

        lbY.setText("Y:");

        tfY.setEditable(false);

        jLabel1.setText("路径坐标");

        lbPX.setText("X:");

        tfPX.setEditable(false);

        lbPY.setText("Y:");

        tfPY.setEditable(false);

        btLockLocation.setText("锁定坐标");

        lbLayer.setText("图层");

        cbBaseLayer.setText("基本图层");

        cbMonsterLayer.setText("怪物图层");

        lbPenSize.setText("画笔大小");

        rbPen.setSelected(true);
        rbPen.setText("画笔");

        rbEarse.setText("橡皮");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(btOpenImage)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btLoadMap)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btLoadMonsterData)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbMaskType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(cbShowGrid)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btClear)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btSaveMap)
                        .add(18, 18, 18)
                        .add(btSaveMonsterData)
                        .add(18, 18, 18)
                        .add(btExportServerMapData)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(btSystemSetting)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btAbout))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lbRealLocation)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(sPenSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(rbPen)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(rbEarse))
                                    .add(btLockLocation)
                                    .add(lbLayer)
                                    .add(cbBaseLayer)
                                    .add(cbMonsterLayer)
                                    .add(lbPenSize)
                                    .add(layout.createSequentialGroup()
                                        .add(lbX)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tfX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(lbY)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tfY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jLabel1)
                                    .add(layout.createSequentialGroup()
                                        .add(lbPX)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tfPX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(lbPY)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(tfPY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jScrollPane1)))))
                .add(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btOpenImage)
                    .add(btLoadMap)
                    .add(btLoadMonsterData)
                    .add(cbMaskType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cbShowGrid)
                    .add(btClear)
                    .add(btSaveMap)
                    .add(btSaveMonsterData)
                    .add(btExportServerMapData)
                    .add(btSystemSetting)
                    .add(btAbout))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lbRealLocation)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbX)
                            .add(tfX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbY)
                            .add(tfY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lbPX)
                            .add(tfPX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lbPY)
                            .add(tfPY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(22, 22, 22)
                        .add(btLockLocation)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lbLayer)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbBaseLayer)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cbMonsterLayer)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lbPenSize)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(sPenSize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(rbPen)
                            .add(rbEarse))
                        .add(0, 296, Short.MAX_VALUE))
                    .add(jScrollPane1))
                .addContainerGap())
        );

        btOpenImage.getAccessibleContext().setAccessibleName("btOpenImage");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbShowGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowGridActionPerformed
    }//GEN-LAST:event_cbShowGridActionPerformed

    private void btAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAboutActionPerformed
        Facade.getInstance().notifyObservers(new Notification(NotiConst.S_COMMAND_ABOUTME_OPEN, this));
    }//GEN-LAST:event_btAboutActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPenGroup;
    private javax.swing.JButton btAbout;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btExportServerMapData;
    private javax.swing.JButton btLoadMap;
    private javax.swing.JButton btLoadMonsterData;
    private javax.swing.JButton btLockLocation;
    private javax.swing.JButton btOpenImage;
    private javax.swing.JButton btSaveMap;
    private javax.swing.JButton btSaveMonsterData;
    private javax.swing.JButton btSystemSetting;
    private javax.swing.JCheckBox cbBaseLayer;
    private javax.swing.JComboBox cbMaskType;
    private javax.swing.JCheckBox cbMonsterLayer;
    private javax.swing.JCheckBox cbShowGrid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLayer;
    private javax.swing.JLabel lbPX;
    private javax.swing.JLabel lbPY;
    private javax.swing.JLabel lbPenSize;
    private javax.swing.JLabel lbRealLocation;
    private javax.swing.JLabel lbX;
    private javax.swing.JLabel lbY;
    private javax.swing.JRadioButton rbEarse;
    private javax.swing.JRadioButton rbPen;
    private javax.swing.JSlider sPenSize;
    private javax.swing.JTextField tfPX;
    private javax.swing.JTextField tfPY;
    private javax.swing.JTextField tfX;
    private javax.swing.JTextField tfY;
    // End of variables declaration//GEN-END:variables
}
