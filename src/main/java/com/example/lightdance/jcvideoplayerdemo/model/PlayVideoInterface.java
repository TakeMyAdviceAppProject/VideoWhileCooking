package com.example.lightdance.jcvideoplayerdemo.model;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/3/8.
 */

public interface PlayVideoInterface {
    interface GetUrlListener {
        /**
         * 操作成功，对uri进行处理
         *
         * @param imgUri   图片地址
         * @param videoUri 视频地址
         */
        void onSuccess(String imgUri, String videoUri);

        /**
         * 操作失败,提示用户为啥
         *
         * @param error 错误说明
         */
        void onFailure(AppError error);
    }


    /**
     * 播放前的准备工作，获取视频地址、视频图片地址等
     *
     * @param imgUrl   视频图片地址
     * @param videoUrl 视频地址
     * @param listener 回调监听
     */
    void prepareVideo(String imgUrl, String videoUrl, GetUrlListener listener);


}
