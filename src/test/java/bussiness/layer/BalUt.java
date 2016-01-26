package bussiness.layer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import web.page.Anchor;
import web.page.Domain;
import web.page.WebPage;

public class BalUt {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void WebPageLoadFromWeb() {

		try {
			Domain domain = new Domain("http://www.jsoup.org/");
			assertTrue("get domain hash" , domain.getDomainHash().length()==64);
			Anchor anchor = new Anchor(domain, "http://www.jsoup.org/");
			assertTrue("get Anchor hash" , anchor.getAnchorHash().length()==64);
			WebPage webPage = new WebPage(anchor);
			webPage.loadDocumentFromWeb();
			//assertTrue(" web page document error ", webPage.getDocument() != null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
