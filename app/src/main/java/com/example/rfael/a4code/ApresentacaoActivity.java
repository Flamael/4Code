package com.example.rfael.a4code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ApresentacaoActivity extends ActionBarActivity {

    Button criarConta, entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.apresentacao);

        criarConta = (Button) findViewById(R.id.criarConta);
        entrar = (Button) findViewById(R.id.entrar);

    }

    public void criarConta(View view) {
        startActivity(new Intent(this, CadastroActivity.class));
    }

    public void entrar(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

}
