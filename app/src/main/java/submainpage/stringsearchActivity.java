package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.string.boyermoore;
import explainpage.string.brute;
import explainpage.string.karprabin;
import explainpage.string.kmp;

public class stringsearchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage__10_stringsearch);

        Button krbutton=(Button) findViewById(R.id.karprabin);
        krbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(stringsearchActivity.this, "카프-라빈 알고리즘", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), karprabin.class);
                startActivity(intent);
            }
        });

        Button kmpbutton=(Button) findViewById(R.id.kmp);
        kmpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(stringsearchActivity.this, "kmp 알고리즘", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), kmp.class);
                startActivity(intent);
            }
        });

        Button bmbutton=(Button) findViewById(R.id.boyermoore);
        bmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(stringsearchActivity.this, "보이어-무어 알고리즘", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), boyermoore.class);
                startActivity(intent);
            }
        });

        Button boringbutton=(Button) findViewById(R.id.brute);
        boringbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(stringsearchActivity.this, "고지식한 알고리즘", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), brute.class);
                startActivity(intent);
            }
        });
    }
}
