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

public val PaymentsGroup.PostEfinance: ImageVector
    get() {
        if (_postEfinance != null) {
            return _postEfinance!!
        }
        _postEfinance = Builder(name = "PostEfinance", defaultWidth = 58.0.dp, defaultHeight =
                40.0.dp, viewportWidth = 58.0f, viewportHeight = 40.0f).apply {
            path(fill = SolidColor(Color(0xFFFFCC00)), stroke = SolidColor(Color(0xFFF3F3F3)),
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
            path(fill = SolidColor(Color(0xFFFFE666)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(57.0f, 35.5638f)
                verticalLineTo(4.234f)
                curveTo(57.1532f, 2.355f, 55.5842f, 0.8013f, 53.7614f, 0.9999f)
                horizontalLineTo(41.0096f)
                curveTo(42.9325f, 6.9627f, 44.2482f, 19.4946f, 36.8602f, 28.6914f)
                curveTo(32.2048f, 34.5531f, 24.8599f, 38.0904f, 15.043f, 38.9999f)
                horizontalLineTo(17.7727f)
                curveTo(26.2739f, 37.6861f, 32.812f, 34.25f, 37.1638f, 28.8936f)
                curveTo(43.7422f, 20.8085f, 43.5398f, 10.0957f, 42.1229f, 3.5265f)
                curveTo(43.8434f, 9.7925f, 44.653f, 20.5053f, 38.5807f, 28.9946f)
                curveTo(35.3422f, 33.5425f, 30.5855f, 36.8776f, 24.3108f, 38.9999f)
                horizontalLineTo(26.0313f)
                curveTo(31.5976f, 36.8776f, 35.9494f, 33.6436f, 38.9855f, 29.3989f)
                curveTo(42.0217f, 25.1542f, 43.641f, 19.7978f, 43.8434f, 13.8351f)
                curveTo(43.9446f, 11.6117f, 43.7422f, 9.5904f, 43.5398f, 7.8723f)
                curveTo(44.7542f, 13.9361f, 44.653f, 22.1223f, 40.2f, 29.1968f)
                curveTo(37.5687f, 33.3404f, 33.9253f, 36.5744f, 28.9663f, 38.9999f)
                horizontalLineTo(30.6867f)
                curveTo(35.0385f, 36.6755f, 38.3783f, 33.5425f, 40.8072f, 29.601f)
                curveTo(44.4506f, 23.7393f, 45.2602f, 17.0691f, 44.7542f, 11.4095f)
                curveTo(45.4626f, 16.867f, 45.0578f, 23.234f, 41.9205f, 29.1968f)
                curveTo(39.7952f, 33.1382f, 36.6599f, 36.4734f, 32.6118f, 38.9999f)
                horizontalLineTo(34.4108f)
                curveTo(37.953f, 36.4734f, 40.8072f, 33.2393f, 42.8313f, 29.601f)
                curveTo(44.9566f, 25.6595f, 45.9687f, 21.4148f, 46.0699f, 17.4734f)
                curveTo(46.0699f, 21.3138f, 45.3614f, 25.2553f, 43.5398f, 29.0957f)
                curveTo(41.7181f, 32.9361f, 39.0758f, 36.2712f, 35.5336f, 38.9999f)
                horizontalLineTo(37.4013f)
                curveTo(40.5387f, 36.3723f, 43.0337f, 33.1382f, 44.653f, 29.601f)
                curveTo(45.5638f, 27.6808f, 46.1711f, 25.7606f, 46.6771f, 23.6382f)
                curveTo(46.3735f, 25.3563f, 45.8675f, 27.1755f, 45.2602f, 28.8936f)
                curveTo(43.7422f, 32.6329f, 41.4253f, 36.1702f, 38.1867f, 38.9999f)
                horizontalLineTo(40.4458f)
                curveTo(43.1783f, 36.1702f, 45.3614f, 32.9361f, 46.7783f, 29.4999f)
                curveTo(45.5638f, 32.9361f, 43.5398f, 36.1702f, 40.8072f, 38.9999f)
                horizontalLineTo(53.6424f)
                curveTo(56.0184f, 39.1473f, 57.1591f, 37.2535f, 57.0f, 35.5638f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFFFFF)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(46.4453f, 24.5012f)
                lineTo(46.9654f, 22.0244f)
                lineTo(4.5206f, 22.0244f)
                lineTo(4.0f, 24.5012f)
                lineTo(46.4453f, 24.5012f)
                close()
            }
            path(fill = SolidColor(Color(0xFFED1C24)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.5576f, 18.6487f)
                curveTo(51.5576f, 18.6487f, 52.1268f, 16.0246f, 52.1347f, 16.0f)
                horizontalLineTo(48.5179f)
                curveTo(48.5179f, 16.0166f, 47.7701f, 19.4823f, 47.7701f, 19.4988f)
                curveTo(47.778f, 19.4988f, 48.6969f, 19.4988f, 48.6969f, 19.4988f)
                curveTo(48.7047f, 19.4988f, 49.2657f, 16.8828f, 49.2657f, 16.8828f)
                horizontalLineTo(51.0211f)
                curveTo(51.0211f, 16.8828f, 50.4684f, 19.5068f, 50.4523f, 19.5234f)
                curveTo(50.4684f, 19.5234f, 53.1262f, 19.5234f, 53.1262f, 19.5234f)
                lineTo(52.7768f, 21.1417f)
                curveTo(52.7768f, 21.1417f, 50.1273f, 21.1417f, 50.1187f, 21.1417f)
                curveTo(50.1187f, 21.1581f, 49.5824f, 23.6103f, 49.5824f, 23.6103f)
                curveTo(49.5824f, 23.6103f, 47.5911f, 23.6103f, 47.575f, 23.6103f)
                curveTo(47.575f, 23.6184f, 47.3961f, 24.4931f, 47.3882f, 24.5012f)
                horizontalLineTo(50.3463f)
                curveTo(50.3463f, 24.4931f, 50.875f, 22.0244f, 50.875f, 22.0244f)
                curveTo(50.875f, 22.0244f, 53.5164f, 22.0244f, 53.5328f, 22.0244f)
                curveTo(53.5328f, 22.0162f, 54.2319f, 18.6648f, 54.2319f, 18.6487f)
                horizontalLineTo(51.5576f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6646f, 22.8502f)
                curveTo(12.9408f, 22.8502f, 13.8022f, 21.9182f, 13.9973f, 20.7003f)
                curveTo(14.2006f, 19.4822f, 13.5261f, 18.5502f, 12.2498f, 18.5502f)
                curveTo(10.9738f, 18.5502f, 10.1122f, 19.4822f, 9.9171f, 20.7003f)
                curveTo(9.714f, 21.9182f, 10.3886f, 22.8502f, 11.6646f, 22.8502f)
                close()
                moveTo(46.0451f, 21.7058f)
                lineTo(45.8336f, 22.6786f)
                curveTo(45.5247f, 22.7764f, 45.151f, 22.8502f, 44.6795f, 22.8502f)
                curveTo(43.5173f, 22.8502f, 42.7695f, 22.1879f, 42.7695f, 21.0601f)
                curveTo(42.7695f, 19.7441f, 43.6472f, 18.5502f, 45.0941f, 18.5502f)
                curveTo(46.2076f, 18.5502f, 46.7278f, 19.2861f, 46.7278f, 20.1854f)
                curveTo(46.7278f, 20.4796f, 46.6708f, 20.7981f, 46.5735f, 21.117f)
                horizontalLineTo(43.8913f)
                curveTo(43.9157f, 21.7466f, 44.3706f, 21.9262f, 44.8911f, 21.9262f)
                curveTo(45.3378f, 21.9262f, 45.6875f, 21.8282f, 46.0451f, 21.7058f)
                close()
                moveTo(45.655f, 20.12f)
                curveTo(45.655f, 19.6867f, 45.3947f, 19.4253f, 45.0128f, 19.4253f)
                curveTo(44.5249f, 19.4253f, 44.1594f, 19.7849f, 43.9887f, 20.3323f)
                horizontalLineTo(45.6389f)
                lineTo(45.6417f, 20.3062f)
                verticalLineTo(20.3061f)
                curveTo(45.6486f, 20.2429f, 45.655f, 20.1846f, 45.655f, 20.12f)
                close()
                moveTo(41.4204f, 21.8528f)
                curveTo(40.892f, 21.8528f, 40.5344f, 21.624f, 40.5344f, 20.9619f)
                curveTo(40.5344f, 20.1854f, 41.022f, 19.5395f, 41.7944f, 19.5395f)
                curveTo(42.0382f, 19.5395f, 42.3145f, 19.613f, 42.5909f, 19.7195f)
                lineTo(42.786f, 18.7876f)
                curveTo(42.4688f, 18.6732f, 42.0947f, 18.5914f, 41.721f, 18.5914f)
                curveTo(40.4449f, 18.5914f, 39.3557f, 19.5477f, 39.3557f, 21.0193f)
                curveTo(39.3557f, 22.2289f, 40.0956f, 22.8009f, 41.1601f, 22.8009f)
                curveTo(41.5177f, 22.8009f, 41.8184f, 22.7356f, 42.0382f, 22.6459f)
                lineTo(42.2494f, 21.6892f)
                curveTo(42.0056f, 21.7792f, 41.7372f, 21.8528f, 41.4204f, 21.8528f)
                close()
                moveTo(36.2511f, 20.6593f)
                lineTo(35.8041f, 22.7275f)
                horizontalLineTo(34.6417f)
                lineTo(35.5115f, 18.6732f)
                horizontalLineTo(36.5923f)
                lineTo(36.4867f, 19.1553f)
                curveTo(36.877f, 18.7383f, 37.332f, 18.5502f, 37.8036f, 18.5502f)
                curveTo(38.657f, 18.5502f, 39.2014f, 19.1717f, 38.9494f, 20.3569f)
                lineTo(38.4375f, 22.7275f)
                horizontalLineTo(37.2751f)
                lineTo(37.7628f, 20.4142f)
                curveTo(37.8687f, 19.9484f, 37.8036f, 19.5395f, 37.259f, 19.5395f)
                curveTo(36.8365f, 19.5395f, 36.4298f, 19.8256f, 36.2511f, 20.6593f)
                close()
                moveTo(31.6265f, 21.5586f)
                curveTo(31.6265f, 21.1501f, 31.9841f, 20.9208f, 32.5772f, 20.9208f)
                curveTo(32.6913f, 20.9208f, 32.9429f, 20.9293f, 33.1708f, 20.9619f)
                lineTo(33.1218f, 21.1908f)
                curveTo(32.9834f, 21.6728f, 32.5937f, 22.0002f, 32.1306f, 22.0002f)
                curveTo(31.7971f, 22.0002f, 31.6265f, 21.8366f, 31.6265f, 21.5586f)
                close()
                moveTo(31.4884f, 18.7548f)
                curveTo(31.6671f, 18.6976f, 32.2117f, 18.5748f, 32.7482f, 18.5748f)
                curveTo(34.0892f, 18.5748f, 34.4709f, 19.1879f, 34.4709f, 19.883f)
                curveTo(34.4709f, 20.0546f, 34.4548f, 20.2342f, 34.4143f, 20.4062f)
                lineTo(33.9102f, 22.7275f)
                horizontalLineTo(32.878f)
                lineTo(32.9675f, 22.3025f)
                curveTo(32.6913f, 22.6294f, 32.2686f, 22.8256f, 31.7727f, 22.8256f)
                curveTo(31.0738f, 22.8256f, 30.5376f, 22.4086f, 30.5376f, 21.714f)
                curveTo(30.5376f, 20.6511f, 31.4639f, 20.2018f, 32.6178f, 20.2018f)
                curveTo(32.7482f, 20.2018f, 33.0244f, 20.2262f, 33.3169f, 20.2588f)
                lineTo(33.3334f, 20.1769f)
                curveTo(33.3495f, 20.1118f, 33.3495f, 20.0462f, 33.3495f, 19.9892f)
                curveTo(33.3495f, 19.6703f, 33.13f, 19.4822f, 32.5206f, 19.4822f)
                curveTo(32.0652f, 19.4822f, 31.553f, 19.6215f, 31.2933f, 19.6949f)
                lineTo(31.4884f, 18.7548f)
                close()
                moveTo(27.1156f, 22.7275f)
                lineTo(27.5625f, 20.6593f)
                curveTo(27.7415f, 19.8256f, 28.1475f, 19.5395f, 28.5707f, 19.5395f)
                curveTo(29.1153f, 19.5395f, 29.1801f, 19.9484f, 29.0747f, 20.4142f)
                lineTo(28.5867f, 22.7275f)
                horizontalLineTo(29.749f)
                lineTo(30.2607f, 20.3569f)
                curveTo(30.5128f, 19.1717f, 29.9685f, 18.5502f, 29.1153f, 18.5502f)
                curveTo(28.6432f, 18.5502f, 28.1881f, 18.7383f, 27.7981f, 19.1553f)
                lineTo(27.9037f, 18.6732f)
                horizontalLineTo(26.8228f)
                lineTo(25.9531f, 22.7275f)
                horizontalLineTo(27.1156f)
                close()
                moveTo(25.6363f, 18.2071f)
                curveTo(25.2787f, 18.2071f, 25.0103f, 17.9209f, 25.035f, 17.5532f)
                curveTo(25.0592f, 17.1854f, 25.3437f, 16.8992f, 25.7418f, 16.8992f)
                curveTo(26.0995f, 16.8992f, 26.3677f, 17.1854f, 26.3431f, 17.5532f)
                curveTo(26.319f, 17.9209f, 26.0345f, 18.2071f, 25.6363f, 18.2071f)
                close()
                moveTo(24.8721f, 18.6732f)
                lineTo(24.0025f, 22.7275f)
                horizontalLineTo(25.1568f)
                lineTo(26.0265f, 18.6732f)
                horizontalLineTo(24.8721f)
                close()
                moveTo(22.0434f, 20.6103f)
                lineTo(21.5883f, 22.7275f)
                horizontalLineTo(20.402f)
                lineTo(21.5563f, 17.2342f)
                lineTo(24.6041f, 17.2342f)
                lineTo(24.3766f, 18.2725f)
                lineTo(22.5316f, 18.2725f)
                lineTo(22.2631f, 19.5722f)
                horizontalLineTo(24.0109f)
                lineTo(23.7994f, 20.6103f)
                horizontalLineTo(22.0434f)
                close()
                moveTo(20.4424f, 19.5641f)
                lineTo(20.6295f, 18.6732f)
                horizontalLineTo(19.3862f)
                lineTo(19.6297f, 17.5452f)
                lineTo(18.4186f, 17.8147f)
                lineTo(17.6627f, 21.2804f)
                curveTo(17.4517f, 22.2617f, 17.9878f, 22.8009f, 18.963f, 22.8009f)
                curveTo(19.1667f, 22.8009f, 19.5077f, 22.7602f, 19.7518f, 22.6786f)
                lineTo(19.9469f, 21.7874f)
                curveTo(19.7518f, 21.8366f, 19.5077f, 21.8855f, 19.2967f, 21.8855f)
                curveTo(18.963f, 21.8855f, 18.7274f, 21.7712f, 18.809f, 21.3623f)
                lineTo(19.1911f, 19.5641f)
                horizontalLineTo(20.4424f)
                close()
                moveTo(15.3059f, 21.9182f)
                curveTo(15.6391f, 21.9182f, 16.0372f, 21.8612f, 16.0372f, 21.534f)
                curveTo(16.0372f, 21.3065f, 15.7913f, 21.204f, 15.4979f, 21.0817f)
                curveTo(15.0639f, 20.9008f, 14.5258f, 20.6765f, 14.5258f, 19.9403f)
                curveTo(14.5258f, 19.0983f, 15.2085f, 18.5914f, 16.338f, 18.5914f)
                curveTo(16.712f, 18.5914f, 17.1266f, 18.6486f, 17.476f, 18.7468f)
                lineTo(17.2809f, 19.6703f)
                lineTo(17.2778f, 19.6694f)
                curveTo(17.1043f, 19.6197f, 16.5957f, 19.4741f, 16.2322f, 19.4741f)
                curveTo(15.8505f, 19.4741f, 15.6067f, 19.5641f, 15.6067f, 19.8177f)
                curveTo(15.6067f, 20.0433f, 15.8488f, 20.1433f, 16.1392f, 20.2633f)
                curveTo(16.5745f, 20.4431f, 17.1185f, 20.6678f, 17.1185f, 21.4278f)
                curveTo(17.1185f, 22.4086f, 16.2728f, 22.8009f, 15.2327f, 22.8009f)
                curveTo(14.7939f, 22.8009f, 14.3306f, 22.7275f, 13.9647f, 22.6375f)
                lineTo(14.1602f, 21.722f)
                curveTo(14.4119f, 21.804f, 14.8831f, 21.9182f, 15.3059f, 21.9182f)
                close()
                moveTo(11.1118f, 20.7003f)
                curveTo(10.9414f, 21.5423f, 11.307f, 21.9102f, 11.7706f, 21.9102f)
                curveTo(12.2336f, 21.9102f, 12.6317f, 21.534f, 12.8025f, 20.7003f)
                curveTo(12.9815f, 19.8664f, 12.6157f, 19.4907f, 12.1523f, 19.4907f)
                curveTo(11.689f, 19.4907f, 11.2824f, 19.8584f, 11.1118f, 20.7003f)
                close()
                moveTo(6.8692f, 21.0516f)
                horizontalLineTo(7.3814f)
                curveTo(9.0151f, 21.0516f, 9.9256f, 20.2426f, 9.9256f, 18.8937f)
                curveTo(9.9256f, 17.8883f, 9.2179f, 17.2342f, 8.007f, 17.2342f)
                horizontalLineTo(6.4956f)
                lineTo(5.3414f, 22.7275f)
                horizontalLineTo(6.5117f)
                lineTo(6.8692f, 21.0516f)
                close()
                moveTo(7.4544f, 18.2398f)
                lineTo(7.0724f, 20.0462f)
                horizontalLineTo(7.5604f)
                curveTo(8.3241f, 20.0462f, 8.7384f, 19.6377f, 8.7384f, 18.9756f)
                curveTo(8.7384f, 18.4606f, 8.4786f, 18.2398f, 7.9421f, 18.2398f)
                horizontalLineTo(7.4544f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(52.7038f, 32.8065f)
                lineTo(52.4922f, 33.7794f)
                curveTo(52.1833f, 33.8771f, 51.8096f, 33.9509f, 51.3382f, 33.9509f)
                curveTo(50.1759f, 33.9509f, 49.4281f, 33.2886f, 49.4281f, 32.1608f)
                curveTo(49.4281f, 30.8448f, 50.3058f, 29.6509f, 51.7527f, 29.6509f)
                curveTo(52.8663f, 29.6509f, 53.3864f, 30.3868f, 53.3864f, 31.2861f)
                curveTo(53.3864f, 31.5803f, 53.3295f, 31.8988f, 53.2321f, 32.2177f)
                horizontalLineTo(50.55f)
                curveTo(50.5743f, 32.8473f, 51.0293f, 33.0269f, 51.5497f, 33.0269f)
                curveTo(51.9965f, 33.0269f, 52.3462f, 32.9289f, 52.7038f, 32.8065f)
                close()
                moveTo(52.3136f, 31.2207f)
                curveTo(52.3136f, 30.7874f, 52.0534f, 30.526f, 51.6714f, 30.526f)
                curveTo(51.1835f, 30.526f, 50.8181f, 30.8856f, 50.6473f, 31.4331f)
                horizontalLineTo(52.2975f)
                lineTo(52.3003f, 31.4068f)
                curveTo(52.3072f, 31.3436f, 52.3136f, 31.2852f, 52.3136f, 31.2207f)
                close()
                moveTo(48.079f, 32.9535f)
                curveTo(47.5507f, 32.9535f, 47.1931f, 32.7247f, 47.1931f, 32.0626f)
                curveTo(47.1931f, 31.2861f, 47.6806f, 30.6402f, 48.4531f, 30.6402f)
                curveTo(48.6968f, 30.6402f, 48.9732f, 30.7137f, 49.2495f, 30.8202f)
                lineTo(49.4446f, 29.8883f)
                curveTo(49.1275f, 29.774f, 48.7534f, 29.6921f, 48.3797f, 29.6921f)
                curveTo(47.1036f, 29.6921f, 46.0143f, 30.6484f, 46.0143f, 32.12f)
                curveTo(46.0143f, 33.3296f, 46.7542f, 33.9016f, 47.8188f, 33.9016f)
                curveTo(48.1764f, 33.9016f, 48.4771f, 33.8363f, 48.6968f, 33.7466f)
                lineTo(48.908f, 32.7899f)
                curveTo(48.6643f, 32.8799f, 48.3958f, 32.9535f, 48.079f, 32.9535f)
                close()
                moveTo(42.9098f, 31.76f)
                lineTo(42.4628f, 33.8282f)
                horizontalLineTo(41.3004f)
                lineTo(42.1701f, 29.774f)
                horizontalLineTo(43.251f)
                lineTo(43.1454f, 30.256f)
                curveTo(43.5357f, 29.839f, 43.9906f, 29.6509f, 44.4623f, 29.6509f)
                curveTo(45.3156f, 29.6509f, 45.86f, 30.2724f, 45.608f, 31.4576f)
                lineTo(45.0962f, 33.8282f)
                horizontalLineTo(43.9338f)
                lineTo(44.4215f, 31.5149f)
                curveTo(44.5273f, 31.0491f, 44.4623f, 30.6402f, 43.9176f, 30.6402f)
                curveTo(43.4951f, 30.6402f, 43.0885f, 30.9264f, 42.9098f, 31.76f)
                close()
                moveTo(38.2852f, 32.6593f)
                curveTo(38.2852f, 32.2508f, 38.6427f, 32.0215f, 39.2358f, 32.0215f)
                curveTo(39.35f, 32.0215f, 39.6015f, 32.03f, 39.8294f, 32.0626f)
                lineTo(39.7805f, 32.2915f)
                curveTo(39.6421f, 32.7735f, 39.2523f, 33.1009f, 38.7893f, 33.1009f)
                curveTo(38.4558f, 33.1009f, 38.2852f, 32.9373f, 38.2852f, 32.6593f)
                close()
                moveTo(38.147f, 29.8555f)
                curveTo(38.3257f, 29.7983f, 38.8703f, 29.6755f, 39.4069f, 29.6755f)
                curveTo(40.7478f, 29.6755f, 41.1295f, 30.2886f, 41.1295f, 30.9837f)
                curveTo(41.1295f, 31.1553f, 41.1135f, 31.3349f, 41.0729f, 31.5069f)
                lineTo(40.5688f, 33.8282f)
                horizontalLineTo(39.5366f)
                lineTo(39.6261f, 33.4032f)
                curveTo(39.35f, 33.7301f, 38.9273f, 33.9263f, 38.4313f, 33.9263f)
                curveTo(37.7324f, 33.9263f, 37.1962f, 33.5094f, 37.1962f, 32.8147f)
                curveTo(37.1962f, 31.7518f, 38.1226f, 31.3026f, 39.2764f, 31.3026f)
                curveTo(39.4069f, 31.3026f, 39.683f, 31.3269f, 39.9756f, 31.3595f)
                lineTo(39.992f, 31.2776f)
                curveTo(40.0081f, 31.2126f, 40.0081f, 31.1469f, 40.0081f, 31.0899f)
                curveTo(40.0081f, 30.771f, 39.7886f, 30.5829f, 39.1792f, 30.5829f)
                curveTo(38.7238f, 30.5829f, 38.2116f, 30.7222f, 37.952f, 30.7956f)
                lineTo(38.147f, 29.8555f)
                close()
                moveTo(33.7742f, 33.8282f)
                lineTo(34.2212f, 31.76f)
                curveTo(34.4001f, 30.9264f, 34.8062f, 30.6402f, 35.2293f, 30.6402f)
                curveTo(35.7739f, 30.6402f, 35.8388f, 31.0491f, 35.7334f, 31.5149f)
                lineTo(35.2454f, 33.8282f)
                horizontalLineTo(36.4076f)
                lineTo(36.9194f, 31.4576f)
                curveTo(37.1715f, 30.2724f, 36.6271f, 29.6509f, 35.7739f, 29.6509f)
                curveTo(35.3019f, 29.6509f, 34.8467f, 29.839f, 34.4568f, 30.256f)
                lineTo(34.5623f, 29.774f)
                horizontalLineTo(33.4815f)
                lineTo(32.6118f, 33.8282f)
                horizontalLineTo(33.7742f)
                close()
                moveTo(32.2949f, 29.3078f)
                curveTo(31.9374f, 29.3078f, 31.6689f, 29.0216f, 31.6936f, 28.6539f)
                curveTo(31.7178f, 28.2861f, 32.0024f, 27.9999f, 32.4005f, 27.9999f)
                curveTo(32.7582f, 27.9999f, 33.0263f, 28.2861f, 33.0017f, 28.6539f)
                curveTo(32.9777f, 29.0216f, 32.6931f, 29.3078f, 32.2949f, 29.3078f)
                close()
                moveTo(31.5308f, 29.774f)
                lineTo(30.6612f, 33.8282f)
                horizontalLineTo(31.8155f)
                lineTo(32.6852f, 29.774f)
                horizontalLineTo(31.5308f)
                close()
                moveTo(28.7021f, 31.711f)
                lineTo(28.2469f, 33.8282f)
                horizontalLineTo(27.0607f)
                lineTo(28.2149f, 28.3349f)
                horizontalLineTo(31.2627f)
                lineTo(31.0352f, 29.3732f)
                horizontalLineTo(29.1902f)
                lineTo(28.9217f, 30.6729f)
                horizontalLineTo(30.6696f)
                lineTo(30.458f, 31.711f)
                horizontalLineTo(28.7021f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.2f, 28.8f)
                horizontalLineTo(24.3f)
                lineTo(24.1f, 29.6f)
                horizontalLineTo(22.1f)
                lineTo(21.8f, 30.9f)
                horizontalLineTo(23.6f)
                lineTo(23.4f, 31.7f)
                horizontalLineTo(21.6f)
                lineTo(21.3f, 33.2f)
                horizontalLineTo(23.4f)
                lineTo(23.2f, 34.0f)
                horizontalLineTo(21.1f)
                horizontalLineTo(20.0f)
                lineTo(21.2f, 28.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.6f, 31.6f)
                horizontalLineTo(26.6f)
                lineTo(26.4f, 32.4f)
                horizontalLineTo(24.4f)
                lineTo(24.6f, 31.6f)
                close()
            }
        }
        .build()
        return _postEfinance!!
    }

private var _postEfinance: ImageVector? = null
