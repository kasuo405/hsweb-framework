package org.hsweb.web.service.system;

import org.hsweb.ezorm.meta.TableMetaData;

import java.sql.SQLException;
import java.util.List;

/**
 * 数据库管理服务,用于获取数据库中的表结构等操作
 * Created by zhouhao on 16-4-21.
 */
public interface DataBaseManagerService {

    /**
     * 获取当前数据源中所有的表名
     * 能自动获取数据库类型，并列出对于的表名
     * 当前版本支持数据库:h2,mysql，oracle
     *
     * @return 表名集合
     */
    List<TableMetaData> getTableList() throws SQLException;


    /**
     * 执行sql语句，多条sql语句使用[;\n]分割
     *
     * @param sql     sql语句
     * @param process 执行过程回调，每执行一个sql都应该调用对应的回调方法
     */
   void executeSQL(String sql, SqlExecuteProcess process) throws SQLException;
}
