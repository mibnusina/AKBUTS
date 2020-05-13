package com.mbi.akbuts;
//Muhammad Ibnu Sina
//10117279
//IF8
//Tanggal Pengerjaan=09-05-2020
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mbi.akbuts.ui.notifications.DaftarTeman;
import com.mbi.akbuts.ui.notifications.DaftarTemanImp;
import com.mbi.akbuts.ui.notifications.DaftarTemanInterface;

import java.nio.charset.Charset;
import java.util.Random;

public class InputActivity extends AppCompatActivity {
    private TextView tvNim,tvNama,tvKelas,tvTelp,tvEmail,tvSosmed;
    private EditText etNim, etNama, etKelas, etTelp, etEmail, etSosmed;
    private DaftarTemanInterface temanInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        init();
    }

    private void init() {
        etNim = findViewById(R.id.etNim);
        etNama = findViewById(R.id.etNama);
        etKelas = findViewById(R.id.etKelas);
        etTelp = findViewById(R.id.etTelp);
        etEmail = findViewById(R.id.etEmail);
        etSosmed = findViewById(R.id.etSosmed);

        Button btn_simpan = findViewById(R.id.btn_simpan);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                create();
            }
        });
    }

    private void create(){
        temanInterface = new DaftarTemanImp(this);
        DaftarTeman teman = new DaftarTeman(
                etNim.getText().toString(),
                etNama.getText().toString(),
                etKelas.getText().toString(),
                etTelp.getText().toString(),
                etEmail.getText().toString(),
                etSosmed.getText().toString()
        );

        if(temanInterface.create(teman)){
            Toast.makeText(this,"Berhasil Disimpan", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    private static String generateTextRandom(){
        byte[] array= new byte[5];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }
}
