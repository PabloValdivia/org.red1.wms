/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_HandlingUnitHistory extends X_WM_HandlingUnitHistory{

	private static final long serialVersionUID = -1L;

	public MWM_HandlingUnitHistory(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_HandlingUnitHistory(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}