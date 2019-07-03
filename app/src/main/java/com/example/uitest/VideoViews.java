package com.example.uitest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;
import android.widget.VideoView;

public class VideoViews   extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {


       try
       {
           super.onCreate(savedInstanceState);

        setContentView(R.layout.video_view);
           this.getSupportActionBar().hide();
           this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                   WindowManager.LayoutParams.FLAG_FULLSCREEN);
           VideoView videoview = (VideoView) findViewById(R.id.videoBackground);
           Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.i1);
           videoview.setVideoURI(uri);
           videoview.start();
       }
       catch (Exception e)
       {
           Log.d("adityaWadekar",e.toString());

       }
    }
}
