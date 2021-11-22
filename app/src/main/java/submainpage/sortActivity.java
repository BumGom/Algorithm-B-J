package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;
import explainpage.sort.quicksort;

import explainpage.sort.bubblesort;
import explainpage.sort.insertionsort;

public class sortActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

        Button bbsbutton=(Button) findViewById(R.id.bubblesort);
        bbsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sortActivity.this, "버블 정렬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), bubblesort.class);
                startActivity(intent);
            }
        });

        Button issbutton=(Button) findViewById(R.id.insertionsort);
        issbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sortActivity.this, "삽입 정렬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), insertionsort.class);
                startActivity(intent);
            }
        });

        Button qsbutton=(Button) findViewById(R.id.quicksort);
        qsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(sortActivity.this, "퀵 정렬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), quicksort.class);
                startActivity(intent);
            }
        });
    }
}
