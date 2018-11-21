package com.example.thal3.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaEmpregador extends AppCompatActivity {
    EditText editEmail2, editSenha2;
    Button butlogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empregadorlogin);

        editEmail2 = (EditText)findViewById(R.id.editEmail2);
        editSenha2 = (EditText)findViewById(R.id.editSenha2);

        butlogin2 = (Button)findViewById(R.id.butlogin2);

    }
}
