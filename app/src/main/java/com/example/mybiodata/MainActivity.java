package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        getSupportActionBar().hide();

        Button one = (Button) findViewById(R.id.btn_map);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.btn_phn);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.btn_email);
        three.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_map:
                // do your code
                Button btn_map;
                btn_map=(Button) findViewById(R.id.btn_map);
                btn_map.setOnClickListener(this);

                String uri = "https://www.google.com/maps/place/" + -6.779712793718963+ "," +  110.84435356741722 ;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);

                break;
            case R.id.btn_phn:
                // do your code
                Button btn_phn;
                btn_phn=(Button) findViewById(R.id.btn_phn);
                btn_phn.setOnClickListener(this);

                intent =new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel: 085865448633"));
                startActivity(intent);

                break;
            case R.id.btn_email:
                // do your code
                Button btn_email;
                btn_email=(Button) findViewById(R.id.btn_email);
                btn_email.setOnClickListener(this);

                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "bagus8545@gmail.com" });
                intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
                intent.putExtra(Intent.EXTRA_TEXT, "mail body");
                startActivity(Intent.createChooser(intent, ""));
                break;
            default:
                break;
        }
    }

}