package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CalendarByRoomPlace extends Place {

	public static class CalendarByRoomPlaceTokenizer implements
			PlaceTokenizer<CalendarByRoomPlace> {

		@Override
		public CalendarByRoomPlace getPlace(String token) {
			return new CalendarByRoomPlace();
		}

		@Override
		public String getToken(CalendarByRoomPlace place) {
			return "";
		}

	}

	@Override
	public int hashCode() {
		return 3;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this)
			return true;
		if (other == null)
			return false;

		if (other instanceof CalendarByRoomPlace)
			return true;
		return false;
	}

}
