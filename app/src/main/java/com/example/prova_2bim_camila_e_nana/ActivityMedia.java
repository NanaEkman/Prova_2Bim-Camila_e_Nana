package com.example.prova_2bim_camila_e_nana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityMedia extends AppCompatActivity {

    private Button btnCalculaMedia;
    private EditText txtNota1;
    private EditText txtNota2;
    private TextView lblExibeMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        btnCalculaMedia = findViewById(R.id.btnCalculaMedia);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        lblExibeMedia = findViewById(R.id.lblExibeMedia);

        EscutadorBotaoCalculaMedia ebcm = new EscutadorBotaoCalculaMedia();

        btnCalculaMedia.setOnClickListener(ebcm);

    }

    class EscutadorBotaoCalculaMedia implements View.OnClickListener{
        @Override
        public void onClick(View view) {

            double n1, n2, media;
            n1 = Double.parseDouble(txtNota1.getText().toString());
            n2 = Double.parseDouble(txtNota2.getText().toString());

            media = (n1 + n2)/2;

            lblExibeMedia.setText(Double.toString(media));

        }
    }

}