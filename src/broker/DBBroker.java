/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package broker;

import domain.Dobavljac;
import domain.Roba;
import java.sql.*;
import java.util.LinkedList;

/**
 *
 * @author cid
 */
public class DBBroker {
    private Connection connection;
    
    public void connect() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/SeminarskiProdajaKafe";
            String user = "root";
            String pass = "root";
            connection = DriverManager.getConnection(url,user,pass);
            connection.setAutoCommit(false);
            System.out.println("DBBroker: connection established");
        } catch (SQLException e) {
            System.out.println("DBBroker: error establishing connection");
            e.printStackTrace();
            throw e;
        }
    }
    
    public void disconnect() throws SQLException {
        if (connection==null || connection.isClosed())
            return;
        try {
            connection.close();
            System.out.println("DBBroker: disconnected");
        } catch (SQLException e) {
            System.out.println("DBBroker: error while disconnecting");
            e.printStackTrace();
            throw e;
        }
    }
    
    ///     DOBAVLJAC
    public Dobavljac loginDobavljac(String email, String password) throws SQLException {
        Dobavljac retDobavljac = new Dobavljac();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Dobavljac WHERE email=? AND lozinka=?");
            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
               retDobavljac.setIdDobavljac(rs.getInt(1));
               retDobavljac.setNaziv(rs.getString(2));
               retDobavljac.setEmail(rs.getString(3));
               retDobavljac.setLozinka(rs.getString(4));
               retDobavljac.setOpis(rs.getString(5));
               retDobavljac.setBrojRacuna(rs.getString(6));
            } else 
                return null;
            return retDobavljac;
        } catch (SQLException e) {
            System.out.println("DBBroker: error in loginDobavljac");
            e.printStackTrace();
            throw e;
        }
    }
    
    public boolean registerDobavljac(Dobavljac dobavljac) throws SQLException {
        try{
            String query = "INSERT INTO Dobavljac (idDobavljac, naziv, email, lozinka, opis, brojRacuna) VALUES (?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, dobavljac.getIdDobavljac());
            statement.setString(2, dobavljac.getNaziv());
            statement.setString(3, dobavljac.getEmail());
            statement.setString(4, dobavljac.getLozinka());
            statement.setString(5,"");
            statement.setString(6, dobavljac.getBrojRacuna());
            if (statement.executeUpdate() == 1) {
                connection.commit();
                return true;
            }
            throw new SQLException("nije ubacen 1");
        } catch (SQLException e) {
            System.out.println("DBBroker: error in registerDobavljac");
            System.out.println("DBBroker: doing rollback");
            connection.rollback();
            e.printStackTrace();
            throw e;
        }
    }
    ///     KRAJ DOBAVLJAC
    
    ///     ROBA
    public LinkedList<Roba> getAllRoba() throws SQLException{
        LinkedList<Roba> retList = new LinkedList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Roba");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
               Roba novaRoba = new Roba(rs.getLong("idRoba"), rs.getString("naziv"), rs.getString("opis"), rs.getInt("dostupnaKolicina"), rs.getDouble("cena"));
               retList.add(novaRoba);
            }
            return retList;
        } catch (SQLException e) {
            System.out.println("DBBroker: error in getAllRoba");
            e.printStackTrace();
            throw e;
        }
        
    }
    
    public LinkedList<Roba> getRobaForDobavljac(int idDobavljac) throws SQLException {
        LinkedList<Roba> retList = new LinkedList<>();
        try {
            String in="(";
            PreparedStatement statement = connection.prepareStatement("SELECT idRoba FROM DbRb WHERE idDobavljac=?");
            statement.setInt(1, idDobavljac);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                in = in + rs.getLong(1) + ", ";
            }
            in = in +"0)";
            
            PreparedStatement statement2 = connection.prepareStatement("SELECT * FROM Roba WHERE idRoba in "+in);
            ResultSet rs2 = statement2.executeQuery();
            while (rs2.next()) {
               Roba novaRoba = new Roba(rs2.getLong("idRoba"), rs2.getString("naziv"), rs2.getString("opis"), rs2.getInt("dostupnaKolicina"), rs2.getDouble("cena"));
               retList.add(novaRoba);
            }
            return retList;
        } catch (SQLException e) {
            System.out.println("DBBroker: error in getRobaForDobavljac");
            e.printStackTrace();
            throw e;
        }
    }
    
    public void insertRoba(int idDobavljac, Roba roba) throws SQLException {
        try{
            String query = "INSERT INTO Roba (naziv, opis, dostupnaKolicina, cena) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, roba.getNaziv());
            statement.setString(2, roba.getOpis());
            statement.setInt(3, roba.getDostupnaKolicina());
            statement.setDouble(4, roba.getCena());
            statement.executeUpdate();
            ResultSet rsID = statement.getGeneratedKeys();
            if (rsID.next()) {
                roba.setIdRoba(rsID.getLong(1));
            }
            rsID.close();
            statement.close();
        
            PreparedStatement statement2 = connection.prepareStatement("INSERT INTO DbRb (idDobavljac, idRoba) VALUES (?,?)");
            statement2.setInt(1, idDobavljac);
            statement2.setLong(2, roba.getIdRoba());
            statement2.executeUpdate();
            
            connection.commit();
        } catch (SQLException e) {
            System.out.println("DBBroker: error in insertRoba");
            System.out.println("DBBroker: doing rollback");
            connection.rollback();
            e.printStackTrace();
            throw e;
        }
    }
    ///     KRAJ ROBE
    
    ///     KUPAC
    
    ///     KRAJ KUPAC
    
}
