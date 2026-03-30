package mx.buruel.buildingandroidwithclaude

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import mx.buruel.buildingandroidwithclaude.presentation.contactform.ContactFormScreen
import mx.buruel.buildingandroidwithclaude.ui.theme.BuildingAndroidWithClaudeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BuildingAndroidWithClaudeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContactFormScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
