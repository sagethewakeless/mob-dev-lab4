// Polkovnikov Sergey
package kg.iuca.campuscard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CampusCardScreen() {
    var useSpaceBetween by remember { mutableStateOf(true) }
    var topAligned by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        // Polkovnikov Sergey
        ProfileHeader(name = "Polkovnikov Sergey", status = "In class · Building A")
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Campus Card", style = MaterialTheme.typography.headlineMedium)
            Text(text = "Polkovnikov Sergey")
            Text(text = "Student ID: 1567")
        }
        Text(
            text = "Today",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.clickable { topAligned = !topAligned }
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            ScheduleRow(
                time = "09:30",
                title = "Mobile and IoT Application Development",
                room = "Online",
                verticalAlignment = if (topAligned) Alignment.Top else Alignment.CenterVertically
            )
            ScheduleRow(time = "11:05", title = "Mobile and IoT Application Development", room = "Online")
            ScheduleRow(time = "13:10", title = "Information Security", room = "B305")
        }
        ActionRow(
            useSpaceBetween = useSpaceBetween,
            onToggle = { useSpaceBetween = !useSpaceBetween }
        )
    }
}
