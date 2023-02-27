package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;


@Entity
@Data
@Table(name = "predio", schema = "sc_seguro_agricola")
public class Predio {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pre_id")
    private int preId;
    @Basic
    @Column(name = "cat_id_condicion")
    private int catIdCondicion;
    @Basic
    @Column(name = "par_id")
    private int parId;
    @Basic
    @Column(name = "cat_id_tipo_riego")
    private Integer catIdTipoRiego;
    @Basic
    @Column(name = "pre_superficie_asegurada")
    private Double preSuperficieAsegurada;
    @Basic
    @Column(name = "pre_superficie_total_cultivo")
    private Double preSuperficieTotalCultivo;
    @Basic
    @Column(name = "pre_recinto")
    private String preRecinto;
    @Basic
    @Column(name = "pre_referencia")
    private String preReferencia;
    @Basic
    @Column(name = "pre_riego")
    private boolean preRiego;
    @Basic
    @Column(name = "pre_numero_lote")
    private String preNumeroLote;
    @Basic
    @Column(name = "pre_utmx")
    private String preUtmx;
    @Basic
    @Column(name = "pre_utmy")
    private String preUtmy;
    @Basic
    @Column(name = "pre_utmz")
    private String preUtmz;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "pre_usuario_creacion")
    private String preUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "pre_fecha_creacion")
    private Timestamp preFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "pre_usuario_modificacion")
    private String preUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "pre_fecha_modificacion")
    private Timestamp preFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "pre_estado")
    private int preEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "pre_eliminado")
    private boolean preEliminado;


}
