package com.platform.dao;

import com.platform.entity.UserCouponVo;
import org.apache.ibatis.annotations.Param;

/**
 *

 * @date 2017-08-11 09:16:47
 */
public interface ApiUserCouponMapper extends BaseDao<UserCouponVo> {
    UserCouponVo queryByCouponNumber(@Param("coupon_number") String coupon_number);
}
