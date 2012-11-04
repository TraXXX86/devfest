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
	private LayoutPanel mainForScrollPanel1;
	private LayoutPanel mainForScrollPanel2;
	private LayoutPanel mainForScrollPanel3;
	private LayoutPanel mainForScrollPanel4;
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
		this.createCarousel(carousel);
		this.createCarousel(carousel);
		this.createCarousel(carousel);

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
		panel.add(this.createSessionDesc("Android Bootstrap",//
				"par Jean-François Garreau",//
				"Salle Les Machines",//
				ConstantsUtil.SESSION_ANDROID1,//
				"fr",//
				"202"));

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
		flowPanel3.add(addRoundPanel("TOTOTOTOTOTOTOTOOTOTO"));
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
		str.append(" <bold>").append(title).append("</bold> ").append(author);
		str.append(" : <em>").append(salle).append("</em>");
		str.append("<br/>").append(description);
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
