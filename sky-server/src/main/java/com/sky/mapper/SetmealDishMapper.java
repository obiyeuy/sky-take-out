package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:SetmealDishMapper
 * <p>
 * Package:com.sky.mapper
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/3/26-21:57
 * @Version: v1.0
 */

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param dishIds
     * @return
     */
    //select setmeal_id from setmeal_dish where dish_id in (1,2,...)
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
