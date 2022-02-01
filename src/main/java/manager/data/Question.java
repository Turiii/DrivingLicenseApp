package manager.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "question")
public class Question {

    public Question() {
    }

    @Id
    @Column(name = "numer_pytania")
    private int numer_pytania;

    @Column(name = "pytanie")
    private String trescPL;

    @Column(name = "odpowied_a")
    private String odp_PL_A;

    @Column(name = "odpowied_b")
    private String odp_PL_B;

    @Column(name = "odpowied_c")
    private String odp_PL_C;

    @Column(name = "pytanie_eng")
    private String trescENG;

    @Column(name = "odpowied_eng_a")
    private String odp_ENG_A;

    @Column(name = "odpowied_eng_b")
    private String odp_ENG_B;

    @Column(name = "odpowied_eng_c")
    private String odp_ENG_C;

    @Column(name = "pytanie_de")
    private String trescDE;

    @Column(name = "odpowied_de_a")
    private String odp_DE_A;

    @Column(name = "odpowied_de_b")
    private String odp_DE_B;

    @Column(name = "odpowied_de_c")
    private String odp_DE_C;

    @Column(name = "poprawna_odp")
    private String poprawna_odp;

    @Column(name = "media")
    private String zalacznik;

    @Column(name = "zakres_struktury")
    private String rodzaj;

    @Column(name = "liczba_punkt_w")
    private int wartosc;

    @Column(name = "kategorie")
    private String kategorie;

    @Column(name = "nazwa_bloku")
    private String nazwa_bloku;

    public Question(int numer_pytania, String trescPL, String odp_PL_A, String odp_PL_B, String odp_PL_C, String trescENG, String odp_ENG_A, String odp_ENG_B, String odp_ENG_C, String trescDE, String odp_DE_A, String odp_DE_B, String odp_DE_C, String poprawna_odp, String zalacznik, String rodzaj, int wartosc, String kategorie, String nazwa_bloku) {
        this.numer_pytania = numer_pytania;
        this.trescPL = trescPL;
        this.odp_PL_A = odp_PL_A;
        this.odp_PL_B = odp_PL_B;
        this.odp_PL_C = odp_PL_C;
        this.trescENG = trescENG;
        this.odp_ENG_A = odp_ENG_A;
        this.odp_ENG_B = odp_ENG_B;
        this.odp_ENG_C = odp_ENG_C;
        this.trescDE = trescDE;
        this.odp_DE_A = odp_DE_A;
        this.odp_DE_B = odp_DE_B;
        this.odp_DE_C = odp_DE_C;
        this.poprawna_odp = poprawna_odp;
        this.zalacznik = zalacznik;
        this.rodzaj = rodzaj;
        this.wartosc = wartosc;
        this.kategorie = kategorie;
        this.nazwa_bloku = nazwa_bloku;
    }

    public int getNumer_pytania() {
        return numer_pytania;
    }

    public String getTrescPL() {
        return trescPL;
    }

    public String getOdp_PL_A() {
        return odp_PL_A;
    }

    public String getOdp_PL_B() {
        return odp_PL_B;
    }

    public String getOdp_PL_C() {
        return odp_PL_C;
    }

    public String getTrescENG() {
        return trescENG;
    }

    public String getOdp_ENG_A() {
        return odp_ENG_A;
    }

    public String getOdp_ENG_B() {
        return odp_ENG_B;
    }

    public String getOdp_ENG_C() {
        return odp_ENG_C;
    }

    public String getTrescDE() {
        return trescDE;
    }

    public String getOdp_DE_A() {
        return odp_DE_A;
    }

    public String getOdp_DE_B() {
        return odp_DE_B;
    }

    public String getOdp_DE_C() {
        return odp_DE_C;
    }

    public String getPoprawna_odp() {
        return poprawna_odp;
    }

    public String getZalacznik() {
        return zalacznik;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public int getWartosc() {
        return wartosc;
    }

    public String getKategorie() {
        return kategorie;
    }

    public String getNazwa_bloku() {
        return nazwa_bloku;
    }
}
