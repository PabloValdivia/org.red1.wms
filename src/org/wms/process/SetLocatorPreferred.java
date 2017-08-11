/**


import org.compiere.model.Query;
import org.compiere.util.Env;
import java.sql.PreparedStatement;
import org.compiere.util.DB;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MSequence;
import org.compiere.model.MProduct;
import org.compiere.process.SvrProcess;

	public class SetLocatorPreferred extends SvrProcess {





		ProcessInfoParameter[] para = getParameter();
			for (ProcessInfoParameter p:para) {
				String name = p.getParameterName();
				if (p.getParameter() == null)
				else if(name.equals("M_Warehouse_ID")){
					M_Warehouse_ID = p.getParameterAsInt();
			}
				else if(name.equals("X")){
					X = p.getParameterAsInt();
			}
				else if(name.equals("Y")){
					Y = p.getParameterAsInt();
			}
				else if(name.equals("Z")){
					Z = p.getParameterAsInt();
			}				
		}
	}

		String whereClause = "EXISTS (SELECT T_Selection_ID FROM T_Selection WHERE T_Selection.AD_PInstance_ID=? AND T_Selection.T_Selection_ID=M_Product.M_Product_ID)";

		List<MProduct> lines = new Query(Env.getCtx(),MProduct.Table_Name,whereClause,get_TrxName())
		.setParameters(getAD_PInstance_ID()).list();

		for (MProduct line:lines){
			int a = line.get_ID();

			log.info("Selected line ID = "+a);
		}

		return "Number of Preferred Locators created "+cnt;

	}
}