package stack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class pushpopstack extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_2_stack);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_2_stack.class);
        intent.putExtra("data", "삽입 연산\n" +
                "push(s, item)\n" +
                "\tnewnode ← getnode();\n" +
                "\tnewnode.data ← item;\n" +
                "\tnewnode.link ← top;\n" +
                "\ttop ← newnode;\n" +
                "end push()\n" +
                "\n" +
                "\n" +
                "삭제 연산\n" +
                "pop(s)\n" +
                "\tif(top = null) then\n" +
                "\t\treturn null;\n" +
                "\telse {\n" +
                "\t\t\titem ← top.data;\n" +
                "\t\t\ttop = top.link;\n" +
                "\t\t\treturnnode(oldnode);\n" +
                "\t\t\treturn item;\n" +
                "\t\t }\n" +
                "end pop()");
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
