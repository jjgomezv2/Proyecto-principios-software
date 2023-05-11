package proyecto;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class sqlUsuarios extends Proyecto{
    
    public boolean registrar(usuarios usr){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO usuarios (primer_nombre, apellido, celular, saldo, contrasena, identificacion) VALUES(?,?,?,?,?,?)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getPrimer_nombre());
            ps.setString(2, usr.getApellido());
            ps.setString(3, usr.getCelular());
            ps.setInt(4, usr.getSaldo());
            ps.setString(5, usr.getContrasena());
            ps.setString(6, usr.getIdentificacion());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(sqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
