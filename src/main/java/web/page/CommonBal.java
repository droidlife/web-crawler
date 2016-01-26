package web.page;

import java.sql.Timestamp;

public class CommonBal {

	public static Timestamp getTimeStamp(){
		java.util.Date date = new java.util.Date();
		return new Timestamp(date.getTime());
	}
}
