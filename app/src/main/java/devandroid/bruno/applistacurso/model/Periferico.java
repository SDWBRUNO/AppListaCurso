package devandroid.bruno.applistacurso.model;

public class Periferico {

    private String Periferico;
    private String mouse;
    private String teclado;
    private String mousepad;

    public Periferico(){}

    public String getPeriferico() {
        return Periferico;
    }

    public void setPeriferico(String periferico) {
        Periferico = periferico;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMousepad() {
        return mousepad;
    }

    public void setMousepad(String mousepad) {
        this.mousepad = mousepad;
    }

    @Override
    public String toString() {
        return "Periferico{" +
                "Periferico='" + Periferico + '\'' +
                ", mouse='" + mouse + '\'' +
                ", teclado='" + teclado + '\'' +
                ", mousepad='" + mousepad + '\'' +
                '}';
    }
}
