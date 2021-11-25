package explainpage.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class sequentialsearch extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_6_1_sequentialsearch);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "Node* SLL_SequentialSearch(Node* Head, int Target)\n" +
                "{\n" +
                "   Node* Current = Head;\n" +
                "   Node* Match = NULL;\n" +
                "   while(Current != NULL)\n" +
                "{\n" +
                "\tif(Current->Data == Target)\n" +
                "{\n" +
                "\t\tMatch = Current;\n" +
                "\t\tbreak;\n" +
                "\t}\n" +
                "\telse\n" +
                "\t\tCurrent = Current->NextNode;\n" +
                "   }\n" +
                "   return Match;\n" +
                "}");
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
