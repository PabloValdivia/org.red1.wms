/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_PreferredProduct extends X_WM_PreferredProduct{

	private static final long serialVersionUID = -1L;

	public MWM_PreferredProduct(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_PreferredProduct(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}