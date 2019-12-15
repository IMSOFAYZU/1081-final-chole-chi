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
            //amy 想多買 6，7 這兩隻寶可夢，使用 transaction 及 prepared statement 新增這兩隻寶可夢
            //到她本來的訂單 (order_id=2)
            
        } catch (SQLException ex) {
            Logger.getLogger(ListPokemons.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
