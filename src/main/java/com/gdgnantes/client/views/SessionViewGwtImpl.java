/**
 * 
 */
package com.gdgnantes.client.views;

import com.gdgnantes.client.cst.ConstantsUtil;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.Carousel;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.RoundPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;

/**
 * @author majaouen
 * 
 */
public class SessionViewGwtImpl implements SessionView {

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private HeaderButton headerBackButton;
	private Carousel carousel;
	private boolean isInit = false;

	public SessionViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		headerBackButton = new HeaderButton();
		headerBackButton.setBackButton(true);
		headerPanel.setLeftWidget(headerBackButton);
		headerBackButton.setVisible(!MGWT.getOsDetection().isAndroid());

		main.add(headerPanel);
		carousel = new Carousel();
		carousel.addSelectionHandler(new SelectionHandler<Integer>() {

			@Override
			public void onSelection(SelectionEvent<Integer> event) {
				if (event.getSelectedItem() == 0) {
					setTitle(ConstantsUtil.MENU_SESSIONS + " Android");
				} else if (event.getSelectedItem() == 1) {
					setTitle(ConstantsUtil.MENU_SESSIONS + " Web");
				} else if (event.getSelectedItem() == 2) {
					setTitle(ConstantsUtil.MENU_SESSIONS + " Cloud & APIs");
				} else if (event.getSelectedItem() == 3) {
					setTitle(ConstantsUtil.MENU_SESSIONS + " CodeLab");
				}

			}
		});

		main.add(carousel);

		this.createCarouselSessionAndroid(carousel);
		this.createCarouselSessionWeb(carousel);
		this.createCarouselSessionCloud(carousel);
		this.createCarouselSessionCodelab(carousel);
		// this.createCarousel(carousel);

	}

	@Override
	public RoundPanel addRoundPanel(String description) {
		RoundPanel roundPanel = new RoundPanel();
		roundPanel.add(this.applyStyleForSlide(new HTML(description)));
		return roundPanel;
	}

	private void createCarouselSessionAndroid( //
			Carousel carousel) {

		FlowPanel panel = this.createCarousel(carousel);

		panel.add(this.createSessionDesc("Sécurité Android",//
				"par Philippe Prados",//
				"Salle Titan",//
				ConstantsUtil.SESSION_ANDROID2,//
				"fr",//
				"101"));

		panel.add(this.createSessionDesc("Présentation de RoboSpice",//
				"par Stéphane Nicolas",//
				"Salle Belem",//
				ConstantsUtil.SESSION_ANDROID3,//
				"fr",//
				"202"));

		panel.add(this
				.createSessionDesc(
						"Android NFC pour Nouvelle Façon de Communiquer avec nos Mobiles ?",//
						"par Guillaume Gerbaud",//
						"Salle Graslin",//
						ConstantsUtil.SESSION_ANDROID4,//
						"fr",//
						"202"));

		panel.add(this.createSessionDesc("Wifi P2P",//
				"par Frédéric Berthéléry",//
				"Salle Graslin",//
				ConstantsUtil.SESSION_ANDROID5,//
				"fr",//
				"202"));

		panel.add(this.createSessionDesc("Android in your TV",//
				"par Olivier Gonthier",//
				"Salle Graslin",//
				ConstantsUtil.SESSION_ANDROID6,//
				"fr",//
				"202"));
	}

	private void createCarouselSessionWeb( //
			Carousel carousel) {

		FlowPanel panel = this.createCarousel(carousel);
		panel.add(this.createSessionDesc("Dart",//
				"par Nicolas François et Guillaume Girou",//
				"Salle Graslin",//
				ConstantsUtil.SESSION_WEB1,//
				"fr",//
				"101"));

		panel.add(this.createSessionDesc("Big Data & HTML5",//
				"par Ido Green",//
				"Salle Graslin (hangout)",//
				ConstantsUtil.SESSION_WEB2,//
				"en",//
				"202"));

		panel.add(this.createSessionDesc("HTML5 et le mode déconnecté",//
				"par Antoine Richard",//
				"Salle Belem",//
				ConstantsUtil.SESSION_WEB3,//
				"fr",//
				"101"));

		panel.add(this.createSessionDesc(
				"Building awesome client-side web apps with AngularJS",//
				"par Vojta Jina",//
				"Salle Titan",//
				ConstantsUtil.SESSION_WEB4,//
				"en",//
				"101"));

		panel.add(this.createSessionDesc(
				"Développer une application Web Offline avec GWT et HTML5 ",//
				"par Sami Jaber",//
				"Salle Titan",//
				ConstantsUtil.SESSION_WEB5,//
				"fr",//
				"202"));
	}

	private void createCarouselSessionCloud( //
			Carousel carousel) {

		FlowPanel panel = this.createCarousel(carousel);
		panel.add(this.createSessionDesc("App Engine et Compute Engine",//
				"par Ludovic Champenois",//
				"Salle Titan",//
				ConstantsUtil.SESSION_CLOUD1,//
				"fr",//
				"202"));
		panel.add(this.createSessionDesc("Google Cloud EndPoints",//
				"par Maxime Gréau",//
				"Salle Belem",//
				ConstantsUtil.SESSION_CLOUD2,//
				"fr",//
				"202"));

		panel.add(this.createSessionDesc("Google Drive SDK",//
				"par Nicolas Garnier",//
				"Salle Belem (hangout)",//
				ConstantsUtil.SESSION_CLOUD4,//
				"fr",//
				"101"));
		panel.add(this.createSessionDesc("Chrome Extensions & OAuth2",//
				"par Thibault Pouget",//
				"Salle Belem",//
				ConstantsUtil.SESSION_CLOUD5,//
				"fr",//
				"101"));
		panel.add(this.createSessionDesc("Trucs et astuces pour le Cloud",//
				"par Didier Girard",//
				"Salle Titan",//
				ConstantsUtil.SESSION_CLOUD6,//
				"fr",//
				"101"));
	}

	private void createCarouselSessionCodelab( //
			Carousel carousel) {
		FlowPanel panel = this.createCarousel(carousel);
		panel.add(this.createSessionDesc("Le président est ...",//
				"par Ludovic Champenois et Martin Görner",//
				"Salle Les Machines",//
				ConstantsUtil.SESSION_CLOUD3,//
				"fr",//
				"101"));

		panel.add(this.createSessionDesc("Android Bootstrap",//
				"par Jean-François Garreau",//
				"Salle Les Machines",//
				ConstantsUtil.SESSION_ANDROID1,//
				"fr",//
				"202"));

	}

	private FlowPanel createCarousel( //
			Carousel carousel) {
		FlowPanel flowPanel3 = new FlowPanel();
		ScrollPanel scrollPanel2 = new ScrollPanel();

		// Agenda de la salle
		scrollPanel2.setWidget(flowPanel3);

		// Add page to carousel
		carousel.add(scrollPanel2);
		return flowPanel3;
	}

	private RoundPanel createSessionDesc(String title, String author,
			String salle, String description, String lang, String type) {
		StringBuilder str = new StringBuilder();
		str.append("").append(type);
		str.append(" (").append(lang).append(")");
		str.append(" <bold>").append(title);
		str.append("</bold><br/><em>").append(author);
		str.append(" : ").append(salle).append("</em>");
		str.append("<br/><small>").append(description).append("</small>");
		return this.addRoundPanel(str.toString());
	}

	/**
	 * Create one slide for carousel page
	 * 
	 * @param textForSlide
	 * @return
	 */
	private HTML createSlide(String textForSlide) {
		HTML html = new HTML(textForSlide);
		return applyStyleForSlide(html);
	}

	/**
	 * Apply style for carousel slide
	 * 
	 * @param slideWithoutStyle
	 * @return
	 */
	private HTML applyStyleForSlide(HTML slideWithoutStyle) {
		slideWithoutStyle.getElement().getStyle().setMarginBottom(30, Unit.PX);
		return slideWithoutStyle;
	}

	@Override
	public Widget asWidget() {
		return main;
	}

	@Override
	public void setTitle(String text) {
		headerPanel.setCenter(text);

	}

	@Override
	public void setBackButtonText(String text) {
		headerBackButton.setText(text);
	}

	@Override
	public HasTapHandlers getBackButton() {
		return headerBackButton;
	}

	@Override
	public boolean isInit() {
		return isInit;
	}

	@Override
	public void setInit(boolean b) {
		isInit = b;
	}

}
