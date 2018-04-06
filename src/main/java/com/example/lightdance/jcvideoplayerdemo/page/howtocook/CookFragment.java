package com.example.lightdance.jcvideoplayerdemo.page.howtocook;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lightdance.jcvideoplayerdemo.R;
import com.example.lightdance.jcvideoplayerdemo.page.base.BaseFragment;
import com.example.lightdance.jcvideoplayerdemo.page.base.BasePresenterInterface;
import com.example.lightdance.jcvideoplayerdemo.page.base.BaseView;

import cn.jzvd.JZVideoPlayer;
import cn.jzvd.JZVideoPlayerStandard;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/3/12.
 */

public class CookFragment extends BaseFragment implements CookContract.View {

    CookContract.Presenter presenter;
    JZVideoPlayerStandard player;
    TextView textView;
    //连续更新的计数器
    int count = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cook , container , false);
        player = v.findViewById(R.id.video_player_cook);
        textView = v.findViewById(R.id.text_cook);
        presenter.start();
        return v;
    }


    @Override
    public void bindPresenter(CookContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showVideoPlayer(String videoUri, String imgUri) {
        player.setUp(videoUri , JZVideoPlayer.SCREEN_WINDOW_NORMAL);
        Uri img = Uri.parse(imgUri);
        player.thumbImageView.setImageURI(img);
    }


    @Override
    public void showCookingSteps(String[] steps) {
//        Handler handler = new Handler();
//        handler.postDelayed(()->{
//            textView.setText(steps[count++]);
//        } , 2000);
        String text = "";
        for (int i = 0; i < steps.length; i++) {
            text += (i+1) + steps[i] + "\n\n";
        }
        textView.setText(text);
    }
}
