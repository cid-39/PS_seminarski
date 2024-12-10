/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import broker.DBBroker;
import domain.Dobavljac;
import domain.Roba;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cid
 */
public class Controller {
    private static Controller instance;
    
    private DBBroker broker;
    private Controller() {
        broker = new DBBroker();
        try {
            broker.connect();
        } catch (SQLException ex) {
            System.out.println("Controller: error connecting to database");
        }
    }
    public static Controller getInstance() {
        if (instance==null)
            instance = new Controller();
        return instance;
    }
    
    public boolean registerDobavljac(Dobavljac dobavljac) {
        try {
            return broker.registerDobavljac(dobavljac);
        } catch (SQLException ex) {
            System.out.println("Controller: error in registerDobavljac");
        }
       return false;
    }
    
    public Dobavljac loginDobavljac(String email, String password) {
        try {
            return broker.loginDobavljac(email, password);
        } catch (SQLException ex) {
            System.out.println("Controller: error in loginDobavljac");
        }
        return null;
    }

    public LinkedList<Roba> getAllRoba() {
        try {
            return broker.getAllRoba();
        } catch (SQLException ex) {
            System.out.println("Controller: error in getAllRoba");
        }
        return null;
    }
    
    public LinkedList<Roba> getRobaForDobavljac(int idDobavljac) {
        try {
            return broker.getRobaForDobavljac(idDobavljac);
        } catch (SQLException ex) {
            System.out.println("Controller: error in getRobaForDobavljac");
        }
        return null;
    }

    public void insertRoba(int idDobavljac, Roba roba) {
        try {
            broker.insertRoba(idDobavljac, roba);
        } catch (SQLException ex) {
            System.out.println("Controller: error in insertRoba");
        }
    }
    
    public int deleteRoba(LinkedList<Long> robaID) {
        int affectedRows=0;
        try {
            for (Long id : robaID)
                affectedRows += broker.deleteRoba(id);
            return affectedRows;
        } catch (SQLException ex) {
            System.out.println("Controller: error in deleteRoba");
            return 0;    
        }
    }
}

