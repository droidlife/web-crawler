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
			doc = Jsoup.connect("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose").timeout(10 * 1000).get();
			for (Element table : doc.select("table[class=dataTable]")) {
			     for (Element row : table.select("tr:gt(2)")) {
			        Elements tds = row.select("td:not([rowspan])");
			        System.out.println(tds.get(0).text() + "->" + tds.get(1).text()+tds.get(2).text()+" "+ tds.get(3).text());
			     }
			}
				//System.out.println(newsHeadlines.toString());
				 //System.out.println(element.text());
				
				//Pattern pattern = Pattern.compile("User Ratings: ([0-9,]+)");
				//Matcher matcher = pattern.matcher(element.text());
				//if(matcher.matches()) {
				//    String userRating = matcher.group(1); // "313,393"
				//}
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
