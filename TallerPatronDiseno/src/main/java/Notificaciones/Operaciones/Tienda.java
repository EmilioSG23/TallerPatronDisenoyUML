/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notificaciones.Operaciones;

import Notificaciones.Plataformas.*;

/**
 *
 * @author EmilioSG23
 */
public class Tienda{ 
    public static void main(String[] args){
        String mensaje="Hola, ¿como esta?";
        Notificador noti=new SMSNotificador(new MailNotificador(new NotificadorData(mensaje)));
    }
}
