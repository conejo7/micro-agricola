package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "operadora_seguro", schema = "sc_seguro_agricola")
public class OperadoraSeguro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ope_seg_id")
    private Integer id;
    
    @Column(name = "ope_seg_nombre", nullable = false, length = 1024)
    private String nombre;
    
    @Column(name = "ope_seg_codigo", nullable = false, length = 35)
    private String codigo;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Column(name = "ope_seg_usuario_creacion", nullable = false, length = 512)
    private String usuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "ope_seg_fecha_creacion", nullable = false)
    private Timestamp fechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "ope_seg_usuario_modificacion", nullable = true, length = 512)
    private String usuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "ope_seg_fecha_modificacion", nullable = true)
    private Timestamp fechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "ope_seg_estado", nullable = false)
    private Integer estado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "ope_seg_eliminado", nullable = false)
    private Boolean eliminado;

}
