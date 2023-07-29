package devandroid.bruno.applistacurso.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.bruno.applistacurso.R;
import devandroid.bruno.applistacurso.model.Calendario;
import devandroid.bruno.applistacurso.model.Curso;
import devandroid.bruno.applistacurso.model.Fruta;
import devandroid.bruno.applistacurso.model.Musica;
import devandroid.bruno.applistacurso.model.Periferico;
import devandroid.bruno.applistacurso.model.Pessoa;
import devandroid.bruno.applistacurso.model.Produtos;

public class MainActivity extends AppCompatActivity {

    //pessoa
    Pessoa pessoa;
    Pessoa outrapessoa;

    String dadosPessoa;
    String dadoOutraPessoa;
    //Fim Pessoa

    //======================================================================================

    //Cursos
    Curso curso;

    //Fim Curso

    //======================================================================================

    //Frutas
    Fruta fruta;
    Fruta banana;
    Fruta abacate;
    Fruta mamao;
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

    //Produtos / Setter

    Produtos outroproduto;
    Produtos produtos;
    Produtos valor;
    Produtos peso;
    Produtos entrega;

    //======================================================================================

    //Calendario


    Calendario quanto_dia_tem_em_cada_mes;
    Calendario janeiro;
    Calendario fevereiro;
    Calendario marco;
    Calendario abril;
    Calendario maio;
    Calendario junho;
    Calendario julho;
    Calendario agosto;
    Calendario setembro;
    Calendario outubro;
    Calendario novembro;
    Calendario dezembro;

    //======================================================================================

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

        outrapessoa = new Pessoa();
        outrapessoa.setPrimeiroNome("Lucas");
        outrapessoa.setSobreNome("souza");
        outrapessoa.setCursoDesejado("Java");
        outrapessoa.setTelefoneContato("(19) 98143-4732");

/*        dadosPessoa = " Primeriro Nome: ";
            dadosPessoa += pessoa.getPrimeiroNome();

        dadosPessoa += " Sobrenome: ";
            dadosPessoa += pessoa.getSobreNome();

        dadosPessoa += " Curso desejado: ";
            dadosPessoa += pessoa.getCursoDesejado();

        dadosPessoa += " Telefone de Contato: ";
            dadosPessoa += pessoa.getTelefoneContato();*/

        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",outrapessoa.toString());




        //======================================================================================


        //Classe Curso
        curso = new Curso();

        //settes
        curso.setJava("java");
        curso.setAndroid("Android");
        curso.setPython("Python");

        Log.i("POOCurso",curso.toString());

        //======================================================================================

        //Frutas // Setter
        fruta = new Fruta();
        mamao = new Fruta();
        kaki = new Fruta();
        banana = new Fruta();
        abacate = new Fruta();


        fruta.setFruta("Frutas");
        fruta.setBanana("Banana nanica");
        fruta.setAbacate("Abacate");
        fruta.setKaki("kaki");
        fruta.setMamao("Mamao");

        Log.i("POOFrutas",fruta.toString());
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

        Log.i("POOPerifericos",periferico.toString());


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

        Log.i("Musicas",musica.toString());

        //======================================================================================

        produtos = new Produtos();

        valor = new Produtos();
        peso = new Produtos();
        entrega = new Produtos();

        produtos.setProdutos("relogio");
        produtos.setValor("R$ 358,60");
        produtos.setPeso("250mg");
        produtos.setEntraga("12 dias");

        outroproduto = new Produtos();

        outroproduto.setProdutos("TV SAMSUNG 50P");
        outroproduto.setValor("R$ 3.500");
        outroproduto.setPeso("10kg");
        outroproduto.setEntraga("7 Dias");

        Log.i("POOProdutos",produtos.toString());

        //======================================================================================

        quanto_dia_tem_em_cada_mes = new Calendario();
        janeiro = new Calendario();
        fevereiro = new Calendario();
        marco = new Calendario();
        abril = new Calendario();
        maio = new Calendario();
        junho = new Calendario();
        julho = new Calendario();
        agosto = new Calendario();
        setembro = new Calendario();
        outubro = new Calendario();
        novembro = new Calendario();
        dezembro = new Calendario();
        //Dias
        janeiro.setJaneiro("31 Dias");
        fevereiro.setFevereiro("28/29 Dias");
        marco.setMarco("31 Dias");
        abril.setAbril("30 Dias");
        maio.setMaio("31 Dias");
        junho.setJulho("30 Dias");
        julho.setJulho("31 Dias");
        agosto.setAgosto("31 Dias");
        setembro.setSetembre("30 Dias");
        outubro.setOutubro("31 Dias");
        novembro.setNovembro("30 Dias");
        dezembro.setDezembro("31 Dias");

        Log.i("POOCAlendario",quanto_dia_tem_em_cada_mes.toString());


        //======================================================================================







    }
}