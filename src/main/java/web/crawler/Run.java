package web.crawler;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Run {

	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.jsoup.org/").get();
			Elements newsHeadlines = doc.select("a");
			for (Element element : newsHeadlines) {
				System.out.println(element.attr("abs:href"));
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
