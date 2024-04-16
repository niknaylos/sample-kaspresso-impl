package me.arwazkhan.activitylifecycle

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.text.KTextView

object SecondScreen : BaseScreen<SecondScreen>() {
    private val email = KTextView{withId(R.id.txtEmail)}


    fun assertEmailIsDisplayed() {
        email.isDisplayed()
    }

    fun assertEmailHasCorrectText(emailName: String) {
        email.hasText(emailName)
    }
}