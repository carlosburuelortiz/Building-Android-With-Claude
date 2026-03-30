package mx.buruel.buildingandroidwithclaude.presentation.model

sealed class ValidationState {
    object Idle : ValidationState()
    object Valid : ValidationState()
    object Invalid : ValidationState()
}
