package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.list.circularlinkedlist;
import explainpage.list.doublelinkedlist;
import explainpage.list.linkedlist;

public class listActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_1_list);

        Button llbutton=(Button) findViewById(R.id.linkedlist);
        llbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(listActivity.this, "링크드 리스트", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), linkedlist.class);
                startActivity(intent);
            }
        });

        Button dllbutton=(Button) findViewById(R.id.doublelinkedlist);
        dllbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(listActivity.this, "더블 링크드 리스트", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), doublelinkedlist.class);
                startActivity(intent);
            }
        });

        Button cllbutton=(Button) findViewById(R.id.circularlinkedlist);
        cllbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(listActivity.this, "환영 링크드 리스트", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), circularlinkedlist.class);
                startActivity(intent);
            }
        });
    }
}
