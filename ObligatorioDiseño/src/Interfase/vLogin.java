/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.Utilidades;
import Common.Utilidades.EnumeradoEstadoJuego;
import Common.Utilidades.EnumeradoResultadoFuncion;
import static Common.Utilidades.EstadoJuego;
import static Common.Utilidades.VentanasAbiertas;
import Common.Utilidades.tipoRet;
import Common.cException;
import Common.cJuego;
import Common.cUsuario;
import Dominio.Bingo;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Martin
 */
public class vLogin extends javax.swing.JFrame {

    public Bingo bin = new Bingo();
<<<<<<< HEAD
    private boolean Estado = false;
    PatronObserver o;
=======
    public boolean Estado = true;
    Proxy Prox;
    cJuego j;

    public vLogin(){}
>>>>>>> 7068f64033b64c3e38bc27daa71b43393257e377
    
    public vLogin(Proxy pProx) {
        Prox = pProx;
        initComponents();
    }
    
    public vLogin(PatronObserver p) {
        initComponents();
        o = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 183, 27));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel2.setText("Contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Yu Mincho", 2, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bingo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 253));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       
        String u = txtUsuario.getText().toString();
        String c = txtContraseña.getText().toString();
        cUsuario usu = (cUsuario)bin.CrearObjeto(Utilidades.EnumeradosFabrica.Usuario);
        usu.setUsuario(u);
        usu.setContraseña(c);
             
        try {
<<<<<<< HEAD
            if(!pr.logear(usu,this,o))
            {
               JOptionPane.showMessageDialog(this, "ERROR USUARIO NO ENCONTRADO", "Login", JOptionPane.INFORMATION_MESSAGE);
=======
            EnumeradoResultadoFuncion Resultado = Prox.logear(usu);
            if(null!=Resultado)
            switch (Resultado) {
                case ElJuegoYaComenzo:
                    JOptionPane.showMessageDialog(this, "El JUEGO NO SE A COMENZADO A GESTIONAR", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    break;
                case NoExiste:
                    JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    break;
                case UsuarioLogeado:
                    JOptionPane.showMessageDialog(this, "EL USUARIO YA SE ENCUENTRA EN EL JUEGO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    break;
                default:
                    this.setVisible(false);
                    Estado = false;
                    break;
>>>>>>> 7068f64033b64c3e38bc27daa71b43393257e377
            }
        } catch (cException ex) {
            
            Logger.getLogger(vLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void LimpiarCampos()
    {
        this.txtContraseña.setText("");
    }
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
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public boolean isEstado() {
        return Estado;
    }
    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
}
