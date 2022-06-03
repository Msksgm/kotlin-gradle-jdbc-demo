package com.example.kotlingradlejdbcdemo

import org.springframework.jdbc.core.JdbcTemplate

interface InsertCommand {
    fun perform(firstName: String, lastName: String)
}

class InsertCommandImpl(val jdbcTemplate: JdbcTemplate) : InsertCommand {
    val sql = "INSERT INTO customer(first_name, last_name) VALUES (?, ?);"
    override fun perform(firstName: String, lastName: String) {
        jdbcTemplate.update(sql, firstName, lastName)
    }
}
