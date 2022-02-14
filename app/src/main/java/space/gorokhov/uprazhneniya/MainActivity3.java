package space.gorokhov.uprazhneniya;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int i = 1;
        ImageView img = (ImageView) findViewById(R.id.imageView);
        Button buttup = (Button) findViewById(R.id.butup);
        Button buttdown = (Button) findViewById(R.id.butdown);
        Button buttleft = (Button) findViewById(R.id.butleft);
        Button buttright = (Button) findViewById(R.id.butright);
        Button buttvis = (Button) findViewById(R.id.butv);
        Button btn= (Button) findViewById(R.id.button6);
        buttup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float y = img.getY();
                float x = img.getX();
                img.setY(y - 20);
            }
        });

        buttdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float y = img.getY();
                float x = img.getX();
                img.setY(y + 20);
            }
        });

        buttleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float y = img.getY();
                float x = img.getX();
                img.setX(x - 20);
            }
        });

        buttright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float y = img.getY();
                float x = img.getX();
                img.setX(x + 20);
            }
        });

        buttvis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (img.getVisibility() == View.INVISIBLE) {
                    img.setVisibility(View.VISIBLE);
                } else {
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(in);
            }
        });

    }
}