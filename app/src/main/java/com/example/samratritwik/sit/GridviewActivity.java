package com.example.samratritwik.sit;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

public class GridviewActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);

        TextView tv=(TextView)findViewById(R.id.dtext);
        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent obj = new Intent(GridviewActivity.this,DeptActivity.class);
                startActivity(obj);
            }

        });
            TextView fa=(TextView) findViewById(R.id.text);
            fa.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent fa1=new Intent(GridviewActivity.this,FacilityActivity.class);
                    startActivity(fa1);
                }

            });
            TextView ab=(TextView) findViewById(R.id.text2);
            ab.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent ab1=new Intent(GridviewActivity.this,AboutAcitivity.class);
                    startActivity(ab1);
                }
            });
            TextView pl=(TextView) findViewById(R.id.text3);
            pl.setOnClickListener(new  View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent pl1=new Intent(GridviewActivity.this,PlacementActivity.class);
                    startActivity(pl1);
                }
            });
            TextView nt=(TextView) findViewById(R.id.text4);
            nt.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent nt1 =new Intent(GridviewActivity.this,NoticeActivity.class);
                    startActivity(nt1);
                }
            });
            TextView sz=(TextView)findViewById(R.id.text5);
            sz.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View V){
                    Intent sz1=new Intent(GridviewActivity.this,StudentActivity.class);
                    startActivity(sz1);
            }
    });
    }
        }
    /* if(!isConnected(GridviewActivity.this)) buildDialog(GridviewActivity.this).show();
        else {

        }
    }
    public boolean isConnected(Context context){
        ConnectivityManager cm=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if(netinfo != null && netinfo.isConnectedOrConnecting()){
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        if((mobile !=null && mobile.isConnectedOrConnecting()) || (wifi !=null && wifi.isConnectedOrConnecting()))  return true;
            else return false;
        }else
            return false;
    }
    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }

} */

