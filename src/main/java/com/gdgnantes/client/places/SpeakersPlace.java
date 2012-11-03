package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SpeakersPlace extends Place {

	public static class SpeakersPlaceTokenizer implements
			PlaceTokenizer<SpeakersPlace> {

		@Override
		public SpeakersPlace getPlace(String token) {
			return new SpeakersPlace();
		}

		@Override
		public String getToken(SpeakersPlace place) {
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

		if (other instanceof SpeakersPlace)
			return true;
		return false;
	}

}
