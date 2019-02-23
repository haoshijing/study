package com.nc.study.service;


import com.nc.study.po.DataPo;
import com.nc.study.reposity.DataRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataService {

    @Autowired
    private DataRepository dataRepository;
    public DataPo queryByCode(String code){
        return dataRepository.findByCode(code);
    }

}
