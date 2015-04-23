package com.jameshollingshead;

/**
 * Created by jhollingshead on 4/22/15.
 */
public class FooObject implements Foo {


    public FooObject (){

    }

    @Override public String provideText() {
        return "Injected Foo";
    }
}
