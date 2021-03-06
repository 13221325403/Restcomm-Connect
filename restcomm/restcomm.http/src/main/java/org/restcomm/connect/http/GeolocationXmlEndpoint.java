/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.restcomm.connect.http;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import org.restcomm.connect.commons.annotations.concurrency.ThreadSafe;
import org.restcomm.connect.dao.entities.Geolocation;

/**
 * @author <a href="mailto:fernando.mendioroz@telestax.com"> Fernando Mendioroz </a>
 *
 */
@Path("/Accounts/{accountSid}/Geolocation")
@ThreadSafe
public final class GeolocationXmlEndpoint extends GeolocationEndpoint {

    public GeolocationXmlEndpoint() {
        super();
    }

    /*******************************************/
    // *** Immediate type of Geolocation ***//
    /*******************************************/


    @Path("/Immediate/{sid}")
    @DELETE
    public Response deleteImmediateGeolocationAsXml(@PathParam("accountSid") final String accountSid,
                                                    @PathParam("sid") final String sid) {
        return deleteGeolocation(accountSid, sid);
    }

    @Path("/Immediate/{sid}")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getImmediateGeolocationAsXml(@PathParam("accountSid") final String accountSid,
                                                 @PathParam("sid") final String sid) {
        return getGeolocation(accountSid, sid, retrieveMediaType());
    }

    @Path("/Immediate")
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response putImmediateGeolocationXmlPost(@PathParam("accountSid") final String accountSid,
                                                   final MultivaluedMap<String, String> data) {
        return putGeolocation(accountSid, data, Geolocation.GeolocationType.Immediate, retrieveMediaType());
    }

    @Path("/Immediate/{sid}")
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response putImmediateGeolocationAsXmlPost(@PathParam("accountSid") final String accountSid,
                                                     @PathParam("sid") final String sid, final MultivaluedMap<String, String> data) {
        return updateGeolocation(accountSid, sid, data, retrieveMediaType());
    }

    @Path("/Immediate/{sid}")
    @PUT
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response updateImmediateGeolocationAsXmlPut(@PathParam("accountSid") final String accountSid,
                                                       @PathParam("sid") final String sid, final MultivaluedMap<String, String> data) {
        return updateGeolocation(accountSid, sid, data, retrieveMediaType());
    }

    /*******************************************/
    // *** Notification type of Geolocation ***//
    /*******************************************/

    @Path("/Notification/{sid}")
    @DELETE
    public Response deleteNotificationGeolocationAsXml(@PathParam("accountSid") final String accountSid,
                                                       @PathParam("sid") final String sid) {
        return deleteGeolocation(accountSid, sid);
    }

    @Path("/Notification/{sid}")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getNotificationGeolocationAsXml(@PathParam("accountSid") final String accountSid,
                                                    @PathParam("sid") final String sid) {
        return getGeolocation(accountSid, sid, retrieveMediaType());
    }

    @Path("/Notification")
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response putNotificationGeolocationXmlPost(@PathParam("accountSid") final String accountSid,
                                                      final MultivaluedMap<String, String> data) {
        return putGeolocation(accountSid, data, Geolocation.GeolocationType.Notification, retrieveMediaType());
    }

    @Path("/Notification/{sid}")
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response putNotificationGeolocationAsXmlPost(@PathParam("accountSid") final String accountSid,
                                                        @PathParam("sid") final String sid, final MultivaluedMap<String, String> data) {
        return updateGeolocation(accountSid, sid, data, retrieveMediaType());
    }

    @Path("/Notification/{sid}")
    @PUT
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response updateNotificationGeolocationAsXmlPut(@PathParam("accountSid") final String accountSid,
                                                          @PathParam("sid") final String sid, final MultivaluedMap<String, String> data) {
        return updateGeolocation(accountSid, sid, data, retrieveMediaType());
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getGeolocationsAsXml(@PathParam("accountSid") final String accountSid) {
        return getGeolocations(accountSid, retrieveMediaType());
    }


}
