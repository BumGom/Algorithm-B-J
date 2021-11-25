package com.example.algorithm_bj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

       Button listButton=(Button)findViewById(R.id.list);
        listButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "리스트", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), listActivity.class);
                startActivity(intent);
            }
        });

        Button stackButton=(Button) findViewById(R.id.stack);
        stackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "스택", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), stackActivity.class);
                startActivity(intent);
            }
        });
        Button queueButton=(Button) findViewById(R.id.queue);
        queueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "큐", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), queueActivity.class);
                startActivity(intent);
            }
        });
        Button treeButton=(Button) findViewById(R.id.tree);
        treeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "트리", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), treeActivity.class);
                startActivity(intent);
            }
        });
        Button sortButton=(Button) findViewById(R.id.sort);
        sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "정렬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), sortActivity.class);
                startActivity(intent);
            }
        });
        Button searchButton=(Button) findViewById(R.id.search);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "탐색", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), searchActivity.class);
                startActivity(intent);
            }
        });
        Button heapButton=(Button) findViewById(R.id.heap);
        heapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "우선순위 큐와 힙", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), heapActivity.class);
                startActivity(intent);
            }
        });
        Button hashButton=(Button) findViewById(R.id.hash);
        hashButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "해쉬", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), hashActivity.class);
                startActivity(intent);
            }
        });
        Button graphButton=(Button) findViewById(R.id.graph);
        graphButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "그래프", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), graphActivity.class);
                startActivity(intent);
            }
        });
        Button stringButton=(Button) findViewById(R.id.string);
        stringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "문자열 검색", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), stringsearchActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_option,menu);
        return true;
    }
}