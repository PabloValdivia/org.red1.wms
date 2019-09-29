/**

import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.wms.model.MWM_EmptyStorageLine;

	public class CheckUp extends SvrProcess {
	Timestamp earliest = new Timestamp (System.currentTimeMillis()); 

		ProcessInfoParameter[] para = getParameter();
			for (ProcessInfoParameter p:para) {
				String name = p.getParameterName();
				if (p.getParameter() == null)
				else if(name.equals("IsActive")){
					IsActive = "Y".equals(p.getParameter());
			}
		}
	}

		String whereClause = "EXISTS (SELECT T_Selection_ID FROM T_Selection WHERE T_Selection.AD_PInstance_ID=? AND T_Selection.T_Selection_ID=WM_EmptyStorageLine.WM_EmptyStorageLine_ID)";

		List<MWM_EmptyStorageLine> lines = new Query(Env.getCtx(),MWM_EmptyStorageLine.Table_Name,whereClause,get_TrxName())
		.setParameters(getAD_PInstance_ID()).list();

		for (MWM_EmptyStorageLine line:lines){
		}

	return "Earliest FIFO DateStart:"+earliest;
	}
}