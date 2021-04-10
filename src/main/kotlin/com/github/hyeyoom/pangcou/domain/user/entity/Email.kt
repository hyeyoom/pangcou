package com.github.hyeyoom.pangcou.domain.user.entity

import java.util.regex.Pattern

data class Email(
    val email: String
) {
    companion object {
        val EMAIL_REGEX: Pattern = Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9]))|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        )
    }

    init {
        if(!EMAIL_REGEX.matcher(email).matches()) {
            throw IllegalArgumentException("올바르지 않은 형식의 이메일입니다")
        }
    }
}