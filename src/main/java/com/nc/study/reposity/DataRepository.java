package com.nc.study.reposity;

import com.nc.study.po.DataPo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataPo,Integer> {
    DataPo findByCode(String code);
}
