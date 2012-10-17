/**
 * 
 */
package com.gdgnantes.client.views;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.HasSelectionHandlers;
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
public class CalendarViewGwtImpl implements CalendarView {

	private static String SALLE_1 = "Android";
	private static String SALLE_2 = "Web";
	private static String SALLE_3 = "Cloud & APIs";
	private static String SALLE_4 = "CodeLab";

	private static String HUIT_A_NEUF = "08h30 - 09h00";
	private static String NEUF_A_DIX = "09h00 - 10h00";
	private static String DIX_A_ONZE = "10h10 - 11h10";
	private static String ONZE_A_DOUZE = "11h20 - 12h20";
	private static String DOUZE_A_TREIZE = "12h30 - 13h30";
	private static String TREIZE_A_QUATORZE = "13h30 - 14h30";
	private static String QUATORZE_A_QUINZE = "14h40 - 15h40";
	private static String QUINZE_A_SEIZE = "15h40 - 16h00";
	private static String SEIZE_A_DIX_SEPT = "16h00 - 17h00";
	private static String DIX_SEPT_A_DIX_HUIT = "17h10 - 18h00";

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private HeaderButton headerBackButton;
	private Carousel carousel;

	public CalendarViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		headerBackButton = new HeaderButton();
		headerBackButton.setBackButton(true);
		headerPanel.setLeftWidget(headerBackButton);
		headerBackButton.setVisible(!MGWT.getOsDetection().isAndroid());

		main.add(headerPanel);

		carousel = new Carousel();

		main.add(carousel);

		createCarouselSalle1(carousel);
		createCarouselSalle2(carousel);
		createCarouselSalle3(carousel);
		createCarouselSalle4(carousel);

	}

	private void createCarouselSalle1(Carousel carousel) {
		createCarouselSalle(carousel,//
				SALLE_1,//
				"Ouverture des portes et accueil des participants Café / Croissants",//
				"Key-note, présentation des conférences, codelab de la journée, des sponsors... ",//
				"Sécurité Android",//
				"Android & NFC",//
				"Repas du midi offert sur place ",//
				"Google TV",//
				"TBD",//
				"Pause",//
				"Présentation de RoboSpice",//
				"Pitch Sessions /  Démos / Discussions libres");
	}

	private void createCarouselSalle2(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				SALLE_2,//
				"Ouverture des portes et accueil des participants Café / Croissants",//
				"Key-note, présentation des conférences, codelab de la journée, des sponsors... ",//
				"Big Data & HTML5",//
				"GWT Offline & HTML5",//
				"Repas du midi offert sur place ",//
				"Angular JS",//
				"HTML5 Offline",//
				"Pause",//
				"Dart",//
				"Pitch Sessions /  Démos / Discussions libres");
	}

	private void createCarouselSalle3(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				SALLE_3,//
				"Ouverture des portes et accueil des participants Café / Croissants",//
				"Key-note, présentation des conférences, codelab de la journée, des sponsors... ",//
				"Google Cloud EndPoints",//
				"Chrome Extensions & OAuth2",//
				"Repas du midi offert sur place ",//
				"Drive SDK",//
				"AppEngine",//
				"Pause",//
				"TBD",//
				"Pitch Sessions /  Démos / Discussions libres");
	}

	private void createCarouselSalle4(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				SALLE_4,//
				"Ouverture des portes et accueil des participants Café / Croissants",//
				"Key-note, présentation des conférences, codelab de la journée, des sponsors... ",//
				"Le président est ... (Atelier AppEngine)",//
				"Le président est ... (Atelier AppEngine)",//
				"Repas du midi offert sur place ",//
				"Android BootStrap",//
				"Android BootStrap",//
				"Pause",//
				"Présentation BeMyApp",//
				"Présentation BeMyApp");
	}

	private void createCarouselSalle(Carousel carousel, //
			String roomName, //
			String huit, //
			String neuf, //
			String dix, //
			String onze, //
			String douze, //
			String treize, //
			String quatorze, //
			String quinze, //
			String seize, //
			String dixsept) {
		ScrollPanel scrollPanel2 = new ScrollPanel();
		scrollPanel2.setScrollingEnabledX(false);
		// scrollPanel2.setWidth("100%");

		RoundPanel flowPanel3 = new RoundPanel();

		// Titre de la page du carousel
		flowPanel3.add(createSlide(roomName));

		// Agenda de la salle
		flowPanel3.add(createSlide(HUIT_A_NEUF, huit));
		flowPanel3.add(createSlide(NEUF_A_DIX, neuf));
		flowPanel3.add(createSlide(DIX_A_ONZE, dix));
		flowPanel3.add(createSlide(ONZE_A_DOUZE, onze));
		flowPanel3.add(createSlide(DOUZE_A_TREIZE, douze));
		flowPanel3.add(createSlide(TREIZE_A_QUATORZE, treize));
		flowPanel3.add(createSlide(QUATORZE_A_QUINZE, quatorze));
		flowPanel3.add(createSlide(QUINZE_A_SEIZE, quinze));
		flowPanel3.add(createSlide(SEIZE_A_DIX_SEPT, seize));
		flowPanel3.add(createSlide(DIX_SEPT_A_DIX_HUIT, dixsept));

		scrollPanel2.setWidget(flowPanel3);

		carousel.add(scrollPanel2);
	}

	private HTML createSlide(String dateHour, String textForSlide) {
		HTML html = new HTML(dateHour + " : " + textForSlide);
		return applyStyleForSlide(html);
	}

	private HTML createSlide(String textForSlide) {
		HTML html = new HTML(textForSlide);
		return applyStyleForSlide(html);
	}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.gdgnantes.client.views.CalendarView#getSwipePanel()
	 */
	@Override
	public HasSelectionHandlers<Integer> getSwipePanel() {
		return carousel;
	}

}
