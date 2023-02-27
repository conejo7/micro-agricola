package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "parroquia", schema = "sc_seguro_agricola")
public class Parroquia {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "par_id")
    private int parId;
    @Basic
    @Column(name = "can_id")
    private Integer canId;
    @Basic
    @Column(name = "par_codigo")
    private String parCodigo;
    @Basic
    @Column(name = "par_nombre")
    private String parNombre;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "par_usuario_creacion")
    private String parUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "par_fecha_creacion")
    private Timestamp parFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "par_usuario_modificacion")
    private String parUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "par_fecha_modificacion")
    private Timestamp parFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "par_estado")
    private int parEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "par_eliminado")
    private boolean parEliminado;

    public int getParId() {
        return parId;
    }

    public void setParId(int parId) {
        this.parId = parId;
    }

    public Integer getCanId() {
        return canId;
    }

    public void setCanId(Integer canId) {
        this.canId = canId;
    }

    public String getParCodigo() {
        return parCodigo;
    }

    public void setParCodigo(String parCodigo) {
        this.parCodigo = parCodigo;
    }

    public String getParNombre() {
        return parNombre;
    }

    public void setParNombre(String parNombre) {
        this.parNombre = parNombre;
    }

    public String getParUsuarioCreacion() {
        return parUsuarioCreacion;
    }

    public void setParUsuarioCreacion(String parUsuarioCreacion) {
        this.parUsuarioCreacion = parUsuarioCreacion;
    }

    public Timestamp getParFechaCreacion() {
        return parFechaCreacion;
    }

    public void setParFechaCreacion(Timestamp parFechaCreacion) {
        this.parFechaCreacion = parFechaCreacion;
    }

    public String getParUsuarioModificacion() {
        return parUsuarioModificacion;
    }

    public void setParUsuarioModificacion(String parUsuarioModificacion) {
        this.parUsuarioModificacion = parUsuarioModificacion;
    }

    public Timestamp getParFechaModificacion() {
        return parFechaModificacion;
    }

    public void setParFechaModificacion(Timestamp parFechaModificacion) {
        this.parFechaModificacion = parFechaModificacion;
    }

    public int getParEstado() {
        return parEstado;
    }

    public void setParEstado(int parEstado) {
        this.parEstado = parEstado;
    }

    public boolean isParEliminado() {
        return parEliminado;
    }

    public void setParEliminado(boolean parEliminado) {
        this.parEliminado = parEliminado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parroquia parroquia = (Parroquia) o;

        if (parId != parroquia.parId) return false;
        if (parEstado != parroquia.parEstado) return false;
        if (parEliminado != parroquia.parEliminado) return false;
        if (canId != null ? !canId.equals(parroquia.canId) : parroquia.canId != null) return false;
        if (parCodigo != null ? !parCodigo.equals(parroquia.parCodigo) : parroquia.parCodigo != null) return false;
        if (parNombre != null ? !parNombre.equals(parroquia.parNombre) : parroquia.parNombre != null) return false;
        if (parUsuarioCreacion != null ? !parUsuarioCreacion.equals(parroquia.parUsuarioCreacion) : parroquia.parUsuarioCreacion != null)
            return false;
        if (parFechaCreacion != null ? !parFechaCreacion.equals(parroquia.parFechaCreacion) : parroquia.parFechaCreacion != null)
            return false;
        if (parUsuarioModificacion != null ? !parUsuarioModificacion.equals(parroquia.parUsuarioModificacion) : parroquia.parUsuarioModificacion != null)
            return false;
        if (parFechaModificacion != null ? !parFechaModificacion.equals(parroquia.parFechaModificacion) : parroquia.parFechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = parId;
        result = 31 * result + (canId != null ? canId.hashCode() : 0);
        result = 31 * result + (parCodigo != null ? parCodigo.hashCode() : 0);
        result = 31 * result + (parNombre != null ? parNombre.hashCode() : 0);
        result = 31 * result + (parUsuarioCreacion != null ? parUsuarioCreacion.hashCode() : 0);
        result = 31 * result + (parFechaCreacion != null ? parFechaCreacion.hashCode() : 0);
        result = 31 * result + (parUsuarioModificacion != null ? parUsuarioModificacion.hashCode() : 0);
        result = 31 * result + (parFechaModificacion != null ? parFechaModificacion.hashCode() : 0);
        result = 31 * result + parEstado;
        result = 31 * result + (parEliminado ? 1 : 0);
        return result;
    }
}
