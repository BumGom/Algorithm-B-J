package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.hash.collision;
import explainpage.hash.hashfunction;
import explainpage.hash.hashtable;

public class hashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_8_hash);

        Button htbutton=(Button) findViewById(R.id.hashtable);
        htbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hashActivity.this, "해쉬 테이블", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), hashtable.class);
                startActivity(intent);
            }
        });

        Button hfbutton=(Button) findViewById(R.id.hashfunction);
        hfbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hashActivity.this, "해쉬 함수", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), hashfunction.class);
                startActivity(intent);
            }
        });

        Button collisionbutton=(Button) findViewById(R.id.collisionfix);
        collisionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(hashActivity.this, "충돌 해결", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), collision.class);
                startActivity(intent);
            }
        });
    }

}
