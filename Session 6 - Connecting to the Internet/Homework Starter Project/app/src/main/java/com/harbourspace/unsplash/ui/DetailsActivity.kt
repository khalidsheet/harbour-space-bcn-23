package com.harbourspace.unsplash.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.material.chip.Chip
import com.harbourspace.unsplash.R

private const val TAG = "DetailsActivity"

class DetailsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val textColor = if (isSystemInDarkTheme()) Color.White else Color.Black
            LazyColumn {
                item {
                    Box {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(250.dp),
                            painter = painterResource(id = R.drawable.bcn_la_sagrada_familia),
                            contentScale = ContentScale.Crop,
                            contentDescription = stringResource(id = R.string.description_image_preview)
                        )
                        Box(
                            modifier = Modifier
                                .padding(16.dp)
                                .align(Alignment.BottomStart)
                        ) {
                            Row(

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_location_on_24),
                                    contentDescription = null
                                )
                                Text(
                                    text = "Barcelona, Spain",
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }

                    }


                }

                item {
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .height(80.dp)
                            .padding(20.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Box {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.user),
                                    modifier = Modifier
                                        .height(48.dp)
                                        .width(41.dp)
                                        .clip(
                                            RoundedCornerShape(50)
                                        ),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                )
                                Text(
                                    text = "Biel Morro",
                                    modifier = Modifier.padding(10.dp, 0.dp),
                                    fontWeight = FontWeight.Bold,
                                    color = textColor
                                )
                            }
                        }

                        Box {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.width(100.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_download_24),
                                    tint = textColor,
                                    contentDescription = null,
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                                    contentDescription = null,
                                    tint = textColor,
                                )
                                Icon(
                                    painter = painterResource(id = R.drawable.baseline_bookmark_border_24),
                                    contentDescription = null,
                                    tint = textColor,
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_camera_title),
                                subtitle = stringResource(id = R.string.details_camera_default)
                            )
                        }

                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_aperture_title),
                                subtitle = stringResource(id = R.string.details_aperture_default)
                            )
                        }
                    }
                }

                item {
                    Row(
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_focal_title),
                                subtitle = stringResource(id = R.string.details_focal_default)
                            )
                        }

                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_shutter_title),
                                subtitle = stringResource(id = R.string.details_shutter_default)
                            )
                        }
                    }
                }

                item {
                    Row(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_iso_title),
                                subtitle = stringResource(id = R.string.details_iso_default)
                            )
                        }

                        Column(
                            modifier = Modifier.weight(1.0f)
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_dimensions_title),
                                subtitle = stringResource(id = R.string.details_dimensions_default)
                            )
                        }
                    }
                }

                item {
                    Divider(
                        modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                        thickness = 1.dp,
                        color = Color.LightGray
                    )
                }

                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_views_title),
                                subtitle = stringResource(id = R.string.details_views_default)
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_downloads_title),
                                subtitle = stringResource(id = R.string.details_downloads_default)
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            AddImageInformation(
                                title = stringResource(id = R.string.details_likes_title),
                                subtitle = stringResource(id = R.string.details_likes_default)
                            )
                        }
                    }
                }

                item {
                    Row(
                        modifier = Modifier
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Chip(text = "barcelona")
                        Chip(text = "spain")

                    }
                }
            }
        }
    }
}

@Composable
fun AddImageInformation(
    title: String,
    subtitle: String
) {

    val textColor = if (isSystemInDarkTheme()) Color.White else Color.Black

    Text(
        text = title,
        fontSize = 17.sp,
        fontWeight = FontWeight.Bold,
        color = textColor
    )

    Text(
        text = subtitle,
        fontSize = 15.sp,
        color = textColor
    )
}

@Composable
fun Chip(text: String) {
    val textColor = if (isSystemInDarkTheme()) Color.White else Color.Black
    val backgroundColor = if (isSystemInDarkTheme()) Color(0xFF222222) else Color(0xFFCCCCCC)
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(20.dp))
            .background(backgroundColor)
            .padding(16.dp, 10.dp)
    ) {
        Text(text = text, color = textColor)
    }
    Spacer(modifier = Modifier.width(16.dp))
}