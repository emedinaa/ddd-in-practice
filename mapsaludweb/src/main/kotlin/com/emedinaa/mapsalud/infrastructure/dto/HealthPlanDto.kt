package com.emedinaa.mapsalud.infrastructure.dto

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class HealthPlanDto(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long =-1,
    var plan:String = "",
    var image:String? = "",
    var business:Int = -1,
    var broker:Int = -1,
    var insurance:Int = -1,
    var insuranceName:String = ""
)
