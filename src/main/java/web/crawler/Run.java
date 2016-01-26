package web.crawler;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Run {

	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.imdb.com/chart/top").timeout(10 * 1000).get();
			Elements newsHeadlines = doc.select("a");
			String str = "The godfather";
			for (Element element : newsHeadlines) {
				//System.out.println(element.attr("abs:href"));
				// System.out.println(element.text());
				
				if (element.text().toLowerCase().equals(str.toLowerCase()))
				    System.out.println(element.text());
				
				//Pattern pattern = Pattern.compile("User Ratings: ([0-9,]+)");
				//Matcher matcher = pattern.matcher(element.text());
				//if(matcher.matches()) {
				//    String userRating = matcher.group(1); // "313,393"
				//}
			}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
