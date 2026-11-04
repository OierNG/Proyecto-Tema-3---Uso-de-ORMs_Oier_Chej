package Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Piezas getPiezas() {
        return piezas;
    }

    public void setPiezas(Piezas piezas) {
        this.piezas = piezas;
    }

    public Proveedores getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedores proveedores) {
        this.proveedores = proveedores;
    }

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }

    @Override
    public String toString() {
        return "Gestion{" +
                "id=" + id +
                ", piezas=" + piezas +
                ", proveedores=" + proveedores +
                ", proyectos=" + proyectos +
                ", cantidad=" + cantidad +
                ", fecha=" + fecha +
                '}';
    }
}
