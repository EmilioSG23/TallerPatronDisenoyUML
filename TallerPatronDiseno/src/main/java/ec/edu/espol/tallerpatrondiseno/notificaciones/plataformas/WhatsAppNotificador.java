/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.tallerpatrondiseno.notificaciones.plataformas;

import ec.edu.espol.tallerpatrondiseno.operaciones.NotiDecorator;
import ec.edu.espol.tallerpatrondiseno.operaciones.Notificador;

/**
 *
 * @author EmilioSG23
 */
public class WhatsAppNotificador extends NotiDecorator{
    public WhatsAppNotificador(Notificador notificador){
        super(notificador);
    }
    
    public void enviarMensaje(String mensaje){
        //Envia mensaje
    }
}
