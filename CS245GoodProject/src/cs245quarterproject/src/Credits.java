/**
 * *************************************************************
 * file: Credits.java 
 * author: Diaz Disciples (Group name)
 * class: Computer Programming
 * Graphical User Interfaces - CS245
 * purpose: Defines the Credits screen
 * **************************************************************
 *
 */
package cs245quarterproject.src;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/*
 */
public class Credits extends javax.swing.JPanel {
    public Credits() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        creditText = new javax.swing.JLabel();
        one = new javax.swing.JLabel();
        two = new javax.swing.JLabel();
        three = new javax.swing.JLabel();
        four = new javax.swing.JLabel();
        five = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setText("Back");
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setPreferredSize(new java.awt.Dimension(85, 25));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 110, 40));

        creditText.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        creditText.setForeground(new java.awt.Color(204, 0, 51));
        creditText.setText("CREDITS");
        add(creditText, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        one.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        one.setText("Tomik Aghajanian, #011353849");
        add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        two.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        two.setText("Christian Munoz, #010817014");
        add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        three.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        three.setText("Emanuel Juarez, #009631258");
        add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        four.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        four.setText("David Chang, #009074689");
        add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        five.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        five.setText("Fabian Flores, #010913838");
        add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        ///Remove current JPanel and add new one
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.getContentPane().removeAll();
        frame.repaint();
        
        Menu main = new Menu();
        frame.add(main);
        frame.setVisible(true);
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel creditText;
    private javax.swing.JLabel five;
    private javax.swing.JLabel four;
    private javax.swing.JLabel one;
    private javax.swing.JLabel three;
    private javax.swing.JLabel two;
    // End of variables declaration//GEN-END:variables
}
