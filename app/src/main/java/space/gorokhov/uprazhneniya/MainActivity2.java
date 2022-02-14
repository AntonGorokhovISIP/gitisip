package space.gorokhov.uprazhneniya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText in11= (EditText) findViewById(R.id.in1);
        EditText in22= (EditText) findViewById(R.id.in2);
        EditText out1= (EditText) findViewById(R.id.out);
        EditText outt= (EditText) findViewById(R.id.outTXT);
        Button bt= (Button) findViewById(R.id.button3);
        Button btn= (Button) findViewById(R.id.button4);
        Button btp= (Button) findViewById(R.id.button5);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a,b;
                if((in11.getText().toString().trim().length()!=0)&&(in22.toString().trim().length()!=0)){
                    a=Float.parseFloat(in11.getText().toString());
                    b=Float.parseFloat(in22.getText().toString());
                    out1.setText(Float.toString(a+b));
                    outt.setText(Float.toString(a)+"+"+Float.toString(b)+"="+Float.toString(a+b));
                }
                else{
                    outt.setText("Введите числа для операции сложения");
                }
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in=new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(in);
                    }
                });
                btp.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in=new Intent(MainActivity2.this, MainActivity.class);
                        startActivity(in);
                    }
                });

            }
        });

    }
}
