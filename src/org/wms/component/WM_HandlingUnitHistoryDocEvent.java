/**
import org.adempiere.base.event.AbstractEventHandler;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class WM_HandlingUnitHistoryDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(WM_HandlingUnitHistoryDocEvent.class);
		private String trxName = "";
		private PO po = null;

	@Override 
	protected void initialize() { 
		registerTableEvent(IEventTopics.PO_AFTER_CHANGE, MWM_HandlingUnitHistory.Table_Name);
		log.info("WM_HandlingUnitHistory<PLUGIN> .. IS NOW INITIALIZED");
		}

	@Override 
	protected void doHandleEvent(Event event){
		String type = event.getTopic();
		if (type.equals(IEventTopics.AFTER_LOGIN)) {
	}
 		else {
			setPo(getPO(event));
			setTrxName(po.get_TrxName());
	log.info(" topic="+event.getTopic()+" po="+po);
		if (po instanceof MWM_HandlingUnitHistory){
			if (IEventTopics.PO_AFTER_CHANGE == type){
				MWM_HandlingUnitHistory modelpo = (MWM_HandlingUnitHistory)po;
	log.fine("MWM_HandlingUnitHistory changed: "+modelpo.get_ID());
	// **DO SOMETHING** ;
			}
		}
	  }
 }

	private void setPo(PO eventPO) {
		 po = eventPO;
	}

	private void setTrxName(String get_TrxName) {
 	trxName = get_TrxName;
		}
}