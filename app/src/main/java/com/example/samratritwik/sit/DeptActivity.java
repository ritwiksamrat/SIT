package com.example.samratritwik.sit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeptActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dept);

        Button cse=(Button)findViewById(R.id.text20);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cse1=new Intent(DeptActivity.this,ComputerActivity.class);
                startActivity(cse1);
            }
        });
        Button ee=(Button)findViewById(R.id.text9);
        ee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ee1=new Intent(DeptActivity.this,EeActivity.class);
                startActivity(ee1);
            }
        });
        Button ece=(Button)findViewById(R.id.text10);
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ece1=new Intent(DeptActivity.this,EceActivity.class);
                startActivity(ece1);
            }
        });
        Button it=(Button)findViewById(R.id.text11);
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it1=new Intent(DeptActivity.this,ItActivity.class);
                startActivity(it1);
            }
        });
        Button ce=(Button)findViewById(R.id.text12);
        ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ce1=new Intent(DeptActivity.this,CeActivity.class);
                startActivity(ce1);
            }
        });
        Button esh=(Button)findViewById(R.id.text13);
        esh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent esh1=new Intent(DeptActivity.this,EshActivity.class);
                startActivity(esh1);
            }
        });
        Button hmct=(Button)findViewById(R.id.text14);
        hmct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hmct1=new Intent(DeptActivity.this,HmctActivity.class);
                startActivity(hmct1);
            }
        });
        Button mba=(Button)findViewById(R.id.text15);
        mba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mba1=new Intent(DeptActivity.this,MbaActivity.class);
                startActivity(mba1);
            }
        });
        Button ca=(Button)findViewById(R.id.text16);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ca1=new Intent(DeptActivity.this,CaActivity.class);
                startActivity(ca1);
            }
        });
        Button bhm=(Button)findViewById(R.id.text17);
        bhm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bhm1=new Intent(DeptActivity.this,BhmActivity.class);
                startActivity(bhm1);
            }
        });
    }
}
