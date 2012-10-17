package com.gdgnantes.client.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class TemplatePlace extends Place {

	public static class TemplatePlaceTokenizer implements PlaceTokenizer<TemplatePlace> {

		@Override
		public TemplatePlace getPlace(String token) {
			return new TemplatePlace();
		}

		@Override
		public String getToken(TemplatePlace place) {
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

		if (other instanceof TemplatePlace)
			return true;
		return false;
	}

}
