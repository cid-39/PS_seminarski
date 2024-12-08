/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author cid
 */
public class Dobavljac {
    private int idDobavljac;
    private String naziv;
    private String email;
    private String lozinka;
    private String opis;
    private String brojRacuna;

    public Dobavljac() {
    }

    public Dobavljac(int idDobavljac, String naziv, String email, String lozinka, String brojRacuna) {
        this.idDobavljac = idDobavljac;
        this.naziv = naziv;
        this.email = email;
        this.lozinka = lozinka;
        this.brojRacuna = brojRacuna;
    }

    public int getIdDobavljac() {
        return idDobavljac;
    }

    public void setIdDobavljac(int idDobavljac) {
        this.idDobavljac = idDobavljac;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    @Override
    public String toString() {
        return "Dobavljac{" + "idDobavljac=" + idDobavljac + ", naziv=" + naziv + ", email=" + email + ", lozinka=" + lozinka + ", opis=" + opis + ", brojRacuna=" + brojRacuna + '}';
    }
    
}
