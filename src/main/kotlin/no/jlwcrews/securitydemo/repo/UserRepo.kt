package no.jlwcrews.securitydemo.repo

import no.jlwcrews.securitydemo.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo: JpaRepository<UserEntity, Long> {

    fun findByUsername(username: String): UserEntity
}