package com.home;

import java.time.LocalTime;

public class Setup {
    public void setupBar (BarDB db){
        db.add(new Bar("Кръкалника", 43.206338, 23.566672,
                LocalTime.of(0,0), LocalTime.of(23,59)));
        db.add(new Bar("Рок клуб The Stage", 43.207122, 23.553563,
                LocalTime.of(21,0), LocalTime.of(5,0)));
        db.add(new Bar("Тракийска принцеса", 43.204687, 23.552347,
                LocalTime.of(8,30), LocalTime.of(0,0)));
        db.add(new Bar("Бижу", 43.205137, 23.556241,
                LocalTime.of(6,0), LocalTime.of(2,0)));
        db.add(new Bar("Кадифе", 43.202918, 23.549158,
                LocalTime.of(7,0), LocalTime.of(15,0)));
        db.add(new Bar("Валентино", 43.201610, 23.549212,
                LocalTime.of(7,0), LocalTime.of(23,0)));
        db.add(new Bar("Кафе Ола", 43.204831, 23.553249,
                LocalTime.of(7,0), LocalTime.of(23,0)));
        db.add(new Bar("Фламинго", 43.202805, 23.551010,
                LocalTime.of(7,30), LocalTime.of(22,30)));
        db.add(new Bar("Метър бира",  43.224733, 23.552799,
                LocalTime.of(16,0), LocalTime.of(23,45)));
        db.add(new Bar("Пинтата", 43.206256, 23.551295,
                LocalTime.of(11,30), LocalTime.of(23,0)));
    }

    public static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    public static double findDistanceInMetresBetweenTwoCoordinates(double coordN, double coordE) {
        double earthRadiusKm = 6371;
        double diffN = degreesToRadians(coordN - Myself.MY_LOCATION_N_AXIS);
        double diffE = degreesToRadians(coordE - Myself.MY_LOCATION_E_AXIS);

        double latInRadians = degreesToRadians(Myself.MY_LOCATION_N_AXIS);

        coordN = degreesToRadians(coordN);

        double a = Math.sin(diffN/2) * Math.sin(diffN/2) +
                Math.sin(diffE/2) * Math.sin(diffE/2) * Math.cos(latInRadians) * Math.cos(coordN);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        return Math.round(earthRadiusKm * c*1000);
    }
}
