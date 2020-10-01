package moduloNotificaciones.estrategias.adapters.email;

import moduloNotificaciones.Notificacion;

public class AdapterJavaMail implements AdapterNotificadorEmail{
    /**
     *
     * TODO Se debería llamar a la o las clases correspondientes que se quieren adaptar
     */
    public void enviarEmail(Notificacion notificacion) {
        System.out.println("Enviando email a "+ notificacion.getEmail()+" por JavaMail: '"+notificacion.getMensaje()+"'");
    }
}
