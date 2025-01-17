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

public val PaymentsGroup.VisaElectron: ImageVector
    get() {
        if (_visaElectron != null) {
            return _visaElectron!!
        }
        _visaElectron = Builder(name = "VisaElectron", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
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
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.7516f, 27.4332f)
                horizontalLineTo(21.8901f)
                lineTo(24.3054f, 13.4325f)
                horizontalLineTo(28.1667f)
                lineTo(25.7516f, 27.4332f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.7499f, 13.7748f)
                curveTo(38.9882f, 13.4915f, 37.7802f, 13.1787f, 36.2865f, 13.1787f)
                curveTo(32.4731f, 13.1787f, 29.7878f, 15.0851f, 29.7713f, 17.8106f)
                curveTo(29.7396f, 19.8215f, 31.6939f, 20.9384f, 33.1556f, 21.6089f)
                curveTo(34.6495f, 22.2941f, 35.1574f, 22.7413f, 35.1574f, 23.352f)
                curveTo(35.1422f, 24.29f, 33.9502f, 24.7223f, 32.8384f, 24.7223f)
                curveTo(31.2967f, 24.7223f, 30.4707f, 24.4994f, 29.2153f, 23.9776f)
                lineTo(28.7069f, 23.7539f)
                lineTo(28.1665f, 26.8967f)
                curveTo(29.0722f, 27.2835f, 30.7408f, 27.6268f, 32.4731f, 27.6419f)
                curveTo(36.5249f, 27.6419f, 39.1627f, 25.765f, 39.1939f, 22.8605f)
                curveTo(39.2093f, 21.2667f, 38.1774f, 20.0454f, 35.9526f, 19.0475f)
                curveTo(34.602f, 18.4069f, 33.7749f, 17.9749f, 33.7749f, 17.3195f)
                curveTo(33.7908f, 16.7236f, 34.4745f, 16.1133f, 35.9991f, 16.1133f)
                curveTo(37.2544f, 16.0834f, 38.1768f, 16.3663f, 38.8755f, 16.6494f)
                lineTo(39.2247f, 16.7981f)
                lineTo(39.7499f, 13.7748f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(46.6618f, 13.4325f)
                horizontalLineTo(49.6486f)
                lineTo(52.7639f, 27.433f)
                horizontalLineTo(49.1885f)
                curveTo(49.1885f, 27.433f, 48.8386f, 25.8244f, 48.7278f, 25.3328f)
                horizontalLineTo(43.7699f)
                curveTo(43.6266f, 25.705f, 42.9595f, 27.433f, 42.9595f, 27.433f)
                horizontalLineTo(38.9078f)
                lineTo(44.6435f, 14.5941f)
                curveTo(45.0409f, 13.6855f, 45.7407f, 13.4325f, 46.6618f, 13.4325f)
                close()
                moveTo(46.4238f, 18.556f)
                curveTo(46.4238f, 18.556f, 45.2001f, 21.6689f, 44.8821f, 22.4732f)
                horizontalLineTo(48.0918f)
                curveTo(47.933f, 21.7733f, 47.2017f, 18.4219f, 47.2017f, 18.4219f)
                lineTo(46.9319f, 17.2156f)
                curveTo(46.8182f, 17.5262f, 46.6539f, 17.9533f, 46.543f, 18.2414f)
                curveTo(46.4679f, 18.4366f, 46.4173f, 18.568f, 46.4238f, 18.556f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.1589f, 13.4325f)
                horizontalLineTo(11.3716f)
                curveTo(12.2138f, 13.462f, 12.8971f, 13.7152f, 13.1194f, 14.6094f)
                lineTo(14.4696f, 21.0422f)
                curveTo(14.4697f, 21.0426f, 14.4699f, 21.043f, 14.47f, 21.0434f)
                lineTo(14.8832f, 22.9796f)
                lineTo(18.6649f, 13.4325f)
                horizontalLineTo(22.7481f)
                lineTo(16.6785f, 27.4184f)
                horizontalLineTo(12.5951f)
                lineTo(9.1534f, 15.253f)
                curveTo(7.9659f, 14.6021f, 6.6106f, 14.0786f, 5.0953f, 13.7154f)
                lineTo(5.1589f, 13.4325f)
                close()
            }
            path(fill = SolidColor(Color(0xFF15195A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.36f, 35.07f)
                curveTo(33.3087f, 35.0793f, 33.2433f, 35.084f, 33.164f, 35.084f)
                curveTo(32.9447f, 35.084f, 32.7883f, 35.0187f, 32.695f, 34.888f)
                curveTo(32.6017f, 34.7573f, 32.555f, 34.566f, 32.555f, 34.314f)
                verticalLineTo(30.016f)
                horizontalLineTo(33.129f)
                verticalLineTo(34.356f)
                curveTo(33.129f, 34.4493f, 33.1453f, 34.5147f, 33.178f, 34.552f)
                curveTo(33.2107f, 34.5893f, 33.248f, 34.608f, 33.29f, 34.608f)
                horizontalLineTo(33.3425f)
                curveTo(33.3588f, 34.608f, 33.3833f, 34.6033f, 33.416f, 34.594f)
                lineTo(33.493f, 35.028f)
                curveTo(33.4557f, 35.0467f, 33.4113f, 35.0607f, 33.36f, 35.07f)
                close()
                moveTo(31.638f, 34.503f)
                verticalLineTo(35.0f)
                horizontalLineTo(28.922f)
                verticalLineTo(30.408f)
                horizontalLineTo(31.568f)
                verticalLineTo(30.898f)
                horizontalLineTo(29.503f)
                verticalLineTo(32.34f)
                horizontalLineTo(31.246f)
                verticalLineTo(32.837f)
                horizontalLineTo(29.503f)
                verticalLineTo(34.503f)
                horizontalLineTo(31.638f)
                close()
                moveTo(35.719f, 35.084f)
                curveTo(35.9523f, 35.084f, 36.16f, 35.049f, 36.342f, 34.979f)
                curveTo(36.524f, 34.909f, 36.6897f, 34.8273f, 36.839f, 34.734f)
                lineTo(36.636f, 34.356f)
                curveTo(36.51f, 34.4353f, 36.3782f, 34.4995f, 36.2405f, 34.5485f)
                curveTo(36.1028f, 34.5975f, 35.9523f, 34.622f, 35.789f, 34.622f)
                curveTo(35.4623f, 34.622f, 35.1975f, 34.5158f, 34.9945f, 34.3035f)
                curveTo(34.7915f, 34.0912f, 34.6783f, 33.803f, 34.655f, 33.439f)
                horizontalLineTo(36.951f)
                curveTo(36.9603f, 33.397f, 36.9662f, 33.3468f, 36.9685f, 33.2885f)
                curveTo(36.9708f, 33.2302f, 36.972f, 33.1707f, 36.972f, 33.11f)
                curveTo(36.972f, 32.8673f, 36.9417f, 32.648f, 36.881f, 32.452f)
                curveTo(36.8203f, 32.256f, 36.7328f, 32.088f, 36.6185f, 31.948f)
                curveTo(36.5042f, 31.808f, 36.3618f, 31.7007f, 36.1915f, 31.626f)
                curveTo(36.0212f, 31.5513f, 35.8287f, 31.514f, 35.614f, 31.514f)
                curveTo(35.418f, 31.514f, 35.229f, 31.5548f, 35.047f, 31.6365f)
                curveTo(34.865f, 31.7182f, 34.7028f, 31.836f, 34.5605f, 31.99f)
                curveTo(34.4182f, 32.144f, 34.3038f, 32.3318f, 34.2175f, 32.5535f)
                curveTo(34.1312f, 32.7752f, 34.088f, 33.026f, 34.088f, 33.306f)
                curveTo(34.088f, 33.586f, 34.13f, 33.8357f, 34.214f, 34.055f)
                curveTo(34.298f, 34.2743f, 34.4135f, 34.4598f, 34.5605f, 34.6115f)
                curveTo(34.7075f, 34.7632f, 34.8802f, 34.8798f, 35.0785f, 34.9615f)
                curveTo(35.2768f, 35.0432f, 35.4903f, 35.084f, 35.719f, 35.084f)
                close()
                moveTo(34.648f, 33.026f)
                horizontalLineTo(36.468f)
                curveTo(36.468f, 32.6807f, 36.3945f, 32.4182f, 36.2475f, 32.2385f)
                curveTo(36.1005f, 32.0588f, 35.894f, 31.969f, 35.628f, 31.969f)
                curveTo(35.5067f, 31.969f, 35.3912f, 31.9923f, 35.2815f, 32.039f)
                curveTo(35.1718f, 32.0857f, 35.0727f, 32.1545f, 34.984f, 32.2455f)
                curveTo(34.8953f, 32.3365f, 34.8218f, 32.4473f, 34.7635f, 32.578f)
                curveTo(34.7052f, 32.7087f, 34.6667f, 32.858f, 34.648f, 33.026f)
                close()
                moveTo(39.156f, 35.084f)
                curveTo(39.3613f, 35.084f, 39.5573f, 35.0455f, 39.744f, 34.9685f)
                curveTo(39.9307f, 34.8915f, 40.101f, 34.7853f, 40.255f, 34.65f)
                lineTo(40.003f, 34.265f)
                curveTo(39.8957f, 34.3583f, 39.7755f, 34.4388f, 39.6425f, 34.5065f)
                curveTo(39.5095f, 34.5742f, 39.3637f, 34.608f, 39.205f, 34.608f)
                curveTo(39.051f, 34.608f, 38.9087f, 34.5765f, 38.778f, 34.5135f)
                curveTo(38.6473f, 34.4505f, 38.5365f, 34.3618f, 38.4455f, 34.2475f)
                curveTo(38.3545f, 34.1332f, 38.2833f, 33.9967f, 38.232f, 33.838f)
                curveTo(38.1807f, 33.6793f, 38.155f, 33.502f, 38.155f, 33.306f)
                curveTo(38.155f, 33.11f, 38.1818f, 32.9315f, 38.2355f, 32.7705f)
                curveTo(38.2892f, 32.6095f, 38.3627f, 32.4707f, 38.456f, 32.354f)
                curveTo(38.5493f, 32.2373f, 38.6613f, 32.1475f, 38.792f, 32.0845f)
                curveTo(38.9227f, 32.0215f, 39.065f, 31.99f, 39.219f, 31.99f)
                curveTo(39.3543f, 31.99f, 39.4768f, 32.018f, 39.5865f, 32.074f)
                curveTo(39.6962f, 32.13f, 39.8f, 32.2023f, 39.898f, 32.291f)
                lineTo(40.192f, 31.913f)
                curveTo(40.0707f, 31.8057f, 39.9307f, 31.7123f, 39.772f, 31.633f)
                curveTo(39.6133f, 31.5537f, 39.422f, 31.514f, 39.198f, 31.514f)
                curveTo(38.9787f, 31.514f, 38.7698f, 31.5537f, 38.5715f, 31.633f)
                curveTo(38.3732f, 31.7123f, 38.1993f, 31.829f, 38.05f, 31.983f)
                curveTo(37.9007f, 32.137f, 37.7817f, 32.3248f, 37.693f, 32.5465f)
                curveTo(37.6043f, 32.7682f, 37.56f, 33.0213f, 37.56f, 33.306f)
                curveTo(37.56f, 33.586f, 37.6008f, 33.8368f, 37.6825f, 34.0585f)
                curveTo(37.7642f, 34.2802f, 37.8762f, 34.4668f, 38.0185f, 34.6185f)
                curveTo(38.1608f, 34.7702f, 38.33f, 34.8857f, 38.526f, 34.965f)
                curveTo(38.722f, 35.0443f, 38.932f, 35.084f, 39.156f, 35.084f)
                close()
                moveTo(42.3305f, 35.0455f)
                curveTo(42.2208f, 35.0712f, 42.1123f, 35.084f, 42.005f, 35.084f)
                curveTo(41.823f, 35.084f, 41.6702f, 35.056f, 41.5465f, 35.0f)
                curveTo(41.4228f, 34.944f, 41.3225f, 34.867f, 41.2455f, 34.769f)
                curveTo(41.1685f, 34.671f, 41.1137f, 34.552f, 41.081f, 34.412f)
                curveTo(41.0483f, 34.272f, 41.032f, 34.118f, 41.032f, 33.95f)
                verticalLineTo(32.067f)
                horizontalLineTo(40.528f)
                verticalLineTo(31.633f)
                lineTo(41.06f, 31.598f)
                lineTo(41.13f, 30.646f)
                horizontalLineTo(41.613f)
                verticalLineTo(31.598f)
                horizontalLineTo(42.53f)
                verticalLineTo(32.067f)
                horizontalLineTo(41.613f)
                verticalLineTo(33.957f)
                curveTo(41.613f, 34.167f, 41.6515f, 34.3292f, 41.7285f, 34.4435f)
                curveTo(41.8055f, 34.5578f, 41.942f, 34.615f, 42.138f, 34.615f)
                curveTo(42.1987f, 34.615f, 42.264f, 34.6057f, 42.334f, 34.587f)
                curveTo(42.404f, 34.5683f, 42.467f, 34.5473f, 42.523f, 34.524f)
                lineTo(42.635f, 34.958f)
                curveTo(42.5417f, 34.9907f, 42.4402f, 35.0198f, 42.3305f, 35.0455f)
                close()
                moveTo(43.874f, 35.0f)
                verticalLineTo(32.816f)
                curveTo(43.9907f, 32.5267f, 44.1272f, 32.3237f, 44.2835f, 32.207f)
                curveTo(44.4398f, 32.0903f, 44.5903f, 32.032f, 44.735f, 32.032f)
                curveTo(44.805f, 32.032f, 44.8633f, 32.0367f, 44.91f, 32.046f)
                curveTo(44.9567f, 32.0553f, 45.008f, 32.0693f, 45.064f, 32.088f)
                lineTo(45.176f, 31.584f)
                curveTo(45.0687f, 31.5373f, 44.9473f, 31.514f, 44.812f, 31.514f)
                curveTo(44.616f, 31.514f, 44.4352f, 31.577f, 44.2695f, 31.703f)
                curveTo(44.1038f, 31.829f, 43.9627f, 31.9993f, 43.846f, 32.214f)
                horizontalLineTo(43.825f)
                lineTo(43.776f, 31.598f)
                horizontalLineTo(43.3f)
                verticalLineTo(35.0f)
                horizontalLineTo(43.874f)
                close()
                moveTo(47.5805f, 34.965f)
                curveTo(47.3915f, 35.0443f, 47.192f, 35.084f, 46.982f, 35.084f)
                curveTo(46.772f, 35.084f, 46.5725f, 35.0443f, 46.3835f, 34.965f)
                curveTo(46.1945f, 34.8857f, 46.0277f, 34.7702f, 45.883f, 34.6185f)
                curveTo(45.7383f, 34.4668f, 45.6228f, 34.2802f, 45.5365f, 34.0585f)
                curveTo(45.4502f, 33.8368f, 45.407f, 33.586f, 45.407f, 33.306f)
                curveTo(45.407f, 33.0213f, 45.4502f, 32.7682f, 45.5365f, 32.5465f)
                curveTo(45.6228f, 32.3248f, 45.7383f, 32.137f, 45.883f, 31.983f)
                curveTo(46.0277f, 31.829f, 46.1945f, 31.7123f, 46.3835f, 31.633f)
                curveTo(46.5725f, 31.5537f, 46.772f, 31.514f, 46.982f, 31.514f)
                curveTo(47.192f, 31.514f, 47.3915f, 31.5537f, 47.5805f, 31.633f)
                curveTo(47.7695f, 31.7123f, 47.9363f, 31.829f, 48.081f, 31.983f)
                curveTo(48.2257f, 32.137f, 48.3412f, 32.3248f, 48.4275f, 32.5465f)
                curveTo(48.5138f, 32.7682f, 48.557f, 33.0213f, 48.557f, 33.306f)
                curveTo(48.557f, 33.586f, 48.5138f, 33.8368f, 48.4275f, 34.0585f)
                curveTo(48.3412f, 34.2802f, 48.2257f, 34.4668f, 48.081f, 34.6185f)
                curveTo(47.9363f, 34.7702f, 47.7695f, 34.8857f, 47.5805f, 34.965f)
                close()
                moveTo(46.982f, 34.608f)
                curveTo(46.8373f, 34.608f, 46.7043f, 34.5765f, 46.583f, 34.5135f)
                curveTo(46.4617f, 34.4505f, 46.3578f, 34.3618f, 46.2715f, 34.2475f)
                curveTo(46.1852f, 34.1332f, 46.1187f, 33.9967f, 46.072f, 33.838f)
                curveTo(46.0253f, 33.6793f, 46.002f, 33.502f, 46.002f, 33.306f)
                curveTo(46.002f, 33.11f, 46.0253f, 32.9315f, 46.072f, 32.7705f)
                curveTo(46.1187f, 32.6095f, 46.1852f, 32.4707f, 46.2715f, 32.354f)
                curveTo(46.3578f, 32.2373f, 46.4617f, 32.1475f, 46.583f, 32.0845f)
                curveTo(46.7043f, 32.0215f, 46.8373f, 31.99f, 46.982f, 31.99f)
                curveTo(47.1267f, 31.99f, 47.2597f, 32.0215f, 47.381f, 32.0845f)
                curveTo(47.5023f, 32.1475f, 47.6062f, 32.2373f, 47.6925f, 32.354f)
                curveTo(47.7788f, 32.4707f, 47.8453f, 32.6095f, 47.892f, 32.7705f)
                curveTo(47.9387f, 32.9315f, 47.962f, 33.11f, 47.962f, 33.306f)
                curveTo(47.962f, 33.502f, 47.9387f, 33.6793f, 47.892f, 33.838f)
                curveTo(47.8453f, 33.9967f, 47.7788f, 34.1332f, 47.6925f, 34.2475f)
                curveTo(47.6062f, 34.3618f, 47.5023f, 34.4505f, 47.381f, 34.5135f)
                curveTo(47.2597f, 34.5765f, 47.1267f, 34.608f, 46.982f, 34.608f)
                close()
                moveTo(50.027f, 32.536f)
                verticalLineTo(35.0f)
                horizontalLineTo(49.453f)
                verticalLineTo(31.598f)
                horizontalLineTo(49.929f)
                lineTo(49.978f, 32.088f)
                horizontalLineTo(49.999f)
                curveTo(50.1623f, 31.9247f, 50.3338f, 31.7882f, 50.5135f, 31.6785f)
                curveTo(50.6932f, 31.5688f, 50.902f, 31.514f, 51.14f, 31.514f)
                curveTo(51.4993f, 31.514f, 51.7618f, 31.626f, 51.9275f, 31.85f)
                curveTo(52.0932f, 32.074f, 52.176f, 32.4053f, 52.176f, 32.844f)
                verticalLineTo(35.0f)
                horizontalLineTo(51.602f)
                verticalLineTo(32.921f)
                curveTo(51.602f, 32.599f, 51.5507f, 32.3668f, 51.448f, 32.2245f)
                curveTo(51.3453f, 32.0822f, 51.182f, 32.011f, 50.958f, 32.011f)
                curveTo(50.7807f, 32.011f, 50.6243f, 32.0553f, 50.489f, 32.144f)
                curveTo(50.3537f, 32.2327f, 50.1997f, 32.3633f, 50.027f, 32.536f)
                close()
            }
        }
        .build()
        return _visaElectron!!
    }

private var _visaElectron: ImageVector? = null
