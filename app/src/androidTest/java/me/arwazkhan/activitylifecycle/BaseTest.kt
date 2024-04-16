package me.arwazkhan.activitylifecycle

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiObject
import androidx.test.uiautomator.UiObjectNotFoundException
import com.kaspersky.components.alluresupport.withForcedAllureSupport
import com.kaspersky.kaspresso.kaspresso.Kaspresso


import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.After
import org.junit.Before

import org.junit.Rule


open class BaseTestCase : TestCase(kaspressoBuilder = Kaspresso.Builder.withForcedAllureSupport()) {

    @get:Rule
    val activityRule = activityScenarioRule<LoginActivity>()

    val mDevice: UiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())
    val notNowPerm = UiSelector()
        .resourceId("android:id/autofill_save_no")

    fun clickOnNotNow() {
        val notNowButton = mDevice.findObject(notNowPerm)
        if (notNowButton.exists() && notNowButton.isEnabled()) {
            notNowButton.click()
        }
    }
}