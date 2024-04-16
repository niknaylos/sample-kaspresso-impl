package me.arwazkhan.activitylifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import me.arwazkhan.activitylifecycle.R
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.text.*

object FastScreen : BaseScreen<FastScreen>() {

    private val mobilePhoneInput = KEditText{withId(R.id.etMobileNumber)}
    private val loginButton = KView{withId(R.id.btnLogin)}
    private val passwordInput = KEditText{withId(R.id.etPassword)}



    fun typeTextInMobilePhoneInput(phone: String) {
        mobilePhoneInput.replaceText(phone)
    }
    fun typeTextInPassword(password: String) {
        passwordInput.replaceText(password)
    }
    fun clickOnLoginButton() {
        loginButton.click()
    }
}