package pt.ipg.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Livros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros);

        Toast.makeText(Livros.this,"Livros",Toast.LENGTH_SHORT).show();

    }
}
