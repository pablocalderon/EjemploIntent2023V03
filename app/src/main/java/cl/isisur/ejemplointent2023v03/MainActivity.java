package cl.isisur.ejemplointent2023v03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button boton;
    EditText etnombre,etmatricula;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=(EditText) findViewById(R.id.etNombre);
        etmatricula=(EditText) findViewById(R.id.etMatricula);
        boton =(Button) findViewById(R.id.btaceptar);

        Intent intent= new Intent(this, MainActivity2.class);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(intent);
            }
        });




    }
}