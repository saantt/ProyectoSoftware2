package co.edu.uniquindio.proyecto.demo.model.vo;


import co.edu.uniquindio.proyecto.modelo.enums.EstadoBoleta;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Boleta {
    private String idBoleta;
    private String idEvento;
    private String idClientePropietario;
    private String nombreEvento;
    private LocalDate fechaEvento;
    private String nombreLocalidad;
    private EstadoBoleta estado;
    private String idPropietarioOriginal;
}
