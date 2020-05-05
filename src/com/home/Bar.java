package com.home;

import java.time.LocalTime;

public class Bar {
    private String name;
    private double locationNAxis;
    private double locationEAxis;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private double distance;
    private TextureManager texture;
    private int pixelX;
    private int pixelY;

    public Bar() {
    }

    public Bar(String name, double locationNAxis, double locationEAxis, LocalTime openingTime, LocalTime closingTime, int pixelX, int pixelY) {
        this.name = name;
        this.locationNAxis = locationNAxis;
        this.locationEAxis = locationEAxis;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        texture = new TextureManager();
        this.pixelX = pixelX;
        this.pixelY = pixelY;
    }

    public double getDistance() {
        return distance;
    }

    public void setTexture(int width, int height, int scale, String path) {
        texture = new TextureManager(getMapX(), getMapY(), width, height, scale, path);
        Map.display.addTexture(texture);
    }

    public TextureManager getTexture() {
        return texture;
    }

    public int getMapX() {
        return pixelX;
    }

    public int getMapY() {
        return pixelY;
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