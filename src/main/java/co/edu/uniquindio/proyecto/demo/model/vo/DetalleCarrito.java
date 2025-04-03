package co.edu.uniquindio.proyecto.demo.model.vo;

import lombok.*;
import org.bson.types.ObjectId;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DetalleCarrito {

    private String idDetalleCarrito;
    private String idEvento;
    private int cantidad;
    private String nombreLocalidad;
    private float precioUnitario;


}

