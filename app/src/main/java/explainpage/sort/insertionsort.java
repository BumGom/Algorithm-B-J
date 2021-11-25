package explainpage.sort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class insertionsort extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_5_2_insertionsort);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "void InsertionSort(int DataSet[]. int Length){\n" +
                "   int i=0, j=0, value = 0;\n" +
                "   for(i=1; i<Length; i++){\n" +
                "\tif(DataSet[i-1] <= DataSet[i])\n" +
                "\t   continue;\n" +
                "\tvalue = DataSet[i];\n" +
                "\tfor(j=0; j<i; j++){\n" +
                "\t   if(DataSet[j] > value){\n" +
                "\t\tmemmove(&DataSet[j+1], &DataSet[j], sizeof(DataSet[0] * (i-j));\n" +
                "\t\tDataSet[j] = value;\n" +
                "\t\tbreak; }\n" +
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
