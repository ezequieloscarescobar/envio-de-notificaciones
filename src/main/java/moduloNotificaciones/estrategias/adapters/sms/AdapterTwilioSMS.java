package moduloNotificaciones.estrategias.adapters.sms;

import moduloNotificaciones.Notificacion;

public class AdapterTwilioSMS implements AdapterNotificadorSMS{
    /**
     *
     * TODO Se debería llamar a la o las clases correspondientes que se quieren adaptar
     */
    public void enviarSMS(Notificacion notificacion) {
        System.out.println("Enviando SMS a "+ notificacion.getNumeroCompleto()+" por Twilio: '"+notificacion.getMensaje()+"'");
    }
}
