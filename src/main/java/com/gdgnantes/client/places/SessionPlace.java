package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SessionPlace extends Place {

	public static class SessionPlaceTokenizer implements
			PlaceTokenizer<SessionPlace> {

		@Override
		public SessionPlace getPlace(String token) {
			return new SessionPlace();
		}

		@Override
		public String getToken(SessionPlace place) {
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

		if (other instanceof SessionPlace)
			return true;
		return false;
	}

}
