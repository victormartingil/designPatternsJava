package org.martin.designpatters.structural.adapter.old.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.martin.designpatters.structural.adapter.old.BookingOld;

/**
 * @author victor.martingil
 **/
public class BookingOldImpl implements BookingOld {

    @Override
    public String getHotelInfo(Long hotelId, String name) {
        return "This hotel is " + name + " and its id is: " + hotelId;
    }
}
