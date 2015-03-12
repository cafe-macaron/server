/*
 * Author   : hnguyen 
 * Date     : 12.03.2015 
 * 
 * Project  : mobile-server-api 
 * Package  : com.mt82.cafe.server.mobile.api.services 
 * 
 */

package com.mt82.cafe.server.mobile.api.services;

import com.mt82.cafe.server.mobile.api.dto.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("ordering")
public interface OrderingService {

    /**
     * This method is used by the client to submit an order to server
     *
     * @param order {@link Order}
     * @return {@link Response} 201 CREATED
     */
    @POST
    @Path("submit")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response submitOrder(Order order);

}
