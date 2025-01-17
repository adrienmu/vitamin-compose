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

public val PaymentsGroup.MbMay: ImageVector
    get() {
        if (_mbMay != null) {
            return _mbMay!!
        }
        _mbMay = Builder(name = "MbMay", defaultWidth = 58.0.dp, defaultHeight = 40.0.dp,
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
            path(fill = SolidColor(Color(0xFFD60510)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.5474f, 4.0f)
                horizontalLineTo(38.5929f)
                curveTo(39.7918f, 4.0f, 40.7715f, 5.0367f, 40.7715f, 6.3057f)
                verticalLineTo(7.4016f)
                curveTo(40.7715f, 8.96f, 38.6608f, 8.9534f, 38.6608f, 7.4016f)
                verticalLineTo(6.8164f)
                curveTo(38.6608f, 6.4324f, 38.3501f, 6.1207f, 37.966f, 6.1195f)
                horizontalLineTo(20.8833f)
                curveTo(20.4997f, 6.1219f, 20.1897f, 6.4328f, 20.1885f, 6.8164f)
                verticalLineTo(7.4038f)
                curveTo(20.1885f, 8.9534f, 18.1786f, 8.9381f, 18.1786f, 7.4389f)
                verticalLineTo(6.3057f)
                curveTo(18.1786f, 5.0367f, 19.1583f, 4.0f, 20.3551f, 4.0f)
                horizontalLineTo(21.5474f)
                close()
                moveTo(29.3633f, 29.7008f)
                horizontalLineTo(40.4186f)
                curveTo(42.9435f, 29.7008f, 42.9677f, 27.0181f, 42.7112f, 25.6921f)
                curveTo(42.5709f, 24.8022f, 41.0586f, 24.8153f, 40.892f, 25.6921f)
                verticalLineTo(26.7266f)
                curveTo(40.8896f, 27.2001f, 40.5064f, 27.5834f, 40.0329f, 27.5858f)
                horizontalLineTo(18.8362f)
                curveTo(18.3621f, 27.5845f, 17.9782f, 27.2006f, 17.977f, 26.7266f)
                verticalLineTo(25.6921f)
                curveTo(17.8104f, 24.8153f, 16.2981f, 24.8022f, 16.1578f, 25.6921f)
                curveTo(15.8992f, 27.0181f, 15.9255f, 29.7008f, 18.4504f, 29.7008f)
                horizontalLineTo(29.3633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF373536)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(36.1972f, 15.8203f)
                horizontalLineTo(37.9507f)
                verticalLineTo(15.8006f)
                curveTo(38.7679f, 15.6734f, 39.3711f, 14.9706f, 39.3731f, 14.1436f)
                curveTo(39.3707f, 13.2186f, 38.6214f, 12.4693f, 37.6964f, 12.4669f)
                horizontalLineTo(34.1567f)
                verticalLineTo(21.234f)
                horizontalLineTo(38.6586f)
                curveTo(39.6134f, 21.2304f, 40.3865f, 20.4573f, 40.3901f, 19.5025f)
                curveTo(40.3877f, 18.5472f, 39.6139f, 17.7734f, 38.6586f, 17.771f)
                horizontalLineTo(37.966f)
                horizontalLineTo(36.2126f)
                curveTo(35.6761f, 17.7686f, 35.2418f, 17.3343f, 35.2394f, 16.7979f)
                curveTo(35.2418f, 16.2614f, 35.6761f, 15.8271f, 36.2126f, 15.8247f)
                lineTo(36.1972f, 15.8203f)
                close()
                moveTo(40.3419f, 16.6817f)
                curveTo(41.5363f, 17.2151f, 42.314f, 18.3918f, 42.3364f, 19.6998f)
                curveTo(42.3364f, 21.5562f, 40.7167f, 23.0729f, 38.7353f, 23.0729f)
                horizontalLineTo(33.1835f)
                curveTo(32.682f, 23.0878f, 32.2614f, 22.6974f, 32.2389f, 22.1962f)
                verticalLineTo(11.6274f)
                curveTo(32.2413f, 11.1156f, 32.6563f, 10.7015f, 33.1682f, 10.7003f)
                horizontalLineTo(37.7907f)
                curveTo(39.7419f, 10.7051f, 41.3232f, 12.2844f, 41.3304f, 14.2357f)
                curveTo(41.33f, 15.1482f, 40.9757f, 16.0251f, 40.3419f, 16.6817f)
                close()
            }
            path(fill = SolidColor(Color(0xFF373536)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5139f, 33.0527f)
                curveTo(24.423f, 33.3944f, 24.3269f, 33.7591f, 24.2256f, 34.1467f)
                curveTo(24.1295f, 34.5328f, 24.0276f, 34.904f, 23.9306f, 35.2575f)
                curveTo(23.8335f, 35.6111f, 23.7431f, 35.9199f, 23.6557f, 36.1878f)
                curveTo(23.6007f, 36.3765f, 23.528f, 36.56f, 23.4385f, 36.7358f)
                curveTo(23.3366f, 36.9107f, 23.1559f, 36.9972f, 22.8993f, 36.9972f)
                curveTo(22.804f, 36.9939f, 22.7094f, 36.9795f, 22.6177f, 36.9544f)
                curveTo(22.4918f, 36.9174f, 22.3873f, 36.8315f, 22.3294f, 36.7172f)
                curveTo(22.2382f, 36.5324f, 22.1654f, 36.3395f, 22.1121f, 36.1413f)
                curveTo(22.0256f, 35.8557f, 21.9353f, 35.5273f, 21.8373f, 35.1552f)
                curveTo(21.7392f, 34.7831f, 21.645f, 34.3886f, 21.5489f, 33.9737f)
                curveTo(21.4528f, 33.5588f, 21.3654f, 33.1727f, 21.2885f, 32.8145f)
                curveTo(21.2116f, 32.4564f, 21.1462f, 32.1531f, 21.0963f, 31.9028f)
                curveTo(21.0463f, 31.6526f, 21.0165f, 31.5028f, 21.0098f, 31.4516f)
                curveTo(21.0044f, 31.4303f, 21.0012f, 31.4085f, 21.0001f, 31.3865f)
                verticalLineTo(31.3493f)
                curveTo(20.9971f, 31.2496f, 21.0435f, 31.1545f, 21.1251f, 31.0935f)
                curveTo(21.2132f, 31.0286f, 21.322f, 30.9957f, 21.4326f, 31.0004f)
                curveTo(21.5317f, 30.9966f, 21.6296f, 31.0212f, 21.7142f, 31.0711f)
                curveTo(21.7945f, 31.1326f, 21.8488f, 31.2202f, 21.8671f, 31.3177f)
                curveTo(21.8671f, 31.3298f, 21.8863f, 31.4209f, 21.9199f, 31.5875f)
                curveTo(21.9536f, 31.754f, 22.0016f, 31.9698f, 22.0554f, 32.2285f)
                curveTo(22.1093f, 32.4871f, 22.1717f, 32.7801f, 22.239f, 33.1039f)
                curveTo(22.3063f, 33.4276f, 22.3764f, 33.7551f, 22.4514f, 34.0863f)
                curveTo(22.5264f, 34.4175f, 22.5994f, 34.7375f, 22.6734f, 35.0491f)
                curveTo(22.7474f, 35.3608f, 22.8157f, 35.625f, 22.881f, 35.8473f)
                curveTo(22.9445f, 35.638f, 23.0146f, 35.3961f, 23.0934f, 35.1264f)
                curveTo(23.1722f, 34.8566f, 23.2482f, 34.5775f, 23.3251f, 34.2891f)
                curveTo(23.4019f, 34.0007f, 23.475f, 33.7132f, 23.5461f, 33.4239f)
                curveTo(23.6172f, 33.1346f, 23.6826f, 32.8657f, 23.7441f, 32.6192f)
                curveTo(23.8056f, 32.3726f, 23.8575f, 32.154f, 23.9027f, 31.9596f)
                curveTo(23.9479f, 31.7652f, 23.9825f, 31.6238f, 24.0094f, 31.5298f)
                curveTo(24.0625f, 31.2999f, 24.2775f, 31.1395f, 24.5207f, 31.1484f)
                curveTo(24.6461f, 31.1437f, 24.7693f, 31.1819f, 24.8686f, 31.2563f)
                curveTo(24.9561f, 31.3261f, 25.0167f, 31.4225f, 25.0406f, 31.5298f)
                curveTo(25.113f, 31.8343f, 25.1902f, 32.1754f, 25.2723f, 32.5531f)
                curveTo(25.3549f, 32.9253f, 25.4433f, 33.3067f, 25.5327f, 33.6918f)
                curveTo(25.6221f, 34.077f, 25.7173f, 34.4537f, 25.8114f, 34.8231f)
                curveTo(25.9056f, 35.1924f, 26.0037f, 35.5199f, 26.093f, 35.8036f)
                curveTo(26.1565f, 35.5813f, 26.2266f, 35.3143f, 26.3006f, 35.0054f)
                curveTo(26.3746f, 34.6966f, 26.4487f, 34.3747f, 26.5255f, 34.0453f)
                curveTo(26.6024f, 33.716f, 26.6764f, 33.3941f, 26.7476f, 33.0694f)
                curveTo(26.8187f, 32.7448f, 26.8831f, 32.4573f, 26.9398f, 32.1996f)
                curveTo(26.9965f, 31.9419f, 27.0436f, 31.7345f, 27.0791f, 31.5717f)
                curveTo(27.1147f, 31.4089f, 27.132f, 31.3261f, 27.132f, 31.3205f)
                curveTo(27.15f, 31.2225f, 27.2052f, 31.1346f, 27.2867f, 31.0739f)
                curveTo(27.3703f, 31.0241f, 27.4674f, 30.9995f, 27.5655f, 31.0032f)
                curveTo(27.6764f, 30.9984f, 27.7855f, 31.0313f, 27.874f, 31.0963f)
                curveTo(27.9559f, 31.1571f, 28.0027f, 31.2522f, 27.9999f, 31.3521f)
                verticalLineTo(31.3893f)
                curveTo(27.9988f, 31.4113f, 27.9956f, 31.4331f, 27.9903f, 31.4544f)
                curveTo(27.9855f, 31.5056f, 27.9537f, 31.6535f, 27.8942f, 31.9056f)
                curveTo(27.8346f, 32.1577f, 27.774f, 32.4638f, 27.6971f, 32.8173f)
                curveTo(27.6202f, 33.1709f, 27.5328f, 33.5616f, 27.4357f, 33.9718f)
                curveTo(27.3386f, 34.3821f, 27.2435f, 34.7766f, 27.1531f, 35.1478f)
                curveTo(27.0628f, 35.5189f, 26.9696f, 35.8473f, 26.8821f, 36.1302f)
                curveTo(26.8286f, 36.3268f, 26.7559f, 36.5181f, 26.6649f, 36.7014f)
                curveTo(26.605f, 36.8186f, 26.4991f, 36.9077f, 26.3708f, 36.9488f)
                curveTo(26.2792f, 36.9784f, 26.1838f, 36.9956f, 26.0873f, 37.0f)
                curveTo(26.048f, 36.9992f, 26.0089f, 36.9961f, 25.97f, 36.9907f)
                curveTo(25.9142f, 36.9828f, 25.8592f, 36.97f, 25.8057f, 36.9526f)
                curveTo(25.744f, 36.9327f, 25.6859f, 36.9035f, 25.6336f, 36.866f)
                curveTo(25.574f, 36.824f, 25.5271f, 36.7671f, 25.4981f, 36.7014f)
                curveTo(25.4139f, 36.5116f, 25.3445f, 36.316f, 25.2905f, 36.1162f)
                curveTo(25.2107f, 35.8427f, 25.1223f, 35.5348f, 25.0301f, 35.1906f)
                curveTo(24.9378f, 34.8463f, 24.8446f, 34.4863f, 24.7552f, 34.1105f)
                curveTo(24.6658f, 33.7346f, 24.5812f, 33.383f, 24.5053f, 33.0555f)
            }
            path(fill = SolidColor(Color(0xFF373536)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.045f, 36.1034f)
                curveTo(29.1182f, 35.8505f, 29.2029f, 35.5753f, 29.298f, 35.2778f)
                horizontalLineTo(31.6866f)
                curveTo(31.7081f, 35.345f, 31.7291f, 35.4112f, 31.7498f, 35.4762f)
                curveTo(31.8208f, 35.6992f, 31.8876f, 35.9093f, 31.9538f, 36.1044f)
                curveTo(32.0394f, 36.3563f, 32.1155f, 36.5683f, 32.1782f, 36.7283f)
                curveTo(32.2033f, 36.8043f, 32.2475f, 36.873f, 32.3066f, 36.9282f)
                curveTo(32.3765f, 36.9801f, 32.4634f, 37.0053f, 32.551f, 36.9988f)
                curveTo(32.6723f, 37.0073f, 32.7921f, 36.9689f, 32.8848f, 36.8919f)
                curveTo(32.9612f, 36.8206f, 33.0031f, 36.7209f, 32.9998f, 36.6176f)
                curveTo(32.999f, 36.5764f, 32.9926f, 36.5354f, 32.9808f, 36.4958f)
                curveTo(32.9693f, 36.4553f, 32.9459f, 36.3865f, 32.912f, 36.2865f)
                curveTo(32.8899f, 36.2213f, 32.8632f, 36.1429f, 32.8325f, 36.0504f)
                curveTo(32.7903f, 35.9236f, 32.7425f, 35.7845f, 32.69f, 35.6318f)
                curveTo(32.6456f, 35.5024f, 32.5978f, 35.3633f, 32.5472f, 35.2136f)
                curveTo(32.4369f, 34.8873f, 32.3133f, 34.5339f, 32.1792f, 34.1574f)
                curveTo(32.0451f, 33.7808f, 31.9091f, 33.4107f, 31.7732f, 33.0472f)
                curveTo(31.6372f, 32.6836f, 31.5069f, 32.3415f, 31.3833f, 32.0328f)
                curveTo(31.2597f, 31.7241f, 31.1532f, 31.4749f, 31.0628f, 31.2889f)
                curveTo(31.0297f, 31.1893f, 30.9551f, 31.1079f, 30.8574f, 31.0648f)
                curveTo(30.6302f, 30.9817f, 30.3804f, 30.9784f, 30.1509f, 31.0555f)
                curveTo(30.0583f, 31.1008f, 29.9854f, 31.177f, 29.9455f, 31.2703f)
                curveTo(29.8043f, 31.5239f, 29.6804f, 31.7864f, 29.5747f, 32.056f)
                curveTo(29.4406f, 32.3805f, 29.3046f, 32.732f, 29.1639f, 33.1067f)
                curveTo(29.0231f, 33.4814f, 28.8872f, 33.8626f, 28.7578f, 34.2457f)
                curveTo(28.6984f, 34.4217f, 28.6414f, 34.5916f, 28.5866f, 34.7551f)
                curveTo(28.522f, 34.9476f, 28.4604f, 35.1312f, 28.4012f, 35.3057f)
                curveTo(28.2919f, 35.6283f, 28.2063f, 35.898f, 28.1388f, 36.1146f)
                curveTo(28.0713f, 36.3312f, 28.0313f, 36.4586f, 28.019f, 36.4949f)
                curveTo(27.9763f, 36.6318f, 28.0066f, 36.7806f, 28.0998f, 36.891f)
                curveTo(28.1862f, 36.9696f, 28.3028f, 37.0085f, 28.4203f, 36.9979f)
                curveTo(28.6072f, 37.0133f, 28.7805f, 36.9014f, 28.8396f, 36.7273f)
                curveTo(28.9033f, 36.5683f, 28.9718f, 36.3563f, 29.045f, 36.1034f)
                close()
                moveTo(31.0362f, 33.3577f)
                curveTo(31.156f, 33.6943f, 31.2825f, 34.0653f, 31.4166f, 34.4679f)
                horizontalLineTo(29.5956f)
                curveTo(29.7278f, 34.0653f, 29.8542f, 33.6943f, 29.9712f, 33.3577f)
                curveTo(30.0897f, 33.0199f, 30.2124f, 32.6988f, 30.3392f, 32.3945f)
                curveTo(30.3658f, 32.3387f, 30.3923f, 32.2716f, 30.4215f, 32.1979f)
                curveTo(30.4279f, 32.1819f, 30.4343f, 32.1656f, 30.4409f, 32.149f)
                curveTo(30.4561f, 32.0959f, 30.4769f, 32.0445f, 30.5027f, 31.9956f)
                curveTo(30.5062f, 32.0067f, 30.5147f, 32.0289f, 30.5286f, 32.0649f)
                curveTo(30.5379f, 32.089f, 30.5495f, 32.1192f, 30.5636f, 32.1564f)
                curveTo(30.5988f, 32.2494f, 30.6321f, 32.3266f, 30.6635f, 32.3945f)
                curveTo(30.7909f, 32.6985f, 30.9164f, 33.0211f, 31.0362f, 33.3577f)
                close()
            }
            path(fill = SolidColor(Color(0xFF373536)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.5971f, 34.6551f)
                curveTo(34.5666f, 34.6233f, 34.5386f, 34.5891f, 34.5132f, 34.5528f)
                curveTo(34.4808f, 34.5117f, 34.451f, 34.4685f, 34.4238f, 34.4235f)
                curveTo(34.3399f, 34.2998f, 34.2506f, 34.1501f, 34.1514f, 33.9724f)
                curveTo(34.0523f, 33.7948f, 33.954f, 33.6078f, 33.8549f, 33.4097f)
                curveTo(33.7557f, 33.2116f, 33.662f, 33.0098f, 33.57f, 32.8089f)
                curveTo(33.478f, 32.608f, 33.3913f, 32.421f, 33.319f, 32.2508f)
                curveTo(33.2466f, 32.0806f, 33.1796f, 31.9253f, 33.1261f, 31.7997f)
                curveTo(33.086f, 31.7137f, 33.0529f, 31.6244f, 33.0269f, 31.5328f)
                curveTo(33.0171f, 31.5104f, 33.0097f, 31.487f, 33.0046f, 31.463f)
                curveTo(33.0017f, 31.4399f, 33.0002f, 31.4166f, 33.0001f, 31.3933f)
                curveTo(32.9975f, 31.2881f, 33.0377f, 31.1868f, 33.1109f, 31.1142f)
                curveTo(33.1961f, 31.0353f, 33.3079f, 30.9949f, 33.4217f, 31.0017f)
                curveTo(33.5156f, 30.9919f, 33.6088f, 31.026f, 33.6763f, 31.0947f)
                curveTo(33.7233f, 31.1497f, 33.7611f, 31.2126f, 33.7879f, 31.2807f)
                curveTo(33.7995f, 31.3133f, 33.829f, 31.3793f, 33.8772f, 31.4844f)
                curveTo(33.9255f, 31.5895f, 33.9773f, 31.7207f, 34.0425f, 31.875f)
                curveTo(34.1077f, 32.0294f, 34.1827f, 32.2015f, 34.2658f, 32.3866f)
                curveTo(34.3488f, 32.5717f, 34.4355f, 32.7586f, 34.523f, 32.9363f)
                curveTo(34.6105f, 33.1139f, 34.6936f, 33.2869f, 34.7731f, 33.4525f)
                curveTo(34.8407f, 33.5924f, 34.9171f, 33.7276f, 35.0017f, 33.8571f)
                curveTo(35.1367f, 33.6379f, 35.2596f, 33.4109f, 35.3697f, 33.1772f)
                curveTo(35.5001f, 32.9037f, 35.6261f, 32.6349f, 35.7449f, 32.3699f)
                curveTo(35.8637f, 32.1048f, 35.9673f, 31.8657f, 36.0548f, 31.6621f)
                curveTo(36.1423f, 31.4584f, 36.1932f, 31.33f, 36.212f, 31.2807f)
                curveTo(36.2399f, 31.2132f, 36.2776f, 31.1504f, 36.3236f, 31.0947f)
                curveTo(36.3914f, 31.0258f, 36.4849f, 30.9918f, 36.5791f, 31.0017f)
                curveTo(36.6927f, 30.9948f, 36.8042f, 31.0353f, 36.889f, 31.1142f)
                curveTo(36.9622f, 31.1868f, 37.0024f, 31.2881f, 36.9998f, 31.3933f)
                curveTo(37.0006f, 31.4166f, 36.9991f, 31.44f, 36.9953f, 31.463f)
                curveTo(36.9902f, 31.4868f, 36.9833f, 31.5101f, 36.9748f, 31.5328f)
                lineTo(36.8712f, 31.8025f)
                curveTo(36.8211f, 31.9327f, 36.7568f, 32.0815f, 36.6809f, 32.2582f)
                curveTo(36.605f, 32.435f, 36.5237f, 32.6201f, 36.4317f, 32.8163f)
                curveTo(36.3397f, 33.0126f, 36.2433f, 33.2181f, 36.1459f, 33.4172f)
                curveTo(36.0485f, 33.6162f, 35.9485f, 33.805f, 35.8494f, 33.9845f)
                curveTo(35.7502f, 34.164f, 35.6591f, 34.3166f, 35.5761f, 34.4403f)
                curveTo(35.5255f, 34.5165f, 35.4684f, 34.5878f, 35.4055f, 34.6533f)
                verticalLineTo(36.5814f)
                curveTo(35.41f, 36.694f, 35.3692f, 36.8036f, 35.2929f, 36.8836f)
                curveTo(35.1277f, 37.0388f, 34.8766f, 37.0388f, 34.7115f, 36.8836f)
                curveTo(34.6349f, 36.8037f, 34.5938f, 36.6942f, 34.598f, 36.5814f)
                lineTo(34.5971f, 34.6551f)
                close()
            }
            path(fill = SolidColor(Color(0xFF373536)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.3578f, 22.0186f)
                curveTo(31.4232f, 22.6305f, 30.9801f, 23.1795f, 30.3682f, 23.2449f)
                curveTo(29.7563f, 23.3102f, 29.2073f, 22.8672f, 29.1419f, 22.2553f)
                lineTo(28.2301f, 13.8542f)
                lineTo(24.9951f, 22.0756f)
                verticalLineTo(22.0975f)
                verticalLineTo(22.115f)
                verticalLineTo(22.1325f)
                verticalLineTo(22.1479f)
                verticalLineTo(22.1654f)
                curveTo(24.939f, 22.2749f, 24.8649f, 22.3742f, 24.7759f, 22.4591f)
                lineTo(24.7584f, 22.4745f)
                curveTo(24.7001f, 22.5278f, 24.6353f, 22.5735f, 24.5655f, 22.6104f)
                lineTo(24.5458f, 22.6213f)
                horizontalLineTo(24.526f)
                horizontalLineTo(24.5129f)
                horizontalLineTo(24.4997f)
                horizontalLineTo(24.4866f)
                horizontalLineTo(24.4734f)
                horizontalLineTo(24.4581f)
                horizontalLineTo(24.4449f)
                curveTo(24.3399f, 22.6586f, 24.2297f, 22.6793f, 24.1184f, 22.6827f)
                horizontalLineTo(24.0373f)
                curveTo(23.912f, 22.6782f, 23.7883f, 22.653f, 23.6712f, 22.6082f)
                horizontalLineTo(23.6559f)
                horizontalLineTo(23.6405f)
                horizontalLineTo(23.6252f)
                horizontalLineTo(23.6121f)
                horizontalLineTo(23.5989f)
                horizontalLineTo(23.5792f)
                lineTo(23.5616f, 22.5972f)
                horizontalLineTo(23.5507f)
                curveTo(23.4903f, 22.5628f, 23.4331f, 22.5232f, 23.3797f, 22.4789f)
                lineTo(23.3425f, 22.446f)
                lineTo(23.3162f, 22.4197f)
                curveTo(23.3072f, 22.4096f, 23.2977f, 22.4001f, 23.2877f, 22.3912f)
                lineTo(23.2548f, 22.3539f)
                curveTo(23.209f, 22.3016f, 23.1693f, 22.2443f, 23.1364f, 22.183f)
                verticalLineTo(22.1654f)
                verticalLineTo(22.1457f)
                verticalLineTo(22.1325f)
                verticalLineTo(22.1194f)
                verticalLineTo(22.1062f)
                verticalLineTo(22.0909f)
                verticalLineTo(22.0756f)
                lineTo(19.68f, 13.8542f)
                lineTo(18.766f, 22.2553f)
                curveTo(18.6885f, 22.8558f, 18.1454f, 23.2843f, 17.5434f, 23.2199f)
                curveTo(16.9414f, 23.1555f, 16.5011f, 22.6219f, 16.5523f, 22.0186f)
                lineTo(17.6285f, 12.1161f)
                curveTo(17.642f, 12.0001f, 17.6662f, 11.8857f, 17.7008f, 11.7742f)
                curveTo(17.735f, 11.6624f, 17.7805f, 11.5545f, 17.8367f, 11.452f)
                curveTo(18.1159f, 10.9273f, 18.6307f, 10.5691f, 19.2197f, 10.4898f)
                horizontalLineTo(19.2811f)
                curveTo(19.3716f, 10.4733f, 19.4632f, 10.4631f, 19.5551f, 10.4591f)
                curveTo(19.6687f, 10.4648f, 19.7816f, 10.4802f, 19.8926f, 10.5052f)
                curveTo(20.4825f, 10.6413f, 20.9668f, 11.0607f, 21.1858f, 11.6252f)
                lineTo(23.954f, 18.6279f)
                lineTo(26.709f, 11.6317f)
                curveTo(26.9284f, 11.0667f, 27.4136f, 10.6472f, 28.0044f, 10.5117f)
                curveTo(28.1152f, 10.4845f, 28.2281f, 10.4669f, 28.3419f, 10.4591f)
                curveTo(28.4353f, 10.4526f, 28.5291f, 10.4526f, 28.6225f, 10.4591f)
                horizontalLineTo(28.6838f)
                curveTo(29.2805f, 10.5404f, 29.8f, 10.9078f, 30.0756f, 11.4432f)
                curveTo(30.1307f, 11.549f, 30.1754f, 11.6599f, 30.2093f, 11.7742f)
                curveTo(30.2441f, 11.8864f, 30.2683f, 12.0016f, 30.2816f, 12.1183f)
                lineTo(31.3578f, 22.0186f)
                close()
            }
        }
        .build()
        return _mbMay!!
    }

private var _mbMay: ImageVector? = null
