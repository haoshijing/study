package com.nc.study.controller;


import com.nc.study.po.DataPo;
import com.nc.study.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/data")
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/getByCode")
    public String queryByCode(String code, ModelMap modelMap) {
        DataPo dataPo = dataService.queryByCode(code);
        modelMap.addAttribute("data", dataPo);
        return "detail";
    }

    @RequestMapping("/import")
    public String importPage() {
        return "importPage";
    }


    @RequestMapping("/importData")
    public String submitFile(MultipartFile file) throws Exception {
        dataService.submitFile(file.getInputStream());
        return "succ";
    }
}
