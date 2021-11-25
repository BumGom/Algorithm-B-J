package explainpage.sort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class bubblesort extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_5_1_bubblesort);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "void BubbleSort(int DataSet[], int Length){\n" +
                "   int i, j, temp = 0;\n" +
                "   for(i=0; i<Length-1; i++){\n" +
                "\tfor(j=0; j<Length-(i+1); j++){\n" +
                "\t\tif(DataSet[j] > DataSet[j+1]){\n" +
                "\t\t\ttemp = DataSet[j+1];\n" +
                "\t\t\tDataSet[j+1] = DataSet[j];\n" +
                "\t\t\tDataSet[j] = temp;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "   }\n" +
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
