package CreationType.Builder;

import java.util.Collection;
import java.util.Map;

/**
 * @Author zzguo
 * @Description 实现导出数据到文本文件的的生成器对象
 * @Date 4:44 下午 2021/12/27
 **/
public class TxtBuilder implements Builder{
    /**
     * 用来记录构建的文件的内容，相当于产品
     */
    private StringBuffer buffer = new StringBuffer();

    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for(String tblName : mapData.keySet()){
            //先拼接表名称
            buffer.append(tblName+"\n");
            //然后循环拼接具体数据
            for(ExportDataModel edm : mapData.get(tblName)){
                buffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");
            }
        }
    }
    public void buildFooter(ExportFooterModel efm) {
        buffer.append(efm.getExportUser());
    }
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId()+","+ehm.getExportDate()+"\n");
    }
    public StringBuffer getResult(){
        return buffer;
    }
}
