package com.soulkitchen.serifenuruysal.flightsearchapp.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.soulkitchen.serifenuruysal.flightsearchapp.utils.Constants.*;

/**
 * Created by S.Nur Uysal on 28.11.2018.
 */
public class Utils {

    public static Map<String, String> getDefaultParamaters(int pageIndex) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("pageIndex", pageIndex + "");
        params.put("pageSize", PAGE_SIZE);
        params.put("country", COUNTRY);
        params.put("cabinclass", ECONOMY);
        params.put("currency", GBP);
        params.put("locale", LOCALE);
        params.put("locationSchema", SKY);
        params.put("originplace", EDI_SKY);
        params.put("destinationplace", LOND_SKY);
        params.put("outbounddate", OUTBOUND_DATE);
        params.put("inbounddate", INBOUND_DATE);
        params.put("adults", ADULTS_COUNT);
        params.put("children", CHILDREN_COUNT);
        params.put("infants", INFANTS);
        return params;
    }

    public static String getSessionId(String url) {
        String[] resultUrl = url.split("/");
        if (resultUrl.length == 0)
            throw new IllegalArgumentException("String not in correct format");
        return resultUrl[resultUrl.length - 1];
    }

    public static String getTime(String sDate) {
//        String strDate = "2013-05-15T10:00:00";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
        Date date = null;
        try {
            date = dateFormat.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date.getHours() + ":" + date.getMinutes();

    }

    public static String getDefaultBodyParamaters() {
        return "cabinclass=Economy&country=UK&currency=GBP&locale=en-GB&locationSchema=sky&originplace=EDI-sky&destinationplace=LOND-sky&outbounddate=2018-12-02&inbounddate=2018-12-09&adults=1&children=0&infants=0&apikey=ss630745725358065467897349852985";
    }
}
