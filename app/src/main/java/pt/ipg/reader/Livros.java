package pt.ipg.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Livros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livros);

        Button buttonCancelar = findViewById(R.id.buttonCancelar);
        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }

        });

    Button buttonPesquisar = findViewById(R.id.buttonPesquisar);

    buttonPesquisar.setOnClickListener(new View.OnClickListener() {

      }
      }
        @Override
        public void onClick(View v) {
            EditText editTextNome = findViewById(R.id.editText);
            String mensagem = editTextNome.getText().toString();

            if (mensagem.trim().length() == 0) {
                editTextNome.setError(getString(R.string.campo_obrigatorio));
            }else if (!mensagem.matches("[a-zA-Z ]+")){
                editTextNome.setError(getString(R.string.char_especiais));
            }else{
                finish();
                Toast.makeText(Livros.this,"Livro Pesquisado",Toast.LENGTH_SHORT).show();
            }
        }
    }

