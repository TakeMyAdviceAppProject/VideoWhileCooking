package com.example.lightdance.jcvideoplayerdemo.model;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/4/6.
 */

public class CookingStepsLogic implements CookingStepsInterface {

    private static final String[] testSteps = {"准备好原材料",
            "鸡翅两面都斜着切两道口",
            "锅里加入适量水，滴入加入适量料酒烧开，下入鸡翅焯水，再次烧开煮一分钟捞起沥干水分",
            "生姜切成片、大葱切成段，小葱切成葱花",
            "锅里加入少许油，放入生姜、大葱、八角炒香",
            "加入鸡翅两面煎黄", "加入适量盐、少许生抽翻均匀",
            "加入可乐煮直到煮粘稠",
            "出锅装盘，撒上葱花"};

    @Override
    public void getSteps(String stepsUri , OperateListener listener) {
        String [] steps = testSteps;
        if (steps != null){
            listener.onSuccess(steps);
        }else {
            listener.onFailure(AppError.SRC_NOT_FOUND);
        }
    }
}
