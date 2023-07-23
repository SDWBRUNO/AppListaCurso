package devandroid.bruno.applistacurso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.bruno.applistacurso.model.Curso;
import devandroid.bruno.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    Curso curso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();

        curso = new Curso();
    }
}