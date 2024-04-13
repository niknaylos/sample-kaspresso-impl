package me.arwazkhan.activitylifecycle

import androidx.test.ext.junit.rules.activityScenarioRule

import com.kaspersky.kaspresso.testcases.api.testcase.TestCase

import org.junit.Rule


open class BaseTestCase : TestCase() {
    @get:Rule
    val activityRule = activityScenarioRule<LoginActivity>()
}