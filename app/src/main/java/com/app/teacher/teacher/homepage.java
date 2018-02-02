package com.app.teacher.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homepage extends AppCompatActivity {

    Button bt_aboutus , bt_aboutapp , bt_service , bt_contacts , bt_searchteacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        bt_aboutapp = (Button) findViewById(R.id.bt_aboutapp);
        bt_aboutapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homepage.this , aboutappscreen.class);
                startActivity(intent);
            }
        });
        /////////////////////////////////////

        bt_searchteacher = (Button) findViewById(R.id.bt_searchteacher);
        bt_searchteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homepage.this , search_for_teacher.class);
                startActivity(intent);
            }
        });
        /////////////////////////////////////

        bt_aboutus = (Button) findViewById(R.id.bt_aboutus);
        bt_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homepage.this , aboutusscreen.class);
                startActivity(intent);
            }
        });
        /////////////////////////////////////
        bt_service = (Button) findViewById(R.id.bt_service);
        bt_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homepage.this , service.class);
                startActivity(intent);
            }
        });
        /////////////////////////////////////
        bt_contacts = (Button) findViewById(R.id.bt_contactus);
        bt_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(homepage.this , aboutappscreen.class);
                startActivity(intent);
            }
        });
        /////////////////////////////////////
    }
}
