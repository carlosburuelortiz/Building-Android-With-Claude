package mx.buruel.buildingandroidwithclaude.presentation.contactform

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import mx.buruel.buildingandroidwithclaude.presentation.model.ContactFormUiState
import mx.buruel.buildingandroidwithclaude.presentation.model.ValidationState
import mx.buruel.buildingandroidwithclaude.presentation.utils.Util

class ContactFormViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ContactFormUiState())
    val uiState: StateFlow<ContactFormUiState> = _uiState.asStateFlow()

    fun onInputChanged(input: String) {
        val validationState = when {
            input.isEmpty() -> ValidationState.Idle
            Util.isValidEmail(input) || Util.isValidPhoneNumber(input) -> ValidationState.Valid
            else -> ValidationState.Invalid
        }
        _uiState.value = ContactFormUiState(inputValue = input, validationState = validationState)
    }
}
