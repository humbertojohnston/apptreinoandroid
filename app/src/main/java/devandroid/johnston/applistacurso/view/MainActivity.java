package devandroid.johnston.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import devandroid.johnston.applistacurso.R;
import devandroid.johnston.applistacurso.controller.CursoController;
import devandroid.johnston.applistacurso.controller.PessoaController;
import devandroid.johnston.applistacurso.model.Curso;
import devandroid.johnston.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    //Passados para a controller
    //SharedPreferences preferences; //preferences é o atributo
    //SharedPreferences.Editor listaVip;
    //public static final String NOME_PREFERENCES = "pref_listavip"; //atribuição do nome do arquivo

    PessoaController controller; //criou-se uma instância
    CursoController cursoController;
    Pessoa pessoa; //CTRL+Espaço, cria o Objeto com o mesmo nome da Classe

    List<Curso> listaDeCursos; //O 'E' espere que se informe qual é o tipo de dado esperado

    //Declarando EditText
    EditText editPrimeiroNome;
    EditText editSobrenome;
    EditText editNomeCurso;
    EditText editTelefoneContato;

    //Declarando Button
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //arquivo de layout, instancia o layout, CTRL+B abre o layout (selecionando o activity_main)

        //Passados para a controller
        //preferences = getSharedPreferences(NOME_PREFERENCES, 0);
        //precisa informar duas coisas: o nome e o modo de acesso. 0 siginifica Escrita/Leitura
        //psfl atribui o nome ao arquivo

        //Passados para a controller
        // listaVip = preferences.edit(); //cria o arquivo e o deixa aberto para edição

        controller = new PessoaController(MainActivity.this);
        controller.toString(); //Método por Herança

        cursoController = new CursoController();
        listaDeCursos = cursoController.getListaDeCursos();

        pessoa = new Pessoa(); //criou o Objeto pessoa da Classe Pessoa
        //pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "NULO"));
        //pessoa.setSobreNome(preferences.getString("sobreNome", "NULO"));
        //pessoa.setCursoDesejado(preferences.getString("cursoDesejado", "NULO"));
        //pessoa.setTelefoneContato(preferences.getString("telefoneContato", "NULO"));
        controller.buscar(pessoa);

        //Atribuição de dados ao EditText
        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefoneContato.setText(pessoa.getTelefoneContato());

        //Atribuição de dados ao Button
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //Implementação do botão btnLimpar
        btnLimpar.setOnClickListener(new View.OnClickListener() { //criado uma instância view)
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobrenome.setText("");
                editNomeCurso.setText("");
                editTelefoneContato.setText("");

                //Passados para a controller
                //listaVip.clear();
                //listaVip.apply();

                controller.limpar();
            }
        });

        //Implementação do botão btnFinalizar
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "* PROGRAMA FINALIZADO *", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        //Implementação do botão btnSalvar
        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Pegando os dados dos campos editText
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobrenome.getText().toString());
                pessoa.setCursoDesejado(editNomeCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneContato.getText().toString());
                Toast.makeText(MainActivity.this, "* SALVO *" + pessoa.toString(), Toast.LENGTH_LONG).show();

                //Passados para a controller
                //listaVip.putString("primeiroNome", pessoa.getPrimeiroNome()); //Salva o registro
                //listaVip.putString("sobreNome", pessoa.getSobreNome()); //Salva o registro
                //listaVip.putString("cursoDesejado", pessoa.getCursoDesejado()); //Salva o registro
                //listaVip.putString("telefoneContato", pessoa.getTelefoneContato()); //Salva o registro
                //listaVip.apply();

                controller.salvar(pessoa); //cria o método salvar na controladora
            }
        });

        //Para o Logcat
        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        //tag é uma etiqueta que identifica o grupo de informações que se quer apresentar.
    }
}