package potato.support.lottie.model.animatable;

import android.graphics.Path;

import potato.support.lottie.value.Keyframe;
import potato.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import potato.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import potato.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
