package space.gorokhov.uprazhneniya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText in= (EditText) findViewById(R.id.editT1);
        EditText out= (EditText) findViewById(R.id.editT2);
        Button bt1= (Button) findViewById(R.id.button);
        Button bt2= (Button) findViewById(R.id.button2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                out.setText(in.getText());
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(in);
            }
        });

    }
}
