package potato.support.lottie.model.content;

import android.graphics.PointF;

import potato.support.lottie.LottieDrawable;
import potato.support.lottie.animation.content.Content;
import potato.support.lottie.animation.content.EllipseContent;
import potato.support.lottie.model.animatable.AnimatablePointValue;
import potato.support.lottie.model.animatable.AnimatableValue;
import potato.support.lottie.model.layer.BaseLayer;

public class CircleShape implements ContentModel {
  private final String name;
  private final AnimatableValue<PointF, PointF> position;
  private final AnimatablePointValue size;
  private final boolean isReversed;

  public CircleShape(String name, AnimatableValue<PointF, PointF> position,
      AnimatablePointValue size, boolean isReversed) {
    this.name = name;
    this.position = position;
    this.size = size;
    this.isReversed = isReversed;
  }

  @Override public Content toContent(LottieDrawable drawable, BaseLayer layer) {
    return new EllipseContent(drawable, layer, this);
  }

  public String getName() {
    return name;
  }

  public AnimatableValue<PointF, PointF> getPosition() {
    return position;
  }

  public AnimatablePointValue getSize() {
    return size;
  }

  public boolean isReversed() {
    return isReversed;
  }
}
