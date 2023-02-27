package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "calificacion", schema = "sc_seguro_agricola")
public class Calificacion {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @ApiModelProperty(value = "cal_id de la tabla calificacion dependiendo del core del negocio", example = "57")
    @Column(name = "cal_id")
    private int calId;

    @ApiModelProperty(value = "tra_id de la tabla calificacion dependiendo del core del negocio", example = "165")
    @Basic
    @Column(name = "tra_id")
    private Integer traId;

    @ApiModelProperty(value = "cat_id_estado_poliza de la tabla calificacion dependiendo del core del negocio 1 aprobado, 2 negado", example = "1")
    @Basic
    @Column(name = "cat_id_estado_poliza")
    private int catIdEstadoPoliza;

    @ApiModelProperty(value = "cal_tasa de la tabla calificacion dependiendo del core del negocio ", example = "2.37")
    @Basic
    @Column(name = "cal_tasa")
    private Double calTasa;

    @ApiModelProperty(value = "cal_monto_asegurado de la tabla calificacion dependiendo del core del negocio ", example = "40000")
    @Basic
    @Column(name = "cal_monto_asegurado")
    private Double calMontoAsegurado;

    @ApiModelProperty(value = "cal_prima_neta de la tabla calificacion dependiendo del core del negocio ", example = "94.8")
    @Basic
    @Column(name = "cal_prima_neta")
    private Double calPrimaNeta;

    @ApiModelProperty(value = "cal_aporte_super de la tabla calificacion dependiendo del core del negocio ", example = "3.32")
    @Basic
    @Column(name = "cal_aporte_super")
    private Double calAporteSuper;

    @ApiModelProperty(value = "cal_seguro_campesino de la tabla calificacion dependiendo del core del negocio ", example = "0.47")
    @Basic
    @Column(name = "cal_seguro_campesino")
    private Double calSeguroCampesino;

    @ApiModelProperty(value = "cal_derecho_emision de la tabla calificacion dependiendo del core del negocio ", example = "0.5")
    @Basic
    @Column(name = "cal_derecho_emision")
    private Double calDerechoEmision;
    @ApiModelProperty(value = "cal_recargo_sc de la tabla calificacion dependiendo del core del negocio ", example = "0.5")
    @Basic
    @Column(name = "cal_recargo_sc")
    private Double calRecargoSc;

    @ApiModelProperty(value = "cal_iva de la tabla calificacion dependiendo del core del negocio ", example = "0")
    @Basic
    @Column(name = "cal_iva")
    private Double calIva;

    @ApiModelProperty(value = "cal_total_imp de la tabla calificacion dependiendo del core del negocio ", example = "5.3")
    @Basic
    @Column(name = "cal_total_imp")
    private Double calTotalImp;

    @ApiModelProperty(value = "cal_prima_bruta de la tabla calificacion dependiendo del core del negocio ", example = "125.2")
    @Basic
    @Column(name = "cal_prima_bruta")
    private Double calPrimaBruta;

    @ApiModelProperty(value = "cal_prima_subsidiada de la tabla calificacion dependiendo del core del negocio ", example = "47.96")
    @Basic
    @Column(name = "cal_prima_subsidiada")
    private Double calPrimaSubsidiada;

    @ApiModelProperty(value = "cal_prima_financiada de la tabla calificacion dependiendo del core del negocio ", example = "47.96")
    @Basic
    @Column(name = "cal_prima_financiada")
    private Double calPrimaFinanciada;

    @ApiModelProperty(value = "cal_numero_poliza de la tabla calificacion dependiendo del core del negocio ", example = "0000081")
    @Basic
    @Column(name = "cal_numero_poliza")
    private String calNumeroPoliza;

    @ApiModelProperty(value = "cal_numero_factura de la tabla calificacion dependiendo del core del negocio ", example = "002002000028238")
    @Basic
    @Column(name = "cal_numero_factura")
    private String calNumeroFactura;

    @ApiModelProperty(value = "cal_numero_anexo de la tabla calificacion dependiendo del core del negocio ", example = "000009")
    @Basic
    @Column(name = "cal_numero_anexo")
    private String calNumeroAnexo;

    @ApiModelProperty(value = "cal_fecha_emi_poliza de la tabla calificacion dependiendo del core del negocio ", example = "2022-11-14 00:00:00.000")
    @Basic
    @Column(name = "cal_fecha_emi_poliza")
    private Timestamp calFechaEmiPoliza;

    @ApiModelProperty(value = "cal_fecha_ven_poliza de la tabla calificacion dependiendo del core del negocio ", example = "2023-06-20 00:00:00.000")
    @Basic
    @Column(name = "cal_fecha_ven_poliza")
    private Timestamp calFechaVenPoliza;

    @ApiModelProperty(value = "cal_observacion de la tabla calificacion dependiendo del core del negocio ", example = "http://polizaelectronica.hispanadeseguros.com:8030/pdocumentos/desa/50/50-0000024-000028.pdf")
    @Basic
    @Column(name = "cal_observacion")
    private String calObservacion;


    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "cal_usuario_creacion")
    private String calUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "cal_fecha_creacion")
    private Timestamp calFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "cal_usuario_modificacion")
    private String calUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "cal_fecha_modificacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp calFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "cal_estado", columnDefinition = "Integer default 11")
    private int calEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "cal_eliminado", columnDefinition = "boolean default false")
    private boolean calEliminado;



}
