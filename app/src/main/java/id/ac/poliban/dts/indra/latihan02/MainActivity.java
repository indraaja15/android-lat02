package id.ac.poliban.dts.indra.latihan02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btRealMadrid = findViewById(R.id.btRealMadrid );
        Button btBarcelona = findViewById(R.id.btBarcelona );
        Button btLeicester = findViewById(R.id.btLeicester );
        Button btFiorentina = findViewById(R.id.btFiorentina );

        //lambda
        btRealMadrid.setOnClickListener(v -> {
            Toast.makeText(this, "Kita musuhan", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Kita Kawanan aja", Toast.LENGTH_SHORT).show();
        });

        btBarcelona.setOnClickListener(v -> Toast.makeText(this, "Ini barcelona", Toast.LENGTH_SHORT).show()) ;
        btLeicester.setOnClickListener(v -> Toast.makeText(this, "Ini leicester", Toast.LENGTH_SHORT).show()) ;
        btFiorentina .setOnClickListener(v -> Toast.makeText(this, "Ini fiorentia", Toast.LENGTH_SHORT).show()) ;
    }
}
