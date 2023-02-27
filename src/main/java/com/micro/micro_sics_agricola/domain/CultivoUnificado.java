package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "cultivo_unificado", schema = "sc_seguro_agricola")
public class CultivoUnificado {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cul_uni_id")
    private int culUniId;

    @Basic
    @Column(name = "por_sub_id")
    private Integer porSubId;
    @Basic
    @Column(name = "cul_uni_nombre")
    private String culUniNombre;
    @Basic
    @Column(name = "cul_uni_codigo")
    private String culUniCodigo;
    @Basic
    @Column(name = "cul_uni_vigencia")
    private int culUniVigencia;
    @Basic
    @Column(name = "cul_uni_valor_max_subvencion")
    private Double culUniValorMaxSubvencion;
    @Basic
    @Column(name = "cul_uni_tasa")
    private Double culUniTasa;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "cul_uni_usuario_creacion")
    private String culUniUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "cul_uni_fecha_creacion")
    private Timestamp culUniFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "cul_uni_usuario_modificacion")
    private String culUniUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "cul_uni_fecha_modificacion")
    private Date culUniFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "cul_uni_estado")
    private int culUniEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "cul_uni_eliminado")
    private boolean culUniEliminado;


}
