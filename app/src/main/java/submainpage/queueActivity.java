package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.queue.circularqueue;
import explainpage.queue.endequeue;

public class queueActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

        Button endeqbutton=(Button) findViewById(R.id.endequeue);
        endeqbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(queueActivity.this, "큐 삽입과 제거", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), endequeue.class);
                startActivity(intent);
            }
        });

        Button cqbutton=(Button) findViewById(R.id.circularqueue);
        cqbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(queueActivity.this, "순환 큐", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), circularqueue.class);
                startActivity(intent);
            }
        });
    }
}
