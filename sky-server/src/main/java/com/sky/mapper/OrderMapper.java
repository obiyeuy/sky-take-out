package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName:OrderMapper
 * <p>
 * Package:com.sky.mapper
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/4/2-8:53
 * @Version: v1.0
 */
@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);
}
