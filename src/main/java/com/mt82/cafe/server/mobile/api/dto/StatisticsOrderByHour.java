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

public class StatisticsOrderByHour implements Serializable {

    private Long orderedQty;
    private Integer hourOfDay;

    public Integer getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public Long getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(Long orderedQty) {
        this.orderedQty = orderedQty;
    }
}
