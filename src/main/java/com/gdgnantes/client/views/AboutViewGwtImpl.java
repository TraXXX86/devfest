/**
 * 
 */
package com.gdgnantes.client.views;

import com.gdgnantes.client.cst.ConstantsUtil;
import com.gdgnantes.client.cst.img.ImgBundle;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.RoundPanel;

/**
 * @author majaouen
 * 
 */
public class AboutViewGwtImpl implements AboutView {

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private HeaderButton headerBackButton;

	public AboutViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		headerBackButton = new HeaderButton();
		headerBackButton.setBackButton(true);
		headerPanel.setLeftWidget(headerBackButton);
		headerBackButton.setVisible(!MGWT.getOsDetection().isAndroid());

		main.add(headerPanel);

		// Create Main Panel
		LayoutPanel mainScrollPanel = new LayoutPanel();

		Image imgdev = new Image(ImgBundle.INSTANCE.devfest());
		imgdev.addStyleName("devfestimage");
		mainScrollPanel.addStyleName("center");
		// mainScrollPanel.add(imgdev);

		RoundPanel round = new RoundPanel();

		mainScrollPanel.add(round);

		round.add(imgdev);
		round.add(new HTML(ConstantsUtil.ABOUT_BODY));

		main.add(mainScrollPanel);

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

}
