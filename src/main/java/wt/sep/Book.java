package wt.sep.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("books")
public class Book {
    @Id
    private Long id;
    private String titel;
    private String auteur;
    private int aantalExemplaren;
    private String afbeeldingURL;

    // Constructors
    public Book() {}

    public Book(String titel, String auteur, int aantalExemplaren, String afbeeldingURL) {
        this.titel = titel;
        this.auteur = auteur;
        this.aantalExemplaren = aantalExemplaren;
        this.afbeeldingURL = afbeeldingURL;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAantalExemplaren() {
        return aantalExemplaren;
    }

    public void setAantalExemplaren(int aantalExemplaren) {
        this.aantalExemplaren = aantalExemplaren;
    }

    public String getAfbeeldingURL() {
        return afbeeldingURL;
    }

    public void setAfbeeldingURL(String afbeeldingURL) {
        this.afbeeldingURL = afbeeldingURL;
    }
}