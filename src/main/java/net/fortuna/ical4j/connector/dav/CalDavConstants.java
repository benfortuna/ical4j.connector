/**
 * Copyright (c) 2011, Ben Fortuna
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  o Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *
 *  o Neither the name of Ben Fortuna nor the names of any other contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.fortuna.ical4j.connector.dav;

import org.apache.jackrabbit.webdav.xml.Namespace;

/**
 * $Id$
 * 
 * Created on 19/11/2008
 * 
 * @author Ben
 * 
 */
public class CalDavConstants {

    /**
     * Default namespace.
     */
    public static final Namespace NAMESPACE = Namespace.getNamespace("C", "urn:ietf:params:xml:ns:caldav");

    /**
     * Namespace used by CalendarServer (calendarserver.org).
     */
    public static final Namespace CS_NAMESPACE = Namespace.getNamespace("S", "http://calendarserver.org/ns/");

    /**
     * Namespace used by the iCal client from Apple.
     */
    public static final Namespace ICAL_NAMESPACE = Namespace.getNamespace("I", "http://apple.com/ns/ical/");

    /**
     * To improve on performance, this specification defines a new "calendar collection entity tag" (CTag) WebDAV
     * property that is defined on calendar collections. When the calendar collection changes, the CTag value changes.
     * Source : https://trac.calendarserver.org/browser/CalendarServer/trunk/doc/Extensions/caldav-ctag.txt
     */
    public static final String PROPERTY_CTAG = "getctag";

    /**
     * Purpose: Provides a human-readable description of the calendar collection. RFC : rfc4791
     */
    public static final String PROPERTY_CALENDAR_DESCRIPTION = "calendar-description";

    /**
     * Apple's iCal client use this property to store the color of the calendar, set by the user in iCal.
     */
    public static final String PROPERTY_CALENDAR_COLOR = "calendar-color";

    /**
     * 
     */
    public static final String PROPERTY_CALENDAR_ORDER = "calendar-order";

    /**
     * Purpose: Identify the calendars that contribute to the free-busy information for the owner of the scheduling
     * http://www.ietf.org/id/draft-desruisseaux-caldav-sched-09.txt
     */
    public static final String PROPERTY_FREE_BUSY_SET = "calendar-free-busy-set";

    /**
     * Purpose: Identifies the URL of any WebDAV collections that contain calendar collections owned by the associated
     * principal resource. RFC : rfc4791
     */
    public static final String PROPERTY_HOME_SET = "calendar-home-set";

    /**
     * The property to identify a "calendar" resource-type for the collection.
     */
    public static final String PROPERTY_RESOURCETYPE_CALENDAR = "calendar";

    /**
     * TODO: description missing. Stuff coming from Apple's Calendar Server
     */
    public static final String PROPERTY_PROXY_WRITE_FOR = "calendar-proxy-write-for";
    
    /**
     * TODO: description missing. Stuff coming from Apple's Calendar Server
     */
    public static final String PROPERTY_PROXY_READ_FOR = "calendar-proxy-read-for";

    /**
     * Identify the calendar addresses of the associated principal resource.
     * http://www.ietf.org/id/draft-desruisseaux-caldav-sched-09.txt
     */
    public static final String PROPERTY_USER_ADDRESS_SET = "calendar-user-address-set";
    
    /**
     * Identify the URL of the scheduling Inbox collection owned by the associated principal resource.
     * http://www.ietf.org/id/draft-desruisseaux-caldav-sched-09.txt
     */
    public static final String PROPERTY_SCHEDULE_INBOX_URL = "schedule-inbox-URL";
    
    /**
     * Identify the URL of the scheduling Outbox collection owned by the associated principal resource.
     * http://www.ietf.org/id/draft-desruisseaux-caldav-sched-09.txt
     */
    public static final String PROPERTY_SCHEDULE_OUTBOX_URL = "schedule-outbox-URL";
    
    /**
     * Specific to CalendarServer, but I can't find the description
     */
    public static final String PROPERTY_DROP_HOME_URL = "dropbox-home-URL";
    
    /**
     * Provides the URI of the pubsub node to subscribe to in order to receive a notification whenever a 
     * resource within this calendar home has changed.
     * http://svn.calendarserver.org/repository/calendarserver/CalendarServer/trunk/doc/Extensions/caldav-pubsubdiscovery.txt
     */
    public static final String PROPERTY_XMPP_URI = "xmpp-uri";
    
    /**
     * Identify the URL of the notification collection owned by the associated principal resource.
     * http://svn.calendarserver.org/repository/calendarserver/CalendarServer/trunk/doc/Extensions/caldav-sharing-02.txt
     */
    public static final String PROPERTY_NOTIFICATION_URL = "notification-URL";
    
    /**
     * Provides the hostname of the XMPP server a client should connect to for subscribing to notifications.
     * http://svn.calendarserver.org/repository/calendarserver/CalendarServer/trunk/doc/Extensions/caldav-pubsubdiscovery.txt
     */
    public static final String PROPERTY_XMPP_SERVER = "xmpp-server";
    
    /**
     * Specifies the calendar component types (e.g., VEVENT, VTODO, etc.) that calendar object resources can 
     * contain in the calendar collection.
     */
    public static final String PROPERTY_SUPPORTED_CALENDAR_COMPONENT_SET = "supported-calendar-component-set";
    
    /**
     * Determines whether the calendar object resources in a calendar collection will affect the owner's freebusy.
     */
    public static final String PROPERTY_SCHEDULE_CALENDAR_TRANSP = "schedule-calendar-transp";
    
    /**
     * Specifies a default calendar for an attendee that will automatically have new scheduling messages 
     * deposited into it when they arrive.
     */
    public static final String PROPERTY_SCHEDULE_DEFAULT_CALENDAR_URL = "schedule-default-calendar-URL";
    
    /**
     * The CALDAV:calendar-timezone property is used to specify the time zone the server should 
     * rely on to resolve "date" values and "date with local time" values (i.e., floating time) to 
     * "date with UTC time" values.
     */
    public static final String PROPERTY_CALENDAR_TIMEZONE = "calendar-timezone";
}
