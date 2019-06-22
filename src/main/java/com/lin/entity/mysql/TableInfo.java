package com.lin.entity.mysql;

/**
 * 数据表信息
 * @author lkmc2
 * @since 1.0.1
 */
public class TableInfo {
    private String tableName; // 表名
    private String tableComment; // 表注释

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public String toString() {
        return "TableInfo{" +
                "tableName='" + tableName + '\'' +
                ", tableComment='" + tableComment + '\'' +
                '}';
    }
}
