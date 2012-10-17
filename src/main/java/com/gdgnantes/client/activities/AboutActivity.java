/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.gdgnantes.client.activities;

import com.gdgnantes.client.ClientFactory;
import com.gdgnantes.client.places.HomePlace;
import com.gdgnantes.client.views.AboutView;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * @author Daniel Kurka
 * 
 */
public class AboutActivity extends MGWTAbstractActivity {

	private final ClientFactory clientFactory;

	public AboutActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
		AboutView view = clientFactory.getAboutView();

		// Ajout du titre principal
		view.setTitle("About");

		// Ajout du label du bouton de retour
		view.setBackButtonText("Retour");

		// Ajout de la place pour le bouton de retour
		addHandlerRegistration(view.getBackButton().addTapHandler(new TapHandler() {
			@Override
			public void onTap(TapEvent event) {
				clientFactory.getPlaceController().goTo(new HomePlace());
				return;
			}
		}));

		panel.setWidget(view);

	}

}
