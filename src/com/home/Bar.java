package com.home;

import java.time.LocalTime;

public class Bar {
    private String name;
    private double locationNAxis;
    private double locationEAxis;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private double distance;

    public Bar() {
    }

    public Bar(String name, double locationNAxis, double locationEAxis, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.locationNAxis = locationNAxis;
        this.locationEAxis = locationEAxis;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public double getDistance() {
        return distance;
    }

    public int getMapX() {
        return (int) Math.abs(((locationNAxis - Map.MAP_START_X_CONST) * 600) / Map.MAP_CONST);
    }
    public int getMapY() {
        return (int) Math.abs(((locationEAxis - Map.MAP_START_Y_CONST) * 600) / Map.MAP_CONST);
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLocationNAxis() {
        return locationNAxis;
    }

    public void setLocationNAxis(double locationNAxis) {
        this.locationNAxis = locationNAxis;
    }

    public double getLocationEAxis() {
        return locationEAxis;
    }

    public void setLocationEAxis(double locationEAxis) {
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