package mx.buruel.buildingandroidwithclaude.presentation.contactform

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import mx.buruel.buildingandroidwithclaude.presentation.model.ValidationState

@Composable
fun ContactFormScreen(
    modifier: Modifier = Modifier,
    viewModel: ContactFormViewModel = viewModel(),
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = uiState.inputValue,
            onValueChange = viewModel::onInputChanged,
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Correo o teléfono") },
            isError = uiState.validationState is ValidationState.Invalid,
            supportingText = {
                when (uiState.validationState) {
                    is ValidationState.Valid -> Text(
                        text = "Formato válido",
                        color = MaterialTheme.colorScheme.primary
                    )
                    is ValidationState.Invalid -> Text(
                        text = "Formato incorrecto",
                        color = MaterialTheme.colorScheme.error
                    )
                    is ValidationState.Idle -> Unit
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            singleLine = true
        )
    }
}
