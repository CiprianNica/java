package com.proyectoClase.springHR.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LOCATIONS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {
    @Id
    @Column(name = "LOCATION_ID" )
    private Integer id;

    @Column(name = "STREET_ADDRESS")
    private String direccion;

    @Column(name = "POSTAL_CODE")
    private String cp;

    @Column(name = "CITY")
    private String ciudad;

    @Column(name = "STATE_PROVINCE")
    private String provincia;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Pais pais;

}
