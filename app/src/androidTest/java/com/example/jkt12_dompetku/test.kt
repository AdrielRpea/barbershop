package com.example.jkt12_dompetku

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainTest{
    @Rule @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun Login(){
        onView(withId(R.id.edtUserName)).perform(ViewActions.typeText("name"))
        onView(withId(R.id.edtPassword)).perform(ViewActions.typeText("1234"))
        onView(withId(R.id.btnLogin)).perform(ViewActions.click())
        onView(withId(R.id.homeFragment)).check(ViewAssertions.matches(isDisplayed()))
    }
}