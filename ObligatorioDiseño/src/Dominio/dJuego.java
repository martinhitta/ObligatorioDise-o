/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

<<<<<<< HEAD
/**
 *
 * @author Kingdel
 */
public class dJuego {
=======
import Common.cException;
import Common.cJuego;
import Persistencia.pJuego;

/**
 *
 * @author cristian castro
 */
public class dJuego {
        
    public void Modificar(cJuego pJuego) throws cException
    {
        pJuego u = new pJuego();
        u.modificar(pJuego);
    }
    
    public cJuego buscarTodo() throws cException
    {
        pJuego u = new pJuego();
        return u.buscarTodo();
    }
    
    public void ComenzarPartida()
    {
        int i = 0;
        //Metodo
        //trolololololol
    }
    
>>>>>>> 47dc42d846762745c7e020b03000e9887d41aedc
    
}
