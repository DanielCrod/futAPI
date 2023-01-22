package entity;

import javax.persistence.*;

@Entity
@Table(name = "liga", schema = "uefa", catalog = "")
public class LigaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "pais")
    private String pais;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LigaEntity that = (LigaEntity) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (pais != null ? !pais.equals(that.pais) : that.pais != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (pais != null ? pais.hashCode() : 0);
        return result;
    }
}
