package devandroid.bruno.applistacurso.model;

public class Fruta {

    private String fruta;
    private String abacate;
    private String kaki;
    private String mamao;
    private String banana;

    public Fruta(){}

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    public String getAbacate() {
        return abacate;
    }

    public void setAbacate(String abacate) {
        this.abacate = abacate;
    }

    public String getKaki() {
        return kaki;
    }

    public void setKaki(String kaki) {
        this.kaki = kaki;
    }

    public String getMamao() {
        return mamao;
    }

    public void setMamao(String mamao) {
        this.mamao = mamao;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "fruta='" + fruta + '\'' +
                ", abacate='" + abacate + '\'' +
                ", kaki='" + kaki + '\'' +
                ", mamao='" + mamao + '\'' +
                ", banana='" + banana + '\'' +
                '}';
    }
}
