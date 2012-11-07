/**
 * 
 */
package com.gdgnantes.client.views;

import com.gdgnantes.client.cst.ConstantsUtil;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
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
public class CalendarByRoomViewGwtImpl implements CalendarByRoomView {

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private HeaderButton headerBackButton;
	private Carousel carousel;

	public CalendarByRoomViewGwtImpl() {
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
					setTitle(ConstantsUtil.CALENDAR_ROOM + " "
							+ ConstantsUtil.CALENDAR_ROOM_1);
				} else if (event.getSelectedItem() == 1) {
					setTitle(ConstantsUtil.CALENDAR_ROOM + " "
							+ ConstantsUtil.CALENDAR_ROOM_2);
				} else if (event.getSelectedItem() == 2) {
					setTitle(ConstantsUtil.CALENDAR_ROOM + " "
							+ ConstantsUtil.CALENDAR_ROOM_3);
				} else if (event.getSelectedItem() == 3) {
					setTitle(ConstantsUtil.CALENDAR_ROOM + " "
							+ ConstantsUtil.CALENDAR_ROOM_4);
				}

			}
		});

		main.add(carousel);

		createCarouselSalle1(carousel);
		createCarouselSalle2(carousel);
		createCarouselSalle3(carousel);
		createCarouselSalle4(carousel);

	}

	/**
	 * Create carousel page for room 1 (Android)
	 * 
	 * @param carousel
	 */
	private void createCarouselSalle1(Carousel carousel) {
		createCarouselSalle(carousel,//
				ConstantsUtil.CALENDAR_ROOM_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_1_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_2_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_2_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_3_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_3_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_6);
	}

	/**
	 * Create carousel page for room 2 (Web)
	 * 
	 * @param carousel
	 */
	private void createCarouselSalle2(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				ConstantsUtil.CALENDAR_ROOM_2,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_2_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_1_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_1_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_1_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_2_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_6);
	}

	/**
	 * Create carousel page for room 3 (Cloud & APIs)
	 * 
	 * @param carousel
	 */
	private void createCarouselSalle3(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				ConstantsUtil.CALENDAR_ROOM_3,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_3_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_3_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_3_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_2_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_1_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_5,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_6);
	}

	/**
	 * Create carousel page for room 4 (CodeLab )
	 * 
	 * @param carousel
	 */
	private void createCarouselSalle4(Carousel carousel2) {
		createCarouselSalle(carousel2,//
				ConstantsUtil.CALENDAR_ROOM_4,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_1,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_2,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_4,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_4_ACTIVITY_3,//
				ConstantsUtil.CALENDAR_SALLE_X_ACTIVITY_6);
	}

	/**
	 * Create one page for carousel (for a room)
	 * 
	 * @param carousel
	 *            : Carousel to complete with this new page
	 * @param roomName
	 *            : Room name
	 * @param huit
	 *            : 8-9h activity
	 * @param neuf
	 *            : 9-10h activity
	 * @param dix
	 *            : 10-11h activity
	 * @param onze
	 *            : 11-12h activity
	 * @param douze
	 *            : 12-13h activity
	 * @param treize
	 *            : 13-14h activity
	 * @param quatorze
	 *            : 14-15h activity
	 * @param quinze
	 *            : 15-16h activity
	 * @param seize
	 *            : 16-17h activity
	 * @param dixsept
	 *            : 17-18h activity
	 */
	private void createCarouselSalle( //
			Carousel carousel, //
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
			String dixsept, //
			String afterparty) {

		// New page for carousel
		ScrollPanel scrollPanel2 = new ScrollPanel();
		scrollPanel2.setScrollingEnabledX(false);
		// scrollPanel2.setWidth("100%");
		RoundPanel flowPanel3 = new RoundPanel();

		// Titre de la page du carousel

		// Agenda de la salle
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_HUIT_A_NEUF, huit));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_NEUF_A_DIX, neuf));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_DIX_A_ONZE, dix));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_ONZE_A_DOUZE, onze));
		flowPanel3
				.add(createSlide(ConstantsUtil.CALENDAR_DOUZE_A_TREIZE, douze));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_TREIZE_A_QUATORZE,
				treize));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_QUATORZE_A_QUINZE,
				quatorze));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_QUINZE_A_SEIZE,
				quinze));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_SEIZE_A_DIX_SEPT,
				seize));
		flowPanel3.add(createSlide(ConstantsUtil.CALENDAR_DIX_SEPT_A_DIX_HUIT,
				dixsept));
		flowPanel3
				.add(createSlide(ConstantsUtil.CALENDAR_DIX_NEUF, afterparty));

		scrollPanel2.setWidget(flowPanel3);

		// Add page to carousel
		carousel.add(scrollPanel2);
	}

	/**
	 * Create one slide for carousel page
	 * 
	 * @param dateHour
	 * @param textForSlide
	 * @return
	 */
	private HTML createSlide(String dateHour, String textForSlide) {
		HTML html = new HTML(dateHour + " : " + textForSlide);
		return applyStyleForSlide(html);
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
	public HasSelectionHandlers<Integer> getSwipePanel() {
		return carousel;
	}

}
