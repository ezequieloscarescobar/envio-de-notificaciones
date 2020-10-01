package moduloNotificaciones.estrategias;

import moduloNotificaciones.Notificacion;
import moduloNotificaciones.estrategias.adapters.email.AdapterNotificadorEmail;

public class NotificadorEmail implements EstrategiaDeNotificacion{
    private AdapterNotificadorEmail adapter;

    public NotificadorEmail(AdapterNotificadorEmail adapter) {
        this.adapter = adapter;
    }

    public void setAdapter(AdapterNotificadorEmail adapter) {
        this.adapter = adapter;
    }

    public void enviar(Notificacion notificacion) {
        this.adapter.enviarEmail(notificacion);
    }
}
