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
import java.util.List;

@Path("ordering")
public interface OrderService {

    /**
     * This method is used by the client to submit an order to server.
     *
     * @param order {@link Order}
     * @return {@link Response} 201 CREATED
     */
    @POST
    @Path("submit")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response submitOrder(Order order);

    /**
     * This method is used by the client to retrieve an order by id
     *
     * @param id orderId
     * @return {@link Response} 200 contains an {@link Order}
     */
    @POST
    @Path("id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getOrderById(@PathParam("id") Long id);

    /**
     * This method is used by the client to retrieve all orders
     *
     * @return {@link Response} 200 contains {@link List} of {@link Order}
     */
    @POST
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getOrderById();

}
