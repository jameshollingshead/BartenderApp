package com.jameshollingshead;

import android.app.Application;

import com.jameshollingshead.activity.DeckardActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jhollingshead on 4/22/15.
 */
@Module(
        injects = DeckardActivity.class,
        library = true
)

public class DummyModule {
    private DeckardApplication application;


    public DummyModule(DeckardApplication application){
        this.application = application;
    }

    @Provides @Singleton Application provideApplicationContext() {
        return application;
    }

    @Provides String providesInjectedFoo(){
        return "Injected Foo";
    }
}
