package com.example.scaffold_lesson

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scaffold_lesson.ui.theme.Scaffold_LessonХХХTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold_LessonХХХTheme {
                      BasicScaffold()

                }
            }
        }
    }

@OptIn(markerClass = arrayOf(ExperimentalMaterial3Api::class))
@Composable
fun BasicScaffold()
{
    Scaffold(
        topBar = { TopAppBar(
        title = { Text("Top app bar")},
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource( id = R.drawable.ic_menu),
                        contentDescription = "menu"
                    )
                }
            },
            colors = topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary
            )
    )
        },
        bottomBar =  {
            NavigationBar {
                NavigationBarItem(
                    icon = { Icon(
                        painter = painterResource( id = R.drawable.ic_home),
                        contentDescription = "Home"
                    )},
                    label = {Text("Home")},
                    selected = true,
                    onClick = {}

                )
                NavigationBarItem(
                    icon = { Icon(
                        painter = painterResource( id = R.drawable.ic_search),
                        contentDescription = "Search"
                    )},
                    label = {Text("Search")},
                    selected = false,
                    onClick = {}

                )
            }
        },
        floatingActionButton = {
            Column() {
                FloatingActionButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_add),
                        contentDescription = "Add"
                    )
                }
                Spacer(Modifier.height(16.dp))
                FloatingActionButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id=R.drawable.ic_favorite),
                        contentDescription = "Add"
                    )
                }
            }
        }
    ) { innerPadding ->
        Box( modifier = Modifier.padding(paddingValues = innerPadding)) {
            Text("Screen content",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 16.dp)
            )

        }

    }

}
