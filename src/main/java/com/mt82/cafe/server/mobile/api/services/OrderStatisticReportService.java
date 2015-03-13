/*
 * Author   : hnguyen 
 * Date     : 13.03.2015 
 * 
 * Project  : mobile-server-api 
 * Package  : com.mt82.cafe.server.mobile.api.services 
 * 
 * NOTICE:  All information and intellectual property contained herein is 
 * the confidential property of SICPA  HOLDING SA, and may be subject to 
 * patent, copyright, trade secret, and other intellectual property and 
 * contractual protections.  Reproduction or dissemination of the 
 * information or intellectual property contained herein is strictly 
 * forbidden, unless separate written permission has been obtained from 
 * SICPA HOLDING SA.  
 *
 * Copyright Notice
 * Copyright © 2015 SICPA HOLDING SA. All rights reserved.
 * 
 */

package com.mt82.cafe.server.mobile.api.services;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.List;
import java.util.Date;

import com.mt82.cafe.server.mobile.api.dto.StatisticsOrderByHour;

@Path("order/sale")
public interface OrderStatisticReportService {

    /**
     * This method is used by the client to query number of order by items for a specific hour in a specific day
     *
     * @param hour {@link Date} contains the specific hour and day
     * @return {@link Response} contains {@link List} of {@link StatisticsOrderByHour}
     */
    @GET
    @Path("hour/{hour}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response orderByHourAndDay(@PathParam("hour") Date hour);

    /**
     * This method is used by the client to query average number of order by items by hour of the day
     *
     * @return {@link Response} contains {@link List} of {@link StatisticsOrderByHour}
     */
    @GET
    @Path("statistic")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response orderStatisticByHourOfDay();
}
