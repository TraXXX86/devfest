package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class CalendarPlace extends Place {

	public static class CalendarPlaceTokenizer implements PlaceTokenizer<CalendarPlace> {

		@Override
		public CalendarPlace getPlace(String token) {
			return new CalendarPlace();
		}

		@Override
		public String getToken(CalendarPlace place) {
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

		if (other instanceof CalendarPlace)
			return true;
		return false;
	}

}
