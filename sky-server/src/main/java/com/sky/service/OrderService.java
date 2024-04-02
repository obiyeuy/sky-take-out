package com.sky.service;

import com.sky.dto.OrdersSubmitDTO;
import com.sky.vo.OrderSubmitVO;

/**
 * ClassName:OrderService
 * <p>
 * Package:com.sky.service
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/4/2-8:47
 * @Version: v1.0
 */
public interface OrderService {

    /**
     * 用户下单
     * @param ordersSubmitDTO
     * @return
     */
    OrderSubmitVO submitOrder(OrdersSubmitDTO ordersSubmitDTO);
}
