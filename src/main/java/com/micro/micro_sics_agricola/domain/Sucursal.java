package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "sucursal", schema = "sc_seguro_agricola")
public class Sucursal {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "suc_id")
    private int sucId;
    @Basic
    @Column(name = "fac_id")
    private Integer facId;
    @Basic
    @Column(name = "suc_codigo")
    private String sucCodigo;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "suc_usuario_creacion")
    private String sucUsuarioCreacion;


    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "suc_fecha_creacion")
    private Timestamp sucFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "suc_usuario_modificacion")
    private String sucUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "suc_fecha_modificacion")
    private Timestamp sucFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "suc_estado")
    private int sucEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "suc_eliminado")
    private boolean sucEliminado;

    public int getSucId() {
        return sucId;
    }

    public void setSucId(int sucId) {
        this.sucId = sucId;
    }

    public Integer getFacId() {
        return facId;
    }

    public void setFacId(Integer facId) {
        this.facId = facId;
    }

    public String getSucCodigo() {
        return sucCodigo;
    }

    public void setSucCodigo(String sucCodigo) {
        this.sucCodigo = sucCodigo;
    }

    public String getSucUsuarioCreacion() {
        return sucUsuarioCreacion;
    }

    public void setSucUsuarioCreacion(String sucUsuarioCreacion) {
        this.sucUsuarioCreacion = sucUsuarioCreacion;
    }

    public Timestamp getSucFechaCreacion() {
        return sucFechaCreacion;
    }

    public void setSucFechaCreacion(Timestamp sucFechaCreacion) {
        this.sucFechaCreacion = sucFechaCreacion;
    }

    public String getSucUsuarioModificacion() {
        return sucUsuarioModificacion;
    }

    public void setSucUsuarioModificacion(String sucUsuarioModificacion) {
        this.sucUsuarioModificacion = sucUsuarioModificacion;
    }

    public Timestamp getSucFechaModificacion() {
        return sucFechaModificacion;
    }

    public void setSucFechaModificacion(Timestamp sucFechaModificacion) {
        this.sucFechaModificacion = sucFechaModificacion;
    }

    public int getSucEstado() {
        return sucEstado;
    }

    public void setSucEstado(int sucEstado) {
        this.sucEstado = sucEstado;
    }

    public boolean isSucEliminado() {
        return sucEliminado;
    }

    public void setSucEliminado(boolean sucEliminado) {
        this.sucEliminado = sucEliminado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sucursal sucursal = (Sucursal) o;

        if (sucId != sucursal.sucId) return false;
        if (sucEstado != sucursal.sucEstado) return false;
        if (sucEliminado != sucursal.sucEliminado) return false;
        if (facId != null ? !facId.equals(sucursal.facId) : sucursal.facId != null) return false;
        if (sucCodigo != null ? !sucCodigo.equals(sucursal.sucCodigo) : sucursal.sucCodigo != null) return false;
        if (sucUsuarioCreacion != null ? !sucUsuarioCreacion.equals(sucursal.sucUsuarioCreacion) : sucursal.sucUsuarioCreacion != null)
            return false;
        if (sucFechaCreacion != null ? !sucFechaCreacion.equals(sucursal.sucFechaCreacion) : sucursal.sucFechaCreacion != null)
            return false;
        if (sucUsuarioModificacion != null ? !sucUsuarioModificacion.equals(sucursal.sucUsuarioModificacion) : sucursal.sucUsuarioModificacion != null)
            return false;
        if (sucFechaModificacion != null ? !sucFechaModificacion.equals(sucursal.sucFechaModificacion) : sucursal.sucFechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sucId;
        result = 31 * result + (facId != null ? facId.hashCode() : 0);
        result = 31 * result + (sucCodigo != null ? sucCodigo.hashCode() : 0);
        result = 31 * result + (sucUsuarioCreacion != null ? sucUsuarioCreacion.hashCode() : 0);
        result = 31 * result + (sucFechaCreacion != null ? sucFechaCreacion.hashCode() : 0);
        result = 31 * result + (sucUsuarioModificacion != null ? sucUsuarioModificacion.hashCode() : 0);
        result = 31 * result + (sucFechaModificacion != null ? sucFechaModificacion.hashCode() : 0);
        result = 31 * result + sucEstado;
        result = 31 * result + (sucEliminado ? 1 : 0);
        return result;
    }
}
