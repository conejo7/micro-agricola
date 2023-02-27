package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "catalogo", schema = "sc_seguro_agricola")
public class Catalogo {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @ApiModelProperty(value = "cat_id de la tabla Catalogo dependiendo del core del negocio ", example = "1")
    @Column(name = "cat_id")
    private int catId;

    @ApiModelProperty(value = "gru_cat_id de la tabla Catalogo dependiendo del core del negocio ", example = "1")
    @Basic
    @Column(name = "gru_cat_id")
    private Integer gruCatId;

    @ApiModelProperty(value = "cat_nemonico de la tabla Catalogo dependiendo del core del negocio ", example = "GRC_011")
    @NotEmpty
    @Size(min=4,max=30)
    @Basic
    @Column(name = "cat_nemonico")
    private String catNemonico;

    @ApiModelProperty(value = "cat_codigo de la tabla Catalogo dependiendo del core del negocio ", example = "GRC_008")
    @Basic
    @Column(name = "cat_codigo")
    private String catCodigo;

    @ApiModelProperty(value = "cat_id_cgtic de la tabla Catalogo dependiendo del core del negocio ", example = "")
    @Basic
    @Column(name = "cat_id_cgtic")
    private String catIdCgtic;

    @ApiModelProperty(value = "cat_nom_catalogo de la tabla Catalogo dependiendo del core del negocio ", example = "Comercio por mayor de animales vivos y sus productos")
    @Basic
    @Column(name = "cat_nom_catalogo")
    private String catNomCatalogo;

    @ApiModelProperty(value = "cat_valor_numerico de la tabla Catalogo dependiendo del core del negocio ", example = "1500")
    @Basic
    @Column(name = "cat_valor_numerico")
    private BigInteger catValorNumerico;

    @ApiModelProperty(value = "cat_descripcion de la tabla Catalogo dependiendo del core del negocio ", example = "TIPO DE CULTIVO PERENNE MANTENIMIENTO")
    @Basic
    @Column(name = "cat_descripcion")
    private String catDescripcion;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "cat_usuario_creacion")
    private String catUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "cat_fecha_creacion")
    private Timestamp catFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "cat_usuario_modificacion")
    private String catUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "cat_fecha_modificacion")
    private Timestamp catFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "cat_estado")
    private int catEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "cat_eliminado")
    private boolean catEliminado;


}
