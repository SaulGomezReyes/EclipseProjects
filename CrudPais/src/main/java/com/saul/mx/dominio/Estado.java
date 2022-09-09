package com.saul.mx.dominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "ESTADOSES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Estado {

    @Id
    @Column(name = "ID_ESTADO", columnDefinition = "NUMBER")
    int idEstado;

    @Column(name = "NOMBRE", columnDefinition = "NVARCHAR(100)")
    String nombre;

    @Column(name = "CAPITAL", columnDefinition = "NVARCHAR(100)")
    String capital;

    @Column(name = "HABITANTES", columnDefinition = "NUMBER")
    int habitantes;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PAIS")
    Pais pais;

}
