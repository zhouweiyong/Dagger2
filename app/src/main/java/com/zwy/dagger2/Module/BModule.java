package com.zwy.dagger2.Module;

import com.zwy.dagger2.Bean.Teacher;
import com.zwy.dagger2.scope.BScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/11/17.
 * email:16681805@qq.com
 */
@Module
public class BModule {
    @BScope
    @Provides
    public Teacher provideTeacher() {
        return new Teacher("Teacher tom");
    }
}
