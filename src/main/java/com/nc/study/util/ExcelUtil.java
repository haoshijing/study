package com.nc.study.util;

import com.google.common.collect.Lists;
import com.nc.study.po.DataPo;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public final class ExcelUtil {
    public static List<DataPo> load(InputStream inputStream) throws Exception {
        Workbook workbook = Workbook.getWorkbook(inputStream);

        Sheet sheet = workbook.getSheet(0);
        List<DataPo> dataPos = Lists.newArrayList();
        int totalRows = sheet.getRows();
        for (int i = 1; i < totalRows; i++) {
            Cell[] cells = sheet.getRow(i);
            if (cells != null && cells.length > 0) {
                DataPo dataPo = new DataPo();

                String qymc = cells[0].getContents();
                String xxdz = cells[1].getContents();
                String tydm = cells[2].getContents();
                String zccbj = cells[3].getContents();
                String zsbh = cells[4].getContents();
                String fzjg = cells[5].getContents();
                String zbls = cells[6].getContents();
                String zzfw = cells[7].getContents();
                String frdb = cells[8].getContents();
                String jjxz = cells[9].getContents();

                String yxq = cells[10].getContents();

                String fzrq = cells[11].getContents();
                String fbls = cells[12].getContents();
                String code= cells[13].getContents();

                dataPo.setCode(code);
                dataPo.setQymc(qymc);
                dataPo.setXxdz(xxdz);
                dataPo.setTydm(tydm);
                dataPo.setZczbj(zccbj);
                dataPo.setZsbh(zsbh);
                dataPo.setFzjg(fzjg);
                dataPo.setZbls(zbls);
                dataPo.setZzfw(zzfw);
                dataPo.setFrdb(frdb);
                dataPo.setJjxz(jjxz);
                dataPo.setYxq(yxq);
                dataPo.setFzrq(fzrq);
                dataPo.setFbls(fbls);

                dataPos.add(dataPo);

            }
        }
        return dataPos;
    }

}
