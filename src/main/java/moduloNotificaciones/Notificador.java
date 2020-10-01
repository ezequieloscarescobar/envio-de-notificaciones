package moduloNotificaciones;

import moduloNotificaciones.estrategias.EstrategiaDeNotificacion;

public class Notificador {
    private EstrategiaDeNotificacion estrategia;

    public void setEstrategia(EstrategiaDeNotificacion estrategia) {
        this.estrategia = estrategia;
    }

    public void enviar(Notificacion notificacion) {
        this.estrategia.enviar(notificacion);
    }
}