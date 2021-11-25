package explainpage.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class binarysearch extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_6_2_binarysearch);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "ElementType BinarySearch(ElementType DataSet[], int size, ElementType Target){\n" +
                "   int Left, Right, Mid;\n" +
                "   Left = 0;\n" +
                "   Right = size - 1;\n" +
                "\n" +
                "   while(Left <= Right)\n" +
                "{\n" +
                "\tMid = (Left + Right) / 2;\n" +
                "   if(Target == DataSet[Mid])\n" +
                "\treturn DataSet[Mid];\n" +
                "   else if(Target > DataSet[Mid])\n" +
                "\tLeft = Mid + 1;\n" +
                "   else\n" +
                "\tRight = Mid + 1;\n" +
                "   }\n" +
                "   return NULL;\n" +
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
