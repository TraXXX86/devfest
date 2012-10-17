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

import java.util.ArrayList;
import java.util.List;

import com.gdgnantes.client.ClientFactory;
import com.gdgnantes.client.activities.home.Topic;
import com.gdgnantes.client.cst.ConstantsUtil;
import com.gdgnantes.client.places.HomePlace;
import com.gdgnantes.client.views.TemplateView;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;

/**
 * @author Daniel Kurka
 * 
 */
public class TemplateActivity extends MGWTAbstractActivity {

	private final ClientFactory clientFactory;

	public TemplateActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
		TemplateView view = clientFactory.getTemplateView();

		// Ajout du titre principal
		view.setTitle(ConstantsUtil.HEADER_DEVFEST_2012);

		// Ajout du label du bouton de retour
		view.setBackButtonText(ConstantsUtil.HEADER_BACK);

		// Ajout du sous titre
		view.getFirstHeader().setText("Template");

		// Ajout des boutons du menu
		view.setTopics(createTopicsList());

		// Ajout des places sur les différents boutons du menu
		addHandlerRegistration(view.getCellSelectedHandler().addCellSelectedHandler(new CellSelectedHandler() {

			@Override
			public void onCellSelected(CellSelectedEvent event) {
				int index = event.getIndex();
				// Bouton 1
				if (index == 0) {
					clientFactory.getPlaceController().goTo(new HomePlace());
					return;
				}
			}
		}));

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

	/**
	 * Création de la liste des boutons du menu
	 * 
	 * @return
	 */
	private List<Topic> createTopicsList() {
		ArrayList<Topic> list = new ArrayList<Topic>();
		list.add(new Topic(ConstantsUtil.HEADER_BACK, 5));
		return list;
	}

}
