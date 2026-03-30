package mx.buruel.buildingandroidwithclaude.presentation.model

data class ContactFormUiState(
    val inputValue: String = "",
    val validationState: ValidationState = ValidationState.Idle
)
