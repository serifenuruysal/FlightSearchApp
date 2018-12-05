package com.soulkitchen.serifenuruysal.flightsearchapp;

import android.app.Application;
import android.content.Context;
import androidx.test.runner.AndroidJUnitRunner;

/**
 * Created by S.Nur Uysal on 30.11.2018.
 */
public class MockTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, Application.class.getName(), context);
    }
}
