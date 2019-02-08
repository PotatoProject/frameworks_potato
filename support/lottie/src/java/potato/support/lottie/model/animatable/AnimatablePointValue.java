package potato.support.lottie.model.animatable;

import android.graphics.PointF;

import potato.support.lottie.value.Keyframe;
import potato.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import potato.support.lottie.animation.keyframe.PointKeyframeAnimation;

import java.util.List;

public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
  public AnimatablePointValue(List<Keyframe<PointF>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
    return new PointKeyframeAnimation(keyframes);
  }
}
