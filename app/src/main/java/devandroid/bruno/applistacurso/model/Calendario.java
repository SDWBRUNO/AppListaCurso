package devandroid.bruno.applistacurso.model;

public class Calendario {


    private String janeiro;
    private String fevereiro;
    private String marco;
    private String abril;
    private String maio;
    private String junho;
    private String julho;
    private String agosto;
    private String setembre;
    private String outubro;
    private String novembro;
    private String dezembro;

    public Calendario(){}



    public String getJaneiro() {
        return janeiro;
    }

    public void setJaneiro(String janeiro) {
        this.janeiro = janeiro;
    }

    public String getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(String fevereiro) {
        this.fevereiro = fevereiro;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public String getAbril() {
        return abril;
    }

    public void setAbril(String abril) {
        this.abril = abril;
    }

    public String getMaio() {
        return maio;
    }

    public void setMaio(String maio) {
        this.maio = maio;
    }

    public String getJunho() {
        return junho;
    }

    public void setJunho(String junho) {
        this.junho = junho;
    }

    public String getJulho() {
        return julho;
    }

    public void setJulho(String julho) {
        this.julho = julho;
    }

    public String getAgosto() {
        return agosto;
    }

    public void setAgosto(String agosto) {
        this.agosto = agosto;
    }

    public String getSetembre() {
        return setembre;
    }

    public void setSetembre(String setembre) {
        this.setembre = setembre;
    }

    public String getOutubro() {
        return outubro;
    }

    public void setOutubro(String outubro) {
        this.outubro = outubro;
    }

    public String getNovembro() {
        return novembro;
    }

    public void setNovembro(String novembro) {
        this.novembro = novembro;
    }

    public String getDezembro() {
        return dezembro;
    }

    public void setDezembro(String dezembro) {
        this.dezembro = dezembro;
    }

    @Override
    public String toString() {
        return "Calendario{" +
                "janeiro='" + janeiro + '\'' +
                ", fevereiro='" + fevereiro + '\'' +
                ", marco='" + marco + '\'' +
                ", abril='" + abril + '\'' +
                ", maio='" + maio + '\'' +
                ", junho='" + junho + '\'' +
                ", julho='" + julho + '\'' +
                ", agosto='" + agosto + '\'' +
                ", setembre='" + setembre + '\'' +
                ", outubro='" + outubro + '\'' +
                ", novembro='" + novembro + '\'' +
                ", dezembro='" + dezembro + '\'' +
                '}';
    }
}
