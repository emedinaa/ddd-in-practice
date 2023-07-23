package com.emedinaa.mapsalud

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class JpaTest @Autowired constructor(
    val entityManager: TestEntityManager
) {

    @Test
    fun givenPerson_whenSaved_thenFound() {
        val person = Person(name = "Edu", message = "hi")
        entityManager.persist(person)
        entityManager.flush()
    }
}