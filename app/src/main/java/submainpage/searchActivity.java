package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.search.binarysearch;
import explainpage.search.redblacktree;
import explainpage.search.sequentialsearch;

public class searchActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_6_search);

        Button sqsbutton=(Button) findViewById(R.id.sequentialsearch);
        sqsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(searchActivity.this, "순차 탐색", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), sequentialsearch.class);
                startActivity(intent);
            }
        });

        Button bsbutton=(Button) findViewById(R.id.binarysearch);
        bsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(searchActivity.this, "이진 탐색(이진 탐색 트리)", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), binarysearch.class);
                startActivity(intent);
            }
        });

        Button rbtbutton=(Button) findViewById(R.id.redblocktree);
        rbtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(searchActivity.this, "레드 블랙 트리", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), redblacktree.class);
                startActivity(intent);
            }
        });
    }
}
