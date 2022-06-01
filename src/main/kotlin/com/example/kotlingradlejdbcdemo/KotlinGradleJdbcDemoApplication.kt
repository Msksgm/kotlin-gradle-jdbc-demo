package com.example.kotlingradlejdbcdemo

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.jdbc.core.JdbcTemplate

@SpringBootApplication
class KotlinGradleJdbcDemoApplication(val jdbcTemplate: JdbcTemplate) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("--Create--")
        InsertCommandImpl(jdbcTemplate).perform("Carol", "Sample3")
        println("--Read--")
        SelectAllQueryImpl(jdbcTemplate).perform().forEach { println(it) }
        println("--Update--")
        UpdateCommandImpl(jdbcTemplate).perform("Sample3")
        println("--Read--")
        SelectAllQueryImpl(jdbcTemplate).perform().forEach { println(it) }
        println("--Delete--")
        DeleteCommandImpl(jdbcTemplate).perform("Eve")
        println("--Read--")
        SelectAllQueryImpl(jdbcTemplate).perform().forEach { println(it) }
    }
}

fun main(args: Array<String>) {
    runApplication<KotlinGradleJdbcDemoApplication>(*args)
}
