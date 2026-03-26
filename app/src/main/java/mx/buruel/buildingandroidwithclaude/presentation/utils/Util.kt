package mx.buruel.buildingandroidwithclaude.presentation.utils

import mx.buruel.buildingandroidwithclaude.presentation.utils.Constant.PATTERN_EMAIL
import mx.buruel.buildingandroidwithclaude.presentation.utils.Constant.PATTERN_PHONE

object Util {
    fun isValidEmail(email: String): Boolean {
        val regex = Regex(PATTERN_EMAIL)
        return regex.matches(email)
    }

    fun isValidPhoneNumber(phoneNumber: String): Boolean {
        val regex = Regex(PATTERN_PHONE)
        return regex.matches(phoneNumber)
    }
}
