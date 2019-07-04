package com.example.truptibday;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luolc.emojirain.EmojiRainLayout;

public class RainEmoji  extends AppCompatActivity {
    private EmojiRainLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rain_emoji);

        // bind view
        mContainer = findViewById(R.id.group_emoji_container1);

        // add emoji sources
        mContainer.addEmoji(R.drawable.emoji_1_3 );
        mContainer.addEmoji(R.drawable.emoji_2_3);
        mContainer.addEmoji(R.drawable.emoji_3_3);
        mContainer.addEmoji(R.drawable.emoji_4_3);
        mContainer.addEmoji(R.drawable.emoji_5_3);

        // set emojis per flow, default 6
        mContainer.setPer(10);

        // set total duration in milliseconds, default 8000
        mContainer.setDuration(7200);

        // set average drop duration in milliseconds, default 2400
        mContainer.setDropDuration(2400);

        // set drop frequency in milliseconds, default 500
        mContainer.setDropFrequency(500);
        mContainer.startDropping();

    }
}
