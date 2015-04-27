package com.jameshollingshead;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

public class MainApplication extends Application {

    private ObjectGraph graph;

    @Override public void onCreate(){
        super.onCreate();

        graph = ObjectGraph.create(getModules().toArray());
    }

    public List<DummyModule> getModules(){
        return Arrays.asList(new DummyModule());
    }

    public void inject(Object object){
        graph.inject(object);
    }
}
