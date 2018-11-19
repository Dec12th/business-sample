package com.benny.archetype.business.api;

import com.benny.archetype.business.api.request.UserQueryRequest;
import com.benny.archetype.business.api.result.UserQueryResult;
import com.benny.archetype.common.net.annotations.CommonNet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * api示例
 * @author yin.beibei
 * @date 2018/11/19 15:31
 */
@RestController
@RequestMapping("/wechat/message")
@CommonNet(appName = "steam-weixin")
public interface DemoFacade {

    /**
     * 查询用户信息
     * @param request 请求参数
     * @return userQueryResult 返回参数
     */
    UserQueryResult queryUser(UserQueryRequest request);
}
