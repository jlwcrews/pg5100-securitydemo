package no.jlwcrews.securitydemo.service

import no.jlwcrews.securitydemo.repo.UserRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class UserService(@Autowired private val userRepo: UserRepo) :
    UserDetailsService {

    override fun loadUserByUsername(username: String?): UserDetails {
        val user = username?.let { userRepo.findByUsername(it) }
        user?.let {
            return AuthUserDetails(it)
        }
        throw ForbiddenException()
    }
}

@ResponseStatus(value = HttpStatus.FORBIDDEN)
class ForbiddenException : RuntimeException()
