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
import com.gdgnantes.client.cst.ConstantsUtil;
import com.gdgnantes.client.places.HomePlace;
import com.gdgnantes.client.views.SpeakersView;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

/**
 * @author Daniel Kurka
 * 
 */
public class SpeakersActivity extends MGWTAbstractActivity {

	private final ClientFactory clientFactory;

	public SpeakersActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	private boolean isInit = false;

	@Override
	public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
		SpeakersView view = clientFactory.getSpeakersView();

		// Ajout du titre principal
		view.setTitle(ConstantsUtil.MENU_SPEAKERS);

		// Ajout du label du bouton de retour
		view.setBackButtonText(ConstantsUtil.HEADER_BACK);

		// Ajout de la place pour le bouton de retour
		addHandlerRegistration(view.getBackButton().addTapHandler(new TapHandler() {
			@Override
			public void onTap(TapEvent event) {
				clientFactory.getPlaceController().goTo(new HomePlace());
				return;
			}
		}));

		if (!view.isInit()) {
			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_NGR_NAME, //
					ConstantsUtil.SPEAKER_NGR_DESCRIPTION, //
					ConstantsUtil.SPEAKER_NGR_GGPLUS, //
					ConstantsUtil.SPEAKER_NGR_IMG));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_PPS_NAME, //
					ConstantsUtil.SPEAKER_PPS_DESCRIPTION, //
					ConstantsUtil.SPEAKER_PPS_GGPLUS, //
					ConstantsUtil.SPEAKER_PPS_IMG));
			view.setInit(true);
		}

		panel.setWidget(view);
	}

	private String createSpeakerDescription(String speakerName, String speakerDescription, String ggplusUrl, String speakerImg) {
		StringBuilder builder = new StringBuilder();
		builder.append(ConstantsUtil.SPEAKER_1);
		builder.append(ggplusUrl);
		builder.append(ConstantsUtil.SPEAKER_2);
		builder.append(speakerName);
		builder.append(ConstantsUtil.SPEAKER_3);
		builder.append(speakerImg);
		builder.append(ConstantsUtil.SPEAKER_4);
		builder.append(ggplusUrl);
		builder.append(ConstantsUtil.SPEAKER_5);
		builder.append(speakerName);
		builder.append(ConstantsUtil.SPEAKER_6);
		builder.append(speakerDescription);
		builder.append(ConstantsUtil.SPEAKER_7);
		return builder.toString();
	}

}
