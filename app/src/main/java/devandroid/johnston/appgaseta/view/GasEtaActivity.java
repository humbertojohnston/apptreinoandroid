package devandroid.johnston.appgaseta.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.johnston.appgaseta.R;
import devandroid.johnston.appgaseta.apoio.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity {

    //UtilGasEta utilGasEta = new UtilGasEta();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gaseta); //APRESENTA O LAYOUT NA TELA

       // utilGasEta.metodoNaoEstatico();

       //UtilGasEta.metodoEstatico();

        Toast.makeText(GasEtaActivity.this, UtilGasEta.mensagem(),
                Toast.LENGTH_LONG).show();
    }
}
