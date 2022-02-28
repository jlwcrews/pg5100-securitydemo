package no.jlwcrews.securitydemo.entity

import javax.persistence.*

@Entity
@Table(name = "USERS")
class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    val id: Long? = null,

    @Column(name = "user_username")
    val username: String,

    @Column(name = "user_password")
    val password: String,

    @Column(name = "user_enabled")
    val enabled: Boolean,

    @Column(name = "user_role")
    val role: String
) {
    override fun toString(): String {
        return "UserEntity(id=$id, username=$username, password=$password, enabled=$enabled)"
    }
}


