package sem4.Solution26;

import java.util.ArrayList;
import java.util.List;

public class Solution26 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment apparment : apartments) {
            if (apparment instanceof OneRoomApt) ((OneRoomApt) apparment).clean1Room();
            if (apparment instanceof TwoRoomApt) ((TwoRoomApt) apparment).clean2Rooms();
            if (apparment instanceof ThreeRoomApt) ((ThreeRoomApt) apparment).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }


    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }


    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }


    }
}
