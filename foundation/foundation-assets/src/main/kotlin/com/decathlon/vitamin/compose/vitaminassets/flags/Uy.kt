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

public val FlagsGroup.Uy: ImageVector
    get() {
        if (_uy != null) {
            return _uy!!
        }
        _uy = Builder(name = "Uy", defaultWidth = 28.0.dp, defaultHeight = 20.0.dp, viewportWidth =
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
                path(fill = SolidColor(Color(0xFF0E4DC5)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(28.0f, 2.6667f)
                    horizontalLineTo(13.3333f)
                    verticalLineTo(5.3333f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(2.6667f)
                    close()
                    moveTo(13.3333f, 8.0f)
                    verticalLineTo(10.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(8.0f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(13.3333f, 13.3333f)
                    lineTo(0.0f, 13.3333f)
                    verticalLineTo(16.0f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(13.3333f)
                    horizontalLineTo(13.3333f)
                    close()
                    moveTo(0.0f, 20.0f)
                    verticalLineTo(18.6667f)
                    horizontalLineTo(28.0f)
                    verticalLineTo(20.0f)
                    horizontalLineTo(0.0f)
                    close()
                }
                path(fill = SolidColor(Color(0xFFFED443)), stroke = null, strokeLineWidth = 0.0f,
                        strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                        pathFillType = EvenOdd) {
                    moveTo(6.6667f, 9.3213f)
                    lineTo(5.7766f, 10.6499f)
                    lineTo(5.5511f, 9.0667f)
                    lineTo(4.1727f, 9.8776f)
                    lineTo(4.6565f, 8.3533f)
                    lineTo(3.0628f, 8.4858f)
                    lineTo(4.1601f, 7.3224f)
                    lineTo(2.6667f, 6.7502f)
                    lineTo(4.1601f, 6.1781f)
                    lineTo(3.0628f, 5.0147f)
                    lineTo(4.6565f, 5.1472f)
                    lineTo(4.1727f, 3.6229f)
                    lineTo(5.5511f, 4.4338f)
                    lineTo(5.7766f, 2.8505f)
                    lineTo(6.6667f, 4.1792f)
                    lineTo(7.5568f, 2.8505f)
                    lineTo(7.7822f, 4.4338f)
                    lineTo(9.1607f, 3.6229f)
                    lineTo(8.6768f, 5.1472f)
                    lineTo(10.2706f, 5.0147f)
                    lineTo(9.1733f, 6.1781f)
                    lineTo(10.6667f, 6.7502f)
                    lineTo(9.1733f, 7.3224f)
                    lineTo(10.2706f, 8.4858f)
                    lineTo(8.6768f, 8.3533f)
                    lineTo(9.1607f, 9.8776f)
                    lineTo(7.7822f, 9.0667f)
                    lineTo(7.5568f, 10.6499f)
                    lineTo(6.6667f, 9.3213f)
                    close()
                    moveTo(6.6667f, 9.2957f)
                    curveTo(8.0725f, 9.2957f, 9.2121f, 8.156f, 9.2121f, 6.7502f)
                    curveTo(9.2121f, 5.3444f, 8.0725f, 4.2048f, 6.6667f, 4.2048f)
                    curveTo(5.2609f, 4.2048f, 4.1212f, 5.3444f, 4.1212f, 6.7502f)
                    curveTo(4.1212f, 8.156f, 5.2609f, 9.2957f, 6.6667f, 9.2957f)
                    close()
                    moveTo(8.6667f, 6.6667f)
                    curveTo(8.6667f, 7.7712f, 7.7713f, 8.6667f, 6.6667f, 8.6667f)
                    curveTo(5.5621f, 8.6667f, 4.6667f, 7.7712f, 4.6667f, 6.6667f)
                    curveTo(4.6667f, 5.5621f, 5.5621f, 4.6667f, 6.6667f, 4.6667f)
                    curveTo(7.7713f, 4.6667f, 8.6667f, 5.5621f, 8.6667f, 6.6667f)
                    close()
                }
            }
        }
        .build()
        return _uy!!
    }

private var _uy: ImageVector? = null
