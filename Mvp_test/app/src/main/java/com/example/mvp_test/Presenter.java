package com.example.mvp_test;

import java.util.Date;

/**
 * Created by 郝书逸 on 2018/6/21.
 */

public class Presenter {
    private IView mIView;
    private Model mModel;
    public Presenter(IView mIView) {

        this.mIView = mIView;
        mModel = new Model();

    }
    public void saveData(Data data){
        mModel.saveData(data);
    }

}
