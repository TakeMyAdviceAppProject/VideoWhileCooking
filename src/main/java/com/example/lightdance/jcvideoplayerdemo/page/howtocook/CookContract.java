package com.example.lightdance.jcvideoplayerdemo.page.howtocook;

import com.example.lightdance.jcvideoplayerdemo.page.base.BasePresenterInterface;
import com.example.lightdance.jcvideoplayerdemo.page.base.BaseView;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/3/12.
 */

class CookContract {
    interface Presenter extends BasePresenterInterface{
        /**
         * 获取视频&图片资源
         */
        void prepareVideoSrc();

        /**
         * 获取做菜步骤
         */
        void getCookingSteps();
    }

    interface View extends BaseView<Presenter>{
        /**
         * 显示播放器控件
         */
        void showVideoPlayer();

        /**
         * 显示操作步骤
         */
        void showCookingSteps();
    }
}
