package com.example.vikas.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll=(LinearLayout)findViewById(R.id.ll);
        ll.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(getApplicationContext(),"long click",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.a:
                Toast.makeText(getApplicationContext(),"About",Toast.LENGTH_SHORT).show();
                break;

            case R.id.b:
                Toast.makeText(getApplicationContext(),"setting",Toast.LENGTH_SHORT).show();
                break;

            case R.id.c:
                Toast.makeText(getApplicationContext(),"contact",Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);

    }
    public void signIn(View view)
    {
       // Toast.makeText(getApplicationContext(),"i am textview",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }
}
