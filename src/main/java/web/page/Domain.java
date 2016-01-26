package web.page;

import java.sql.Timestamp;

public class Domain {

	private String domainHash;
	private String domainUrl;
	private boolean enabled;
	private Timestamp modified;
	private Timestamp created;

	public Domain(String domainHash, String domainUrl, boolean enabled, Timestamp modified, Timestamp created) {
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
		this.enabled = enabled;
		this.modified = modified;
		this.created = created;
	}

	public Domain(String domainHash, String domainUrl) {
		super();
		this.domainHash = domainHash;
		this.domainUrl = domainUrl;
	}
	
	public Domain(String domainUrl) throws Exception {
		super();
		this.domainHash = Hasher.toSha256(domainUrl);
		this.domainUrl = domainUrl;
		this.enabled = true;
		this.created = CommonBal.getTimeStamp();
		this.modified = CommonBal.getTimeStamp();
	}

	public String getDomainHash() {
		return domainHash;
	}

	public String getDomainUrl() {
		return domainUrl;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public Timestamp getModified() {
		return modified;
	}

	public Timestamp getCreated() {
		return created;
	}
}
