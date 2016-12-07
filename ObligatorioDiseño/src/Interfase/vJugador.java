/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import static Common.Utilidades.*;
import Common.cException;
import Common.cJuego;
import Common.cUsuario;
import Dominio.Bingo;
import static Dominio.Bingo.getInstancia;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author cristian castro
 */
public class vJugador extends javax.swing.JPanel implements Observer{

    Bingo b = getInstancia();
    int CantidadCartones = 0;
    cUsuario usu = null;
    cJuego j;
            
    /**
     * Creates new form vJugadorJugando
     */
    public vJugador(int pCant, cUsuario pusu) throws cException {
        usu = pusu;
        CantidadCartones = pCant;
        j = b.buscarTodo();
        initComponents();
        
        // <editor-fold defaultstate="collapsed" desc=" ConsultaCartones ">
        String Resultado = "Testeando";
        while(Validar(Resultado) != EnumeradosVentana.Ok)
        {
            Resultado = (JOptionPane.showInputDialog(this, "¿Con Cuantos Cartones Jugara?", "1 - 10"));
            if(Validar(Resultado) == EnumeradosVentana.Ok)
            {
                break;
            }
                
            if(Validar(Resultado) == EnumeradosVentana.NoNumero || Validar(Resultado) == EnumeradosVentana.NoValido){ 
               JOptionPane.showMessageDialog(this, "Ingrese Un Numero Entre"
                    + "\n 1 - "+ Integer.toString(CantidadCartones)); 
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Su Saldo No Es Suficiente");
                Resultado = "Testeando";
            }
        }
        // </editor-fold>
    }
    
    public EnumeradosVentana Validar(String pResultado) throws cException
    {
        if(!isNumeric(pResultado))
        {
            return EnumeradosVentana.NoNumero;
        }
        if(Integer.parseInt(pResultado)>j.getCantidadMaximaCartonesXJuegadores()&&Integer.parseInt(pResultado)<1)
        {
            return EnumeradosVentana.NoValido;
        }
        if(!b.CompraDeCarton(CantidadCartones, usu))
        {
            return EnumeradosVentana.NoSaldo;
        }
        return EnumeradosVentana.Ok;
    }
    
    public vJugador()
    {
        initComponents();
        
        tblCarton1.setVisible(false);
        tblCarton2.setVisible(false);
        tblCarton3.setVisible(false);
        tblCarton4.setVisible(false);
        tblCarton5.setVisible(false);
        tblCarton6.setVisible(false);
        tblCarton7.setVisible(false);
        tblCarton8.setVisible(false);
     
        int CantFi = j.getCantidadFilas();
        int CantC = j.getCantidadColumnas();
        DefaultTableModel tb1 = (DefaultTableModel) this.tblCarton1.getModel();
        DefaultTableModel tb2 = (DefaultTableModel) this.tblCarton2.getModel();
        DefaultTableModel tb3 = (DefaultTableModel) this.tblCarton3.getModel();
        DefaultTableModel tb4 = (DefaultTableModel) this.tblCarton4.getModel();
        DefaultTableModel tb5 = (DefaultTableModel) this.tblCarton1.getModel();
        DefaultTableModel tb6 = (DefaultTableModel) this.tblCarton1.getModel();
        DefaultTableModel tb7 = (DefaultTableModel) this.tblCarton1.getModel();
        DefaultTableModel tb8 = (DefaultTableModel) this.tblCarton1.getModel();
        
        
        tb1.addColumn(CantC);
        tb2.addColumn(CantC);
        tb3.addColumn(CantC);
        tb4.addColumn(CantC);
        tb5.addColumn(CantC);
        tb6.addColumn(CantC);
        tb7.addColumn(CantC);
        tb8.addColumn(CantC);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarton8 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCarton1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCarton2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCarton3 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCarton4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCarton5 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblCarton6 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblCarton7 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCarton8.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCarton8);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 260, 100));

        tblCarton1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCarton1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 100));

        tblCarton2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblCarton2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 100));

        tblCarton3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblCarton3);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 260, 100));

        tblCarton4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblCarton4);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 260, 100));

        tblCarton5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblCarton5);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 260, 100));

        tblCarton6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tblCarton6);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 260, 100));

        tblCarton7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tblCarton7);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 260, 100));

        jTextField1.setText("jTextField1");
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, -1, -1));

        jTextField2.setText("jTextField2");
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, -1, -1));

        jLabel1.setText("Pozo");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void update(Observable o, Object arg) {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblCarton1;
    private javax.swing.JTable tblCarton2;
    private javax.swing.JTable tblCarton3;
    private javax.swing.JTable tblCarton4;
    private javax.swing.JTable tblCarton5;
    private javax.swing.JTable tblCarton6;
    private javax.swing.JTable tblCarton7;
    private javax.swing.JTable tblCarton8;
    // End of variables declaration//GEN-END:variables
}
