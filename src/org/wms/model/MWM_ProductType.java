/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_ProductType extends X_WM_ProductType{

	private static final long serialVersionUID = -1L;

	public MWM_ProductType(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_ProductType(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}