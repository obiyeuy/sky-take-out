package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * ClassName:DishService
 * <p>
 * Package:com.sky.service
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/3/26-15:10
 * @Version: v1.0
 */
public interface DishService {

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}




