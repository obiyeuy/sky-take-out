package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * ClassName:UserService
 * <p>
 * Package:com.sky.service
 * <p>
 * Description:
 * <p>
 *
 * @Author: yyb
 * @Create: 2024/3/28-22:18
 * @Version: v1.0
 */
public interface UserService {

    /**
     * 微信登陆
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
