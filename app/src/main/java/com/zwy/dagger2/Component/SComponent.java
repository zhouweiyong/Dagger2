package com.zwy.dagger2.Component;

import com.zwy.dagger2.Bean.Student;
import com.zwy.dagger2.Module.SModule;

import dagger.Component;

/**
 * Created by zwy on 2017/11/17.
 * email:16681805@qq.com
 */
@Component(modules = SModule.class)
public interface SComponent {
    Student provideStudent();
}
