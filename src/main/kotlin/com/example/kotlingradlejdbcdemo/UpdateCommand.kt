package com.example.kotlingradlejdbcdemo

import org.springframework.jdbc.core.JdbcTemplate

interface UpdateCommand {
    fun perform(lastName: String)
}

class UpdateCommandImpl(val jdbcTemplate: JdbcTemplate) : UpdateCommand {
    val sql = """
        UPDATE
            customer
        SET
            first_name = 'Eve'
            , last_name = 'Sample4'
        WHERE
            last_name = ?
        ;
    """.trimIndent()

    override fun perform(lastName: String) {
        jdbcTemplate.update(sql, lastName)
    }
}
