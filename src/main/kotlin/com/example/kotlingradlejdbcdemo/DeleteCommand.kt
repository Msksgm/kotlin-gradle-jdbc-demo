package com.example.kotlingradlejdbcdemo

import org.springframework.jdbc.core.JdbcTemplate

interface DeleteCommand {
    fun perform(firstName: String)
}

class DeleteCommandImpl(val jdbcTemplate: JdbcTemplate) : DeleteCommand {
    val sql = "DELETE FROM customer WHERE first_name = ?"
    override fun perform(firstName: String) {
        jdbcTemplate.update(sql, firstName)
    }
}
