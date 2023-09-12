package gm.datos;

import gm.conexion.Conexion;
import gm.dominio.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static gm.conexion.Conexion.getConexion;

public class EstudianteDAO {
    public List<Estudiante>listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion()
        String sql = "SELECT * FROM estudiante ORDER BY id_estudiante";
        try{
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        while(rs.next()){
            var estudiante = new Estudiante();
            estudiante.setIdEstudiante(rs.getInt("id_estudiante"));

        }



        } catch (Exception e){
            System.out.println();
        }

    }
