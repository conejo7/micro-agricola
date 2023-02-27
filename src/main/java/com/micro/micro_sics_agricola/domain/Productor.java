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
@Table(name = "productor", schema = "sc_seguro_agricola")
public class Productor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pro_id")
    private int proId;
    @Basic
    @Column(name = "cat_id_sexo")
    private int catIdSexo;
    @Basic
    @Column(name = "pro_cedula")
    private String proCedula;
    @Basic
    @Column(name = "pro_nombres")
    private String proNombres;
    @Basic
    @Column(name = "pro_apellidos")
    private String proApellidos;
    @Basic
    @Column(name = "pro_fecha_nacimiento")
    private LocalDate proFechaNacimiento;
    @Basic
    @Column(name = "pro_lugar_nacimiento")
    private String proLugarNacimiento;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "pro_usuario_creacion")
    private String proUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "pro_fecha_creacion")
    private Timestamp proFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @Basic
    @Column(name = "pro_usuario_modificacion")
    private String proUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "pro_fecha_modificacion")
    private Timestamp proFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "pro_estado")
    private int proEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "pro_eliminado")
    private boolean proEliminado;


}
