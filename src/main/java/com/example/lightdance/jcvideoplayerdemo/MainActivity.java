package com.example.lightdance.jcvideoplayerdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;
public class MainActivity extends AppCompatActivity {
    String url;
    JZVideoPlayerStandard  player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = findViewById(R.id.video_main);

        //可正常使用!
        url = "http://jzvd.nathen.cn/c6e3dc12a1154626b3476d9bf3bd7266/6b56c5f0dc31428083757a45764763b0-5287d2089db37e62345123a1be272f8b.mp4";

        player.setUp(url , JZVideoPlayer.SCREEN_WINDOW_NORMAL , "测试");

    }
}
