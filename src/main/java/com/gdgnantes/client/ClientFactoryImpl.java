/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.gdgnantes.client;

import com.gdgnantes.client.views.AboutView;
import com.gdgnantes.client.views.AboutViewGwtImpl;
import com.gdgnantes.client.views.CalendarByRoomView;
import com.gdgnantes.client.views.CalendarByRoomViewGwtImpl;
import com.gdgnantes.client.views.CalendarView;
import com.gdgnantes.client.views.CalendarViewGwtImpl;
import com.gdgnantes.client.views.MenuListView;
import com.gdgnantes.client.views.MenuListViewGwtImpl;
import com.gdgnantes.client.views.PartnerView;
import com.gdgnantes.client.views.PartnerViewGwtImpl;
import com.gdgnantes.client.views.SessionView;
import com.gdgnantes.client.views.SessionViewGwtImpl;
import com.gdgnantes.client.views.SpeakersView;
import com.gdgnantes.client.views.SpeakersViewGwtImpl;
import com.gdgnantes.client.views.TemplateView;
import com.gdgnantes.client.views.TemplateViewGwtImpl;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * @author Daniel Kurka
 * 
 */
public class ClientFactoryImpl implements ClientFactory {

	private EventBus eventBus;
	private PlaceController placeController;
	private MenuListView homeViewImpl;
	private CalendarView calendarViewImpl;
	private CalendarByRoomView calendarByRoomViewImpl;
	private TemplateView templateViewImpl;
	private AboutViewGwtImpl aboutViewImpl;
	private SpeakersViewGwtImpl speakersViewImpl;
	private SessionViewGwtImpl sessionViewImpl;
	private PartnerViewGwtImpl partnerViewImpl;

	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();

		placeController = new PlaceController(eventBus);

	}

	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.ClientFactory#getHomeView()
	 */
	@Override
	public MenuListView getHomeView() {
		if (homeViewImpl == null) {
			homeViewImpl = new MenuListViewGwtImpl();
		}
		return homeViewImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.ClientFactory#getCalendarView()
	 */
	@Override
	public CalendarView getCalendarView() {
		if (calendarViewImpl == null) {
			calendarViewImpl = new CalendarViewGwtImpl();
		}
		return calendarViewImpl;
	}

	@Override
	public CalendarByRoomView getCalendarByRoomView() {
		if (calendarByRoomViewImpl == null) {
			calendarByRoomViewImpl = new CalendarByRoomViewGwtImpl();
		}
		return calendarByRoomViewImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.ClientFactory#getTemplateView()
	 */
	@Override
	public TemplateView getTemplateView() {
		if (templateViewImpl == null) {
			templateViewImpl = new TemplateViewGwtImpl();
		}
		return templateViewImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.ClientFactory#getAboutView()
	 */
	@Override
	public AboutView getAboutView() {
		if (aboutViewImpl == null) {
			aboutViewImpl = new AboutViewGwtImpl();
		}
		return aboutViewImpl;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.ClientFactory#getSpeakersView()
	 */
	@Override
	public SpeakersView getSpeakersView() {
		if (speakersViewImpl == null) {
			speakersViewImpl = new SpeakersViewGwtImpl();
		}
		return speakersViewImpl;
	}

	@Override
	public SessionView getSessionView() {
		if (sessionViewImpl == null) {
			sessionViewImpl = new SessionViewGwtImpl();
		}
		return sessionViewImpl;
	}

	@Override
	public PartnerView getPartnerView() {
		if (partnerViewImpl == null) {
			partnerViewImpl = new PartnerViewGwtImpl();
		}
		return partnerViewImpl;
	}

}
