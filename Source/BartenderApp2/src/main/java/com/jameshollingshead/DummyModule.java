package com.jameshollingshead;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jhollingshead on 4/22/15.
 */
@Module(
        injects = {MainActivity.class, MainApplication.class}
)

public class DummyModule {

    public DummyModule(){

    }

    @Provides public Foo provideFoo(){
        return new FooObject();
    }
}
