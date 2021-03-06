/**
 * 
 */
package com.gdgnantes.client.views;

import java.util.List;

import com.gdgnantes.client.activities.home.Topic;
import com.gdgnantes.client.cst.img.ImgBundle;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.dom.client.event.tap.HasTapHandlers;
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
public class MenuListViewGwtImpl implements MenuListView {

	private LayoutPanel main;
	private HeaderButton forwardButton;
	private HeaderPanel headerPanel;
	private CellListWithHeader<Topic> cellList;

	public MenuListViewGwtImpl() {
		main = new LayoutPanel();

		headerPanel = new HeaderPanel();

		forwardButton = new HeaderButton();
		forwardButton.setForwardButton(true);
		// if (MGWT.getOsDetection().isPhone()) {
		headerPanel.setRightWidget(forwardButton);
		// }
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

		// Create Main Panel
		LayoutPanel mainScrollPanel = new LayoutPanel();
		mainScrollPanel.addStyleName("center");

		FlowPanel flowLayout = new FlowPanel();
		Image imgdev = new Image(ImgBundle.INSTANCE.devfest());
		imgdev.addStyleName("devfestimage");
		flowLayout.add(imgdev);
		flowLayout.add(cellList);

		// Create and add Menu scroll panel
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setWidget(flowLayout);
		scrollPanel.setScrollingEnabledX(false);
		mainScrollPanel.add(scrollPanel);

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
	public void setRightButtonText(String text) {
		forwardButton.setText(text);
	}

	@Override
	public HasTapHandlers getAboutButton() {
		return forwardButton;
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

}
