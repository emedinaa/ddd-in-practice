package com.emedinaa.mapsalud.interfaces.model

import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto

data class HealthPlanResponse(
    val message:String,
    val data:List<HealthPlanDto>
)
