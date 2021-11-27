package com.example.algorithm_bj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


import submainpage.graphActivity;
import submainpage.hashActivity;
import submainpage.heapActivity;
import submainpage.listActivity;
import submainpage.queueActivity;
import submainpage.searchActivity;
import submainpage.sortActivity;
import submainpage.stackActivity;
import submainpage.stringsearchActivity;
import submainpage.treeActivity;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);

        //ImageView imageview=(ImageView) findViewById(R.id.boringsearchgifexplain);
        //Glide.with(this).load(R.drawable.gifboringsearch).into((ImageView) findViewById(R.id.boringsearchgifexplain));



        Button listButton=(Button)findViewById(R.id.list);
        listButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), listActivity.class);
                startActivity(intent);
            }
        });

        Button stackButton=(Button) findViewById(R.id.stack);
        stackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), stackActivity.class);
                startActivity(intent);
            }
        });
        Button queueButton=(Button) findViewById(R.id.queue);
        queueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), queueActivity.class);
                startActivity(intent);
            }
        });
        Button treeButton=(Button) findViewById(R.id.tree);
        treeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), treeActivity.class);
                startActivity(intent);
            }
        });
        Button sortButton=(Button) findViewById(R.id.sort);
        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), sortActivity.class);
                startActivity(intent);
            }
        });
        Button searchButton=(Button) findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), searchActivity.class);
                startActivity(intent);
            }
        });
        Button heapButton=(Button) findViewById(R.id.heap);
        heapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), heapActivity.class);
                startActivity(intent);
            }
        });
        Button hashButton=(Button) findViewById(R.id.hash);
        hashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), hashActivity.class);
                startActivity(intent);
            }
        });
        Button graphButton=(Button) findViewById(R.id.graph);
        graphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), graphActivity.class);
                startActivity(intent);
            }
        });
        Button stringButton=(Button) findViewById(R.id.string);
        stringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), stringsearchActivity.class);
                startActivity(intent);
            }
        });



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu1:
                Toast.makeText(getApplicationContext(),"개발자들",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),extrapage.development_staff.class);
                startActivity(intent);
                return true;
            case R.id.menu2:
                Toast.makeText(getApplicationContext(),"참고 문헌",Toast.LENGTH_SHORT).show();
                Intent intent1=new Intent(getApplicationContext(),extrapage.reference.class);
                startActivity(intent1);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}