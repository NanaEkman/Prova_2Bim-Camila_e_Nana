package com.example.prova_2bim_camila_e_nana;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Camila Devita Basaglia e Nana Ekman



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private class EscutadorDialogoCancela implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

            dialogInterface.cancel();

            Toast.makeText( getApplicationContext(), "Cancelando...", Toast.LENGTH_SHORT).show();
        }
    }
    private class EscutadorDialogoOK implements DialogInterface.OnClickListener {

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {

            finish();

            Toast.makeText( getApplicationContext(), "Fechando...", Toast.LENGTH_SHORT).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuMedia:
                // abrindo a activity 1
                Intent i1 = new Intent(getApplicationContext(), ActivityMedia.class);
                startActivity(i1);
                return true;

            case R.id.menuFim:

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);

                dialogo.setTitle("Fechar o app");
                dialogo.setMessage("Deseja mesmo fechar o app ?");
                dialogo.setPositiveButton("Fechar", new EscutadorDialogoOK());
                dialogo.setNegativeButton("Cancelar", new EscutadorDialogoCancela());
                dialogo.setCancelable(false);
                dialogo.create();
                dialogo.show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}