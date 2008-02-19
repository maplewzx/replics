package replics.net.messages;

import java.util.Collection;

import replics.net.IGroupID;
import replics.net.IPeerID;

//import net.jxta.document.Document;

public interface IMessage extends Cloneable {

	public IGroupID getGroupID(); 
	
	public void setGroupID(IGroupID groupID);
	
	public void setSourcePeerID(IPeerID peerID);
	
	public IPeerID getSourcePeerID();
	
	public void setAddrPeerIDs(Collection<IPeerID> peerIDs);
	
	public Collection<IPeerID> getAddrPeerIDs();
	
	// specifique jxta
	//public Document getDocument();
	
	public int getHops();
	
	public void setHops(int hops);
	
	public int getTTL();
	
	public void setTTL(int ttl);
	
	
	
	// specifique jxta
	//public void setDocument(); 
	
}
