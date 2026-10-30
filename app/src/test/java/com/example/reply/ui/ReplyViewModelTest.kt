package com.example.reply.ui

import com.example.reply.data.MailboxType
import com.example.reply.data.local.LocalEmailsDataProvider
import org.junit.Assert.*
import org.junit.Test

class ReplyViewModelTest {
    @Test
    fun opensSelectedEmailAndReturnsToInbox() {
        val model = ReplyViewModel()
        val email = LocalEmailsDataProvider.allEmails[2]
        model.updateDetailsScreenStates(email)
        assertEquals(email, model.uiState.value.currentSelectedEmail)
        assertFalse(model.uiState.value.isShowingHomepage)
        model.resetHomeScreenStates()
        assertTrue(model.uiState.value.isShowingHomepage)
        assertEquals(model.uiState.value.currentMailboxEmails.first(), model.uiState.value.currentSelectedEmail)
    }

    @Test
    fun changingMailboxSelectsItsFirstEmail() {
        val model = ReplyViewModel()
        for (mailbox in MailboxType.values()) {
            model.updateCurrentMailbox(mailbox)
            model.resetHomeScreenStates()
            assertEquals(mailbox, model.uiState.value.currentMailbox)
            assertEquals(mailbox, model.uiState.value.currentSelectedEmail.mailbox)
            assertTrue(model.uiState.value.isShowingHomepage)
        }
    }
}
