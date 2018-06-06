package com.zwy.dagger2;

import dagger.Component;

/**
 * Created by zwy on 2017/11/14.
 * email:16681805@qq.com
 */
//这个构造者没有Module手下
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
