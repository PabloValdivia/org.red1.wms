/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_Truck extends X_WM_Truck{

	private static final long serialVersionUID = -1L;

	public MWM_Truck(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_Truck(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}