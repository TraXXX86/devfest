package com.gdgnantes.client.cst.img;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public interface ImgBundle extends ClientBundle {

	public static final ImgBundle INSTANCE = GWT.create(ImgBundle.class);

	@Source("resources/ngr.png")
	@ImageOptions(height = 75, width = 75)
	ImageResource ngr();

	@Source("resources/pps.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource pps();

	@Source("resources/jfg.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource jfg();

	@Source("resources/lcs.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource lcs();

	@Source("resources/sns.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource sns();

	@Source("resources/ggd.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource ggd();

	@Source("resources/ign.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource ign();

	@Source("resources/mgr.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource mgr();

	@Source("resources/vja.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource vja();

	@Source("resources/nfs.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource nfs();

	@Source("resources/ggu.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource ggu();

	@Source("resources/tpt.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource tpt();

	@Source("resources/mgu.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource mgu();

	@Source("resources/ard.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource ard();

	@Source("resources/ogr.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource ogr();

	@Source("resources/sjr.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource sjr();

	@Source("resources/fby.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource fby();

	@Source("resources/dgd.jpg")
	@ImageOptions(height = 75, width = 75)
	ImageResource dgd();

}
