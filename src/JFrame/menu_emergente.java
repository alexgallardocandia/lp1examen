/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

/**
 *
 * @author Alex
 */
import Login.menu_secundario;
import java.awt.*;
import Login.*;
import javax.swing.ImageIcon;
public class menu_emergente extends javax.swing.JFrame {

    /**
     * Creates new form menu_emergente
     */
    public menu_emergente() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/login.jpg")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        menuRojo = new javax.swing.JMenuItem();
        menuVerde = new javax.swing.JMenuItem();
        menuAzul = new javax.swing.JMenuItem();
        btnVolver = new javax.swing.JButton();

        menuRojo.setText("Rojo");
        menuRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRojoActionPerformed(evt);
            }
        });
        menuEmergente.add(menuRojo);

        menuVerde.setText("Verde");
        menuVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerdeActionPerformed(evt);
            }
        });
        menuEmergente.add(menuVerde);

        menuAzul.setText("Azul");
        menuAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAzulActionPerformed(evt);
            }
        });
        menuEmergente.add(menuAzul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnVolver)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        /*        if(evt.getButton() == 1){
        JOptionPane.showMessageDialog(null,"Pulso el izquierdo");
        }else if(evt.getButton() == 2){
        JOptionPane.showMessageDialog(null,"Pulso el central");
        }else if(evt.getButton() == 3){
        JOptionPane.showMessageDialog(null,"Pulso el derecho");
        }*/
        menuEmergente.show(this,evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

    private void menuRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRojoActionPerformed
       this.getContentPane().setBackground(Color.red);
    }//GEN-LAST:event_menuRojoActionPerformed

    private void menuVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerdeActionPerformed
        this.getContentPane().setBackground(Color.green);
    }//GEN-LAST:event_menuVerdeActionPerformed

    private void menuAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAzulActionPerformed
        this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_menuAzulActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        new menu_secundario().setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(menu_emergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_emergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_emergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_emergente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_emergente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JMenuItem menuAzul;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem menuRojo;
    private javax.swing.JMenuItem menuVerde;
    // End of variables declaration//GEN-END:variables
}
