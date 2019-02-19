package com.platform.dao;

import com.platform.entity.CommentVo;

import java.util.Map;

/**
 *

 * @date 2017-08-11 09:14:26
 */
public interface ApiCommentMapper extends BaseDao<CommentVo> {
    int queryhasPicTotal(Map<String, Object> map);
}
