package explainpage.string;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.algorithm_bj.R;

public class brute extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage__10_4_boringsearch);

        txtResult = (TextView) findViewById(R.id.textResult);

        // GIF add code +
        ImageView boringsearch = (ImageView) findViewById(R.id.boringsearchgifexplain);
        Glide.with(this).load(R.raw.boringsearchgifraw)
        .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(boringsearch);
        // GIF add code -
    }

    public void mOnPopupClick(View v) {
        //데이터 담아서 팝업(액티비티) 호출
        Intent intent = new Intent(this, pseudocode.pseudocode_1_2_doublelinkedlist.class);
        intent.putExtra("data", "boringsearch 수도코드 작성하기");
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
