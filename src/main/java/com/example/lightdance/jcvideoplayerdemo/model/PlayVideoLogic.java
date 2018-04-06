package com.example.lightdance.jcvideoplayerdemo.model;

import com.example.lightdance.jcvideoplayerdemo.app.AppError;

/**
 * file description
 *
 * @author LightDance
 * @date 2018/3/9.
 */

public class PlayVideoLogic implements PlayVideoInterface {
    public static final String TEST_VIDEO_URL = "http://video19.ifeng.com/video09/2017/10/04/9023299-102-009-082422.mp4?vid=5f81ea80-1790-47a4-93a9-e4f3d620d671&uid=1523012504121_msq8vw7979&from=v_Free&pver=vHTML5Player_v2.0.0&sver=&se=%E5%B0%8F%E9%B1%BC%E5%AE%B6%E5%B8%B8%E8%8F%9C&cat=91-93&ptype=91&platform=pc&sourceType=h5&dt=1507076602000&gid=-y3l0WKanq9T&sign=12835ec687542e5e17338bdc5856247e&tm=1523012513620&vkey=PUWbh0gD5%2Bx%2BscImI%2BQ41JQhin56cM8zxhSg2KRIi47zNrH7egZOqv8OhQMDEm0ODKqFGHe43or56ZyVot5%2F3k76aRr1GppWlbvrvO88S4zrKKl4vZIoDbbhq5MhQY2DocVn9ufL9T%2FShBR%2Bz6ZonDxy30K6P6kMiMdhm2qcw2xWhzePwjWH4K8aOKqIMFN4G855O6%2BmFhzP6sB%2FZ3G4Bvj6Oq1NbRrt5%2FTpo9gjYfrDd8kURb%2FPOrjkA7EJ8HVNA10eu0mzd%2FmAZgDBdYzS4QMcXw5E0czcuYR46JH9hTknQoMmdR6vEsAIAdynNUnD";
    public static final String TEST_IMG_URL = "http://p.qpic.cn/videoyun/0/2449_43b6f696980311e59ed467f22794e792_1/640";

    @Override
    public void prepareVideo(String imgUrl, String videoUrl, GetUrlListener listener) {
        if (imgUrl != null && videoUrl != null) {
            listener.onSuccess(TEST_IMG_URL, TEST_VIDEO_URL);
        } else {
            listener.onFailure(AppError.SRC_NOT_FOUND);
        }
    }
}
