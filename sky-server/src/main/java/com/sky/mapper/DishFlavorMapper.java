package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName:DishFlavorMapper
 * <p>
 * Package:com.sky.mapper
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/3/26-19:27
 * @Version: v1.0
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}