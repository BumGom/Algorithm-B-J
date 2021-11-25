package explainpage.graph;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class graph extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_9_1_graph1);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "typedef struct tagVertex\n" +
                "{\n" +
                "\tElementType Data;\n" +
                "\tint Visited;\n" +
                "\tint Index;\n" +
                "\tstruct tagVertex* Next;\n" +
                "\tstruct tagEdge* AdjacencyList;\n" +
                "} Vertex;\n" +
                "\n" +
                "typedef struct tagEdge\n" +
                "{\n" +
                "\tint Weight;\n" +
                "\tstruct tagEdge* Next;\n" +
                "\tVertex* From;\n" +
                "\tVertex* Target;\n" +
                "} Edge;\n" +
                "\n" +
                "typedef struct tagGraph\n" +
                "{\n" +
                "\tVertex* Vertices;\n" +
                "\tint VertexCount;\n" +
                "} Graph;");
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
