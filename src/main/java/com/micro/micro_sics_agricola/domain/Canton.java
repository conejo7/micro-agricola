package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "canton", schema = "sc_seguro_agricola")
public class Canton {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @ApiModelProperty(value = "can_id de la tabla canton dependiendo del core del negocio ", example = "1")
    @Column(name = "can_id")
    private int canId;
    @ApiModelProperty(value = "prov_id de la tabla canton dependiendo del core del negocio ", example = "1")
    @Basic
    @Column(name = "prov_id")
    private Integer provId;

    @ApiModelProperty(value = "can_codigo de la tabla canton dependiendo del core del negocio ", example = "0101")
    @Basic
    @Column(name = "can_codigo")
    private String canCodigo;

    @ApiModelProperty(value = "can_nombre de la tabla canton dependiendo del core del negocio ", example = "CUENCA")
    @Basic
    @Column(name = "can_nombre")
    private String canNombre;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "can_usuario_creacion")
    private String canUsuarioCreacion;
    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "can_fecha_creacion")
    private Timestamp canFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "can_usuario_modificacion")
    private String canUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "can_fecha_modificacion")
    private Timestamp canFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "can_estado")
    private int canEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "can_eliminado")
    private boolean canEliminado;

    public int getCanId() {
        return canId;
    }

    public void setCanId(int canId) {
        this.canId = canId;
    }

    public Integer getProvId() {
        return provId;
    }

    public void setProvId(Integer provId) {
        this.provId = provId;
    }

    public String getCanCodigo() {
        return canCodigo;
    }

    public void setCanCodigo(String canCodigo) {
        this.canCodigo = canCodigo;
    }

    public String getCanNombre() {
        return canNombre;
    }

    public void setCanNombre(String canNombre) {
        this.canNombre = canNombre;
    }

    public String getCanUsuarioCreacion() {
        return canUsuarioCreacion;
    }

    public void setCanUsuarioCreacion(String canUsuarioCreacion) {
        this.canUsuarioCreacion = canUsuarioCreacion;
    }

    public Timestamp getCanFechaCreacion() {
        return canFechaCreacion;
    }

    public void setCanFechaCreacion(Timestamp canFechaCreacion) {
        this.canFechaCreacion = canFechaCreacion;
    }

    public String getCanUsuarioModificacion() {
        return canUsuarioModificacion;
    }

    public void setCanUsuarioModificacion(String canUsuarioModificacion) {
        this.canUsuarioModificacion = canUsuarioModificacion;
    }

    public Timestamp getCanFechaModificacion() {
        return canFechaModificacion;
    }

    public void setCanFechaModificacion(Timestamp canFechaModificacion) {
        this.canFechaModificacion = canFechaModificacion;
    }

    public int getCanEstado() {
        return canEstado;
    }

    public void setCanEstado(int canEstado) {
        this.canEstado = canEstado;
    }

    public boolean isCanEliminado() {
        return canEliminado;
    }

    public void setCanEliminado(boolean canEliminado) {
        this.canEliminado = canEliminado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Canton canton = (Canton) o;

        if (canId != canton.canId) return false;
        if (canEstado != canton.canEstado) return false;
        if (canEliminado != canton.canEliminado) return false;
        if (provId != null ? !provId.equals(canton.provId) : canton.provId != null) return false;
        if (canCodigo != null ? !canCodigo.equals(canton.canCodigo) : canton.canCodigo != null) return false;
        if (canNombre != null ? !canNombre.equals(canton.canNombre) : canton.canNombre != null) return false;
        if (canUsuarioCreacion != null ? !canUsuarioCreacion.equals(canton.canUsuarioCreacion) : canton.canUsuarioCreacion != null)
            return false;
        if (canFechaCreacion != null ? !canFechaCreacion.equals(canton.canFechaCreacion) : canton.canFechaCreacion != null)
            return false;
        if (canUsuarioModificacion != null ? !canUsuarioModificacion.equals(canton.canUsuarioModificacion) : canton.canUsuarioModificacion != null)
            return false;
        if (canFechaModificacion != null ? !canFechaModificacion.equals(canton.canFechaModificacion) : canton.canFechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = canId;
        result = 31 * result + (provId != null ? provId.hashCode() : 0);
        result = 31 * result + (canCodigo != null ? canCodigo.hashCode() : 0);
        result = 31 * result + (canNombre != null ? canNombre.hashCode() : 0);
        result = 31 * result + (canUsuarioCreacion != null ? canUsuarioCreacion.hashCode() : 0);
        result = 31 * result + (canFechaCreacion != null ? canFechaCreacion.hashCode() : 0);
        result = 31 * result + (canUsuarioModificacion != null ? canUsuarioModificacion.hashCode() : 0);
        result = 31 * result + (canFechaModificacion != null ? canFechaModificacion.hashCode() : 0);
        result = 31 * result + canEstado;
        result = 31 * result + (canEliminado ? 1 : 0);
        return result;
    }
}
