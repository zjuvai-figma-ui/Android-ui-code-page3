package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            NewsStory()
        }
    }
}

@Composable
@Preview
fun NewsStory() {
    Column(
        modifier = Modifier
            .background(color = Color(0xFFfafafa))
            .width(360.dp)
            .height(800.dp)
    ) {
        TopAppBar(
            modifier = Modifier
                .padding(top = 42.dp) // 写在background前面的就是Outer padding（即外边距margin）; outside background
                .background(color = Color.Transparent) // Solid element background color
                .height(50.dp)
                .padding(0.dp), // 写在background后面的就是Inner padding（即内边距padding）; inside background, around text
            backgroundColor = Color.Transparent,
            elevation = 0.dp,
            title = { Text(text = "Secondary Title", fontSize = 16.sp) },
            navigationIcon = {
                IconButton(
                    onClick = { /* doSomething() */ }) {
                    Icon(painter= painterResource(id = R.drawable.ic_arrow_back), contentDescription = null)
                }
            },
            actions = {
                IconButton(
                    onClick = { /* doSomething() */ }) {
                    Icon(painter= painterResource(id = R.drawable.ic_add), contentDescription = "Localized description")
                }
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(painter= painterResource(id = R.drawable.ic_add), contentDescription = "Localized description")
                }
                IconButton(onClick = { /* doSomething() */ }) {
                    Icon(painter= painterResource(id = R.drawable.ic_more), contentDescription = "Localized description")
                }
            }
        )

        Row(
            modifier = Modifier
                .padding(top = 10.dp)
                .background(Color.Transparent)
                .height(64.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(260.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp), text = "Title", fontSize = 16.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 3.dp),
                    text = "Description",
                    fontSize = 12.sp,
                    color = Color(0xFF717171)
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .background(Color.Transparent)
                    .padding(vertical = 21.dp)
                    .width(36.dp)
                    .height(64.dp)
            ) {
                SwitchDemo()
            }
        }

        Row(
            modifier = Modifier
                .height(64.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(276.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp), text = "Title", fontSize = 16.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 3.dp),
                    text = "Assignment",
                    fontSize = 12.sp,
                    color = Color(0xFF39bf56)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 16.dp, top = 20.dp)
                    .width(24.dp)
                    .height(24.dp),
                onClick = { /* doSomething() */ }) {
//                Icon(Icons.Filled.KeyboardArrowRight, contentDescription = "Localized description")
                Icon(
                    painter = painterResource(id = R.drawable.ic_lists_arrow),
                    contentDescription = "Localized description"
                )
            }
        }

        Row(
            modifier = Modifier
                .height(64.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(276.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp), text = "Title", fontSize = 16.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 3.dp),
                    text = "Description",
                    fontSize = 12.sp,
                    color = Color(0xFF717171)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 16.dp, top = 20.dp)
                    .width(24.dp)
                    .height(24.dp),
                onClick = { /* doSomething() */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lists_arrow),
                    contentDescription = "Localized description"
                )
            }
        }

        Divider(
            Modifier
                .fillMaxWidth()
                .padding(vertical = 13.dp)
                .background(Color.Transparent)
                .height(1.dp)
                .padding(start = 24.dp, end = 24.dp),
            //颜色
            color = Color(0xFFDCDCDC),
        )

        Row(
            modifier = Modifier
                .background(Color.Transparent)
                .height(52.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(260.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 15.5.dp), text = "Title", fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .background(Color.Transparent)
                    .padding(vertical = 15.dp)
                    .width(36.dp)
                    .height(52.dp)
            ) {
                SwitchDemo()
            }
        }

        Row(
            modifier = Modifier
                .height(64.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(276.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp), text = "Title", fontSize = 16.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 3.dp),
                    text = "Assignment",
                    fontSize = 12.sp,
                    color = Color(0xFF39bf56)
                )
            }
            IconButton(
                modifier = Modifier
                    .padding(start = 16.dp, top = 20.dp)
                    .width(24.dp)
                    .height(24.dp),
                onClick = { /* doSomething() */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_lists_arrow),
                    contentDescription = "Localized description"
                )
            }
        }

        Row(
            modifier = Modifier
                .background(Color.Transparent)
                .height(64.dp)
                .width(360.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 24.dp)
                    .width(260.dp)
            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 12.dp), text = "Title", fontSize = 16.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 3.dp),
                    text = "Description",
                    fontSize = 12.sp,
                    color = Color(0xFF717171)
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 16.dp)
                    .background(Color.Transparent)
                    .padding(vertical = 21.dp)
                    .width(36.dp)
                    .height(64.dp)
            ) {
                SwitchDemo()
            }
        }

        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp)
                .clip(RoundedCornerShape(14.dp))
                .background(color = Color(0xFFffffff))
                .width(328.dp)
                .height(224.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 24.dp, top = 22.dp),
                text = "You might be looking for:",
                fontSize = 12.sp,
                color = Color(0xFF737373)
            )

            Text(
                modifier = Modifier
                    .padding(start = 24.dp, top = 22.dp),
                text = "Auto screen off",
                fontSize = 14.sp,
                color = Color(0xFF262626)
            )

            Text(
                modifier = Modifier
                    .padding(start = 24.dp, top = 20.dp),
                text = "Dark mode",
                fontSize = 14.sp,
                color = Color(0xFF262626)
            )

            Text(
                modifier = Modifier
                    .padding(start = 24.dp, top = 20.dp),
                text = "Themes",
                fontSize = 14.sp,
                color = Color(0xFF262626)
            )

            Text(
                modifier = Modifier
                    .padding(start = 24.dp, top = 20.dp),
                text = "Themes",
                fontSize = 14.sp,
                color = Color(0xFF262626)
            )
        }
    }

}

@Composable
fun SwitchDemo() {
    val checkedState = remember { mutableStateOf(true) }

    Switch(
        checked = checkedState.value,
        onCheckedChange = {
            checkedState.value = it
        },
        colors = SwitchDefaults.colors(
            //多种颜色属性，设置滑块及背景颜色
            checkedThumbColor = Color.White,
            checkedTrackColor = Color(0xFF39bf56)
        )
    )
}
