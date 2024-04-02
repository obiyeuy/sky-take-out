package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:OrderDetailMapper
 * <p>
 * Package:com.sky.mapper
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/4/2-8:54
 * @Version: v1.0
 */
@Mapper
public interface OrderDetailMapper {

    /**
     * 批量插入订单明细数
     * @param orderDetailList
     */
    void insertBatch(List<OrderDetail> orderDetailList);
}
