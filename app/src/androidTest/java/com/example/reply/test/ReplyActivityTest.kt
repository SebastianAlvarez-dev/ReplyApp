package com.example.reply.test

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performScrollTo
import com.example.reply.MainActivity
import com.example.reply.R
import org.junit.Rule
import org.junit.Test

class ReplyActivityTest {
    @get:Rule
    val rule = createAndroidComposeRule<MainActivity>()

    @Test
    fun selectedEmailSurvivesActivityRecreation() {
        val subject = rule.activity.getString(R.string.email_2_subject)
        rule.onNodeWithText(subject).performScrollTo().performClick()
        rule.activityRule.scenario.recreate()
        rule.onNodeWithText(subject).assertIsDisplayed()
    }

    @Test
    fun switchesToSentMailbox() {
        rule.onNodeWithContentDescriptionForStringId(R.string.tab_sent).performClick()
        rule.onNodeWithText(rule.activity.getString(R.string.email_3_subject))
            .performScrollTo().assertIsDisplayed()
    }
}
