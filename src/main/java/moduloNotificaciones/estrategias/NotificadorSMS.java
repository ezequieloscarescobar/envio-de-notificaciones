package moduloNotificaciones.estrategias;

import moduloNotificaciones.Notificacion;
import moduloNotificaciones.estrategias.adapters.sms.AdapterNotificadorSMS;

public class NotificadorSMS implements EstrategiaDeNotificacion{
    private AdapterNotificadorSMS adapter;

    public NotificadorSMS(AdapterNotificadorSMS adapter) {
        this.adapter = adapter;
    }

    public void setAdapter(AdapterNotificadorSMS adapter) {
        this.adapter = adapter;
    }

    public void enviar(Notificacion notificacion) {
        this.adapter.enviarSMS(notificacion);
    }
}
