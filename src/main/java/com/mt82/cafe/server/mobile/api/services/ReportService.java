/*
 * Author   : hnguyen 
 * Date     : 12.03.2015 
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

@Path("report")
public interface ReportService {

    /**
     * This method is used by the client to query sale by date
     *
     * @param date {@link java.util.Date} contains the full requested date
     * @return {@link javax.ws.rs.core.Response} contains a {@link Long} value represents the sale
     */
    @GET
    @Path("sale/date/{date}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saleByDate(@PathParam("date") Date date);

    /**
     * This method is used by the client to query sale by month
     *
     * @param date {@link Date} contains the requested month and year
     * @return {@link Response} contains a {@link Long} value represents the sale
     */
    @GET
    @Path("sale/month/{date}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saleByMonth(@PathParam("date") Date date);

}
