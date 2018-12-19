package exception;

import java.util.Date;

public class ExceptionResponse {
	
	private Date timestamp ;
	private String details ;
	private String messages;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getMessages() {
		return messages;
	}
	public void setMessages(String messages) {
		this.messages = messages;
	}
	//time stamp
	public ExceptionResponse(Date timestamp, String details, String messages) {
		super();
		this.timestamp = timestamp;
		this.details = details;
		this.messages = messages;
	}
	
	//message
	//details 

}
