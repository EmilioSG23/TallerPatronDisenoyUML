/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones.Plataformas;

import Notificaciones.Operaciones.*;

/**
 *
 * @author EmilioSG23
 */
public class SignalNotificador extends NotiDecorator{
    public SignalNotificador(Notificador notificador){
        super(notificador);
    }
    
    public void enviarMensaje(String mensaje){
        //Envia mensaje
    }
}
