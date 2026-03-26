package mx.buruel.buildingandroidwithclaude.presentation.utils

import mx.buruel.buildingandroidwithclaude.presentation.utils.Constant.PATTERN_EMAIL

object Util {
    fun isValidEmail(email: String): Boolean {
        val regex = Regex(PATTERN_EMAIL)
        return regex.matches(email)
    }
}
