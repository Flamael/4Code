package com.example.rfael.a4code;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class RedefinirSenhaActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.redefinir_senha);

    }

    public void voltar(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void enviar(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }

}
