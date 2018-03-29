package edu.fdu.se.astdiff.miningactions.util;

import edu.fdu.se.astdiff.generatingactions.ActionConstants;
import edu.fdu.se.astdiff.miningactions.bean.ChangePacket;
import edu.fdu.se.astdiff.miningoperationbean.ClusteredActionBean;
import edu.fdu.se.astdiff.miningoperationbean.OperationTypeConstants;

import java.util.List;
import java.util.Set;

/**
 * Created by huangkaifeng on 2018/2/6.
 *
 */
public class DownUpMatchUtil {

    public static void setChangePacket(ClusteredActionBean bean){
        if(bean.changePacket.getChangeSet1()==null){
            return;
        }else if(bean.changePacket.getChangeSet1() == null){
            setChangePacket(bean.changePacket,bean.changePacket.getChangeSet1());
        }else{
            //不存在
        }

    }



    private static void setChangePacket(ChangePacket changePacket,List<String> type){
        changePacket.setOperationSubEntity(OperationTypeConstants.SUB_ENTITY_STRUCTURE_REFURNISH);
        if(BaseMatchUtil.twoItemInsertAndNullAction(type)){
        }else if(BaseMatchUtil.twoItemDeleteAndNullAction(type)){
            changePacket.setOperationType(OperationTypeConstants.DELETE);
        }else if(BaseMatchUtil.twoItemMoveAndNullAction(type)){
            changePacket.setOperationType(OperationTypeConstants.MOVE);
        }else if(BaseMatchUtil.twoItemUpdateAndNullAction(type)){
            changePacket.setOperationType(OperationTypeConstants.UPDATE);
        }else {
            changePacket.setOperationType(OperationTypeConstants.MULTIPLE_EDIT);
            changePacket.multiEditStr = generateMultiEditString(type);
        }


    }

    private static String generateMultiEditString(List<String> types){
        String result = "";
        for(String tmp:types){
            if(!tmp.equals(ActionConstants.NULLACTION)){
                result += tmp+"_";
            }
        }
        return result.substring(0,result.length()-1);
    }
}
