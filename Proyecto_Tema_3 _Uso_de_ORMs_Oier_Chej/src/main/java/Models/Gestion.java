package Models;

import jakarta.persistence.*;

import java.util.Date;

public class Gestion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Integer id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "cantidad")
    private Integer cantidad;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "proveedores_id", referencedColumnName = "id")
    private Proveedores proveedores;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "piezas_id", referencedColumnName = "id")
    private Piezas piezas;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "proyectos_id", referencedColumnName = "id")
    private Proyectos proyectos;




}
