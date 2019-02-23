package com.nc.study.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "data")
public class DataPo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    /**
     * 企业名称
     */
    private String qymc;
    /**
     * 详细地址
     */
    private String xxdz;
    /**
     *统一代码
     */
    private String tydm;

    private String zczbj;
    private String zsbh;
    private String fzjg;
    private Long zbls;
    private String zzfw;
    private String frdb;
    private String jjxz;
    private String yxq;
    private String fzrq;
    private String fbls;
}
