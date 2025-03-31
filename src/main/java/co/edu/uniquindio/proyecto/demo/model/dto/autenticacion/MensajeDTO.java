package co.edu.uniquindio.proyecto.demo.model.dto.autenticacion;
public record MensajeDTO<T>(
        boolean error,
        T respuesta
) {
}

