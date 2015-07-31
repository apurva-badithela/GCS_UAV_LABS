/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PanelKML.java
 *
 * Created on Nov 23, 2009, 2:13:02 PM
 */

package gui.app;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author david
 */
public class PanelKML extends javax.swing.JPanel {

    /** Creates new form PanelKML */
    public PanelApp parent;
    public PanelKML() {
        initComponents();
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        textBrowse = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textPeriod = new javax.swing.JTextField();

        setBackground(new java.awt.Color(254, 254, 254));

        checkBox1.setBackground(new java.awt.Color(254, 254, 254));
        checkBox1.setText("Export data");
        checkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(73, 68, 103));
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Refresh period (s):");

        textPeriod.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBox1)
                    .addComponent(textPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       browse();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox1ActionPerformed

        // TODO add your handling code here:
        if(checkBox1.isSelected()){
            
            int period =2;
            try{
                period=Integer.parseInt(textPeriod.getText());
                parent.setKMLPath(new File(textBrowse.getText()),period);
            }
            catch(Exception e){
                parent.joutln("The period is not valid", true);
            }
            

        }
        else{
            parent.kmlStop();
        }

    }//GEN-LAST:event_checkBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField textBrowse;
    private javax.swing.JTextField textPeriod;
    // End of variables declaration//GEN-END:variables

    private void browse() {
        JFileChooser fileChooser=new JFileChooser();
        //fileChooser.setVisible(true);
        //fileChooser.addChoosableFileFilter(new MatFilter());
        int returnVal = fileChooser.showDialog(this,"Set file");
        File file =fileChooser.getSelectedFile();
        if(file!=null){
             //joutln("Saving data, please wait");
             textBrowse.setText(file.getAbsolutePath());            

             if(checkBox1.isSelected()){
                 int period =2;
                try{
                    period=Integer.parseInt(textPeriod.getText());
                    parent.setKMLPath(new File(textBrowse.getText()),period);
                }
                catch(Exception e){
                    parent.joutln("The period is not valid", true);
                }
                
             }

        }
        


    }

    void setParent(PanelApp _parent) {
        parent =_parent;

    }

}