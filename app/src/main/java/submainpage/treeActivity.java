package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.tree.expressiontree;
import explainpage.tree.tree;

public class treeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_4_tree);

        Button treebutton=(Button) findViewById(R.id.tree);
        treebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), tree.class);
                startActivity(intent);
            }
        });

        Button etbutton=(Button) findViewById(R.id.experssiontree);
        etbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), expressiontree.class);
                startActivity(intent);
            }
        });
    }
}
