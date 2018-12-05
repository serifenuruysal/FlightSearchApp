package com.soulkitchen.serifenuruysal.flightsearchapp.utils;

import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.CarriersItem;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.ItinerariesItem;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.LegsItem;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SkyResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.Utils;

import java.util.HashMap;

/**
 * Created by S.Nur Uysal on 27.11.2018.
 */
public class CardTransition {
    private String inBoundTime;
    private String inImageUrl;
    private String outBoundTime;
    private String outImageUrl;
    private String isInDirect;
    private String isOutDirect;
    private String inDuration;
    private String outDuration;
    private String inSubtitle;
    private String outSubtitle;
    private String price;
    private String agent;

    public CardTransition(ItinerariesItem item, SkyResponse skyResponse) {
        String inboundLegId = item.getInboundLegId();
        String outboundLegId = item.getOutboundLegId();
        HashMap<Integer, CarriersItem> carriersItemMap = new HashMap<Integer, CarriersItem>();
        for (CarriersItem cItem : skyResponse.getCarriers()) {
            carriersItemMap.put(cItem.getId(), cItem);
        }
        for (LegsItem legItem : skyResponse.getLegs()) {
            if (legItem.getId().equals(inboundLegId)) {
                this.setInBoundTime(Utils.getTime(legItem.getDeparture()) + " - " + Utils.getTime(legItem.getArrival()));
                this.setInDuration(legItem.getDuration() + "m");
                this.setInSubtitle(skyResponse.getQuery().getOriginPlace() + "-" + skyResponse.getQuery().getDestinationPlace());
                this.setIsInDirect((legItem.getStops() != null && legItem.getStops().size() > 1) ? legItem.getStops().size() + " stop" : "Direct");
                this.setInImageUrl(carriersItemMap.get(legItem.getFlightNumbers().get(0).getCarrierId()).getImageUrl());
                this.setAgent(carriersItemMap.get(legItem.getFlightNumbers().get(0).getCarrierId()).getName());
                this.setPrice(item.getPricingOptions().get(0).getPrice()+skyResponse.getQuery().getCurrency());
            }
            if (legItem.getId().equals(outboundLegId)) {
                this.setOutBoundTime(Utils.getTime(legItem.getDeparture()) + " - " + Utils.getTime(legItem.getArrival()));
                this.setOutDuration(legItem.getDuration() + "m");
                this.setOutSubtitle(skyResponse.getQuery().getDestinationPlace() + "-" + skyResponse.getQuery().getOriginPlace());
                this.setIsOutDirect((legItem.getStops() != null && legItem.getStops().size() > 1) ? legItem.getStops().size() + " stop" : "Direct");
                this.setOutImageUrl(carriersItemMap.get(legItem.getFlightNumbers().get(0).getCarrierId()).getImageUrl());
                this.setAgent(carriersItemMap.get(legItem.getFlightNumbers().get(0).getCarrierId()).getName());
                this.setPrice(item.getPricingOptions().get(0).getPrice()+skyResponse.getQuery().getCurrency());
            }
        }
    }

    public String getInBoundTime() {
        return inBoundTime;
    }

    public void setInBoundTime(String inBoundTime) {
        this.inBoundTime = inBoundTime;
    }

    public String getInImageUrl() {
        return inImageUrl;
    }

    public void setInImageUrl(String inImageUrl) {
        this.inImageUrl = inImageUrl;
    }

    public String getOutBoundTime() {
        return outBoundTime;
    }

    public void setOutBoundTime(String outBoundTime) {
        this.outBoundTime = outBoundTime;
    }

    public String getOutImageUrl() {
        return outImageUrl;
    }

    public void setOutImageUrl(String outImageUrl) {
        this.outImageUrl = outImageUrl;
    }

    public String getIsInDirect() {
        return isInDirect;
    }

    public void setIsInDirect(String isInDirect) {
        this.isInDirect = isInDirect;
    }

    public String getIsOutDirect() {
        return isOutDirect;
    }

    public void setIsOutDirect(String isOutDirect) {
        this.isOutDirect = isOutDirect;
    }

    public String getInDuration() {
        return inDuration;
    }

    public void setInDuration(String inDuration) {
        this.inDuration = inDuration;
    }

    public String getOutDuration() {
        return outDuration;
    }

    public void setOutDuration(String outDuration) {
        this.outDuration = outDuration;
    }

    public String getInSubtitle() {
        return inSubtitle;
    }

    public void setInSubtitle(String inSubtitle) {
        this.inSubtitle = inSubtitle;
    }

    public String getOutSubtitle() {
        return outSubtitle;
    }

    public void setOutSubtitle(String outSubtitle) {
        this.outSubtitle = outSubtitle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }
}
