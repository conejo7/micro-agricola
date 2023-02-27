package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "facilitador_operadora", schema = "sc_seguro_agricola")
public class FacilitadorOperadora {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "fac_ope_id", nullable = false)
    private Integer facOpeId;
    @Basic
    @Column(name = "ope_seg_id", nullable = true, insertable = false, updatable = false)
    private Integer opeSegId;
    @Basic
    @Column(name = "fac_id", nullable = true)
    private Integer facId;


    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "fac_ope_usuario_creacion", nullable = false, length = 512)
    private String facOpeUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "fac_ope_fecha_creacion", nullable = false)
    private Timestamp facOpeFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "fac_ope_usuario_modificacion", nullable = true, length = 512)
    private String facOpeUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "fac_ope_fecha_modificacion", nullable = true)
    private Timestamp facOpeFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "fac_ope_estado", nullable = false)
    private Integer facOpeEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "fac_ope_eliminado", nullable = false)
    private Boolean facOpeEliminado;


    @ManyToOne
    @JoinColumn(name = "ope_seg_id", referencedColumnName = "ope_seg_id")
    private OperadoraSeguro operadoraSeguroByOpeSegId;


}
