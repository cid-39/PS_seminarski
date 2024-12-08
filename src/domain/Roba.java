/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author cid
 */
public class Roba {
    private long idRoba;
    private String naziv;
    private String opis;
    private int dostupnaKolicina;
    private double cena;

    public Roba(long idRoba, String naziv, String opis, int dostupnaKolicina, double cena) {
        this.idRoba = idRoba;
        this.naziv = naziv;
        this.opis = opis;
        this.dostupnaKolicina = dostupnaKolicina;
        this.cena = cena;
    }

    public Roba() {
    }

    public Roba(String naziv, String opis, int dostupnaKolicina, double cena) {
        this.naziv = naziv;
        this.opis = opis;
        this.dostupnaKolicina = dostupnaKolicina;
        this.cena = cena;
    }

    public long getIdRoba() {
        return idRoba;
    }

    public void setIdRoba(long idRoba) {
        this.idRoba = idRoba;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getDostupnaKolicina() {
        return dostupnaKolicina;
    }

    public void setDostupnaKolicina(int dostupnaKolicina) {
        this.dostupnaKolicina = dostupnaKolicina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Roba{" + "idRoba=" + idRoba + ", naziv=" + naziv + ", opis=" + opis + ", dostupnaKolicina=" + dostupnaKolicina + ", cena=" + cena + '}';
    }
    
    
}
