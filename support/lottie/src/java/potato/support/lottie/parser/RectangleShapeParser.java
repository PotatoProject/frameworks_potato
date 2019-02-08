package potato.support.lottie.parser;

import android.graphics.PointF;
import android.util.JsonReader;

import potato.support.lottie.LottieComposition;
import potato.support.lottie.model.animatable.AnimatableFloatValue;
import potato.support.lottie.model.animatable.AnimatablePointValue;
import potato.support.lottie.model.animatable.AnimatableValue;
import potato.support.lottie.model.content.RectangleShape;

import java.io.IOException;

class RectangleShapeParser {

  private RectangleShapeParser() {}

  static RectangleShape parse(
      JsonReader reader, LottieComposition composition) throws IOException {
    String name = null;
    AnimatableValue<PointF, PointF> position = null;
    AnimatablePointValue size = null;
    AnimatableFloatValue roundedness = null;

    while (reader.hasNext()) {
      switch (reader.nextName()) {
        case "nm":
          name = reader.nextString();
          break;
        case "p":
          position =
              AnimatablePathValueParser.parseSplitPath(reader, composition);
          break;
        case "s":
          size = AnimatableValueParser.parsePoint(reader, composition);
          break;
        case "r":
          roundedness = AnimatableValueParser.parseFloat(reader, composition);
          break;
        default:
          reader.skipValue();
      }
    }

    return new RectangleShape(name, position, size, roundedness);
  }
}
