package com.example.hasee.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private LinearLayout animLine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animLine = (LinearLayout) findViewById(R.id.line_anim);

    }

    public void btAnim(View view){


//        animLine.setPivotX(1.0f);
//        animLine.animate().scaleX(0).setDuration(500).setInterpolator(new AccelerateDecelerateInterpolator());
//        if(animLine.getAlpha() ==1){
//            animLine.animate().scaleX(0).scaleXBy(100).setDuration(2000);
//        }else {
//            animLine.animate().alpha(1).scaleX(1).scaleXBy(1).setDuration(2000);
//        }
//        Toast.makeText(this,"alpha="+animLine.getAlpha()+"scale="+animLine.getScaleX(),Toast.LENGTH_SHORT).show();
        sendMessage3("10690700367","zc33");
    }

    private void sendMessage3(String tel, String content) {

            Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:" + tel));
            intent.putExtra("sms_body", content);
            startActivity(intent);

    }
}
