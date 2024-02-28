package com.example.foodapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.foodapp.R;
import com.example.foodapp.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {

    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater()); // 创建绑定类的实例
        setContentView(binding.getRoot()); //获取对根视图的引用，作为活动视图
        buttonSetting();
    }

    private void buttonSetting() {
        binding.sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("注册","注册");
            }
        });

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("登录","登录");

            }
        });
    }
}