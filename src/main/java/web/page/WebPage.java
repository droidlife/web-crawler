package web.page;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebPage {

	public Anchor getAnchor() {
		return anchor;
	}

	public String getWebPageHash() {
		return webPageHash;
	}

	public int getAnchorParseStatus() {
		return anchorParseStatus;
	}

	public int getEmailParseStatus() {
		return emailParseStatus;
	}

	public Document getDocument() {
		return document;
	}

	private Anchor anchor;
	private String webPageHash;
	private int anchorParseStatus;
	private int emailParseStatus;
	private Document document;

	public WebPage(Anchor anchor) throws Exception {
		super();
		this.anchor = anchor;
		this.webPageHash = Hasher.toSha256(anchor.getAnchorUrl()+CommonBal.getTimeStamp().toString());
		this.anchorParseStatus = 0;
		this.emailParseStatus = 0;
	}

	public void loadDocumentFromWeb() {
		try {
			document = Jsoup.connect(anchor.getAnchorUrl()).get();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
