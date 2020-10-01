# Envío de Notificaciones

El presente repositorio cuenta con el desarrollo del diseño base de un Módulo de envío de Notificaciones para clientes, que cumple con los siguientes requerimientos:

- En las notificaciones se enviará, únicamente, texto plano o código HTML.
- Cada cliente elige su medio preferido de notificación, lo que causa que solamente reciba avisos por el mismo. Otro sistema se encarga de la gestión de clientes y se debe guardar referencia a dicha configuración.
- Los medios de notificaciones soportados, por el momento, serán: WhatsApp, SMS y Email.

Algunas consideraciones:

- Está previsto que el envío de notificaciones por WhatsApp se realice por Twilio, pero no se descarta el reemplazo a otro componente en un futuro.
- Está previsto que el envío de notificaciones por SMS también se realice por Twilio, pero también está previsto que pueda cambiar el componente en un futuro.
- Para el envío de Email se puede utilizar cualquier biblioteca que facilite dicha tarea.