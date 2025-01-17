package com.decathlon.vitamin.compose.vitaminassets.payments

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
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.decathlon.vitamin.compose.vitaminassets.PaymentsGroup

public val PaymentsGroup.WebMoney: ImageVector
    get() {
        if (_webMoney != null) {
            return _webMoney!!
        }
        _webMoney = Builder(name = "WebMoney", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
                viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0xFFF3F3F3)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 0.5f)
                lineTo(54.0f, 0.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 57.5f, 4.0f)
                lineTo(57.5f, 36.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 54.0f, 39.5f)
                lineTo(4.0f, 39.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 0.5f, 36.0f)
                lineTo(0.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 4.0f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0068A3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.9712f, 28.1016f)
                curveTo(20.2771f, 27.9429f, 20.7971f, 27.7346f, 21.3479f, 27.7346f)
                curveTo(22.6122f, 27.7346f, 23.2956f, 28.5873f, 23.2956f, 30.1741f)
                curveTo(23.2956f, 32.0277f, 22.3781f, 32.93f, 20.8994f, 32.93f)
                curveTo(20.3586f, 32.93f, 19.5225f, 32.7615f, 18.9105f, 32.4438f)
                verticalLineTo(25.5238f)
                lineTo(19.9712f, 25.2759f)
                verticalLineTo(28.1016f)
                close()
                moveTo(19.9611f, 32.0771f)
                curveTo(20.2872f, 32.216f, 20.6443f, 32.2356f, 20.8994f, 32.2356f)
                curveTo(21.654f, 32.2356f, 22.225f, 31.7797f, 22.225f, 30.1741f)
                curveTo(22.225f, 28.9145f, 21.7559f, 28.5081f, 21.0727f, 28.5081f)
                curveTo(20.6645f, 28.5081f, 20.3691f, 28.6171f, 19.9611f, 28.8353f)
                verticalLineTo(32.0771f)
                close()
                moveTo(9.0996f, 27.8633f)
                horizontalLineTo(9.171f)
                lineTo(10.5576f, 32.811f)
                horizontalLineTo(11.6588f)
                lineTo(13.3111f, 25.7812f)
                horizontalLineTo(12.1179f)
                lineTo(11.0777f, 31.0263f)
                horizontalLineTo(11.0067f)
                lineTo(9.5889f, 25.7812f)
                horizontalLineTo(8.6813f)
                lineTo(7.3557f, 31.0263f)
                horizontalLineTo(7.2842f)
                lineTo(6.142f, 25.7812f)
                horizontalLineTo(5.0f)
                lineTo(6.6521f, 32.811f)
                horizontalLineTo(7.7532f)
                lineTo(9.0996f, 27.8633f)
                close()
                moveTo(17.83f, 32.4736f)
                verticalLineTo(31.7201f)
                curveTo(17.2691f, 32.0473f, 16.7594f, 32.2356f, 16.2088f, 32.2356f)
                curveTo(15.1583f, 32.2356f, 14.6588f, 31.7099f, 14.6588f, 30.5204f)
                horizontalLineTo(17.9829f)
                verticalLineTo(30.1537f)
                curveTo(17.9829f, 28.5379f, 17.1977f, 27.7346f, 15.9233f, 27.7346f)
                curveTo(14.3936f, 27.7346f, 13.6083f, 28.8253f, 13.6083f, 30.3321f)
                curveTo(13.6083f, 31.8988f, 14.3119f, 32.93f, 16.025f, 32.93f)
                curveTo(16.7594f, 32.93f, 17.3712f, 32.7317f, 17.83f, 32.4736f)
                close()
                moveTo(17.0141f, 29.8563f)
                horizontalLineTo(14.6793f)
                curveTo(14.7911f, 28.8651f, 15.2702f, 28.399f, 15.8926f, 28.399f)
                curveTo(16.4432f, 28.399f, 16.9636f, 28.8151f, 17.0141f, 29.8563f)
                close()
                moveTo(27.9867f, 31.3236f)
                horizontalLineTo(27.9355f)
                lineTo(25.6513f, 25.7812f)
                horizontalLineTo(24.4174f)
                verticalLineTo(32.811f)
                horizontalLineTo(25.3353f)
                verticalLineTo(27.8339f)
                horizontalLineTo(25.4269f)
                lineTo(27.5075f, 32.811f)
                horizontalLineTo(28.1599f)
                lineTo(30.2403f, 27.7148f)
                horizontalLineTo(30.3323f)
                verticalLineTo(32.811f)
                horizontalLineTo(31.4336f)
                verticalLineTo(25.7812f)
                horizontalLineTo(30.1689f)
                lineTo(27.9867f, 31.3236f)
                close()
                moveTo(32.5552f, 30.3321f)
                curveTo(32.5552f, 28.597f, 33.5342f, 27.7346f, 34.8802f, 27.7346f)
                curveTo(36.2264f, 27.7346f, 37.2056f, 28.597f, 37.2056f, 30.3321f)
                curveTo(37.2056f, 32.0277f, 36.2775f, 32.93f, 34.8802f, 32.93f)
                curveTo(33.483f, 32.93f, 32.5552f, 32.0277f, 32.5552f, 30.3321f)
                close()
                moveTo(36.1346f, 30.3321f)
                curveTo(36.1346f, 28.9938f, 35.5735f, 28.4288f, 34.8802f, 28.4288f)
                curveTo(34.2071f, 28.4288f, 33.6258f, 28.9938f, 33.6258f, 30.3321f)
                curveTo(33.6258f, 31.6908f, 34.1564f, 32.2356f, 34.8802f, 32.2356f)
                curveTo(35.6042f, 32.2356f, 36.1346f, 31.6908f, 36.1346f, 30.3321f)
                close()
                moveTo(40.7742f, 27.7346f)
                curveTo(39.602f, 27.7346f, 38.6329f, 28.2005f, 38.1741f, 28.4683f)
                verticalLineTo(32.811f)
                horizontalLineTo(39.2348f)
                verticalLineTo(28.8847f)
                curveTo(39.5508f, 28.7066f, 40.071f, 28.5277f, 40.4791f, 28.5277f)
                curveTo(40.9991f, 28.5277f, 41.3964f, 28.6666f, 41.3964f, 29.4499f)
                verticalLineTo(32.811f)
                horizontalLineTo(42.4569f)
                verticalLineTo(29.2216f)
                curveTo(42.4569f, 28.2005f, 41.9984f, 27.7346f, 40.7742f, 27.7346f)
                close()
                moveTo(47.6269f, 31.7201f)
                verticalLineTo(32.4736f)
                curveTo(47.1682f, 32.7317f, 46.5567f, 32.93f, 45.822f, 32.93f)
                curveTo(44.1092f, 32.93f, 43.4054f, 31.8988f, 43.4054f, 30.3321f)
                curveTo(43.4054f, 28.8253f, 44.1909f, 27.7346f, 45.7203f, 27.7346f)
                curveTo(46.9953f, 27.7346f, 47.7807f, 28.5379f, 47.7807f, 30.1537f)
                verticalLineTo(30.5204f)
                horizontalLineTo(44.4562f)
                curveTo(44.4562f, 31.7099f, 44.9558f, 32.2356f, 46.006f, 32.2356f)
                curveTo(46.5567f, 32.2356f, 47.0665f, 32.0473f, 47.6269f, 31.7201f)
                close()
                moveTo(44.4764f, 29.8563f)
                horizontalLineTo(46.8115f)
                curveTo(46.7608f, 28.8151f, 46.2403f, 28.399f, 45.6897f, 28.399f)
                curveTo(45.0674f, 28.399f, 44.5888f, 28.8651f, 44.4764f, 29.8563f)
                close()
                moveTo(52.8386f, 27.9031f)
                horizontalLineTo(51.7474f)
                lineTo(50.5844f, 31.5514f)
                horizontalLineTo(50.5236f)
                lineTo(49.2184f, 27.9031f)
                horizontalLineTo(48.0966f)
                lineTo(50.0545f, 32.8604f)
                curveTo(49.8094f, 33.5939f, 49.3816f, 34.1297f, 48.6881f, 34.1297f)
                verticalLineTo(34.9423f)
                curveTo(49.8603f, 34.9423f, 50.4825f, 34.2288f, 50.9926f, 32.8604f)
                lineTo(52.8386f, 27.9031f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0068A3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.2356f, 5.0f)
                curveTo(29.6389f, 5.0f, 30.968f, 5.3177f, 32.1517f, 5.8818f)
                curveTo(32.3376f, 5.9676f, 32.5231f, 6.0619f, 32.709f, 6.1661f)
                lineTo(31.8862f, 6.882f)
                lineTo(30.65f, 5.6393f)
                lineTo(28.5636f, 7.4486f)
                lineTo(27.3244f, 6.1336f)
                lineTo(23.4378f, 9.5396f)
                lineTo(25.9295f, 12.2093f)
                lineTo(24.9503f, 13.0466f)
                lineTo(27.4045f, 15.7203f)
                lineTo(26.4311f, 16.5556f)
                lineTo(29.938f, 20.3507f)
                lineTo(32.0197f, 18.4875f)
                lineTo(33.8195f, 20.4841f)
                curveTo(33.4615f, 20.7547f, 33.0715f, 21.0093f, 32.6419f, 21.2446f)
                curveTo(31.3404f, 21.9662f, 29.8362f, 22.3793f, 28.2356f, 22.3793f)
                curveTo(23.3128f, 22.3793f, 19.2979f, 18.4754f, 19.2979f, 13.6899f)
                curveTo(19.2979f, 8.9034f, 23.3128f, 5.0f, 28.2356f, 5.0f)
                close()
                moveTo(26.6067f, 13.1406f)
                lineTo(28.7321f, 11.2798f)
                lineTo(30.6459f, 13.3466f)
                lineTo(28.5207f, 15.2067f)
                lineTo(26.6067f, 13.1406f)
                close()
                moveTo(30.2435f, 14.8507f)
                lineTo(28.118f, 16.711f)
                lineTo(30.0321f, 18.7778f)
                lineTo(32.1575f, 16.917f)
                lineTo(30.2435f, 14.8507f)
                close()
                moveTo(25.086f, 9.6118f)
                lineTo(27.2113f, 7.7516f)
                lineTo(29.1246f, 9.8179f)
                lineTo(26.9992f, 11.6781f)
                lineTo(25.086f, 9.6118f)
                close()
                moveTo(30.58f, 7.2154f)
                lineTo(28.986f, 8.6104f)
                lineTo(30.4212f, 10.1607f)
                lineTo(32.0152f, 8.7651f)
                lineTo(30.58f, 7.2154f)
                close()
                moveTo(31.8182f, 15.0017f)
                lineTo(33.4128f, 13.6061f)
                lineTo(34.8479f, 15.1562f)
                lineTo(33.2539f, 16.5514f)
                lineTo(31.8182f, 15.0017f)
                close()
                moveTo(34.8141f, 16.7362f)
                lineTo(33.2205f, 18.132f)
                lineTo(34.6556f, 19.6812f)
                lineTo(36.2496f, 18.286f)
                lineTo(34.8141f, 16.7362f)
                close()
                moveTo(33.8626f, 10.9576f)
                lineTo(34.9253f, 10.0274f)
                lineTo(35.8819f, 11.0606f)
                lineTo(34.8197f, 11.9906f)
                lineTo(33.8626f, 10.9576f)
                close()
                moveTo(33.5675f, 6.9578f)
                lineTo(32.5048f, 7.8878f)
                lineTo(33.4615f, 8.921f)
                lineTo(34.5243f, 7.9909f)
                lineTo(33.5675f, 6.9578f)
                close()
                moveTo(35.2212f, 14.0273f)
                lineTo(36.2839f, 13.0971f)
                lineTo(37.2407f, 14.13f)
                lineTo(36.178f, 15.0603f)
                lineTo(35.2212f, 14.0273f)
                close()
                moveTo(32.0492f, 10.3313f)
                lineTo(30.4554f, 11.7271f)
                lineTo(31.8909f, 13.2763f)
                lineTo(33.4844f, 11.881f)
                lineTo(32.0492f, 10.3313f)
                close()
            }
        }
        .build()
        return _webMoney!!
    }

private var _webMoney: ImageVector? = null
