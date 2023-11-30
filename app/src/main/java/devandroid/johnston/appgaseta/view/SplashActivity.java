package devandroid.johnston.appgaseta.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.johnston.appgaseta.R;

public class SplashActivity extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH = 3000; //TEMPO DE DURAÇÃO DA TELA SPLASH EM MILISEGUNDOS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        comutarTelaSplash();
    }

    private void comutarTelaSplash() {

        //Handler executa um processo que demora alguns segundos
        new Handler().postDelayed(new Runnable() { //Digita-se RUN e em seguida <TAB> para criar a estrutura abaixo
            @Override
            public void run() {

                //Rotina para mudar de tela
                Intent telaPrincipal = new Intent(SplashActivity.this, GasEtaActivity.class);
                //'SplashActivity.this' onde eu estou e 'MainActivity.class' para onde eu vou.
                startActivity(telaPrincipal); //chama a tela principal
                finish(); //para não voltar para a tela Splash
            }
        }, TIME_OUT_SPLASH);
    }
}