package com.example.lightdance.jcvideoplayerdemo.model;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/4/6.
 */

public interface CookingStepsInterface {

    interface OperateListener{
        /**
         * 成功时将获取的步骤封装成字符串数组返回
         * @param stringArray 做菜步骤
         */
        void onSuccess(String []stringArray);

        /**
         * 失败时将错误显示出来
         * @param error 错误类型
         */
        void onFailure(AppError error);
    }

    /**
     * 根据uri获取做菜步骤文字描述
     * @param stepsUri 做菜说明地址
     */
    void getSteps(String stepsUri , OperateListener listener);

}
