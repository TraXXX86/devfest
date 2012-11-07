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
import com.gdgnantes.client.cst.img.ImgBundle;
import com.gdgnantes.client.places.HomePlace;
import com.gdgnantes.client.views.SpeakersView;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Image;
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
					ImgBundle.INSTANCE.ngr()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_PPS_NAME, //
					ConstantsUtil.SPEAKER_PPS_DESCRIPTION, //
					ConstantsUtil.SPEAKER_PPS_GGPLUS, //
					ImgBundle.INSTANCE.pps()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_JFG_NAME, //
					ConstantsUtil.SPEAKER_JFG_DESCRIPTION, //
					ConstantsUtil.SPEAKER_JFG_GGPLUS, //
					ImgBundle.INSTANCE.jfg()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_LCS_NAME, //
					ConstantsUtil.SPEAKER_LCS_DESCRIPTION, //
					ConstantsUtil.SPEAKER_LCS_GGPLUS, //
					ImgBundle.INSTANCE.lcs()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_SNS_NAME, //
					ConstantsUtil.SPEAKER_SNS_DESCRIPTION, //
					ConstantsUtil.SPEAKER_SNS_GGPLUS, //
					ImgBundle.INSTANCE.sns()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_GGD_NAME, //
					ConstantsUtil.SPEAKER_GGD_DESCRIPTION, //
					ConstantsUtil.SPEAKER_GGD_GGPLUS, //
					ImgBundle.INSTANCE.ggd()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_IGN_NAME, //
					ConstantsUtil.SPEAKER_IGN_DESCRIPTION, //
					ConstantsUtil.SPEAKER_IGN_GGPLUS, //
					ImgBundle.INSTANCE.ign()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_MGR_NAME, //
					ConstantsUtil.SPEAKER_MGR_DESCRIPTION, //
					ConstantsUtil.SPEAKER_MGR_GGPLUS, //
					ImgBundle.INSTANCE.mgr()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_VJA_NAME, //
					ConstantsUtil.SPEAKER_VJA_DESCRIPTION, //
					ConstantsUtil.SPEAKER_VJA_GGPLUS, //
					ImgBundle.INSTANCE.vja()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_NFS_NAME, //
					ConstantsUtil.SPEAKER_NFS_DESCRIPTION, //
					ConstantsUtil.SPEAKER_NFS_GGPLUS, //
					ImgBundle.INSTANCE.nfs()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_GGU_NAME, //
					ConstantsUtil.SPEAKER_GGU_DESCRIPTION, //
					ConstantsUtil.SPEAKER_GGU_GGPLUS, //
					ImgBundle.INSTANCE.ggu()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_TPT_NAME, //
					ConstantsUtil.SPEAKER_TPT_DESCRIPTION, //
					ConstantsUtil.SPEAKER_TPT_GGPLUS, //
					ImgBundle.INSTANCE.tpt()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_MGU_NAME, //
					ConstantsUtil.SPEAKER_MGU_DESCRIPTION, //
					ConstantsUtil.SPEAKER_MGU_GGPLUS, //
					ImgBundle.INSTANCE.mgu()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_ARD_NAME, //
					ConstantsUtil.SPEAKER_ARD_DESCRIPTION, //
					ConstantsUtil.SPEAKER_ARD_GGPLUS, //
					ImgBundle.INSTANCE.ard()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_OGR_NAME, //
					ConstantsUtil.SPEAKER_OGR_DESCRIPTION, //
					ConstantsUtil.SPEAKER_OGR_GGPLUS, //
					ImgBundle.INSTANCE.ogr()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_SJR_NAME, //
					ConstantsUtil.SPEAKER_SJR_DESCRIPTION, //
					ConstantsUtil.SPEAKER_SJR_GGPLUS, //
					ImgBundle.INSTANCE.sjr()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_FBY_NAME, //
					ConstantsUtil.SPEAKER_FBY_DESCRIPTION, //
					ConstantsUtil.SPEAKER_FBY_GGPLUS, //
					ImgBundle.INSTANCE.fby()));

			view.addSpeakerDescription(createSpeakerDescription(//
					ConstantsUtil.SPEAKER_DGD_NAME, //
					ConstantsUtil.SPEAKER_DGD_DESCRIPTION, //
					ConstantsUtil.SPEAKER_DGD_GGPLUS, //
					ImgBundle.INSTANCE.dgd()));

			view.setInit(true);
		}

		panel.setWidget(view);
	}

	private String createSpeakerDescription(String speakerName, String speakerDescription, String ggplusUrl, ImageResource speakerImg) {
		StringBuilder builder = new StringBuilder();
		builder.append(ConstantsUtil.SPEAKER_1);
		// builder.append(ggplusUrl);
		// builder.append(ConstantsUtil.SPEAKER_2);
		// builder.append(speakerName);
		// builder.append(ConstantsUtil.SPEAKER_3);
		// System.out.println(speakerImg.getSafeUri().asString());
		// System.out.println(speakerImg.getHeight());
		Image img = new Image(speakerImg);
		// System.out.println(img.getStyleName());
		// System.out.println(img.getStylePrimaryName());
		// String urlImg = StringUtils.replace(img.getAltText(), "0px", "75px");
		// AbstractImagePrototype test = AbstractImagePrototype.create(speakerImg);
		// img.setPixelSize(75, speakerImg.getHeight() * 75 / speakerImg.getWidth());
		// System.out.println(test.getHTML());
		// System.out.println(img);
		// img.setPixelSize(75, 75);
		// System.out.println(img);
		// img.setSize("75px", "75px");
		// System.out.println(img);
		// img.setLayoutData(new Layout)
		// tHeight("75px");
		// img.setWidth("75px");
		// img.getElement().setAttribute("width", "75");
		// img.getElement().setAttribute("height", "75");
		builder.append(img);
		builder.append(ConstantsUtil.SPEAKER_2);
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
