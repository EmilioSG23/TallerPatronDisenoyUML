/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatrondiseno.operaciones;

import ec.edu.espol.tallerpatrondiseno.operaciones.Notificador;

/**
 *
 * @author EmilioSG23
 */
public class NotiDecorator implements Notificador{
    private Notificador wrapper;
    
    public NotiDecorator(Notificador notificador){
        this.wrapper=notificador;
    }
    public void enviarMensaje(String mensaje){
        //Envío de mensaje
    }
}
