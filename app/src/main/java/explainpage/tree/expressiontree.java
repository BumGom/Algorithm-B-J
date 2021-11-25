package explainpage.tree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

public class expressiontree extends AppCompatActivity {
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_4_2_expressiontree);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "void ET_BuildExpressionTree(char* PostfixExpression, ETNode** Node)\n" +
                "{\n" +
                "\tint len - strlen(PostfixExpression);\n" +
                "\tchar Token = PostfixExpression[len - 1];\n" +
                "\tPostfixExpression[len - 1] = '/0';\n" +
                "\n" +
                "\tswitch(Token)\n" +
                "\t{\n" +
                "\t\tcase '+' : case '-' : case'*' : case'/' :  (*Node) = ET_CreateNode(Token);\n" +
                "\t\tET_BuildExpressionTree(PostfixExpression, &(*Node)->Right);\n" +
                "\t\tET_BuildExpressionTree(PostfixExpression, &(*Node)->Left);\n" +
                "\t\tbreak;\n" +
                "\n" +
                "\t\tdefault : (*Node) = ET_CreatNode(Token);\n" +
                "\t}\n" +
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
