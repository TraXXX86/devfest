package com.gdgnantes.client;

import com.gdgnantes.client.activities.AboutActivity;
import com.gdgnantes.client.activities.CalendarActivity;
import com.gdgnantes.client.activities.MenuListActivity;
import com.gdgnantes.client.activities.TemplateActivity;
import com.gdgnantes.client.places.AboutPlace;
import com.gdgnantes.client.places.CalendarPlace;
import com.gdgnantes.client.places.HomePlace;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

public class TabletNavActivityMapper implements ActivityMapper {

	private final ClientFactory clientFactory;

	public TabletNavActivityMapper(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if (place instanceof HomePlace) {
			return new MenuListActivity(clientFactory);
		}
		if (place instanceof CalendarPlace) {
			return new CalendarActivity(clientFactory);
		}
		if (place instanceof AboutPlace) {
			return new AboutActivity(clientFactory);
		}
		return new TemplateActivity(clientFactory);
	}
}
