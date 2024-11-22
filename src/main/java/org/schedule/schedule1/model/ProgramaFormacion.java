package org.schedule.schedule1.model;

import jakarta.persistence.*;

// Mapea la tabla "programaFormacion"
@Entity
@Table(name = "programaFormacion")
public class ProgramaFormacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ProgramaF")
    private int id;

    @Column(nullable = false, length = 250)
    private String nombre;

    @Column(length = 100)
    private String duracion;

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
