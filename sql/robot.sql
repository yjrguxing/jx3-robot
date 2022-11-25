DROP TABLE IF EXISTS School;
CREATE TABLE School(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '主键ID;主键ID' ,
    school_name VARCHAR(32) NOT NULL   COMMENT '门派名称;门派名称' ,
    delete_flag TINYINT NOT NULL   COMMENT '是否已删除/弃用;0未删除 1已删除' ,
    CREATED_USER VARCHAR(32) NOT NULL   COMMENT '创建人;创建人id' ,
    CREATED_TIME DATETIME NOT NULL   COMMENT '创建时间;创建时间' ,
    UPDATED_USER VARCHAR(32)    COMMENT '更新人;更新人id' ,
    UPDATED_TIME DATETIME    COMMENT '更新时间;更新时间' ,
    DELETE_BY VARCHAR(32)    COMMENT '删除人;删除人用户ID' ,
    DELETE_TIME DATETIME    COMMENT '删除时间;删除时间' ,
    PRIMARY KEY (id)
)  COMMENT = '门派';

DROP TABLE IF EXISTS QATemplate;
CREATE TABLE QATemplate(
    id INT NOT NULL AUTO_INCREMENT  COMMENT '主键;主键标识' ,
    name VARCHAR(32) NOT NULL   COMMENT '模板名称/问题名称;模板名称/问题名称' ,
    school_id INT NOT NULL   COMMENT '门派ID;门派ID' ,
    categroy_type INT NOT NULL   COMMENT '分类层级;本条记录在分类中的层级 从1开始' ,
    father_id INT NOT NULL   COMMENT '父ID;该条记录的父级ID' ,
    default_flag TINYINT NOT NULL   COMMENT '是否默认模板;0非默认 1为默认' ,
    delete_flag TINYINT NOT NULL   COMMENT '是否已删除;0未删除 1已删除' ,
    CREATED_USER VARCHAR(32) NOT NULL   COMMENT '创建人;创建人id' ,
    CREATED_TIME DATETIME NOT NULL   COMMENT '创建时间;创建时间' ,
    UPDATED_USER VARCHAR(32)    COMMENT '更新人;更新人id' ,
    UPDATED_TIME DATETIME    COMMENT '更新时间;更新时间' ,
    DELETE_BY VARCHAR(32)    COMMENT '删除人;删除人用户ID' ,
    DELETE_TIME DATETIME    COMMENT '删除时间;删除时间' ,
    PRIMARY KEY (id)
)  COMMENT = '问答模板';

