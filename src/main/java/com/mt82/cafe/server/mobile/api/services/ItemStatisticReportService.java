/*
 * Author   : hnguyen 
 * Date     : 13.03.2015 
 * 
 * Project  : mobile-server-api 
 * Package  : com.mt82.cafe.server.mobile.api.services 
 * 
 */

package com.mt82.cafe.server.mobile.api.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

import java.util.List;

import com.mt82.cafe.server.mobile.api.dto.StatisticItemOrderedByMonth;

@Path("item/sale")
public interface ItemStatisticReportService {

    /**
     * This method is used by the client to query number of item sale for a specific month
     *
     * @param month {@link Date} contains the specific month
     * @return {@link Response} contains {@link List} of {@link StatisticItemOrderedByMonth}
     */
    @GET
    @Path("month/{month}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response itemSaleByMonth(@PathParam("month") Date month);

    /**
     * This method is used by the client to query average number of item sale in a month
     *
     * @return {@link Response} contains {@link List} of {@link StatisticItemOrderedByMonth}
     */
    @GET
    @Path("statistic")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response itemSaleAvgByMonth();

}
