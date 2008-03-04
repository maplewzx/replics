package replics.net.test;

import replics.impl.services.DefaultServiceManager;
import replics.net.messages.IMessage;
import replics.net.messages.ITextMessage;
import replics.net.messages.MessageType;
import replics.net.protocol.IMessageListener;
import replics.services.IServiceManager;

public class MailerTest implements IMessageListener {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailerTest tester = new MailerTest();
		IServiceManager sm = new DefaultServiceManager();
		sm.getPeerGroupManager().setGlobalContext("Replics");
		sm.getPeerGroupManager().setLocalPeerID("123");
		sm.getPeerGroupManager().setLocalPeerName("JIBIX");
		sm.getMessageMailer().register(tester, MessageType.TEXT_MESSAGE);
		ITextMessage message;
		int i=0;
		while(true)
		{
			i++;
			message = sm.getMessageFactory().newTextMessage();
			message.setContent(sm.getPeerGroupManager().getLocalPeerName() + " > Message " + i);
			sm.getMessageMailer().send(message);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void handleMessage(IMessage message) {
		if (!(message instanceof ITextMessage))
		{
			System.out.println("Wrong message type");
			return;
		}
		else
		{
			ITextMessage textmsg = (ITextMessage) message;
			System.out.println(textmsg.getSourcePeerName() + ": " + textmsg.getContent());
		}
	}

}