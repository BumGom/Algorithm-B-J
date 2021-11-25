package explainpage.sort;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class quicksort extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_5_3_quicksort);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "int Partition(int DataSet[], int Left, int Right){\n" +
                "   int First = Left;\n" +
                "   int Pivot = DataSet[First];\n" +
                "   ++Left;\n" +
                "   while(Left < Right){\n" +
                "\twhile(DataSet[Left] <= Pivot)\n" +
                "\t   ++Left;\n" +
                "\twhile(DataSet[Right] > Pivot)\n" +
                "\t   --Right;\n" +
                "\tif(Left >= Right)\n" +
                "\t   break;\n" +
                "\tSwap(&DataSet[Left], &DataSet[Right]);\n" +
                "   }\n" +
                "   Swap(&DataSet[First], &DataSet[Right]);\n" +
                "   return Right;\n" +
                "}\n" +
                "\n" +
                "void QuickSort(int DataSet[], int Left, int Right){\n" +
                "   if(Left < Right){\n" +
                "\tint Index = Partition(DataSet, Left, Right);\n" +
                "\tQuickSort = DataSet, Left, Index - 1);\n" +
                "\tQuickSort = DataSet, Index + 1, Right);\n" +
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
