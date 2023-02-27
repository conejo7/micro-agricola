package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "cultivo", schema = "sc_seguro_agricola")
@Data
public class Cultivo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cul_id")
    private Integer culId;

    @Basic
    @Column(name = "cul_nombre")
    private String culNombre;
    @Basic
    @Column(name = "cul_codigo")
    private Integer culCodigo;

    @Basic
    @Column(name = "cul_cat_id_tipo")
    private Integer culCatIdTipo;

    @Basic
    @Column(name = "cul_cultivo_unificado")
    private Integer culCultivoUnificado;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "cul_usuario_creacion")
    private String culUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "cul_fecha_creacion")
    private Timestamp culFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "cul_usuario_modificacion")
    private String culUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "cul_fecha_modificacion")
    private Timestamp culFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "cul_estado")
    private int culEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "cul_eliminado")
    private boolean culEliminado;




}
