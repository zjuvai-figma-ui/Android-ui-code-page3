package com.example.composetutorial

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.WindowCompat
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            MainContent()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
@Preview
fun MainContent() {
    Box(//P4-3-联想
        modifier = Modifier
            .size(width = 360.dp, height = 804.dp)
            .background(color = Color(0xfffafafa)),
    ){
        Box(//Overlay Mask
            modifier = Modifier
                .size(width = 360.dp, height = 804.dp)
                .background(color = Color(0xff969696))
        ){}
        Box(//Frame 270988932
            modifier = Modifier
                .size(width = 360.dp, height = 764.dp)
                .offset(x = 0.dp, 40.dp)
        ){
            Box(//Panel
                modifier = Modifier
                    .size(width = 360.dp, height = 764.dp)
                    .clip(RoundedCornerShape(24.dp, 24.dp, 0.dp, 0.dp))
                    .background(color = Color(0xfff5f5f5))
            ){
                Row(//.Components/Panel Title
                    modifier = Modifier
                        .size(width = 360.dp, height = 50.dp)
                        .offset(x = 0.dp, 16.dp)
                        .padding(top = 4.dp, end = 11.dp, bottom = 4.dp, start = 11.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Box(//.Icon
                        modifier = Modifier.size(width = 42.dp,height = 42.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Box(//cancel退出
                            modifier = Modifier.size(width = 24.dp,height = 24.dp)
                        ){
                            Icon(
                                Icons.Filled.Close,
                                contentDescription = null
                            )
                        }
                    }
                    Text(//Secondarytitle
                        modifier = Modifier.size(width = 254.dp,height = 21.dp),
                        text = "新建联系人",
                        color = Color(0xff252525),
                        fontSize = 16.sp,
                        lineHeight = 21.sp,
                        fontWeight = FontWeight.W500,
                        textAlign = TextAlign.Center
                    )
                    Box(//.Icon
                        modifier = Modifier.size(width = 42.dp,height = 42.dp),
                        contentAlignment = Alignment.Center
                    ){
                        Box(//cancel退出
                            modifier = Modifier.size(width = 24.dp,height = 24.dp)
                        ){
                            Icon(
                                Icons.Filled.Done,
                                contentDescription = null
                            )
                        }
                    }
                }
            }

            Column(//Frame 48098990
                modifier = Modifier
                    .size(width = 360.dp, height = 356.dp)
                    .offset(x = 0.dp, y = 66.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Column(//新建联系人-头像大
                    modifier = Modifier
                        .size(width = 360.dp, height = 172.dp)
                        .padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Box(//头像
                        modifier = Modifier.size(width = 104.dp,height = 104.dp),
                    ){
                        Icon(
                            Icons.Filled.AccountCircle,
                            modifier = Modifier.size(width = 104.dp,height = 104.dp),
                            contentDescription = null,
                            tint = Color(0xffd0d0d0)
                        )
                    }
                    Row(//保存至-本机
                        modifier = Modifier
                            .size(width = 110.dp, height = 24.dp)
                            .padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Row(//Frame2737
                            modifier = Modifier
                                .size(width = 102.dp, height = 24.dp)
                                .padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 0.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(//🖊Title
                                modifier = Modifier.size(width = 42.dp,height = 20.dp),
                                text = "保存至",
                                color = Color(0xff6e6e6e),
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight.W500
                            )
                            Text(//🖊Title
                                modifier = Modifier.size(width = 28.dp,height = 20.dp),
                                text = "本机",
                                color = Color(0xff252525),
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight.W500
                            )
                            Box(//Frame48099249
                                modifier = Modifier.size(width = 24.dp,height = 24.dp),
                            ){
                                Icon(
                                    Icons.Filled.ArrowDropDown,
                                    contentDescription = null,
                                    tint = Color(0xffc4c4c4)
                                )
                            }
                        }
                    }
                }

                Column(//Frame 48098989
                    modifier = Modifier
                        .size(width = 360.dp, height = 184.dp)
                        .padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.Start
                ){
                    TextField(//新建输入框-单行
                        modifier = Modifier
                            .size(width = 328.dp,height = 62.dp),
                        value = "王俊",
                        onValueChange ={},
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Person,
                                contentDescription = null,
                                tint = Color(0xff262626)
                            )
                        },
                        trailingIcon = {
                            Icon(
                                Icons.Filled.ArrowDropDown,
                                contentDescription = null,
                                tint = Color(0xffc4c4c4)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color(0xff262626),
                            cursorColor = Color(0xff2da74e),
                            backgroundColor = Color(0xffffffff),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        textStyle = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W500,
                            lineHeight = 21.sp,
                        ),
                        shape = RoundedCornerShape(16.dp)
                    )

                    TextField(//新建输入框-单行
                        modifier = Modifier
                            .size(width = 328.dp,height = 62.dp),
                        value = "手机",
                        onValueChange ={},
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Phone,
                                contentDescription = null,
                                tint = Color(0xff262626)
                            )
                        },
                        trailingIcon = {
                            Icon(
                                Icons.Filled.ArrowDropDown,
                                contentDescription = null,
                                tint = Color(0xffc4c4c4)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = Color(0xff262626),
                            cursorColor = Color(0xff2da74e),
                            backgroundColor = Color(0xffffffff),
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        textStyle = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.W500,
                            lineHeight = 21.sp,
                        ),
                        shape = RoundedCornerShape(16.dp)
                    )

                    Column(//展开与删除
                        modifier = Modifier
                            .size(width = 328.dp, height = 28.dp)
                            .padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 0.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.Start
                    ){
                        TextButton(//Text button
                            onClick={},
                            modifier = Modifier
                                .size(width = 88.dp, height = 28.dp),
                            contentPadding = PaddingValues(top = 4.dp, end = 16.dp, bottom = 4.dp, start = 16.dp)
                        ){
                            Text(//Text button
                                modifier = Modifier.size(width = 56.dp,height = 20.dp),
                                text = "展开更多",
                                color = Color(0xff2da74e),
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontWeight = FontWeight.W500
                            )
                        }
                    }
                }


            }

            Column(//Frame 联系人-联想弹窗
                modifier = Modifier
                    .offset(x = 37.5.dp, y = 308.dp)
                    .size(width = 161.dp, height = 128.dp)
                    .clip(RoundedCornerShape(16.dp, 16.dp, 16.dp, 16.dp))
                    .shadow(12.dp)
                    .background(color = Color(0xffffffff))
                    .padding(top = 8.dp, end = 16.dp, bottom = 8.dp, start = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.Start
            ){
                Row(//联系人-联想列表
                    modifier = Modifier
                        .size(width = 129.dp, height = 56.dp)
                        .padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Box(//头像
                        modifier = Modifier.size(width = 36.dp,height = 36.dp),
                    ){
                        Icon(
                            Icons.Filled.AccountCircle,
                            modifier = Modifier.size(width = 36.dp,height = 36.dp),
                            contentDescription = null,
                            tint = Color(0xff3068e1)
                        )
                    }

                    Column(//Frame 1318
                        modifier = Modifier
                            .size(width = 77.dp, height = 56.dp)
                            .padding(top = 10.dp, end = 0.dp, bottom = 10.dp, start = 0.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(//Option
                            modifier = Modifier.size(width = 28.dp,height = 20.dp),
                            text = "王俊",
                            color = Color(0xff2DA74E),
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.W500,
                            textAlign = TextAlign.Start
                        )
                        Text(//150 7376 6819
                            modifier = Modifier.size(width = 77.dp,height = 16.dp),
                            text = "15073766819",
                            color = Color(0xff737373),
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight.W400,
                            textAlign = TextAlign.Start
                        )
                    }
                }

                Row(//联系人-联想列表
                    modifier = Modifier
                        .size(width = 129.dp, height = 56.dp)
                        .padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 0.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Box(//头像
                        modifier = Modifier.size(width = 36.dp,height = 36.dp),
                    ){
                        Icon(
                            Icons.Filled.AccountCircle,
                            modifier = Modifier.size(width = 36.dp,height = 36.dp),
                            contentDescription = null,
                            tint = Color(0xff3068e1)
                        )
                    }

                    Column(//Frame 1318
                        modifier = Modifier
                            .size(width = 77.dp, height = 56.dp)
                            .padding(top = 10.dp, end = 0.dp, bottom = 10.dp, start = 0.dp),
                        verticalArrangement = Arrangement.SpaceBetween,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(//Option
                            modifier = Modifier.size(width = 28.dp,height = 20.dp),
                            text = "王俊",
                            color = Color(0xff2DA74E),
                            fontSize = 14.sp,
                            lineHeight = 20.sp,
                            fontWeight = FontWeight.W500,
                            textAlign = TextAlign.Start
                        )
                        Text(//150 7376 6819
                            modifier = Modifier.size(width = 77.dp,height = 16.dp),
                            text = "15073766819",
                            color = Color(0xff737373),
                            fontSize = 12.sp,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight.W400,
                            textAlign = TextAlign.Start
                        )
                    }
                }
            }
        }
    }
}

