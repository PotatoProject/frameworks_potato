package potato.support.lottie.model.animatable;

import potato.support.lottie.value.Keyframe;
import potato.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import potato.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import potato.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
