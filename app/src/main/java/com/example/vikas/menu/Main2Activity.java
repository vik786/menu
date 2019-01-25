package com.example.vikas.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText c_email,c_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c_email=(EditText)findViewById(R.id.c_email);
        c_password=(EditText)findViewById(R.id.c_password);



    }

    public void ab(View view)
    {
        if(c_email.getText().toString().equals("admin") && c_password.getText().toString().trim().equals("kumar") )
        {   Intent inn=new Intent(getApplicationContext(),Main3Activity.class);
            startActivity(inn);
            Toast.makeText(getApplicationContext(),"Congratulations ,Sign In successfully",Toast.LENGTH_SHORT ).show();}
        else

        { Toast.makeText(getApplicationContext(),"wrong email or password",Toast.LENGTH_SHORT ).show();}

    }

    public void signUp(View view)
    {
        Intent in=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(in);
    }


}
