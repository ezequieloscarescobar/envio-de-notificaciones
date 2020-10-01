package moduloNotificaciones.estrategias.adapters.sms;

import moduloNotificaciones.Notificacion;

public interface AdapterNotificadorSMS {
    void enviarSMS(Notificacion notificacion);
}
