package potato.support.lottie.model.content;


import android.support.annotation.Nullable;

import potato.support.lottie.LottieDrawable;
import potato.support.lottie.animation.content.Content;
import potato.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
