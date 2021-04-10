package com.github.hyeyoom.pangcou.domain.user.entity

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.DisplayName
import io.kotest.core.spec.style.ShouldSpec

@DisplayName("이메일 값객체 테스트")
internal class EmailTest : ShouldSpec({

    context("이메일 생성 조건") {
        should("이메일 형식에 맞지 않는 경우 예외가 발생한다") {
            shouldThrow<IllegalArgumentException> {
                Email("not_email_form")
            }
        }

        should("이메일이 정상인 경우에는 아무일도 발생하지 않는다") {
            shouldNotThrow<IllegalArgumentException> {
                Email("abc@abc.com")
            }
        }
    }
})