package no.jlwcrews.securitydemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/")
    fun getHello(): String {
        return "<h1>Hello</h1>"
    }

    @GetMapping("/user")
    fun getUserHello(): String {
        return "<h1>Hello user</h1>"
    }

    @GetMapping("/admin")
    fun getAdminHello(): String {
        return "<h1>Hello admin</h1>"
    }
}