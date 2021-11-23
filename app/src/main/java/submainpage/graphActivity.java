package submainpage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import explainpage.graph.dijkstra;
import explainpage.graph.graph;
import explainpage.graph.mst;
import explainpage.graph.topologicalsort;

public class graphActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submainpage_9_graph);

        Button graphbutton=(Button) findViewById(R.id.graphrealization);
        graphbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(graphActivity.this, "그래프의 구현", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), graph.class);
                startActivity(intent);
            }
        });

        Button tsbutton=(Button) findViewById(R.id.topological);
        tsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(graphActivity.this, "위상 정렬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), topologicalsort.class);
                startActivity(intent);
            }
        });

        Button mstbutton=(Button) findViewById(R.id.mst);
        mstbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(graphActivity.this, "최소 신장 트리", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), mst.class);
                startActivity(intent);
            }
        });

        Button dijkstrabutton=(Button) findViewById(R.id.dijkstra);
        dijkstrabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(graphActivity.this, "최단 경로 탐색", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), dijkstra.class);
                startActivity(intent);
            }
        });
    }


}
