/**
import java.sql.ResultSet;
import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

public class WM_WarehousePickModelFactory implements IModelFactory {
	@Override 	public Class<?> getClass(String tableName) {
		 if (tableName.equals(MWM_WarehousePick.Table_Name)){
			 return MWM_WarehousePick.class;
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, int Record_ID, String trxName) {
		 if (tableName.equals(MWM_WarehousePick.Table_Name)) {
		     return new MWM_WarehousePick(Env.getCtx(), Record_ID, trxName);
		 }
  		return null;
	}
	@Override	public PO getPO(String tableName, ResultSet rs, String trxName) {
		 if (tableName.equals(MWM_WarehousePick.Table_Name)) {
		     return new MWM_WarehousePick(Env.getCtx(), rs, trxName);
		   }
 		 return null;
	}
}