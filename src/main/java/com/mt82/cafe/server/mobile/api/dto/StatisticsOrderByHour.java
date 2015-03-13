/*
 * Author   : hnguyen 
 * Date     : 12.03.2015 
 * 
 * Project  : mobile-server-api 
 * Package  : com.mt82.cafe.server.mobile.api.dto 
 *
 */

package com.mt82.cafe.server.mobile.api.dto;

import java.io.Serializable;
import java.util.Date;

public class StatisticsOrderByHour implements Serializable {

    private Long orderedQty;
    private Date hourOfDay;

    public Date getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(Date hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public Long getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(Long orderedQty) {
        this.orderedQty = orderedQty;
    }
}
