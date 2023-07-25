package devandroid.bruno.applistacurso.model;

public class Musica {

    private String musica;
    private String rock;
    private String eletronica;
    private String forro;
    private String sertanejo;




    public Musica(){}

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getRock() {
        return rock;
    }

    public void setRock(String rock) {
        this.rock = rock;
    }

    public String getEletronica() {
        return eletronica;
    }

    public void setEletronica(String eletronica) {
        this.eletronica = eletronica;
    }

    public String getForro() {
        return forro;
    }

    public void setForro(String forro) {
        this.forro = forro;
    }

    public String getSetanejo() {
        return sertanejo;
    }

    public void setSetanejo(String setanejo) {
        this.sertanejo = setanejo;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "musica='" + musica + '\'' +
                ", rock='" + rock + '\'' +
                ", eletronica='" + eletronica + '\'' +
                ", forro='" + forro + '\'' +
                ", sertanejo='" + sertanejo + '\'' +
                '}';
    }
}
