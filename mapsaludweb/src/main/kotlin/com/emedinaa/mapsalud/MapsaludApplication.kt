package com.emedinaa.mapsalud

import com.emedinaa.mapsalud.infrastructure.dto.HealthPlanDto
import com.emedinaa.mapsalud.infrastructure.repository.HealthPlanRemoteRepository
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class MapsaludApplication {

	private val log = LoggerFactory.getLogger(MapsaludApplication::class.java)

	/*
	[HealthPlan(idPlan=4299, plan=Plan Base, img=https://mapsalud-b.s3.us-west-2.amazonaws.com/operaciones/v4/aseguradoras/pacifico.png, idBusiness=556, idBroker=1, idInsurance=1, insurance=Pacifico EPS),
 	HealthPlan(idPlan=10721, plan=Plan Adicional 2, img=https://mapsalud-b.s3.us-west-2.amazonaws.com/operaciones/v4/aseguradoras/pacifico.png, idBusiness=1389, idBroker=1, idInsurance=1, insurance=Pacifico EPS)]
 */
	@Bean
	fun init(repository: HealthPlanRemoteRepository) = CommandLineRunner {

		/*repository.save(HealthPlanDto(
			plan = "Plan Base", image =  "https://images.google.com/", business = 556, broker = 1,
			insurance = 1, insuranceName = "Pacifico EPS"))
		repository.save(HealthPlanDto(
			plan = "Plan Adicional 2",
			image = "https://images.google.com/",
			business = 1389,
			broker = 1,
			insurance = 1,
			insuranceName = "Pacifico EPS"))*/
		log.info("--------")
	}
}

fun main(args: Array<String>) {
	runApplication<MapsaludApplication>(*args)
}
