package dao;

import java.util.concurrent.ConcurrentHashMap;

import businessObject.Message;

public class MessageDaoImpl {
	private static ConcurrentHashMap<String, Message> messages;//just emulating a database
	static
    {
		messages = new ConcurrentHashMap<String, Message>();
		messages.put("msg1", new Message("msg1", "myFirstMessage"));
		messages.put("msg2", new Message("msg2", "mySecondMessage"));
    }
	
	public static Message getMessage(String messageName) {
		return messages.get(messageName);
	}
	
	public static void setMessage(Message message) {
		messages.put(message.getName(), message);
	}
}
