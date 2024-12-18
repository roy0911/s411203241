package com.example.s411203241


import android.app.Activity
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.s411203241.ui.theme.S411203241Theme
import androidx.compose.material3.Scaffold as Scaffold1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S411203241Theme { Scaffold1(modifier = Modifier.fillMaxSize()) { innerPadding ->
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)


                Greeting(
                    name = "Android",
                    modifier = Modifier.padding(innerPadding)
                ) }
                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xff95fe95))
    )
    Column( horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            "2024期末上機考(資管二A邱建勳)",
            modifier = modifier
        )
        Image(
            painter = painterResource(id = R.drawable.class_a),
            contentDescription = "A班"
        )
        Text(
            "遊戲持續時間 0 秒",
            modifier = modifier
        )
        Text(
            "您的成績 0 分",
            modifier = modifier
        )
        val activity = (LocalContext.current as? Activity)
        Button(
            onClick = {
                activity?.finish()
            }
        ) {
            Text("結束App")

        }



    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S411203241Theme { Greeting("Android")
    }
}
