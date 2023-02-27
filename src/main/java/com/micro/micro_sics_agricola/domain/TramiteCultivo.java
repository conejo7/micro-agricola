package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tramite_cultivo", schema = "sc_seguro_agricola")
public class TramiteCultivo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "tra_cul_id")
    private int traCulId;
    @Basic
    @Column(name = "cul_id")
    private int culId;
    @Basic
    @Column(name = "tra_id")
    private int traId;
    @Basic
    @Column(name = "cat_id_tipo_semilla")
    private int catIdTipoSemilla;
    @Basic
    @Column(name = "tra_cul_sup_tot_cultivo")
    private Double traCulSupTotCultivo;
    @Basic
    @Column(name = "tra_cul_fecha_inicio_actividades")
    private LocalDate traCulFechaInicioActividades;
    @Basic
    @Column(name = "tra_cul_fecha_tentativa_siembra")
    private LocalDate traCulFechaTentativaSiembra;

    @Basic
    @Column(name ="var_cul_id")
    private int varCulId;


    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/


    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "tra_cul_usuario_creacion")
    private String traCulUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "tra_cul_fecha_creacion")
    private Timestamp traCulFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "tra_cul_usuario_modificacion")
    private String traCulUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "tra_cul_fecha_modfiicacion")
    private Timestamp traCulFechaModfiicacion;


    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "tra_cul_estado")
    private int traCulEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "tra_cul_eliminado")
    private boolean traCulEliminado;



}
