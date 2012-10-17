package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class AboutPlace extends Place {

	public static class AboutPlaceTokenizer implements PlaceTokenizer<AboutPlace> {

		@Override
		public AboutPlace getPlace(String token) {
			return new AboutPlace();
		}

		@Override
		public String getToken(AboutPlace place) {
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

		if (other instanceof AboutPlace)
			return true;
		return false;
	}

}
