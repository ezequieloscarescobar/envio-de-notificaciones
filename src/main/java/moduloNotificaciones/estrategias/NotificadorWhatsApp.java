package moduloNotificaciones.estrategias;

import moduloNotificaciones.Notificacion;
import moduloNotificaciones.estrategias.adapters.whatsapp.AdapterNotificadorWhatsApp;

public class NotificadorWhatsApp implements EstrategiaDeNotificacion{
    private AdapterNotificadorWhatsApp adapter;

    public NotificadorWhatsApp(AdapterNotificadorWhatsApp adapter) {
        this.adapter = adapter;
    }

    public void setAdapter(AdapterNotificadorWhatsApp adapter) {
        this.adapter = adapter;
    }

    public void enviar(Notificacion notificacion) {
        this.adapter.enviarWhatsApp(notificacion);
    }
}