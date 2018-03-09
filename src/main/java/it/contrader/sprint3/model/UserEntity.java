package it.contrader.sprint3.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

    @Id
    private String username;
    @Column
    private String password;
    @Column
    private String nome;
    @Column
    private String cognome;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column
    private Date dataDiNascita;
    @Column
    private String codiceFiscale;
    @Column
    private String CAP;
    @Column
    private String citta;
    @Column
    private String indirizzo;
    @Column
    private String telefono;
    @Column
    private String ruolo;

    public UserEntity(){}

    public UserEntity(String username,String password,String nome,String cognome, Date dataDiNascita,String codiceFiscale,String CAP,String citta,String indirizzo,String telefono,String ruolo){
        this.username=username;
        this.password=password;
        this.nome=nome;
        this.cognome=cognome;
        this.dataDiNascita=dataDiNascita;
        this.codiceFiscale=codiceFiscale;
        this.CAP=CAP;
        this.citta=citta;
        this.indirizzo=indirizzo;
        this.telefono=telefono;
        this.ruolo=ruolo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCAP() {
        return CAP;
    }

    public void setCAP(String CAP) {
        this.CAP = CAP;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(cognome, that.cognome) &&
                Objects.equals(dataDiNascita, that.dataDiNascita) &&
                Objects.equals(codiceFiscale, that.codiceFiscale) &&
                Objects.equals(CAP, that.CAP) &&
                Objects.equals(citta, that.citta) &&
                Objects.equals(indirizzo, that.indirizzo) &&
                Objects.equals(telefono, that.telefono) &&
                Objects.equals(ruolo, that.ruolo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(username, password, nome, cognome, dataDiNascita, codiceFiscale, CAP, citta, indirizzo, telefono, ruolo);
    }
    @Override
    public String toString(){
        return "User: \n"+"Username: "+username+"\nNome: "+nome+"\nCognome: "+cognome+"\nData di nascita: "+dataDiNascita+"\nCodice fiscale: "+codiceFiscale+"\nCAP: "+CAP+"\nCittà: "+citta+"\nIndirizzo: "+indirizzo+"\nTelefono: "+telefono;
    }
}
