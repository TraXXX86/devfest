/**
 * 
 */
package com.gdgnantes.client.views;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.RoundPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;

/**
 * @author majaouen
 * 
 */
public class SpeakersViewGwtImpl implements SpeakersView {

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private HeaderButton headerBackButton;
	private LayoutPanel mainForScrollPanel;
	private boolean isInit = false;

	public SpeakersViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		headerBackButton = new HeaderButton();
		headerBackButton.setBackButton(true);
		headerPanel.setLeftWidget(headerBackButton);
		headerBackButton.setVisible(!MGWT.getOsDetection().isAndroid());

		main.add(headerPanel);

		mainForScrollPanel = new LayoutPanel();

		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setWidget(mainForScrollPanel);
		scrollPanel.setScrollingEnabledX(false);
		main.add(scrollPanel);

	}

	@Override
	public void addSpeakerDescription(String description) {
		RoundPanel speakerPanel = new RoundPanel();
		speakerPanel.add(new HTML(description));
		mainForScrollPanel.add(speakerPanel);
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
