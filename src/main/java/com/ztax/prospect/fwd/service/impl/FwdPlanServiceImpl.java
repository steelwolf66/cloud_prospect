package com.ztax.prospect.fwd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ztax.prospect.fwd.entity.FwdPlan;
import com.ztax.prospect.fwd.mapper.FwdPlanMapper;
import com.ztax.prospect.fwd.service.FwdPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * <p>
    *  服务实现类
    * </p>
 *
 * @since 2022-04-20
 */
@Service
public class FwdPlanServiceImpl extends ServiceImpl<FwdPlanMapper,FwdPlan> implements FwdPlanService {
    @Autowired
    private FwdPlanMapper planMapper;

    @Override
    public void deleteByIdWithFill(String pk) {
        FwdPlan paramBean = new FwdPlan();
        paramBean.setFwdPlanUuid(pk);
        planMapper.deleteByIdWithFill(paramBean);
    }
}

