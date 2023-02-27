package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "facilitador", schema = "sc_seguro_agricola")
public class Facilitador {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fac_id")
    private int facId;
    @Basic
    @Column(name = "cat_tipo_facilitador")
    private Integer catTipoFacilitador;
    @Basic
    @Column(name = "fac_nombre")
    private String facNombre;
    @Basic
    @Column(name = "fac_codigo")
    private String facCodigo;
    @Basic
    @Column(name = "fac_descripcion")
    private String facDescripcion;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "fac_usuario_creacion")
    private String facUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "fac_fecha_creacion")
    private Timestamp facFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "fac_usuario_modificacion")
    private String facUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "fac_fecha_modificacion")
    private Timestamp facFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "fac_estado")
    private int facEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "fac_eliminado")
    private boolean facEliminado;

    public int getFacId() {
        return facId;
    }

    public void setFacId(int facId) {
        this.facId = facId;
    }

    public Integer getCatTipoFacilitador() {
        return catTipoFacilitador;
    }

    public void setCatTipoFacilitador(Integer catTipoFacilitador) {
        this.catTipoFacilitador = catTipoFacilitador;
    }

    public String getFacNombre() {
        return facNombre;
    }

    public void setFacNombre(String facNombre) {
        this.facNombre = facNombre;
    }

    public String getFacCodigo() {
        return facCodigo;
    }

    public void setFacCodigo(String facCodigo) {
        this.facCodigo = facCodigo;
    }

    public String getFacDescripcion() {
        return facDescripcion;
    }

    public void setFacDescripcion(String facDescripcion) {
        this.facDescripcion = facDescripcion;
    }

    public String getFacUsuarioCreacion() {
        return facUsuarioCreacion;
    }

    public void setFacUsuarioCreacion(String facUsuarioCreacion) {
        this.facUsuarioCreacion = facUsuarioCreacion;
    }

    public Timestamp getFacFechaCreacion() {
        return facFechaCreacion;
    }

    public void setFacFechaCreacion(Timestamp facFechaCreacion) {
        this.facFechaCreacion = facFechaCreacion;
    }

    public String getFacUsuarioModificacion() {
        return facUsuarioModificacion;
    }

    public void setFacUsuarioModificacion(String facUsuarioModificacion) {
        this.facUsuarioModificacion = facUsuarioModificacion;
    }

    public Timestamp getFacFechaModificacion() {
        return facFechaModificacion;
    }

    public void setFacFechaModificacion(Timestamp facFechaModificacion) {
        this.facFechaModificacion = facFechaModificacion;
    }

    public int getFacEstado() {
        return facEstado;
    }

    public void setFacEstado(int facEstado) {
        this.facEstado = facEstado;
    }

    public boolean isFacEliminado() {
        return facEliminado;
    }

    public void setFacEliminado(boolean facEliminado) {
        this.facEliminado = facEliminado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Facilitador that = (Facilitador) o;

        if (facId != that.facId) return false;
        if (facEstado != that.facEstado) return false;
        if (facEliminado != that.facEliminado) return false;
        if (catTipoFacilitador != null ? !catTipoFacilitador.equals(that.catTipoFacilitador) : that.catTipoFacilitador != null)
            return false;
        if (facNombre != null ? !facNombre.equals(that.facNombre) : that.facNombre != null) return false;
        if (facCodigo != null ? !facCodigo.equals(that.facCodigo) : that.facCodigo != null) return false;
        if (facDescripcion != null ? !facDescripcion.equals(that.facDescripcion) : that.facDescripcion != null)
            return false;
        if (facUsuarioCreacion != null ? !facUsuarioCreacion.equals(that.facUsuarioCreacion) : that.facUsuarioCreacion != null)
            return false;
        if (facFechaCreacion != null ? !facFechaCreacion.equals(that.facFechaCreacion) : that.facFechaCreacion != null)
            return false;
        if (facUsuarioModificacion != null ? !facUsuarioModificacion.equals(that.facUsuarioModificacion) : that.facUsuarioModificacion != null)
            return false;
        if (facFechaModificacion != null ? !facFechaModificacion.equals(that.facFechaModificacion) : that.facFechaModificacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = facId;
        result = 31 * result + (catTipoFacilitador != null ? catTipoFacilitador.hashCode() : 0);
        result = 31 * result + (facNombre != null ? facNombre.hashCode() : 0);
        result = 31 * result + (facCodigo != null ? facCodigo.hashCode() : 0);
        result = 31 * result + (facDescripcion != null ? facDescripcion.hashCode() : 0);
        result = 31 * result + (facUsuarioCreacion != null ? facUsuarioCreacion.hashCode() : 0);
        result = 31 * result + (facFechaCreacion != null ? facFechaCreacion.hashCode() : 0);
        result = 31 * result + (facUsuarioModificacion != null ? facUsuarioModificacion.hashCode() : 0);
        result = 31 * result + (facFechaModificacion != null ? facFechaModificacion.hashCode() : 0);
        result = 31 * result + facEstado;
        result = 31 * result + (facEliminado ? 1 : 0);
        return result;
    }
}
