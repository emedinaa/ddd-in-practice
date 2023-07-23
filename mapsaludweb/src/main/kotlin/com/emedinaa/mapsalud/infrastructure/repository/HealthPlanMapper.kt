package com.emedinaa.mapsalud.infrastructure.repository

import com.emedinaa.mapsalud.domain.entity.HealthPlan
import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto

class HealthPlanMapper {

    fun healthPlanDtoToHealthPlan(healthPlanDto: HealthPlanDto) :HealthPlan {
        return HealthPlan(
            healthPlanDto.id,
            healthPlanDto.plan,
            healthPlanDto.image?:"",
            healthPlanDto.business,
            healthPlanDto.broker,
            healthPlanDto.insurance,
            healthPlanDto.insuranceName
        )
    }
}