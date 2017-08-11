/**


import org.compiere.model.Query;
import org.compiere.util.Env;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import org.compiere.util.DB;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MSequence;
import org.compiere.model.MProduct;
import org.compiere.process.SvrProcess;

	public class SetProductPackFactor extends SvrProcess {



		ProcessInfoParameter[] para = getParameter();
			for (ProcessInfoParameter p:para) {
				String name = p.getParameterName();
				if (p.getParameter() == null)
				else if(name.equals("UnitsPerPack")){
					UnitsPerPack = p.getParameterAsInt();
			}
				else if(name.equals("UnitsPerPallet")){
					UnitsPerPallet = (BigDecimal)p.getParameterAsBigDecimal();
			}
		}
	}

		String whereClause = "EXISTS (SELECT T_Selection_ID FROM T_Selection WHERE T_Selection.AD_PInstance_ID=? AND T_Selection.T_Selection_ID=M_Product.M_Product_ID)";

		List<MProduct> lines = new Query(Env.getCtx(),MProduct.Table_Name,whereClause,get_TrxName())
		.setParameters(getAD_PInstance_ID()).list();

		for (MProduct line:lines){
			MProduct product = new Query(Env.getCtx(),MProduct.Table_Name,MProduct.COLUMNNAME_M_Product_ID+"=?",get_TrxName())
	}

	return "Products Set: "+cnt;

	}
}