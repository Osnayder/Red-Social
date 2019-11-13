/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cecar.modelo;

import java.util.ArrayList;
import java.util.Date;

/** Clase: 
 * 
 * @version: 1.0
 *  
 * @sincelejo: 21/08/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */

public class Usuario {
    private int idUsuario;
    private String nombres;
    private String apellidos;
    private Date fechanacimiento;
    private byte[] foto;
    private String direccion;
    private ArrayList celular;
    private ArrayList telefonos;
    private ArrayList otrasredes;
    private Date ulitmaconexion;
    private boolean estadoconexion;
    private String departamento;
    private String descripcion;
    private String contrasena;

    public Usuario(int idUsuario, String nombres, String apellidos, Date fechanacimiento, byte[] foto, String direccion, ArrayList celular, ArrayList telefonos, ArrayList otrasredes, Date ulitmaconexion, boolean estadoconexion, String departamento, String descripcion, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.foto = foto;
        this.direccion = direccion;
        this.celular = celular;
        this.telefonos = telefonos;
        this.otrasredes = otrasredes;
        this.ulitmaconexion = ulitmaconexion;
        this.estadoconexion = estadoconexion;
        this.departamento = departamento;
        this.descripcion = descripcion;
        this.contrasena = contrasena;
    }
    
    
}
