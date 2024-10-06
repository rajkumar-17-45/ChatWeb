package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

	  private String content;
	  
	  private String sender;
	  
	  private MessageType type;
	  
	  private String timeStamp;

	
	public ChatMessage(String content, String sender, MessageType type, String timeStamp) {
		super();
		this.content = content;
		this.sender = sender;
		this.type = type;
		this.timeStamp = timeStamp;
	}

	
	public ChatMessage() {
		super();
	}


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
	

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	 private ChatMessage(Builder builder) {
	        this.type = builder.type;
	        this.sender = builder.sender;
	        this.content = builder.content;
	    }

	    public static Builder builder() {
	        return new Builder();
	    }

	    public static class Builder {
	        private MessageType type;
	        private String sender;
	        private String content;

	        public Builder type(MessageType type) {
	            this.type = type;
	            return this;
	        }

	        public Builder sender(String sender) {
	            this.sender = sender;
	            return this;
	        }

	        public Builder content(String content) {
	            this.content = content;
	            return this;
	        }

	        public ChatMessage build() {
	            return new ChatMessage(this);
	        }
	    }

	@Override
	public String toString() {
		return "ChatMessage [content=" + content + ", sender=" + sender + ", type=" + type + ", timeStamp=" + timeStamp
				+ "]";
	}

	
	  
}
