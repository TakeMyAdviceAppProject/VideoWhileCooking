package com.example.lightdance.jcvideoplayerdemo.model;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/3/9.
 */

public class PlayVideoLogic implements PlayVideoInterface {
    private String testVideoUrl = "http://2449.vod.myqcloud.com/2449_22ca37a6ea9011e5acaaf51d105342e3.f20.mp4";
    private String testImgUrl = "http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640";

    @Override
    public void prepareVideo(String imgUrl, String videoUrl, GetUrlListener listener) {
        if (imgUrl != null && videoUrl != null){
            listener.onSuccess(testImgUrl , testVideoUrl);
        }else {
            listener.onFailure(AppError.SRC_NOT_FOUND);
        }
    }
}
