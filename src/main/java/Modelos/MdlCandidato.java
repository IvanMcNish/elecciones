/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class MdlCandidato {
    
    ClsJdbc jdbc;
    public MdlCandidato(){
               
    
        
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
       }
                
    
    
    public boolean agregarCandidato(ClsCandidato candidato){
        

       // String sql = "Insert into bd_elecciones.tbl_candidatos (id_candidato, tipo_documento, nombre, telefono, correo, partido_politico,ciudad_origen,descripcion,mensaje_campania,propuestas) values (?,?,?,?,?,?,?,?,?,?)";

        try {
            
            String consulta = "Insert into bd_elecciones_g8.tbl_candidatos (id_candidato, tipoDocumento, nombre, correo, telefono,propuesta, partido_politico,mensaje_campania,descripcion,ciudad_origen) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            PreparedStatement insert = sentencia;
            insert.setString(1, candidato.getNumeroDocumento());
            insert.setString(2, candidato.getTipoDocumento());
            insert.setString(3, candidato.getNombre());
            insert.setString(4, candidato.getCorreo());
            insert.setString(5, candidato.getTelefono());
            insert.setString(6, candidato.getPropuestas());
            insert.setString(7, candidato.getPartidoPolitico());
            insert.setString(8, candidato.getMensajeCampania());
            insert.setString(9, candidato.getDescripcion());
            insert.setString(10, candidato.getCiudadOrigen());
            insert.execute();
            return true;
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "Error en la conexion" + e);
            return false;
        
        }
    }

    public LinkedList <ClsCandidato> ObtenerCandidatos(){
        try {
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            String consulta = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            while(resultados.next()){
                String correo = resultados.getString("correo");
                String telefono = resultados.getString("telefono");
                String ciudadOrigen = resultados.getString("ciudad_origen");
                String descripcion = resultados.getString("descripcion");
                String propuestas = resultados.getString("propuesta");
                String tipoDocumento = resultados.getString("tipoDocumento");
                String partido = resultados.getString("partido_politico");
                String campania = resultados.getString("mensaje_campania");
                String cedula = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                ClsCandidato candidato = new ClsCandidato( cedula,  tipoDocumento,  nombre, telefono,  correo, partido,  ciudadOrigen,  descripcion,  campania,  propuestas);
                lista.add(candidato);
            }
            return lista;
            
            } catch (Exception e){
                return null;
            }
    }
}
