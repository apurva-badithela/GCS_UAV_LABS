/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameAbout.java
 *
 * Created on Aug 19, 2009, 5:28:35 PM
 */

package gui.app;

/**
 *
 * @author David Escobar Sanabria
 */
public class FrameAbout extends javax.swing.JFrame {

    /** Creates new form FrameAbout */
    public FrameAbout() {
        initComponents();
        setVisible(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setTitle("About");
        setBackground(new java.awt.Color(169, 176, 209));
        setForeground(new java.awt.Color(254, 254, 254));
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(169, 176, 209));
        jScrollPane1.setForeground(new java.awt.Color(254, 254, 254));

        jTextArea1.setBackground(new java.awt.Color(169, 176, 209));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(254, 254, 254));
        jTextArea1.setRows(5);
        jTextArea1.setText("OpenUGS UAV Ground station software\n\nThe .MAT export function is based on the JMatIO library:\nhttp://www.mathworks.com/matlabcentral/fileexchange/10759\n\nLicense: GPL V 3.0.\n\nAuthor: David Escobar Sanabria and Christian Dernehl\n\tUAV research group.\n\tAerospace Engineering\n\tand Mechanics\n\tUniversity of Minnesota\t\n\nE-mail: descobar@aem.umn.edu\n\tdavidescobars@gmail.com \n\nWeb site: \nhttp://www.aem.umn.edu/~uav/");
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
