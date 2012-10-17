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
import com.gdgnantes.client.places.AboutPlace;
import com.gdgnantes.client.places.CalendarPlace;
import com.gdgnantes.client.views.MenuListView;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;

/**
 * @author majaouen
 */
public class MenuListActivity extends MGWTAbstractActivity {

	private final ClientFactory clientFactory;

	public MenuListActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, com.google.gwt.event.shared.EventBus eventBus) {
		MenuListView view = clientFactory.getHomeView();

		// Ajout du titre principal
		view.setTitle(ConstantsUtil.HEADER_DEVFEST_2012);

		// Ajout du clic droit
		view.setRightButtonText(ConstantsUtil.HEADER_ABOUT);

		// Ajout du sous titre
		// view.getFirstHeader().setText("Navigation");

		// Ajout des boutons du menu
		view.setTopics(createTopicsList());

		// Ajout des places sur les différents boutons du menu
		addHandlerRegistration(view.getCellSelectedHandler().addCellSelectedHandler(new CellSelectedHandler() {

			@Override
			public void onCellSelected(CellSelectedEvent event) {
				int index = event.getIndex();
				// Bouton 1 : Agenda
				if (index == 0) {
					clientFactory.getPlaceController().goTo(new CalendarPlace());
					return;
				}
				// // Bouton 2
				// if (index == 1) {
				// clientFactory.getPlaceController().goTo(new TemplatePlace());
				// return;
				// }
				// // Bouton 3
				// if (index == 2) {
				// clientFactory.getPlaceController().goTo(new TemplatePlace());
				// return;
				// }
				// // Bouton 4
				// if (index == 3) {
				// clientFactory.getPlaceController().goTo(new TemplatePlace());
				// return;
				// }
				// // Bouton 5
				// if (index == 4) {
				// clientFactory.getPlaceController().goTo(new TemplatePlace());
				// return;
				// }
			}
		}));

		// Ajout de la place sur le clic droit
		addHandlerRegistration(view.getAboutButton().addTapHandler(new TapHandler() {
			@Override
			public void onTap(TapEvent event) {
				clientFactory.getPlaceController().goTo(new AboutPlace());
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
		// list.add(new Topic("Accueil", 5));
		list.add(new Topic(ConstantsUtil.MENU_CALENDAR, 5));
		list.add(new Topic(ConstantsUtil.MENU_SESSIONS, 5));
		list.add(new Topic(ConstantsUtil.MENU_SPEAKERS, 5));
		list.add(new Topic(ConstantsUtil.MENU_PARTNERS, 5));
		list.add(new Topic(ConstantsUtil.MENU_FAQ, 5));
		return list;
	}

}
