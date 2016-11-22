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
        while(ValidarEntradaCartones(Resultado) != EnumeradosVentana.Ok)
        {
            Resultado = (JOptionPane.showInputDialog(this, "¿Con Cuantos Cartones Jugara?", "1 - 10"));
            if(ValidarEntradaCartones(Resultado) == EnumeradosVentana.Ok)
            {
                break;
            }
                
            if(ValidarEntradaCartones(Resultado) == EnumeradosVentana.NoNumero || ValidarEntradaCartones(Resultado) == EnumeradosVentana.NoValido){ 
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
    
    public EnumeradosVentana ValidarEntradaCartones(String pResultado) throws cException
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void update(Observable o, Object arg) {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
