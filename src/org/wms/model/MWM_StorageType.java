/**

import java.sql.ResultSet;
import java.util.Properties;

public class MWM_StorageType extends X_WM_StorageType{

	private static final long serialVersionUID = -1L;

	public MWM_StorageType(Properties ctx, int id, String trxName) {
		super(ctx,id,trxName);
		}

	public MWM_StorageType(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}
}