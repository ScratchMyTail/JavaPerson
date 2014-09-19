package no.hinesna;

import java.io.Serializable;

/**
 * Created by christerhansen on 12.09.14.
 */
public class Person implements Serializable {
    private String forNavn;
    private String etterNavn;

    public Person(String forNavn, String etterNavn){
        this.forNavn = forNavn;
        this.etterNavn = etterNavn;
    }

    public String getForNavn() {
        return forNavn;
    }

    public void setForNavn(String forNavn) {
        this.forNavn = forNavn;
    }

    public String getEtterNavn() {
        return etterNavn;
    }

    public void setEtterNavn(String etterNavn) {
        this.etterNavn = etterNavn;
    }
}
