package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "provincia", schema = "sc_seguro_agricola")
public class Provincia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "prov_id")
    private int provId;
    @Basic
    @Column(name = "prov_codigo")
    private String provCodigo;
    @Basic
    @Column(name = "prov_nombre")
    private String provNombre;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "prov_usuario_creacion")
    private String provUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "prov_fecha_creacion")
    private Timestamp provFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "prov_usuario_modificacion")
    private String provUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "prov_fecha_modificacion")
    private Timestamp provFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "prov_estado")
    private int provEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "prov_eliminado")
    private boolean provEliminado;

    public int getProvId() {
        return provId;
    }

    public void setProvId(int provId) {
        this.provId = provId;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    public String getProvUsuarioCreacion() {
        return provUsuarioCreacion;
    }

    public void setProvUsuarioCreacion(String provUsuarioCreacion) {
        this.provUsuarioCreacion = provUsuarioCreacion;
    }

    public Timestamp getProvFechaCreacion() {
        return provFechaCreacion;
    }

    public void setProvFechaCreacion(Timestamp provFechaCreacion) {
        this.provFechaCreacion = provFechaCreacion;
    }

    public String getProvUsuarioModificacion() {
        return provUsuarioModificacion;
    }

    public void setProvUsuarioModificacion(String provUsuarioModificacion) {
        this.provUsuarioModificacion = provUsuarioModificacion;
    }

    public Timestamp getProvFechaModificacion() {
        return provFechaModificacion;
    }

    public void setProvFechaModificacion(Timestamp provFechaModificacion) {
        this.provFechaModificacion = provFechaModificacion;
    }

    public int getProvEstado() {
        return provEstado;
    }

    public void setProvEstado(int provEstado) {
        this.provEstado = provEstado;
    }

    public boolean isProvEliminado() {
        return provEliminado;
    }

    public void setProvEliminado(boolean provEliminado) {
        this.provEliminado = provEliminado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provincia provincia = (Provincia) o;

        if (provId != provincia.provId) return false;
        if (provEstado != provincia.provEstado) return false;
        if (provEliminado != provincia.provEliminado) return false;
        if (provCodigo != null ? !provCodigo.equals(provincia.provCodigo) : provincia.provCodigo != null) return false;
        if (provNombre != null ? !provNombre.equals(provincia.provNombre) : provincia.provNombre != null) return false;
        if (provUsuarioCreacion != null ? !provUsuarioCreacion.equals(provincia.provUsuarioCreacion) : provincia.provUsuarioCreacion != null)
            return false;
        if (provFechaCreacion != null ? !provFechaCreacion.equals(provincia.provFechaCreacion) : provincia.provFechaCreacion != null)
            return false;
        if (provUsuarioModificacion != null ? !provUsuarioModificacion.equals(provincia.provUsuarioModificacion) : provincia.provUsuarioModificacion != null)
            return false;
        if (provFechaModificacion != null ? !provFechaModificacion.equals(provincia.provFechaModificacion) : provincia.provFechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provId;
        result = 31 * result + (provCodigo != null ? provCodigo.hashCode() : 0);
        result = 31 * result + (provNombre != null ? provNombre.hashCode() : 0);
        result = 31 * result + (provUsuarioCreacion != null ? provUsuarioCreacion.hashCode() : 0);
        result = 31 * result + (provFechaCreacion != null ? provFechaCreacion.hashCode() : 0);
        result = 31 * result + (provUsuarioModificacion != null ? provUsuarioModificacion.hashCode() : 0);
        result = 31 * result + (provFechaModificacion != null ? provFechaModificacion.hashCode() : 0);
        result = 31 * result + provEstado;
        result = 31 * result + (provEliminado ? 1 : 0);
        return result;
    }
}
