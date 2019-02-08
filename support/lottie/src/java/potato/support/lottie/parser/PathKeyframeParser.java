package potato.support.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;

import potato.support.lottie.LottieComposition;
import potato.support.lottie.value.Keyframe;
import potato.support.lottie.animation.keyframe.PathKeyframe;
import potato.support.lottie.utils.Utils;

import java.io.IOException;

class PathKeyframeParser {

  private PathKeyframeParser() {}

  static PathKeyframe parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    boolean animated = reader.peek() == JsonToken.BEGIN_OBJECT;
    Keyframe<PointF> keyframe = KeyframeParser.parse(
        reader, composition, Utils.dpScale(), PathParser.INSTANCE, animated);

    return new PathKeyframe(composition, keyframe);
  }
}
