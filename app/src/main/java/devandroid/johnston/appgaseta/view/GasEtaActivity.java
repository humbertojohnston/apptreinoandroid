package devandroid.johnston.appgaseta.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.johnston.appgaseta.R;
import devandroid.johnston.appgaseta.apoio.UtilGasEta;
import devandroid.johnston.appgaseta.model.Combustivel;

public class GasEtaActivity extends AppCompatActivity {

    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;

    //DECLARAÇÃO DOS ATRIBUTOS
    EditText editGasolina;
    EditText editEtanol;

    TextView txtResultado;

    Button btnCalcular;
    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    double precoGasolina;
    double precoEtanol;
    String recomendacao;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta); //APRESENTA O LAYOUT NA TELA

        editGasolina = findViewById(R.id.editGasolina);
        editEtanol = findViewById(R.id.editEtanol);

        txtResultado = findViewById(R.id.txtResultado);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        //PEGAR O CLICK DO BOTÃO (BASTA DIGITAR ESTA LINHA  btnCalcular.setOnClickListener(new View.OnClickListener()
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOk = true;

                if(TextUtils.isEmpty(editGasolina.getText())) {
                    editGasolina.setError("* CAMPO NÃO PODE FICAR EM BRANCO");
                    editGasolina.requestFocus(); //VOLTA O CURSOR PARA O CAMPO
                    isDadosOk = false;

                }

                if(TextUtils.isEmpty(editEtanol.getText())) {
                    editEtanol.setError("* CAMPO NÃO PODE FICAR EM BRANCO");
                    editEtanol.requestFocus(); //VOLTA O CURSOR PARA O CAMPO
                    isDadosOk = false;

                }

                if (isDadosOk){

                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());//para poder colocar um double dentro de uma String
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());//para poder colocar um double dentro de uma String

                    recomendacao = UtilGasEta.calcularMelhorOpcao(precoGasolina,precoEtanol);

                    txtResultado.setText(recomendacao);

                } else {

                    Toast.makeText(GasEtaActivity.this,
                        "* CAMPOS DE PREENCHIMENTO OBRIGATÓRIO *", Toast.LENGTH_LONG).show();

                }
            }

        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editEtanol.setText("");
                editGasolina.setText("");

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //TODO: DESABILITAR O BOTÃO SALVAR

                combustivelGasolina = new Combustivel();
                combustivelEtanol = new Combustivel();

                combustivelGasolina.setNomeDoCombustivel("Gasolina");
                combustivelGasolina.setPrecoDoCombustivel(precoGasolina);

                combustivelEtanol.setNomeDoCombustivel("Etanol");
                combustivelEtanol.setPrecoDoCombustivel(precoEtanol);

                combustivelGasolina.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina,precoEtanol));

                int parada = 0;

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(GasEtaActivity.this, "* PROGRAMA FINALIZADO *",
                        Toast.LENGTH_LONG).show();

                finish();

            }
        });

        Toast.makeText(GasEtaActivity.this,
                UtilGasEta.calcularMelhorOpcao(5.12, 3.39),
                Toast.LENGTH_LONG).show();
    }

}
