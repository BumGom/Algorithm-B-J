package explainpage.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import pseudocode.pseudocode_1_1linkedlist;

public class linkedlist extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_1_1_linkedlist);

        txtResult = (TextView) findViewById(R.id.textResult);
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode_1_1linkedlist.class);
        intent.putExtra("data", "월간 <샘터>가 결국 휴간 방침을 철회했습니다. 취재하면서 휴간, 그리고 사실상 폐간이 기정사실인 것처럼 알린 기존 보도들과는 다르게 써달라며 신신당부하던 샘터사 관계자의 말을 들었습니다. 아직은 가능성이 있다고 믿고 그만큼 노력했기 때문에 나온 이야기였습니다. 그래서 조심스러웠습니다. <샘터>를 넘어 온 잡지업계를 닥친 싸늘한 한파는 피할 수 없는 것이지만 그저 얼어붙었다고만 쓰면 그 안에서 움트고 있을 새로운 가능성을 알려드릴 수 없기 때문이었습니다.\n" +
                "\n" +
                "원문보기:\n" +
                "http://weekly.khan.co.kr/khnm.html?mode=view&code=115&artid=201911081545431&pt=nv#csidx2fa690e3e17259bb4c694ce73582e97");
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if(requestCode==1){
            if(requestCode==RESULT_OK){
                String result=data.getStringExtra("result");
                txtResult.setText(result);
            }
        }
    }
}
