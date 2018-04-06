package com.example.lightdance.jcvideoplayerdemo.page.howtocook;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;
import com.example.lightdance.jcvideoplayerdemo.app.MessageLevel;
import com.example.lightdance.jcvideoplayerdemo.model.CookingStepsInterface;
import com.example.lightdance.jcvideoplayerdemo.model.CookingStepsLogic;
import com.example.lightdance.jcvideoplayerdemo.model.PlayVideoInterface;
import com.example.lightdance.jcvideoplayerdemo.model.PlayVideoLogic;

/**
 * Presenter
 *
 * @author LightDance
 * @date 2018/3/12.
 */

public class CookPresenter implements CookContract.Presenter {
    private PlayVideoLogic playVideoLogic;
    private CookingStepsLogic showStepsLogic;
    private CookContract.View view;

    CookContract.View getView() {
        return view;
    }

    CookPresenter(CookContract.View fragment) {
        view = new CookFragment();
        view.bindPresenter(this);
    }

    @Override
    public void start() {
        playVideoLogic = new PlayVideoLogic();
        showStepsLogic = new CookingStepsLogic();
        prepareVideoSrc();
        getCookingSteps();
    }

    @Override
    public void destroy() {

    }

    @Override
    public void prepareVideoSrc() {
        playVideoLogic.prepareVideo(PlayVideoLogic.TEST_IMG_URL, PlayVideoLogic.TEST_VIDEO_URL, new PlayVideoInterface.GetUrlListener() {
            @Override
            public void onSuccess(String imgUri, String videoUri) {
                view.showVideoPlayer(videoUri, imgUri);
            }

            @Override
            public void onFailure(AppError error) {
                view.showMessage(error.toString() , MessageLevel.TOAST);
            }
        });
    }

    @Override
    public void getCookingSteps() {
        showStepsLogic.getSteps("暂时没弄uri", new CookingStepsInterface.OperateListener() {
            @Override
            public void onSuccess(String[] stringArray) {
                view.showCookingSteps(stringArray);
            }

            @Override
            public void onFailure(AppError error) {
                view.showMessage(error.toString() , MessageLevel.TOAST);
            }
        });

    }
}
