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

public class Item implements Serializable {

    private String name;
    private Long quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
