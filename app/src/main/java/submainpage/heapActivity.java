package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.priortiy.heap;
import explainpage.priortiy.priortiyqueue;

public class heapActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_7_priorityqueueheap);

        Button pqbutton=(Button) findViewById(R.id.priorityqueue);
        pqbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(heapActivity.this, "우선 순위 큐", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), priortiyqueue.class);
                startActivity(intent);
            }
        });

        Button heapbutton=(Button) findViewById(R.id.heap);
        heapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(heapActivity.this, "힙", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), heap.class);
                startActivity(intent);
            }
        });
    }
}
