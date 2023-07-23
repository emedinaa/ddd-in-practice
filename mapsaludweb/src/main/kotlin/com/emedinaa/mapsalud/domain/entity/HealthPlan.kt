package com.emedinaa.mapsalud.domain.entity

data class HealthPlan(
    private val id: Long,
    private val name: String,
    private val image: String,
    private val business: Int,
    private val broker: Int,
    private val insurance: Int,
    private val insuranceName: String
)