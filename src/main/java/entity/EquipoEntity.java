package entity;

import javax.persistence.*;

@Entity
@Table(name = "equipo", schema = "uefa", catalog = "")
public class EquipoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "liga")
    private String liga;
    @Basic
    @Column(name = "puntos")
    private Integer puntos;
    @Basic
    @Column(name = "gf")
    private Integer gf;
    @Basic
    @Column(name = "gc")
    private Integer gc;
    @Basic
    @Column(name = "dg")
    private Integer dg;
    @Basic
    @Column(name = "pj")
    private Integer pj;
    @Basic
    @Column(name = "pg")
    private Integer pg;
    @Basic
    @Column(name = "pp")
    private Integer pp;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getGf() {
        return gf;
    }

    public void setGf(Integer gf) {
        this.gf = gf;
    }

    public Integer getGc() {
        return gc;
    }

    public void setGc(Integer gc) {
        this.gc = gc;
    }

    public Integer getDg() {
        return dg;
    }

    public void setDg(Integer dg) {
        this.dg = dg;
    }

    public Integer getPj() {
        return pj;
    }

    public void setPj(Integer pj) {
        this.pj = pj;
    }

    public Integer getPg() {
        return pg;
    }

    public void setPg(Integer pg) {
        this.pg = pg;
    }

    public Integer getPp() {
        return pp;
    }

    public void setPp(Integer pp) {
        this.pp = pp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipoEntity that = (EquipoEntity) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (liga != null ? !liga.equals(that.liga) : that.liga != null) return false;
        if (puntos != null ? !puntos.equals(that.puntos) : that.puntos != null) return false;
        if (gf != null ? !gf.equals(that.gf) : that.gf != null) return false;
        if (gc != null ? !gc.equals(that.gc) : that.gc != null) return false;
        if (dg != null ? !dg.equals(that.dg) : that.dg != null) return false;
        if (pj != null ? !pj.equals(that.pj) : that.pj != null) return false;
        if (pg != null ? !pg.equals(that.pg) : that.pg != null) return false;
        if (pp != null ? !pp.equals(that.pp) : that.pp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (liga != null ? liga.hashCode() : 0);
        result = 31 * result + (puntos != null ? puntos.hashCode() : 0);
        result = 31 * result + (gf != null ? gf.hashCode() : 0);
        result = 31 * result + (gc != null ? gc.hashCode() : 0);
        result = 31 * result + (dg != null ? dg.hashCode() : 0);
        result = 31 * result + (pj != null ? pj.hashCode() : 0);
        result = 31 * result + (pg != null ? pg.hashCode() : 0);
        result = 31 * result + (pp != null ? pp.hashCode() : 0);
        return result;
    }
}
