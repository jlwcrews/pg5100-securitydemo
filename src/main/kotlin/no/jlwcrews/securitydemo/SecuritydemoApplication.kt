package no.jlwcrews.securitydemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@SpringBootApplication
class SecuritydemoApplication

fun main(args: Array<String>) {
	runApplication<SecuritydemoApplication>(*args)
}
