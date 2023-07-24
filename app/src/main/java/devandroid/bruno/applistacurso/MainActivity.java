package devandroid.bruno.applistacurso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.bruno.applistacurso.model.Curso;
import devandroid.bruno.applistacurso.model.Fruta;
import devandroid.bruno.applistacurso.model.Musica;
import devandroid.bruno.applistacurso.model.Periferico;
import devandroid.bruno.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //pessoa
    Pessoa pessoa;
    //Fim Pessoa

    //======================================================================================

    //Cursos
    Curso curso;
    Curso python;
    Curso android;
    Curso java;
    //Fim Curso

    //======================================================================================

    //Frutas
    Fruta fruta;
    Fruta banana;
    Fruta abacate;
    Fruta melao;
    Fruta kaki;

    //======================================================================================

    //Periferico
    Periferico periferico;
    Periferico teclado;
    Periferico mouse;
    Periferico fone;
    Periferico mousepad;

    //======================================================================================

    //Musica
    Musica musica;
    Musica rock;
    Musica eletronica;
    Musica sertanejo;
    Musica forro;
//======================================================================================




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Classe Pessoa / settes ============================================================
        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Bruno");
        pessoa.setSobreNome("Ramos");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("(15) 99872-6354");

        //======================================================================================


        //Classe Curso
        curso = new Curso();
        python = new Curso();
        java = new Curso();
        android = new Curso();

        //settes
        curso.setJava("java");
        curso.setAndroid("Android");
        curso.setPython("Python");

        //======================================================================================

        //Frutas // Setter
        fruta = new Fruta();
        melao = new Fruta();
        kaki = new Fruta();
        banana = new Fruta();
        abacate = new Fruta();

        //======================================================================================

        //Periferico / Setter
        periferico = new Periferico();
        mouse = new Periferico();
        teclado = new Periferico();
        mousepad = new Periferico();
        fone = new Periferico();

        periferico.setPeriferico("Perifericos");
        periferico.setMouse("Mouse");
        periferico.setTeclado("Teclado");
        periferico.setMousepad("MousePad");

        //======================================================================================

        //Musica / Setter
        musica = new Musica();
        rock = new Musica();
        sertanejo = new Musica();
        eletronica = new Musica();
        forro = new Musica();

        musica.setMusica("Musicas");
        musica.setEletronica("ELetronica");
        musica.setForro("Forro");
        musica.setRock("Rock");
        musica.setSetanejo("Sertanejo");






    }
}