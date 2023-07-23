package com.emedinaa.mapsalud.interfaces.rest

import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto
import com.emedinaa.mapsalud.infrastructure.repository.HealthPlanRemoteRepository
import com.emedinaa.mapsalud.interfaces.model.HealthPlanResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthPlanController(val repository: HealthPlanRemoteRepository) {

    //http://localhost:8080/api/healthplans
    @GetMapping("/api/healthplans")
    fun findAll():HealthPlanResponse {
        val data = repository.findAll().toList()
        return HealthPlanResponse("success",data)
    }

    //http://localhost:8080/api/healthplans/name
    @GetMapping("/api/healthplans/{name}")
    fun findByName(@PathVariable name: String):List<HealthPlanDto> = repository.findByPlan(name)
}