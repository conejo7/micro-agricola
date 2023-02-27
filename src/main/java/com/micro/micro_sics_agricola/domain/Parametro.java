package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "parametro", schema = "sc_seguro_agricola")
public class Parametro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "para_id")
    private int paraId;
    @Basic
    @Column(name = "para_nombr")
    private String paraNombr;
    @Basic
    @Column(name = "para_valor_txt")
    private String paraValorTxt;
    @Basic
    @Column(name = "para_valor_num")
    private Integer paraValorNum;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "para_usuario_creacion")
    private String paraUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "para_fecha_creacion")
    private Timestamp paraFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "para_usuario_modificacion")
    private String paraUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "para_fecha_modificacion")
    private Timestamp paraFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "para_estado")
    private int paraEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "para_eliminado")
    private boolean paraEliminado;

}
