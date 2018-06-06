package com.zwy.dagger2.Module;

import com.zwy.dagger2.Bean.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/11/17.
 * email:16681805@qq.com
 */
@Module
public class SModule {
    @Provides
    public Student provideStudent() {
        return new Student("Student jack");
    }
}
