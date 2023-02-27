package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "dato_conyuge", schema = "sc_seguro_agricola")
public class DatoConyuge {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "dat_cony_id")
    private int datConyId;
    @Basic
    @Column(name = "dat_cony_cedula")
    private String datConyCedula;
    @Basic
    @Column(name = "dat_cony_nombre")
    private String datConyNombre;
    @Basic
    @Column(name = "dat_cony_apellido")
    private String datConyApellido;
    @Basic
    @Column(name = "dat_cony_nacionalidad")
    private String datConyNacionalidad;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/
    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "dat_cony_usuario_creacion")
    private String datConyUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "dat_cony_fecha_creacion")
    private LocalDateTime datConyFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "dat_cony_usuario_modificacion")
    private String datConyUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "dat_cony_fecha_modificacion")
    private LocalDateTime datConyFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "dat_cony_estado")
    private Integer datConyEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "dat_cony_eliminado")
    private Boolean datConyEliminado;


}
