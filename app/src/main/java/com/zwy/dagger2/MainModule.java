package com.zwy.dagger2;

import java.util.HashSet;
import java.util.Set;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zwy on 2017/11/14.
 * email:16681805@qq.com
 */
@Module
public class MainModule {
    @Provides(type = Provides.Type.SET_VALUES)
    public Set<User> provideSet() {
        HashSet<User> set = new HashSet<>();
        set.add(new User("tom", 20));
        return set;
    }

    @Provides(type = Provides.Type.SET)
    public User provideUser1() {
        return new User("jack", 30);
    }

    @Provides(type = Provides.Type.SET)
    public User provideUser2() {
        return new User("ema", 18);
    }
}
