package domain;

import moduloNotificaciones.Notificacion;
import moduloNotificaciones.Notificador;
import moduloNotificaciones.estrategias.*;
import moduloNotificaciones.estrategias.adapters.email.AdapterJavaMail;
import moduloNotificaciones.estrategias.adapters.sms.AdapterTwilioSMS;
import moduloNotificaciones.estrategias.adapters.whatsapp.AdapterTwilioWhatsApp;

import java.util.ArrayList;
import java.util.List;

public class MainExample {

    public static void main(String[] args) {
        Notificador notificador = new Notificador();
        EstrategiaDeNotificacion notificadorSMS = new NotificadorSMS(new AdapterTwilioSMS());
        EstrategiaDeNotificacion notificadorWhatsApp = new NotificadorWhatsApp(new AdapterTwilioWhatsApp());
        EstrategiaDeNotificacion notificadorEmail = new NotificadorEmail(new AdapterJavaMail());


        for(UsuarioNotificacionMock usuarioMock : usuariosMock()){
            Notificacion notificacion = new Notificacion();
            notificacion.setEmail(usuarioMock.getEmail());
            notificacion.setNumeroCompleto(usuarioMock.getNumeroCompleto());
            notificacion.setMensaje(usuarioMock.getMensaje());

            switch (usuarioMock.getEstrategiaElegida()) {
                case SMS: notificador.setEstrategia(notificadorSMS); break;
                case WHATSAPP: notificador.setEstrategia(notificadorWhatsApp); break;
                case EMAIL: notificador.setEstrategia(notificadorEmail); break;
            }

            notificador.enviar(notificacion);
        }
    }

    private static List<UsuarioNotificacionMock> usuariosMock() {
        List<UsuarioNotificacionMock> usuariosMock = new ArrayList<UsuarioNotificacionMock>();

        UsuarioNotificacionMock usuarioMock = new UsuarioNotificacionMock(Estrategia.EMAIL,"+541159666574", "usuario1@example.com", "Tu paquete está en camino!");
        usuariosMock.add(usuarioMock);

        usuarioMock = new UsuarioNotificacionMock(Estrategia.WHATSAPP,"+541159666580", "usuario2@example.com", "Tu pedido fue rechazado");
        usuariosMock.add(usuarioMock);

        usuarioMock = new UsuarioNotificacionMock(Estrategia.SMS,"+541159666590", "usuario3@example.com", "El vendedor está preparando el pedido");
        usuariosMock.add(usuarioMock);

        return usuariosMock;
    }
}
