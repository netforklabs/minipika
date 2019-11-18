package com.tengu.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 404NotFoundx
 * @version 1.0.0
 * @date 2019/11/12 11:01
 * @since 1.8
 */
public class ModelProperties {

    private static final Map<String, ModelProperties> messages = new HashMap<>();

    /**
     * 主键字段
     */
    private String primaryKey;

    /**
     * 表名
     */
    private String tableName;

    /**
     * 储存引擎，如：innodb
     */
    private String engine;

    /**
     * 索引字段
     */
    private String[] indexes;

    /**
     * 创建表的SQL语句
     */
    private String createTableSql;

    /**
     * 字段
     */
    private Map<String,String> columns;

    public static void setMessages(String key, ModelProperties value){
        messages.put(key,value);
    }

    public static Map<String, ModelProperties> getMessages() {
        return messages;
    }

    public Map<String, String> getColumns() {
        return columns;
    }

    public void setColumns(Map<String, String> columns) {
        this.columns = columns;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String[] getIndexes() {
        return indexes;
    }

    public void setIndexes(String[] indexes) {
        this.indexes = indexes;
    }

    public String getCreateTableSql() {
        return createTableSql;
    }

    public void setCreateTableSql(String createTableSql) {
        this.createTableSql = createTableSql;
    }
}