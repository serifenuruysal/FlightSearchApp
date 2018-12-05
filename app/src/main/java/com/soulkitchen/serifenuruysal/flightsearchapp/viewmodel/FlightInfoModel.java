package com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel;

import androidx.lifecycle.ViewModel;

import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SkyResponse;

/**
 * Created by S.Nur Uysal on 2.12.2018.
 */
public class FlightInfoModel extends ViewModel {
    private SkyResponse skyResponse;
    private String dateInfo;
    private String adultCount;
    private String flightType;
    private String sourceDestination;

    public String getDateInfo() {
        return skyResponse!=null?skyResponse.getQuery().getInboundDate() + " - " + skyResponse.getQuery().getOutboundDate():"";
    }

    public String getAdultCount() {
        return skyResponse!=null?skyResponse.getQuery().getAdults()+" Adult":"";
    }

    public String getFlightType() {
        return skyResponse!=null?skyResponse.getQuery().getCabinClass():"";
    }

    public String getSourceDestination() {
        return skyResponse!=null?skyResponse.getQuery().getOriginPlace()+"-"+skyResponse.getQuery().getDestinationPlace():"";
    }

    public FlightInfoModel(SkyResponse response) {
        skyResponse=response;
    }
}
