package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class PartnerPlace extends Place {

	public static class PartnerPlaceTokenizer implements
			PlaceTokenizer<PartnerPlace> {

		@Override
		public PartnerPlace getPlace(String token) {
			return new PartnerPlace();
		}

		@Override
		public String getToken(PartnerPlace place) {
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

		if (other instanceof PartnerPlace)
			return true;
		return false;
	}

}
