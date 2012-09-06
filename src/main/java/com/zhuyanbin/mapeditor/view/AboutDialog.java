/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhuyanbin.mapeditor.view;

import com.zhuyanbin.mapeditor.Version;

/**
 *
 * @author flavor
 */
public class AboutDialog extends javax.swing.JDialog {
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form AboutDialog
     */
    public AboutDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        initInfo();
    }
    
    private void initInfo()
    {
        lbVersion.setText("版本:"+Version.VERSION);
        lbAuthor.setText("作者:"+Version.AUTHOR);
        lbTime.setText("时间:"+Version.DATE_TIME);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        btClose = new javax.swing.JButton();
        lbVersion = new javax.swing.JLabel();
        lbAuthor = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("关于MapEditor");
        setAlwaysOnTop(true);

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbTitle.setText("MapEditor");

        btClose.setText("关闭");

        lbVersion.setText("版本:");

        lbAuthor.setText("作者:");

        lbTime.setText("时间:");

        lbInfo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbInfo.setText("版权所有 侵权必究");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(110, 110, 110)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lbTitle)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lbTime)
                                    .add(lbAuthor)
                                    .add(lbVersion))
                                .add(56, 56, 56))))
                    .add(layout.createSequentialGroup()
                        .add(120, 120, 120)
                        .add(btClose))
                    .add(layout.createSequentialGroup()
                        .add(63, 63, 63)
                        .add(lbInfo)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(18, 18, 18)
                .add(lbTitle)
                .add(34, 34, 34)
                .add(lbVersion)
                .add(18, 18, 18)
                .add(lbAuthor)
                .add(18, 18, 18)
                .add(lbTime)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(lbInfo)
                .add(28, 28, 28)
                .add(btClose)
                .add(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JLabel lbAuthor;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbVersion;
    // End of variables declaration//GEN-END:variables
}