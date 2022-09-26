package org.martin.designpatters.structural.adapter;

import org.martin.designpatters.structural.adapter.adapter.BookingAdapter;
import org.martin.designpatters.structural.adapter.newFeature.BookingNewFeature;
import org.martin.designpatters.structural.adapter.old.BookingOld;
import org.martin.designpatters.structural.adapter.old.impl.BookingOldImpl;

/**
 * @author victor.martingil
 **/
public class AdapterMain {


    public static void main(String[] args) {
        BookingOld bookingOld = new BookingOldImpl();
        BookingAdapter bookingAdapter = new BookingAdapter(bookingOld);

        Long hotelId = 1L;
        String hotelName = "Melia";

        System.out.println("Old interface:");
        System.out.println(bookingOld.getHotelInfo(hotelId, hotelName));

        System.out.println("New interface:");
        System.out.println(bookingAdapter.getNewHotelInfo(hotelName, hotelId));

    }
}
