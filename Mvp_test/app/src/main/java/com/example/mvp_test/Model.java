package com.example.mvp_test;

import java.util.Date;

import static com.example.mvp_test.MainActivity.data;

/**
 * Created by 郝书逸 on 2018/6/21.
 */

public class Model implements IModel{
    public Model() {
    }
    //model负责逻辑和数据处理
    @Override
    public void saveData(Data data) {
        String aimless;
        aimless=data.getAimless()+"@#$%&*";
        data.setAimless(aimless);
    }
}
