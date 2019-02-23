DROP TABLE if EXISTS data;
create table data(

    id int PRIMARY  KEY AUTO_INCREMENT,
    code VARCHAR(32) ,
    qymc VARCHAR(255),
    xxdz VARCHAR(255),
    tydm VARCHAR(255),
    zczbj VARCHAR(255),
    zsbh VARCHAR(255),
    fzjg VARCHAR(255),
    zbls VARCHAR(255),
    zzfw VARCHAR(255),
    frdb VARCHAR(255),
    jjxz VARCHAR(255),
    yxq VARCHAR(255),
    fzrq VARCHAR(255),
    fbls VARCHAR(255),
    index idx_code(code)
);

insert into data values (null,
'qwertywws',
'江西省广告建设有限公司',
'江西省南昌市红谷 滩新区翠苑路324号2栋302',
'91360121309236812D','1556万元人民币',
'D554629584',
'南 昌市城乡建设委员会',
'20161410514',
'建筑工程施工总承包贰级；建筑装修装饰工程专业 承包壹级',
'王全','有限责任公司（自然人投资或控股）',
'2021/6/20','2016/6/20',
'20161410514');