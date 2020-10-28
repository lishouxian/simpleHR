package com.xian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xian.entities.EmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: lishouxian
 * @Date: 2020/10/27 13:42
 * @Description:
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeEntity> {
}
