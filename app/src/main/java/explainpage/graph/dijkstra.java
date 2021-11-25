package explainpage.graph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class dijkstra extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_9_4_dijkstra);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "shortest_path(G, v) :\n" +
                "\tS <- {v}\n" +
                "\tfor 각 정점 w∈G do\n" +
                "\t   distance[w] <- weight[v][w];\n" +
                "\twhile 모든 정점이 S에 포함되지 않으면 do\n" +
                "\t   u <- 집합 S에 속하지 않은 정점 중에서 최소 distance 정점;\n" +
                "\t   S <- S∪{u}\n" +
                "\t   for u에 인접하고 S에 있는 각 정점 z do\n" +
                "\t\tif distance[u] + weight[u][z] < distance[z]\n" +
                "\t\t   then distance[z] <- distance[u] + weight[u][z];");
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if(requestCode==RESULT_OK){
                String result=data.getStringExtra("result");
                txtResult.setText(result);
            }
        }
    }
}
