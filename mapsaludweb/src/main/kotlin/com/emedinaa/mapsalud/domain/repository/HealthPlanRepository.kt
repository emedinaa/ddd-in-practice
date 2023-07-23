package com.emedinaa.mapsalud.domain.repository

import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto

interface HealthPlanRepository {

    fun findByPlan(plan: String): List<HealthPlanDto>
}