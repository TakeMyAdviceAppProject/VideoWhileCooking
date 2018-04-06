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
    interface Presenter extends BasePresenterInterface {
        /**
         * 获取视频&图片资源
         */
        void prepareVideoSrc();

        /**
         * 获取做菜步骤
         */
        void getCookingSteps();
    }

    interface View extends BaseView<Presenter> {
        /**
         * 显示播放器控件
         *
         * @param videoUri 视频uri
         * @param imgUri   图片uri
         */
        void showVideoPlayer(String videoUri, String imgUri);

        /**
         * 显示操作步骤
         * @param steps 做菜步骤描述
         */
        void showCookingSteps(String[] steps);
    }
}
