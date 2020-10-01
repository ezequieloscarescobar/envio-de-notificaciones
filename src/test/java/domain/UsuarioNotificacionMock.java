package domain;

import moduloNotificaciones.estrategias.Estrategia;

public class UsuarioNotificacionMock {
    private Estrategia estrategiaElegida;
    private String numeroCompleto;
    private String email;
    private String mensaje;

    public UsuarioNotificacionMock(Estrategia estrategiaElegida, String numeroCompleto, String email, String mensaje) {
        this.estrategiaElegida = estrategiaElegida;
        this.numeroCompleto = numeroCompleto;
        this.email = email;
        this.mensaje = mensaje;
    }

    public String getEmail() {
        return email;
    }

    public String getNumeroCompleto() {
        return numeroCompleto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Estrategia getEstrategiaElegida() {
        return estrategiaElegida;
    }
}
