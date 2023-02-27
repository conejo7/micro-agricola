package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "porcentaje_subvencion", schema = "sc_seguro_agricola")
public class PorcentajeSubvencion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "por_sub_id")
    private int porSubId;
    @Basic
    @Column(name = "por_sub_valor")
    private Integer porSubValor;
    @Basic
    @Column(name = "por_sub_numero_hectareas_min")
    private Double porSubNumeroHectareasMin;
    @Basic
    @Column(name = "por_sub_numero_hectareas_max")
    private Double porSubNumeroHectareasMax;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "por_sub_usuario_creacion")
    private String porSubUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "por_sub_fecha_creacion")
    private Timestamp porSubFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "por_sub_usuario_modificacion")
    private String porSubUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "por_sub_fecha_modificacion")
    private Timestamp porSubFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "por_sub_estado")
    private int porSubEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "por_sub_eliminado")
    private boolean porSubEliminado;

}
