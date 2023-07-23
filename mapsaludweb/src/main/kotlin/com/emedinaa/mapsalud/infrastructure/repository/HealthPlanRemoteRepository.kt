package com.emedinaa.mapsalud.infrastructure.repository

import com.emedinaa.mapsalud.domain.repository.HealthPlanRepository
import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto
import org.springframework.data.repository.CrudRepository

interface HealthPlanRemoteRepository :HealthPlanRepository, CrudRepository<HealthPlanDto,Long> {

    override fun findByPlan(plan: String): List<HealthPlanDto>
}