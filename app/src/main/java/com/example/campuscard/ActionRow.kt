// Polkovnikov Sergey
package kg.iuca.campuscard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ActionRow(useSpaceBetween: Boolean, onToggle: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = if (useSpaceBetween) {
            Arrangement.SpaceBetween
        } else {
            Arrangement.spacedBy(16.dp, Alignment.CenterHorizontally)
        }
    ) {
        Button(onClick = onToggle) { Text(text = "Map") }
        TextButton(onClick = {}) { Text(text = "Show QR") }
    }
}
