package replics;

import replics.data.IDataProvider;
import replics.net.services.IMembershipService;
import replics.net.services.IPeerGroupManager;
import replics.net.services.IRecordComparator;
import replics.net.services.IRecordManager;

public interface IServiceManager {

	public IDataProvider getDataProvider();
	
	public IPeerGroupManager getPeerGroupManager();
	
	public IMembershipService getMembershipService();
	
	public IRecordManager getRecordManager();
	
	public IRecordComparator getRecordComparator();
}