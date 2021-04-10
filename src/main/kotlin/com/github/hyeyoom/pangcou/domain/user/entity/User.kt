package com.github.hyeyoom.pangcou.domain.user.entity

class User(
        email: String,
        name: String,
        displayName: String
) {
    val id: Long? = null
    val email: Email = Email(email)
    val name: String = name
    val displayName: String = displayName

    init {
        if (name.length < 2) {
            throw IllegalArgumentException("이름은 2자 이상 이어야 합니다")
        }
        if (displayName.length < 3) {
            throw IllegalArgumentException("닉네임은 3자 이상이어야 합니다")
        }
    }
}