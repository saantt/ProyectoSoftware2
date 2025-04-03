    package co.edu.uniquindio.proyecto.demo.model.vo;

import lombok.*;

import java.util.List;
import java.util.stream.Collector;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Localidad {

    private double precio;
    private String nombre;
    private int entradasVendidas;
    private int capacidadMaxima;


    public Localidad(double precio, String nombre, int capacidadMaxima) {
        this.precio = precio;
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
    }
    public int getCapacidadDisponible(){
        return capacidadMaxima - entradasVendidas;
    }
}
