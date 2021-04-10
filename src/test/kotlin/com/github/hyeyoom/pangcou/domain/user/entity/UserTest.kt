package com.github.hyeyoom.pangcou.domain.user.entity

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.ShouldSpec

@DisplayName("사용자 엔티티 테스트")
internal class UserTest : ShouldSpec({

    context("사용자 생성 조건") {
        should("닉네임은 세 글자 이상") {
            shouldThrow<IllegalArgumentException> {
                User("email@mail.ml", "12", "12")
            }
        }

        should("이름은 두 글자 이상") {
            shouldThrow<IllegalArgumentException> {
                User("email@mail.ml", "1", "123")
            }
        }

        should("정상적인 입력의 경우 아무 예외가 발생하지 않음") {
            shouldNotThrow<IllegalArgumentException> {
                User("email@mail.ml", "12", "123")
            }
        }
    }
})