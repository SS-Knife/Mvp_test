package com.example.mvp_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements IView{
    public static Data data=new Data();
    Model model=new Model();
    private TextView xiaxianshi;
    private EditText xiaxie;
    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xiaxie=findViewById(R.id.xiajibaxie);
        xiaxianshi=findViewById(R.id.xiajibaxianshi);
        mPresenter = new Presenter(this);
    }

    @Override
    public void setaimless(String aimless) {
        xiaxianshi.setText(aimless);
    }


    public void regist(View view) {
        data.setAimless(xiaxie.getText().toString());
        mPresenter.saveData(data);
        xiaxianshi.setText("");

    }

    public void present(View view) {
        xiaxianshi.setText(data.getAimless());
    }
}
