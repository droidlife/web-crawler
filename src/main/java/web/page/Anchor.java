package web.page;

import java.sql.Timestamp;

public class Anchor {

	private Domain domain;
	private String anchorHash;
	private String anchorUrl;
	private int scanStatus;
	private boolean activated;
	private Timestamp modified;
	private Timestamp created;

	public Anchor(Domain domain, String anchorHash, String anchorUrl, int scanStatus, boolean activated,
			Timestamp modified, Timestamp created) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
		this.scanStatus = scanStatus;
		this.activated = activated;
		this.modified = modified;
		this.created = created;
	}

	public Anchor(Domain domain, String anchorHash, String anchorUrl) {
		super();
		this.domain = domain;
		this.anchorHash = anchorHash;
		this.anchorUrl = anchorUrl;
	}

	public Domain getDomain() {
		return domain;
	}

	public String getAnchorHash() {
		return anchorHash;
	}

	public String getAnchorUrl() {
		return anchorUrl;
	}

	public int getScanStatus() {
		return scanStatus;
	}

	public boolean isActivated() {
		return activated;
	}

	public Timestamp getModified() {
		return modified;
	}

	public Timestamp getCreated() {
		return created;
	}

}
