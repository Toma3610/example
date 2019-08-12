package cn.toma.core;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Auther: Toma
 * @Date: 2018/7/26 17:40
 * @Description:
 */
public interface Mapper<T> extends
    BaseMapper<T>,
    MySqlMapper<T>,
    InsertListMapper<T>,
    IdsMapper<T>,
    ConditionMapper<T>
{
    //FIXME 特别注意，通用tk.mybatis插件要求 该接口不能被扫描到，否则会出错
}
