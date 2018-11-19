package com.benny.archetype.business.api.result;

import com.benny.archetype.business.api.info.UserInfo;
import com.benny.archetype.common.net.domain.BaseResult;
import lombok.Data;

/**
 * @author yin.beibei
 * @date 2018/11/19 15:40
 */
@Data
public class UserQueryResult extends BaseResult {
    private static final long serialVersionUID = 6844509889315376894L;

    private UserInfo userInfo;
}
