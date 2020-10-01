package moduloNotificaciones.estrategias;

import moduloNotificaciones.Notificacion;

public interface EstrategiaDeNotificacion {
    void enviar(Notificacion notificacion);
}
