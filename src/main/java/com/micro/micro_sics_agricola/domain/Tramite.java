package com.micro.micro_sics_agricola.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Data
@Table(name = "tramite", schema = "sc_seguro_agricola")
public class Tramite {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @ApiModelProperty(value = "tra_id de la tabla tramite dependiendo del core del negocio", example = "12417")
    @Column(name = "tra_id")
    private int traId;

    @ApiModelProperty(value = "suc_id de la tabla sucursal dependiendo del core del negocio", example = "459")
    @Basic
    @Column(name = "suc_id")
    private Integer sucId;

    @ApiModelProperty(value = "dat_pro_id de la tabla dato productor dependiendo del core del negocio", example = "12503")
    @Basic
    @Column(name = "dat_pro_id")
    private Integer datProId;

    @ApiModelProperty(value = "pre_id del predio dependiendo del core del negocio", example = "12615")
    @Basic
    @Column(name = "pre_id")
    private Integer preId;

    @ApiModelProperty(value = "cat_estado_subvencion del trámite dependiendo del core del negocio, 13 aprobado, 16 anulado, 15 negado", example = "13")
    @Basic
    @Column(name = "cat_estado_subvencion")
    private int catEstadoSubvencion;

    @ApiModelProperty(value = "tra_codigo código del trámite dependiendo del core del negocio", example = "1-0009103")
    @Basic
    @Column(name = "tra_codigo")
    private String traCodigo;

    @ApiModelProperty(value = "tra_codigo_subvencion código de subvencion del trámite, null en caso de ser negada", example = "230118-009101")
    @Basic
    @Column(name = "tra_codigo_subvencion")
    private String traCodigoSubvencion;

    @ApiModelProperty(value = "tra_fecha_solicitud del trámite dependiendo del core del negocio ", example = "2023-01-17 11:24:30.545")
    @Basic
    @Column(name = "tra_fecha_solicitud")
    private LocalDateTime traFechaSolicitud;

    @ApiModelProperty(value = "tra_valor_porcentaje_subvencion valor de subvencion del trámite, 0 en caso de ser negada", example = "100.00")
    @Basic
    @Column(name = "tra_valor_porcentaje_subvencion")
    private Double traValorPorcentajeSubvencion;

    @ApiModelProperty(value = "tra_plazo_vencimiento del trámite dependiendo del core del negocio ", example = "365")
    @Basic
    @Column(name = "tra_plazo_vencimiento")
    private Integer traPlazoVencimiento;

    @ApiModelProperty(value = "tra_asistencia_tecnica del trámite verdadero o falso", example = "true, false")
    @Basic
    @Column(name = "tra_asistencia_tecnica")
    private boolean traAsistenciaTecnica;

    @ApiModelProperty(value = "tra_porcentaje_subvencion del trámite", example = "20,40,60")
    @Basic
    @Column(name = "tra_porcentaje_subvencion")
    private Double traPorcentajeSubvencion;

    @ApiModelProperty(value = "tra_json_envio json que se envía a hispana", example = "{\"cultivo\":{\"fechaInicioActividades\":\"\",\"superficieTotalCultivo\":5.0,\"costoProduccion\":1250,\"porcentajeSubvencion\":60,\"montoAsegurado\":6250.0,\"codigoVariedadCultivo\":9999,\"superficieAsegurada\":5.0,\"codigoCultivo\":5,\"tipoSemilla\":1,\"fechaTentativaSiembra\":\"06/02/2023\"},\"predio\":{\"recinto\":\"EL CERRO\",\"tipoRiego\":null,\"condicionPredio\":\"A\",\"parroquia\":\"130357\",\"canton\":\"1303\",\"utmZ\":\"\",\"provincia\":\"13\",\"calleReferencia\":\"SITIO EL CERRO PAJA DE LA VIRGEN 0 VIA LA MARGARITA PROPIEDAD DE KARINA TALLEDO\",\"utmX\":\"-0.636274\",\"disponeRiego\":false,\"utmY\":\"-80.209042\"},\"tramite\":{\"nombresUsuario\":\"JIMENA DEL PILAR\",\"tipoFacilitador\":2,\"asistenciaTecnica\":true,\"codigoSubvencion\":\"230124-006288\",\"fechaSolicitud\":\"24/01/2023\",\"apellidosUsuario\":\"RODRIGUEZ NAVARRETE\",\"estadoSubvencion\":1,\"correoUsuario\":\"jimena.rodriguez@banecuador.fin.ec\",\"codigoTramite\":\"4378-3086495\",\"celularUsuario\":\"0998941203\",\"facilitador\":4378},\"productor\":{\"nacionalidadConyuge\":null,\"telefonoReferencia\":null,\"fechaNacimiento\":\"06/08/1978\",\"cedula\":\"1309726980\",\"nombreReferencia\":null,\"direccionDomicilio\":\"MANABI/CHONE/SAN ANTONIO/SITIO EL CERRO PAJA DE LA VIRGEN,SN,VIA LA MARGARITA,A 2KM DESPUES DE LA ESC NICOLAS MOREIRA PINO\",\"nombresConyuge\":null,\"fuenteIngreso\":false,\"nombres\":\"MARCOS ANTONIO\",\"nacionalidad\":\"ECU\",\"egresoAnual\":0.0,\"apellidosConyuge\":null,\"celular\":\"0998470261\",\"pep\":false,\"telefono\":\" \",\"email\":\"\",\"activoAnual\":0.0,\"parentescoReferencia\":null,\"apellidos\":\"FRANCO MARIN\",\"estadoCivil\":\"S\",\"actividadEconomica\":\"004003001\",\"sexo\":\"M\",\"lugarNacimiento\":\"MANABI/TOSAGUA/\",\"ingresoAnual\":27975.0,\"pasivoAnual\":0.0,\"cedulaConyuge\":null}}")
    @Basic
    @Column(name = "tra_json_envio")
    private String traJsonEnvio;

    @ApiModelProperty(value = "tra_nombre_usuario nombre de la persona que carga el trámite", example = "JIMENA DEL PILAR")
    @Basic
    @Column(name = "tra_nombre_usuario")
    private String traNombreUsuario;

    @ApiModelProperty(value = "tra_apellido_usuario apellido de la persona que carga el trámite", example = "RODRIGUEZ NAVARRETE")
    @Basic
    @Column(name = "tra_apellido_usuario")
    private String traApellidoUsuario;

    @ApiModelProperty(value = "tra_celular celular de la persona que carga el trámite", example = "0998941203")
    @Basic
    @Column(name = "tra_celular")
    private String traCelular;

    @ApiModelProperty(value = "tra_correo Correo de la persona que carga el trámite", example = "jimena.rodriguez@banecuador.fin.ec")
    @Basic
    @Column(name = "tra_correo")
    private String traCorreo;

    @ApiModelProperty(value = "tra_estado_tramite 1=Guardado; 2=Enviado ;3=Calificación", example = "3")
    @Basic
    @Column(name = "tra_estado_tramite")
    private Integer traEstadoTramite;

    @ApiModelProperty(value = "tra_observacion_envio motivo por el cual no se realizo el envío", example = "Servicio web de hispana no esta funcionando")
    @Basic
    @Column(name = "tra_observacion_envio")
    private String traObservacionEnvio;

    @ApiModelProperty(value = "tra_observacion_anulacion motivo por el cual se anula el tramite", example = "solicitud del técnico")
    @Basic
    @Column(name = "tra_observacion_anulacion")
    private String traOservacionAnulacion;


    @ApiModelProperty(value = "tra_num_convenio codigo al que pertenece el convenio", example = "CTA-003")
    @Basic
    @Column(name = "tra_num_convenio")
    private String traNumConvenio;

    /*****************************************************
     * SECCION - CAMPOS POR DEFECTO EN TODAS LAS ENTIDADES
     *****************************************************/

    @ApiModelProperty(value = "Id de usuario que creó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @NotNull(message = "_error.validation_blank.message")
    @Basic
    @Column(name = "tra_usuario_creacion")
    private String traUsuarioCreacion;

    @ApiModelProperty(value = "Fecha de registro del campo", example = "")
    @Basic
    @Column(name = "tra_fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime traFechaCreacion;

    @ApiModelProperty(value = "Id de usuario que modificó el regristro", example = "")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Basic
    @Column(name = "tra_usuario_modificacion", nullable = false)
    private String traUsuarioModificacion;

    @ApiModelProperty(value = "Fecha en la que hizo la actualización del registro", example = "")
    @Basic
    @Column(name = "tra_fecha_modificacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime traFechaModificacion;

    @ApiModelProperty(value = "11=activo  12=inactivo", required = true,
            allowableValues = "11=>activo, 12=>inactivo", example = "11")
    @Basic
    @Column(name = "tra_estado", columnDefinition = "Integer default 11")
    private int traEstado;

    @ApiModelProperty(value = "Este campo almacena los valores f =false para eliminado logico  y t= true para indicar eliminado logico ", required = true, allowableValues = "false=>no eliminado lógico, true=> eliminado lógico", example = "")
    @Basic
    @Column(name = "tra_eliminado", columnDefinition = "boolean default false")
    private boolean traEliminado;

}
