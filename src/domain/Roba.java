/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Roba other = (Roba) obj;
        if (this.dostupnaKolicina != other.dostupnaKolicina) {
            return false;
        }
        if (Double.doubleToLongBits(this.cena) != Double.doubleToLongBits(other.cena)) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        return Objects.equals(this.opis, other.opis);
    }
    
    
}
