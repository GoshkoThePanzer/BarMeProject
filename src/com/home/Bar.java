package com.home;

import java.time.LocalTime;

public class Bar {
    private String name;
    private float locationNAxis;
    private float locationEAxis;
    private LocalTime openingTime;
    private LocalTime closingTime;

    public Bar() {
    }

    public Bar(String name, float locationNAxis, float locationEAxis, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.locationNAxis = locationNAxis;
        this.locationEAxis = locationEAxis;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLocationNAxis() {
        return locationNAxis;
    }

    public void setLocationNAxis(float locationNAxis) {
        this.locationNAxis = locationNAxis;
    }

    public float getLocationEAxis() {
        return locationEAxis;
    }

    public void setLocationEAxis(float locationEAxis) {
        this.locationEAxis = locationEAxis;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }
}