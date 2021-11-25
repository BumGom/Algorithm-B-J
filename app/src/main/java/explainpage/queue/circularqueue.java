package explainpage.queue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class circularqueue extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_3_2_circularqueue);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "typedef int ElementType;\n" +
                "\n" +
                "typedef struct tagNode{\n" +
                "   ElementType Data;\n" +
                "} Node;\n" +
                "\n" +
                "typedef struct tagCircularQueue{\n" +
                "   int Capacity;\n" +
                "   int Front;\n" +
                "   int Rear;\n" +
                "   Node* Nodes;\n" +
                "} CircularQueue;");
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
