package com.nobroker.service;

import com.nobroker.entity.OwnerPlan;
import com.nobroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getOwnerPlan();
}

