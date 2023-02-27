package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "dato_productor", schema = "sc_seguro_agricola")
public class DatoProductor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dat_pro_id")
    private int datProId;

    @Basic
    @Column(name = "pro_id")
    private int proId;

    @Basic
    @Column(name = "cat_id_estado_civil")
    private int catIdEstadoCivil;

    @Basic
    @Column(name = "cat_id_nacionalidad")
    private int catIdNacionalidad;

    @Basic
    @Column(name = "cat_id_actividad_economica")
    private int catIdActividadEconomica;

    @Basic
    @Column(name = "dat_pro_domicilio")
    private String datProDomicilio;

    @Basic
    @Column(name = "dat_pro_telefono")
    private String datProTelefono;

    @Basic
    @Column(name = "dat_pro_celular")
    private String datProCelular;

    @Basic
    @Column(name = "dat_pro_email")
    private String datProEmail;

    @Basic
    @Column(name = "dat_pro_ingreso_anual")
    private double datProIngresoAnual;

    @Basic
    @Column(name = "dat_pro_egreso_anual")
    private double datProEgresoAnual;

    @Basic
    @Column(name = "dat_pro_pep")
    private boolean datProPep;

    @Basic
    @Column(name = "dat_pro_fuente_ingreso_ag")
    private boolean datProFuenteIngresoAg;

    @Basic
    @Column(name = "dat_pro_pasivo_anual")
    private double datProPasivoAnual;
    @Basic
    @Column(name = "dat_pro_activo_anual")
    private double datProActivoAnual;

    @Basic
    @Column(name = "dat_cony_id")
    private Integer datConyId;
    @Basic
    @Column(name = "dat_pro_nombre_referencia")
    private String datProNombreReferencia;
    @Basic
    @Column(name = "dat_pro_parentesco")
    private String datProParentesco;
    @Basic
    @Column(name = "dat_pro_telefono_referencia")
    private String datProTelefonoReferencia;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "dat_pro_usuario_creacion")
    private String datProUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "dat_pro_fecha_creacion")
    private Timestamp datProFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "dat_pro_usuario_modificacion")
    private String datProUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "dat_pro_fecha_modificacion")
    private Timestamp datProFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "dat_pro_estado")
    private int datProEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "dat_pro_eliminado")
    private boolean datProEliminado;







}
