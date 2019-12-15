/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.soa.pokemonstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lendle
 */
public class BuyMore {
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
            conn.setAutoCommit(false);
            PreparedStatement pstmt=conn.prepareStatement("insert into order_detail  (`pokemon_id`, `amount`, `order_id`) VALUES (?,?,?)");
            pstmt.setInt(1, 6);
            pstmt.setInt(2, 1);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();
            
            pstmt.setInt(1, 7);
            pstmt.setInt(2, 2);
            pstmt.setInt(3, 2);
            pstmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            Logger.getLogger(ListPokemons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
