package com.jameshollingshead;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

public class DeckardApplication extends Application {

    private ObjectGraph graph;

    @Override public void onCreate(){
        super.onCreate();

        graph = ObjectGraph.create(new DummyModule(this));
    }

//    public List<Object> getModules(){
//        return Arrays.asList(new DummyModule(this));
//    }

    public void inject(Object object){
        graph.inject(object);
    }
}
