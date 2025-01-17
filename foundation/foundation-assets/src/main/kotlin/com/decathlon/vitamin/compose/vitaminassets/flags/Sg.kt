package com.decathlon.vitamin.compose.vitaminassets.flags

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.FlagsGroup

public val FlagsGroup.Sg: ImageVector
    get() {
        if (_sg != null) {
            return _sg!!
        }
        _sg = Builder(name = "Sg", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
                28.0f, viewportHeight = 20.0f).apply {
            group {
                path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF5F5F5)),
                        strokeLineWidth = 0.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 0.25f)
                    lineTo(26.0f, 0.25f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 27.75f, 2.0f)
                    lineTo(27.75f, 18.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 26.0f, 19.75f)
                    lineTo(2.0f, 19.75f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 0.25f, 18.0f)
                    lineTo(0.25f, 2.0f)
                    arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 0.25f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFE12237)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(0.0f, 10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(0.0f)
                    horizontalLineTo(0.0f)
                    verticalLineTo(10.6667f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 9.3333f)
                    curveTo(7.6118f, 9.3333f, 8.4803f, 9.0056f, 9.1649f, 8.4575f)
                    curveTo(8.8023f, 8.5927f, 8.4098f, 8.6667f, 8.0f, 8.6667f)
                    curveTo(6.1591f, 8.6667f, 4.6667f, 7.1743f, 4.6667f, 5.3333f)
                    curveTo(4.6667f, 3.4924f, 6.1591f, 2.0f, 8.0f, 2.0f)
                    curveTo(8.4098f, 2.0f, 8.8023f, 2.0739f, 9.1649f, 2.2092f)
                    curveTo(8.4803f, 1.6611f, 7.6118f, 1.3333f, 6.6667f, 1.3333f)
                    curveTo(4.4576f, 1.3333f, 2.6667f, 3.1242f, 2.6667f, 5.3333f)
                    curveTo(2.6667f, 7.5425f, 4.4576f, 9.3333f, 6.6667f, 9.3333f)
                    close()
                    moveTo(8.0f, 4.6667f)
                    curveTo(8.0f, 5.0349f, 7.7015f, 5.3333f, 7.3334f, 5.3333f)
                    curveTo(6.9652f, 5.3333f, 6.6667f, 5.0349f, 6.6667f, 4.6667f)
                    curveTo(6.6667f, 4.2985f, 6.9652f, 4.0f, 7.3334f, 4.0f)
                    curveTo(7.7015f, 4.0f, 8.0f, 4.2985f, 8.0f, 4.6667f)
                    close()
                    moveTo(8.6667f, 8.0f)
                    curveTo(9.0349f, 8.0f, 9.3334f, 7.7015f, 9.3334f, 7.3333f)
                    curveTo(9.3334f, 6.9651f, 9.0349f, 6.6667f, 8.6667f, 6.6667f)
                    curveTo(8.2985f, 6.6667f, 8.0f, 6.9651f, 8.0f, 7.3333f)
                    curveTo(8.0f, 7.7015f, 8.2985f, 8.0f, 8.6667f, 8.0f)
                    close()
                    moveTo(12.0f, 7.3333f)
                    curveTo(12.0f, 7.7015f, 11.7015f, 8.0f, 11.3334f, 8.0f)
                    curveTo(10.9652f, 8.0f, 10.6667f, 7.7015f, 10.6667f, 7.3333f)
                    curveTo(10.6667f, 6.9651f, 10.9652f, 6.6667f, 11.3334f, 6.6667f)
                    curveTo(11.7015f, 6.6667f, 12.0f, 6.9651f, 12.0f, 7.3333f)
                    close()
                    moveTo(12.6667f, 5.3333f)
                    curveTo(13.0349f, 5.3333f, 13.3334f, 5.0349f, 13.3334f, 4.6667f)
                    curveTo(13.3334f, 4.2985f, 13.0349f, 4.0f, 12.6667f, 4.0f)
                    curveTo(12.2985f, 4.0f, 12.0f, 4.2985f, 12.0f, 4.6667f)
                    curveTo(12.0f, 5.0349f, 12.2985f, 5.3333f, 12.6667f, 5.3333f)
                    close()
                    moveTo(10.6667f, 2.6667f)
                    curveTo(10.6667f, 3.0348f, 10.3682f, 3.3333f, 10.0f, 3.3333f)
                    curveTo(9.6318f, 3.3333f, 9.3334f, 3.0348f, 9.3334f, 2.6667f)
                    curveTo(9.3334f, 2.2985f, 9.6318f, 2.0f, 10.0f, 2.0f)
                    curveTo(10.3682f, 2.0f, 10.6667f, 2.2985f, 10.6667f, 2.6667f)
                    close()
                }
            }
        }
        .build()
        return _sg!!
    }

private var _sg: ImageVector? = null
