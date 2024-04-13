package me.arwazkhan.activitylifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import me.arwazkhan.activitylifecycle.R
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.text.*

object FastScreen : BaseScreen<FastScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    private val mobilePhoneInput = KEditText{withId(R.id.etMobileNumber)}

    fun clickOnMobilePhoneInput() {
        mobilePhoneInput.click()
    }

    fun typeTextInMobilePhoneInput() {
        mobilePhoneInput.replaceText("123456")
    }
}