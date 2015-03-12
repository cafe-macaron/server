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

public class StatisticItemOrderedByMonth implements Serializable {

    private Item item;
    private Long orderedQty;
    private Date month;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getMonth() {
        return month;
    }

    public void setMonth(Date month) {
        this.month = month;
    }

    public Long getOrderedQty() {
        return orderedQty;
    }

    public void setOrderedQty(Long orderedQty) {
        this.orderedQty = orderedQty;
    }
}
