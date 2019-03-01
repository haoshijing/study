package com.nc.study.controller;


import com.nc.study.po.DataPo;
import com.nc.study.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/CertQRCodeQuery.aspx")
    public String queryByCode(String ID, ModelMap modelMap) {
        DataPo dataPo = dataService.queryByCode(ID);
        modelMap.addAttribute("data", dataPo);
        return "detail";
    }

    @RequestMapping("/import")
    public String importPage() {
        return "importpage";
    }


    @RequestMapping("/importData")
    public String submitFile(MultipartFile file) throws Exception {
        dataService.submitFile(file.getInputStream());
        return "succ";
    }
}
