package me.arwazkhan.activitylifecycle

import org.junit.Test

class FirstTest : BaseTestCase() {
    @Test
    fun firstTest() = run {
        step("Type text into phone") {
            FastScreen.typeTextInMobilePhoneInput()
        }
    }
}