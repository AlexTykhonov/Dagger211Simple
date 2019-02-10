package com.boisneyphilippe.githubarchitecturecomponents.di.component;

import android.app.Application;

import com.boisneyphilippe.githubarchitecturecomponents.App;
import com.boisneyphilippe.githubarchitecturecomponents.di.module.ActivityModule;
import com.boisneyphilippe.githubarchitecturecomponents.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Philippe on 02/03/2018.
 */

//        компонент Даггера, в аннотации указано что испльзует 4 класса из которых берутся связи для даггер-класса
@Singleton
@Component(modules={AndroidSupportInjectionModule.class, ActivityModule.class, AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }

    //        важнейший метод - инджект
    void inject(App app);
}
