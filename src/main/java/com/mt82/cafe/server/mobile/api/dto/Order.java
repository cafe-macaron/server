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
import java.util.List;

public class Order implements Serializable {

    private Long orderId;
    private Date openedAt;
    private Date closedAt;
    private Long totalPrice;
    private List<Item> items;

    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Date getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(Date openedAt) {
        this.openedAt = openedAt;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
