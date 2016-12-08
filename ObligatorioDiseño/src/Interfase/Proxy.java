/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.Utilidades;
import static Common.Utilidades.VentanasAbiertas;
import Common.Utilidades.tipoRet;
import Common.cException;
import Common.cJuego;
import Common.cUsuario;
import Dominio.Bingo;
import javax.swing.*;
/**
 *
 * @author Martin
 */
public class Proxy {
    
    Bingo b = new Bingo();
    PatronObserver OPatron;
    
    public Proxy(PatronObserver pOPatron)
    {
        OPatron=pOPatron;
    }
   
    public boolean logear(cUsuario us,vLogin l) throws cException
    {       
        us = b.buscarUsuario(us);
            if(us != null){     
                if(us.getTipo() == Utilidades.EnumeradosTipo.Usuario )
                {
                    l.setVisible(false);
                    vJugador Juego = new vJugador(VentanasAbiertas,us);
                    Juego.setVisible(true);
                    l.setEstado(true);
                    return true;
                }
                else
                {
                    l.setVisible(false);
                    vAdmin A = new vAdmin(this);
                    A.setLocationRelativeTo(null);
                    A.setVisible(true);
                    return true;
                }
            }
            else 
                return false;
    }
                  
}

 