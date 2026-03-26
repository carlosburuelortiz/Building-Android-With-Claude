package mx.buruel.buildingandroidwithclaude.presentation.utils

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner.StrictStubs::class)
class UtilTest {

    // Valid email cases

    @Test
    fun `Standard email is valid`() {
        assertTrue(Util.isValidEmail("user@example.com"))
    }

    @Test
    fun `Email with plus sign is valid`() {
        assertTrue(Util.isValidEmail("user+tag@example.com"))
    }

    @Test
    fun `Email with underscore is valid`() {
        assertTrue(Util.isValidEmail("user_name@example.com"))
    }

    @Test
    fun `Email with dots in local part is valid`() {
        assertTrue(Util.isValidEmail("first.last@example.com"))
    }

    @Test
    fun `Email with dash in local part is valid`() {
        assertTrue(Util.isValidEmail("first-last@example.com"))
    }

    @Test
    fun `Email with subdomain is valid`() {
        assertTrue(Util.isValidEmail("user@mail.example.com"))
    }

    @Test
    fun `Email with two-letter TLD is valid`() {
        assertTrue(Util.isValidEmail("user@example.io"))
    }

    @Test
    fun `Email with six-letter TLD is valid`() {
        assertTrue(Util.isValidEmail("user@example.museum"))
    }

    @Test
    fun `Email with numeric local part is valid`() {
        assertTrue(Util.isValidEmail("123@example.com"))
    }

    // Invalid email cases

    @Test
    fun `Empty string is not a valid email`() {
        assertFalse(Util.isValidEmail(""))
    }

    @Test
    fun `Email without at sign is not valid`() {
        assertFalse(Util.isValidEmail("userexample.com"))
    }

    @Test
    fun `Email without domain is not valid`() {
        assertFalse(Util.isValidEmail("user@"))
    }

    @Test
    fun `Email without local part is not valid`() {
        assertFalse(Util.isValidEmail("@example.com"))
    }

    @Test
    fun `Email without TLD is not valid`() {
        assertFalse(Util.isValidEmail("user@example"))
    }

    @Test
    fun `Email with one-letter TLD is not valid`() {
        assertFalse(Util.isValidEmail("user@example.c"))
    }

    @Test
    fun `Email with seven-letter TLD is not valid`() {
        assertFalse(Util.isValidEmail("user@example.toolong"))
    }

    @Test
    fun `Email with spaces is not valid`() {
        assertFalse(Util.isValidEmail("user name@example.com"))
    }

    @Test
    fun `Email with double at sign is not valid`() {
        assertFalse(Util.isValidEmail("user@@example.com"))
    }

    @Test
    fun `Email with special characters in domain is not valid`() {
        assertFalse(Util.isValidEmail("user@exa!mple.com"))
    }
}
