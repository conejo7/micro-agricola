package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "usuario", schema = "sc_seguro_agricola")
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "usu_id")
    private int usuId;
    @Basic
    @Column(name = "can_fin_id")
    private Integer canFinId;
    @Basic
    @Column(name = "usu_cedula")
    private String usuCedula;
    @Basic
    @Column(name = "usu_lectura")
    private boolean usuLectura;
    @Basic
    @Column(name = "usu_escritura")
    private boolean usuEscritura;

    @Basic
    @Column(name = "usu_suc_id")
    private Integer usuSucId;

    @Basic
    @Column(name = "usu_nombres")
    private String usuNombres;
    @Basic
    @Column(name = "usu_apellidos")
    private String usuApellidos;
    @Basic
    @Column(name = "usu_celular")
    private String usuCelular;
    @Basic
    @Column(name = "usu_correo")
    private String usuCorreo;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "usu_usuario_creacion")
    private String usuUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "usu_fecha_creacion")
    private Timestamp usuFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "usu_usuario_modificacion")
    private String usuUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "usu_fecha_modificacion")
    private Timestamp usuFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "usu_estado")
    private int usuEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "usu_eliminado")
    private boolean usuEliminado;



}
