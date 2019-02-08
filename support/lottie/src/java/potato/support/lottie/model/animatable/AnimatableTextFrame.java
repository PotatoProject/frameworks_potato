package potato.support.lottie.model.animatable;

import potato.support.lottie.value.Keyframe;
import potato.support.lottie.animation.keyframe.TextKeyframeAnimation;
import potato.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
