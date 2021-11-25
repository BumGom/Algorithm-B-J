package explainpage.graph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class mst extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_9_3_mst);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "pirm(G,s) :\n" +
                "\tfor each u∈V do\n" +
                "\t   dist[u] <- ∞\n" +
                "\tdist[u] <- 0\n" +
                "\t우선순위 큐 Q에 모든 정점을 삽입(우선순위 dist[])\n" +
                "\tfor i <- 0 to n-1 do\n" +
                "\t   u <- delete_min(Q)\n" +
                "\t   화면에 u를 출력\n" +
                "\t   for each v∈(u의 인접 정점) do\n" +
                "\t\tif(v∈Q and weight[u][v] < dist[v])\n" +
                "\t\t   then dist[v] <- weight[u][v]");
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
