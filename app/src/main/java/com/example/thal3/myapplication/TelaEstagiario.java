package com.example.thal3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaEstagiario extends AppCompatActivity {

    EditText editEmail1, editSenha1;
    Button butlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estagiariologin);

        editEmail1 = (EditText)findViewById(R.id.editEmail1);
        editSenha1 = (EditText)findViewById(R.id.editSenha1);

        butlogin = (Button)findViewById(R.id.butlogin);

    }
}
