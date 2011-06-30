package com.podprogramming.jobs.werecruit.services;

import java.util.ArrayList;
import java.util.List;

import com.podprogramming.jobs.werecruit.model.Jug;

public class JugService {

	public List<Jug> getJugs() {
		// It would be better to call a REST service to load JUG's list ;-)

		List<Jug> jugs = new ArrayList<Jug>();

		jugs.add(new Jug(
				"Nantes JUG",
				"http://a0.twimg.com/profile_images/474291096/img_1217255298194_bigger.jpg",
				"http://www.nantesjug.org/", "47.223765", "-1.554565"));
		jugs.add(new Jug(
				"Paris JUG",
				"http://a1.twimg.com/profile_images/1122140158/Juggy_version06_logo_bigger.png",
				"http://www.parisjug.org/", "48.860875", "2.352448"));
		jugs.add(new Jug(
				"Poitou-Charentes JUG",
				"http://a2.twimg.com/profile_images/690531273/poitoucharentesjug201201_bigger.png",
				"http://www.poitoucharentesjug.org/", "46.326542", "-0.464344"));
		jugs.add(new Jug(
				"Lorraine JUG",
				"http://a0.twimg.com/profile_images/1119206300/DoL__LorraineJUG__Parleys_bigger.png",
				"http://lorrainejug.blogspot.com", "48.69334", "6.184359"));
		jugs.add(new Jug(
				"Tours JUG",
				"http://a3.twimg.com/profile_images/360372101/toursJuggyh150_normal.gif",
				"http://www.toursjug.org", "47.397071", "0.686131"));
		jugs.add(new Jug(
				"Bordeaux JUG",
				"http://www.devoxx.com/download/attachments/2458018/bordeaux_jug.gif",
				"http://www.bordeauxjug.org", "44.840412", "-0.578499"));
		jugs.add(new Jug(
				"Breizh JUG",
				"http://sites.google.com/site/nantesjug/_/rsrc/1222155316479/config/app/images/breizh-jug.png",
				"http://www.breizhjug.org", "48.116142", "-1.675758"));
		jugs.add(new Jug(
				"Lyon JUG",
				"http://a0.twimg.com/profile_images/190162694/logoLyonJUGSmall_bigger.jpg",
				"http://www.lyonjug.org/", "45.766924", "4.835701"));
		jugs.add(new Jug(
				"Normandy JUG",
				"http://a3.twimg.com/profile_images/95094747/logo-juggy2_bigger.png",
				"http://www.normandyjug.org/", "49.445919", "1.100178"));
		jugs.add(new Jug(
				"Ch'ti JUG",
				"http://a0.twimg.com/profile_images/201843712/chtijug_carr__bigger.jpg",
				"http://chtijug.org", "50.6303", "3.057632"));
		jugs.add(new Jug(
				"Toulouse JUG",
				"http://a0.twimg.com/profile_images/1160156143/logo_bigger.gif",
				"http://www.jugtoulouse.org", "43.606996", "1.444359"));
		jugs.add(new Jug(
				"Mars JUG",
				"http://a0.twimg.com/profile_images/437771565/Picture_1_bigger.png",
				"http://www.marsjug.org", "43.298198", "5.370255"));
		jugs.add(new Jug(
				"Alpes JUG",
				"http://blog.aheritier.net/wp-content/uploads/2010/03/LogoAlpesJuggy.png",
				"http://www.alpesjug.fr/", "45.56791", "5.918369"));
		jugs.add(new Jug(
				"Elsass JUG",
				"http://t3.gstatic.com/images?q=tbn:ANd9GcQN-5Z2uARfsJ6FGBMJjBxg2KYdI78BgS6YYyZa5u-XDrITm29pSw",
				"http://www.elsassjug.org", "48.585465", "7.748795"));
		jugs.add(new Jug(
				"Riviera JUG",
				"http://a3.twimg.com/profile_images/1259624274/rivierajug-logo-2-square-twitter_bigger.png",
				"http://www.rivierajug.org", "43.699403", "7.265739"));
		jugs.add(new Jug("Montpellier JUG",
				"http://www.jug-montpellier.org/public/images/logo.png",
				"http://www.jug-montpellier.org/", "43.611844", "3.876457"));
		jugs.add(new Jug(
				"Duchess France",
				"http://a2.twimg.com/profile_images/64888970/javaduchess3_bigger.png",
				"http://jduchess.org/duchess-france/", "48.860875", "2.352448"));

		return jugs;
	}

}
