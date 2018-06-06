package com.zwy.dagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zwy.dagger2.Bean.Teacher;

public class MainActivity extends AppCompatActivity {
    User user;//这是依赖
    Teacher teacher;//这是依赖

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化User对象
        user = new User();
        user.setName("tom");
        user.setAge(20);
        //实例化Teacher对象
        teacher = new Teacher();
        teacher.setName("jack");

    }
}
