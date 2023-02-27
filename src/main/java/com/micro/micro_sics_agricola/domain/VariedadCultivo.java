package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "variedad_cultivo", schema = "sc_seguro_agricola")
public class VariedadCultivo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "var_cul_id")
    private int varCulId;
    @Basic
    @Column(name = "var_cul_nombre")
    private String varCulNombre;
    @Basic
    @Column(name = "var_cul_codigo")
    private String varCulCodigo;
    @Basic
    @Column(name = "var_cul_cod_cultivo_unificado")
    private String varCulCodCultivoUnificado;
    @Basic
    @Column(name = "var_cul_cod_cultivo_descripcion")
    private String varCulCodCultivoDescripcion;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "var_cul_usuario_creacion", nullable = true, length = -1)
    private String varCulUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "var_cul_fecha_creacion", nullable = true)
    private LocalDateTime varCulFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "var_cul_usuario_modificacion")
    private String varCulUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "var_cul_fecha_modificación")
    private LocalDateTime varCulFechaModificación;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "var_cul_estado")
    private Integer varCulEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "var_cul_eliminado")
    private Boolean varCulEliminado;




}
