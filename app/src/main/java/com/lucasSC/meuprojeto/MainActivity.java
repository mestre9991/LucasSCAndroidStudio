package com.lucasSC.meuprojeto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obter referências aos elementos da interface do usuário
        Button meuBotao = findViewById(R.id.meuBotao);
        final TextView meuTexto = findViewById(R.id.meuTexto);

        // Configurar um ouvinte de clique para o botão
        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação a ser executada quando o botão for clicado
                meuTexto.setText("O texto mudou");
            }
        });
    }
}
