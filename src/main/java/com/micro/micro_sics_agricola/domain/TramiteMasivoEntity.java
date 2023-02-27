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
@Table(name = "tramite_masivo", schema = "sc_seguro_agricola")
public class TramiteMasivoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tra_mas_id")
    private int traMasId;
    @Basic
    @Column(name = "tra_mas_canal")
    private String traMasCanal;
    @Basic
    @Column(name = "tra_mas_envio")
    private String traMasEnvio;
    @Basic
    @Column(name = "tra_mas_fecha")
    private Timestamp traMasFecha;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "tra_mas_usuario_creacion", nullable = true, length = -1)
    private String traMasUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "tra_mas_fecha_creacion", nullable = true)
    private Date traMasFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "tra_mas_usuario_modificacion", nullable = true, length = -1)
    private String traMasUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "tra_mas_fecha_modificacion", nullable = true)
    private Date traMasFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "tra_mas_estado", nullable = true)
    private Integer traMasEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "tra_mas_eliminado", nullable = true)
    private Boolean traMasEliminado;

}
