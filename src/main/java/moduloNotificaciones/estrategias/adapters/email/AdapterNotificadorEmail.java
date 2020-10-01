package moduloNotificaciones.estrategias.adapters.email;

import moduloNotificaciones.Notificacion;

public interface AdapterNotificadorEmail {
    void enviarEmail(Notificacion notificacion);
}
