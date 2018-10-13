package businessFeature;

import businessObject.Message;
import dao.MessageDaoImpl;

public class MessageFeature {
	public static Message readMessage(String messageName) {
		return MessageDaoImpl.getMessage(messageName);
	}

	public static void createOrUpdateMessage(Message message) {
		MessageDaoImpl.setMessage(message);
	}
}
