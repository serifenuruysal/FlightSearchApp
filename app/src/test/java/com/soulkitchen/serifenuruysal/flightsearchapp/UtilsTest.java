package com.soulkitchen.serifenuruysal.flightsearchapp;

import com.soulkitchen.serifenuruysal.flightsearchapp.utils.Utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by S.Nur Uysal on 30.11.2018.
 */
public class UtilsTest {

    @Test
    public void isTimeConverted() {

        String strDate = "2013-05-15T10:20:00";
        assertEquals("10:20", Utils.getTime(strDate));
    }
}
