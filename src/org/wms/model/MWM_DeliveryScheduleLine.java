/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_DeliveryScheduleLine extends X_WM_DeliveryScheduleLine{

	private static final long serialVersionUID = -1L;

	public MWM_DeliveryScheduleLine(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_DeliveryScheduleLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}