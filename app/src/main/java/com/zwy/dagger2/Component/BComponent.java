package com.zwy.dagger2.Component;

import com.zwy.dagger2.Bean.Teacher;
import com.zwy.dagger2.Module.BModule;
import com.zwy.dagger2.scope.BScope;

import dagger.Component;

/**
 * Created by zwy on 2017/11/17.
 * email:16681805@qq.com
 */
@BScope
@Component(modules = BModule.class)
public interface BComponent {
     Teacher provideTeacher();
}
