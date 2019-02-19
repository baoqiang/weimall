package com.platform.dao;

import com.platform.entity.SearchHistoryVo;
import org.apache.ibatis.annotations.Param;

/**
 * 
 * 
 *

 * @date 2017-08-11 09:16:46
 */
public interface ApiSearchHistoryMapper extends BaseDao<SearchHistoryVo> {
    int deleteByUserId(@Param("user_id") Long userId);
}
