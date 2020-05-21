package com.example.samratritwik.sit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int cnt=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Username=(EditText)findViewById(R.id.editText);
        Password=(EditText)findViewById(R.id.etPassword);
        Info=(TextView)findViewById(R.id.tvinfo);
        Login=(Button)findViewById(R.id.btnLogin);
        Info.setText("No. of attempts remaining: 5");

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                validate(Username.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String Username,String Password){
        if ((Username.equals("Ritwik")) && (Password.equals("1234"))){
            Intent std=new Intent(StudentActivity.this,StddataActivity.class);
            startActivity(std);
        }else{
                cnt--;
            Info.setText("No. Of attempts remaining:" + String.valueOf(cnt));

            if (cnt==0){
                Login.setEnabled(false);
            }

        }
    }

}
