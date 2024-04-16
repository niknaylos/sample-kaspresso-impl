package me.arwazkhan.activitylifecycle

import org.junit.Test

class FirstTest : BaseTestCase() {
    @Test
    fun firstTest() = run {
        step("Type text into phone") {
            FastScreen.typeTextInMobilePhoneInput("0123456789")
        }
        step("Type password") {
            FastScreen.typeTextInPassword("tony")
        }
        step("Click on login") {
            FastScreen.clickOnLoginButton()
        }
        step("Fuck u google") {
            clickOnNotNow()
        }
        step("Asserting email is displayed and has correct text") {
            SecondScreen.assertEmailIsDisplayed()
            flakySafely() {SecondScreen.assertEmailHasCorrectText("2131231123") }
        }

    }
}