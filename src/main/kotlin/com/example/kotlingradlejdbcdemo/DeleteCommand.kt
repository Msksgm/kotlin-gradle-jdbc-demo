package com.example.kotlingradlejdbcdemo

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

interface DeleteCommand {
    fun perform(firstName: String)
}

@Component
class DeleteCommandImpl(val jdbcTemplate: JdbcTemplate) : DeleteCommand {
    val sql = "DELETE FROM customer WHERE first_name = ?"
    override fun perform(firstName: String) {
        jdbcTemplate.update(sql, firstName)
    }
}
