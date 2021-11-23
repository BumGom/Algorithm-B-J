package explainpage.list;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.algorithm_bj.R;

import pseudocode.pseudocode_linkedlist;

public class linkedlist extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explainpage_1_1_linkedlist);

        Button pllbutton=(Button) findViewById(R.id.pseudocode_linkedlist);
        pllbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), pseudocode_linkedlist.class);
                startActivity(intent);
            }
        });
    }
}
