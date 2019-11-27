package com.tractor.db;

/**
 * 能够让你买飞机票的类
 *
 * @author 404NotFoundx
 * @version 1.0.0
 * @date 2019/11/27 15:12
 * @since 1.8
 */
public interface UnsafeJdbcService {

    /**
     * 清空某张表的数据
     *
     * @param target
     */
    int clear(Class<?> target);

    /**
     * 删除某张表
     *
     * @param target
     */
    void removeTable(Class<?> target);

}