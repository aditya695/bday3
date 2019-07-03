package com.example.uitest;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.VideoView;

import com.vstechlab.easyfonts.EasyFonts;

import java.nio.file.Files;


public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener {
    ScrollView background;
    RelativeLayout cardClick;
    TextView welcomeBoard;
    TextView contRead;
    TextView module_text1;

    TextView module_text2;
    TextView module_text4;
//    TextView module_text5;
    TextView module_text6;
//    TextView module_text7;
    TextView module_text8;
ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       try
        {

            setContentView(R.layout.activity_main);

            this.getSupportActionBar().hide();
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            welcomeBoard= (TextView) findViewById(R.id.welcomeBoard);
            welcomeBoard.setTypeface(EasyFonts.captureIt(this));
           // contRead.setTextColor(white);

//            welcomeBoard.setTextSize(25);
            contRead= (TextView) findViewById(R.id.contRead);
            contRead.setTypeface(EasyFonts.caviarDreamsBold(this));
//            contRead.setTextColor(R.color.white);
            //welcomeBoard.setTextSize(25);
            module_text1=(TextView) findViewById(R.id.module_text1);

            module_text2=(TextView) findViewById(R.id.module_text2);
            module_text2.setTypeface(EasyFonts.funRaiser  (this));

            module_text4=(TextView) findViewById(R.id.module_text4);
            module_text4.setTypeface(EasyFonts.caviarDreamsBold (this));
            module_text6=(TextView) findViewById(R.id.module_text6);
            module_text6.setTypeface(EasyFonts.caviarDreamsBold (this));
            module_text8=(TextView) findViewById(R.id.module_text8);
            module_text8.setTypeface(EasyFonts.funRaiser (this));
            progressBar= findViewById(R.id.progressBar);
            progressBar.getProgressDrawable().setColorFilter(
                    Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
/*            VideoView videoview = (VideoView) findViewById(R.id.videoBackground);
            Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.i);
            videoview.setVideoURI(uri);
            videoview.start();
            */
            background= findViewById(R.id.scroll);

            background.setOnTouchListener(new View.OnTouchListener()
            {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    ScrollView c = findViewById(R.id.scroll);
                    c.setBackgroundColor ( getResources().getColor(R.color.ghost_white));
                    return false;
                }


            });
            cardClick = findViewById(R.id.cardClick);
            cardClick.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                public void onClick(View v)
                {
                    try {
                        Intent intent = new Intent(v.getContext(), YoutubePreview.class);
                        startActivity(intent);
                       /* ScrollView c = findViewById(R.id.scroll);
                        c.setBackgroundResource(R.drawable.ironman1);*/
                       /* VideoView videoview = (VideoView) findViewById(R.id.videoBackground1);
                        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.i1);
                        videoview.setVideoURI(uri);
                        videoview.start();*/
                        //setContentView(R.layout.activity_main);

//                        c.setBackgroundColor (R.color.ghost_white);
                    }
                    catch(Exception e)
                    {
                        Log.d("adityaWadekar",e.toString());

                    }
                }
            });

            background.setOnScrollChangeListener( new View.OnScrollChangeListener()
            {
                public void onScrollChange(View v,
                                           int scrollX,
                                           int scrollY,
                                           int oldScrollX,
                                           int oldScrollY)
                {
                    ScrollView c = findViewById(R.id.scroll);
                    c.setBackgroundColor ( getResources().getColor(R.color.ghost_white));
                }

            });
        }
        catch (Exception e){
            Log.d("adityaw",e.toString());

           // e.printStackTrace();
        }




    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
