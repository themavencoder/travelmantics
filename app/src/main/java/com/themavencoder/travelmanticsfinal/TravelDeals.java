package com.themavencoder.travelmanticsfinal;

/**
 * Created by themavencoder on 08,August,2019
 */
public class TravelDeals {

    private String id;
    private String title;
    private String description;
    private String price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public TravelDeals() {

    }
    public TravelDeals(String title, String description, String price) {
       // this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }
}
