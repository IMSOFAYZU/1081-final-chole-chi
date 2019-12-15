/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.soa.pokemonstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lendle
 */
public class ListPokemons {
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListPokemons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try(Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/pokemonstore?characterEncoding=utf8", "pokemon", "pokemon")){
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from pokemon order by price");
            while(rs.next()){
                System.out.println(rs.getString("name")+", "+rs.getDouble("price"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ListPokemons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
