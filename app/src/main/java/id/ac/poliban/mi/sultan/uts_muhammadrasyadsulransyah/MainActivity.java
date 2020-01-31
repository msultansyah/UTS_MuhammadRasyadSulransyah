package id.ac.poliban.mi.sultan.uts_muhammadrasyadsulransyah;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
Button btClear, btSubmit;
EditText etNomor, etNama, etAlamat, etTelp;
RadioGroup rgJK;
RadioButton rbLaki, rbPerempuan;
Spinner spAgama;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btClear = findViewById(R.id.btClear);
        btSubmit= findViewById(R.id.btSubmit);
        etNomor = findViewById(R.id.et1);
        etNama = findViewById(R.id.et2);
        etAlamat = findViewById(R.id.et5);
        etTelp = findViewById(R.id.et6);
        rgJK = findViewById(R.id.rg1);
        rbLaki = findViewById(R.id.rbLaki);
        rbPerempuan = findViewById(R.id.rbPerempuan);
        spAgama = findViewById(R.id.spinner1);


        btSubmit.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info Registrasi")
                    .setMessage(etNomor.getText() )
                    .setPositiveButton("OK", null).show();
        });
    }


}
