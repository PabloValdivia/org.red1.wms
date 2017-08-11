/**
import java.math.BigDecimal;
import org.adempiere.base.event.IEventTopics;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.osgi.service.event.Event;

public class WM_DeliveryScheduleLineDocEvent extends AbstractEventHandler {
 	private static CLogger log = CLogger.getCLogger(WM_DeliveryScheduleLineDocEvent.class);
		private String trxName = "";
		private PO po = null;
		private Utils util = null;
	@Override 
	protected void initialize() { 
		registerTableEvent(IEventTopics.PO_AFTER_CHANGE, MWM_DeliveryScheduleLine.Table_Name);
		log.info("WM_DeliveryScheduleLine<PLUGIN> .. IS NOW INITIALIZED");
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
			util = new Utils(trxName);
				if (IEventTopics.PO_AFTER_CHANGE == type){
					MWM_DeliveryScheduleLine dsline = (MWM_DeliveryScheduleLine)po;
					log.fine("MWM_DeliveryScheduleLine changed: "+dsline.get_ID());
				}}}}
	
	private void setPo(PO eventPO) {
		 po = eventPO;
	}

	private void setTrxName(String get_TrxName) {
		trxName = get_TrxName;
		}
}