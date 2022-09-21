package test;

import beans.Equipos;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        listarEquipos();

    }

    public static void actualizarEquipos(int id, String tipo) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE equipos SET tipo = '" + tipo + "'WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {  // desconeta la base de datos
            con.desconectar();
        }
    }

    public static void listarEquipos() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM equipos";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String descripcion = rs.getString("descripcion");
                String tipo = rs.getString("tipo");
                String marca = rs.getString("marca");
                int equipos_disponibles = rs.getInt("equipos_disponibles");
                Equipos equipos = new Equipos(id, descripcion, tipo, marca, equipos_disponibles);
                System.out.println(equipos.toString());

            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {  // desconeta la base de datos
            con.desconectar();
        }
    }
}
