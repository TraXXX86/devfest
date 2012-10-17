/**
 * 
 */
package com.gdgnantes.client.views;

import java.util.List;

import com.gdgnantes.client.activities.home.Topic;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.BasicCell;
import com.googlecode.mgwt.ui.client.widget.celllist.CellListWithHeader;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

/**
 * @author majaouen
 * 
 */
public class TemplateViewGwtImpl implements TemplateView {

	private LayoutPanel main;
	private HeaderPanel headerPanel;
	private CellListWithHeader<Topic> cellList;
	private HeaderButton headerBackButton;

	public TemplateViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		headerBackButton = new HeaderButton();
		headerBackButton.setBackButton(true);
		headerPanel.setLeftWidget(headerBackButton);
		headerBackButton.setVisible(!MGWT.getOsDetection().isAndroid());

		main.add(headerPanel);

		cellList = new CellListWithHeader<Topic>(new BasicCell<Topic>() {

			@Override
			public String getDisplayString(Topic model) {
				return model.getName();
			}

			@Override
			public boolean canBeSelected(Topic model) {
				return true;
			}
		});

		cellList.getCellList().setRound(true);

		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setWidget(cellList);
		scrollPanel.setScrollingEnabledX(false);
		main.add(scrollPanel);

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
	public HasCellSelectedHandler getCellSelectedHandler() {
		return cellList.getCellList();
	}

	@Override
	public void setTopics(List<Topic> createTopicsList) {
		cellList.getCellList().render(createTopicsList);

	}

	@Override
	public HasText getFirstHeader() {
		return cellList.getHeader();
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
