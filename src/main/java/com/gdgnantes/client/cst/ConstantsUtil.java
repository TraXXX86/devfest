/**
 * 
 */
package com.gdgnantes.client.cst;

/**
 * @author majaouen
 * 
 */
public class ConstantsUtil {

	// ################################################################
	// ############################ HTML constants
	// ################################################################
	public static final String HTML_IMG_LOGO = "<center><img src=\"./devfest/devFestLogo.gif\"/></center>";
	public static final String HTML_IMG_LOGO_WITH_BR = "<center><br><img src=\"./devfest/devFestLogo.gif\"/></center>";

	// ################################################################
	// ############################ Header constants
	// ################################################################
	public static final String HEADER_DEVFEST_2012 = "DevFest 2012";
	public static final String HEADER_ABOUT = "A propos";
	public static final String HEADER_BACK = "Retour";

	// ################################################################
	// ############################ About constants
	// ################################################################
	public static final String ABOUT_BODY = "<br/> <center>Site du DevFest Nantes 2012</center> <br/><a target='_blank' href='http://devfest.gdgnantes.com'>http://devfest.gdgnantes.com</a><br/><br/><center>Site du GDG Nantes</center><br/><a target='_blank' href='http://www.gdgnantes.com/'>http://www.gdgnantes.com/</a><br/><br/>";

	// ################################################################
	// ############################ Menu constants
	// ################################################################
	public static final String MENU_CALENDAR = "Agenda";
	public static final String MENU_SESSIONS = "Sessions";
	public static final String MENU_SPEAKERS = "Speakers";
	public static final String MENU_PARTNERS = "Partenaires";
	public static final String MENU_FAQ = "FAQ";

	// ################################################################
	// ############################ Calendar constants
	// ################################################################
	public static final String CALENDAR_SALLE = "Salle : ";
	public static final String CALENDAR_SALLE_1 = "Android";
	public static final String CALENDAR_SALLE_2 = "Web";
	public static final String CALENDAR_SALLE_3 = "Cloud & APIs";
	public static final String CALENDAR_SALLE_4 = "CodeLab";

	public static final String CALENDAR_HUIT_A_NEUF = "08h30 - 09h00";
	public static final String CALENDAR_NEUF_A_DIX = "09h00 - 10h00";
	public static final String CALENDAR_DIX_A_ONZE = "10h10 - 11h10";
	public static final String CALENDAR_ONZE_A_DOUZE = "11h20 - 12h20";
	public static final String CALENDAR_DOUZE_A_TREIZE = "12h30 - 13h30";
	public static final String CALENDAR_TREIZE_A_QUATORZE = "13h30 - 14h30";
	public static final String CALENDAR_QUATORZE_A_QUINZE = "14h40 - 15h40";
	public static final String CALENDAR_QUINZE_A_SEIZE = "15h40 - 16h00";
	public static final String CALENDAR_SEIZE_A_DIX_SEPT = "16h00 - 17h00";
	public static final String CALENDAR_DIX_SEPT_A_DIX_HUIT = "17h10 - 18h00";

	public static final String CALENDAR_SALLE_X_ACTIVITY_1 = "Ouverture des portes et accueil des participants Café / Croissants";
	public static final String CALENDAR_SALLE_X_ACTIVITY_2 = "Key-note, présentation des conférences, codelab de la journée, des sponsors... ";
	public static final String CALENDAR_SALLE_X_ACTIVITY_3 = "Repas du midi offert sur place";
	public static final String CALENDAR_SALLE_X_ACTIVITY_4 = "Pause";
	public static final String CALENDAR_SALLE_X_ACTIVITY_5 = "Pitch Sessions /  Démos / Discussions libres";

	public static final String CALENDAR_SALLE_1_ACTIVITY_1 = "Sécurité Android";
	public static final String CALENDAR_SALLE_1_ACTIVITY_2 = "Android & NFC";
	public static final String CALENDAR_SALLE_1_ACTIVITY_3 = "Google TV";
	public static final String CALENDAR_SALLE_1_ACTIVITY_4 = "TBD";
	public static final String CALENDAR_SALLE_1_ACTIVITY_5 = "Présentation de RoboSpice";

	public static final String CALENDAR_SALLE_2_ACTIVITY_1 = "Big Data & HTML5";
	public static final String CALENDAR_SALLE_2_ACTIVITY_2 = "GWT Offline & HTML5";
	public static final String CALENDAR_SALLE_2_ACTIVITY_3 = "Angular JS";
	public static final String CALENDAR_SALLE_2_ACTIVITY_4 = "HTML5 Offline";
	public static final String CALENDAR_SALLE_2_ACTIVITY_5 = "Dart";

	public static final String CALENDAR_SALLE_3_ACTIVITY_1 = "Google Cloud EndPoints";
	public static final String CALENDAR_SALLE_3_ACTIVITY_2 = "Chrome Extensions & OAuth2";
	public static final String CALENDAR_SALLE_3_ACTIVITY_3 = "Drive SDK";
	public static final String CALENDAR_SALLE_3_ACTIVITY_4 = "AppEngine";
	public static final String CALENDAR_SALLE_3_ACTIVITY_5 = "TBD";

	public static final String CALENDAR_SALLE_4_ACTIVITY_1 = "Le président est ... (Atelier AppEngine)";
	public static final String CALENDAR_SALLE_4_ACTIVITY_2 = "Android BootStrap";
	public static final String CALENDAR_SALLE_4_ACTIVITY_3 = "Présentation BeMyApp";

	// ################################################################
	// ############################ Speakers constants
	// ################################################################

	public static final String SPEAKER_1 = "<div style=\"display:inline;float:left;margin:5px 10px 0px 0px\"><a href=\"";
	// Add here GGPLUS
	public static final String SPEAKER_2 = "\" imageanchor=\"1\" target=\"_blank\"><img alt=\"";
	// Add here SpeakerName
	public static final String SPEAKER_3 = "\" border=\"0\" height=\"75\"  width=\"75\" src=\"";
	// Add here SpeakerImg
	public static final String SPEAKER_4 = "\" /></a></div><a href=\"";
	// Add here GGPLUS
	public static final String SPEAKER_5 = "\" target=\"_blank\"><b>";
	// Add here SpeakerName
	public static final String SPEAKER_6 = "</b></a>";
	// Add here SpeakerDescription
	public static final String SPEAKER_7 = "<br /></div><div>";

	public static final String SPEAKER_NGR_NAME = "Nicolas Garnier";
	public static final String SPEAKER_NGR_GGPLUS = "https://plus.google.com/108635752367054807758";
	public static final String SPEAKER_NGR_IMG = "http://devfest.gdgnantes.com/_/rsrc/1348310811524/speakers/nicolasgarnier2.png";
	public static final String SPEAKER_NGR_DESCRIPTION = " est \"Developper Advocate\" chez Google. " //
			+ "<div>Il est diplômé de l'INSA de Rennes en 2005, a travaillé pour Airbus et le CNES entre 2005 et 2008.Il a rejoint Google en 2008.<br />" //
			+ "Il travaille sur Google Apps, Google Calendar, Google Contacts et OAuth2.<br />";

	public static final String SPEAKER_PPS_NAME = "Philippe Prados";
	public static final String SPEAKER_PPS_GGPLUS = "https://plus.google.com/u/0/113096673936414639590/about";
	public static final String SPEAKER_PPS_IMG = "https://lh4.googleusercontent.com/-04gkwn5TwTA/AAAAAAAAAAI/AAAAAAAAAB8/EKO6S9cErJE/s250-c-k/photo.jpg";
	public static final String SPEAKER_PPS_DESCRIPTION = " est Architecte Smart Mobility et est auteur de plusieurs livres sur C et Java,  de nombreux articles (plus de 120) dont 50% du <a href=\"http://diamond.izibookstore.com/produit?internal_reference=lmhs61\">dernier Hors Série de GNU Linux Mag</a> dédié à Android. Il s’est basé sur les articles de ce dernier numéro pour nous présenter le « Développement sécurisé Android ».</div><div><br />";

}
