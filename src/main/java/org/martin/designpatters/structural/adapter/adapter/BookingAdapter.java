package org.martin.designpatters.structural.adapter.adapter;

import org.martin.designpatters.structural.adapter.newFeature.BookingNewFeature;
import org.martin.designpatters.structural.adapter.old.BookingOld;

/**
 * @author victor.martingil
 **/
public class BookingAdapter implements BookingNewFeature {

    private BookingOld bookingOld;

    public BookingAdapter(BookingOld bookingOld) {
        this.bookingOld = bookingOld;
    }

    @Override
    public String getNewHotelInfo(String name, Long hotelId) {
        return bookingOld.getHotelInfo(hotelId, name);
    }
}
