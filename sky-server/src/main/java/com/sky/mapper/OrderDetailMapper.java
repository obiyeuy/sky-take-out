package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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


    /**
     * 根据订单id查询订单明细
     * @param orderId
     * @return
     */
    @Select("select * from order_detail where order_id = #{orderId}")
    List<OrderDetail> getByOrderId(Long orderId);


}
