package com.bernaferrari.carouselgifviewer.core;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import me.zhanghai.android.materialprogressbar.MaterialProgressBar;

/**
 * A ProgressBar that uses height animation for hiding/showing + animates changes in determinate progress
 * (because {@link ProgressBar#setProgress(int, boolean)} is API 24+ only).
 */
public class AnimatedProgressBar extends MaterialProgressBar {

    private ObjectAnimator progressAnimator;
    private boolean visibilityAnimationOngoing;

    public AnimatedProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);

        setVisible(getVisibility() == VISIBLE, false);
        super.setVisibility(VISIBLE);
    }

    public void setProgressWithAnimation(int toProgress) {
        cancelProgressAnimation();

        progressAnimator = ObjectAnimator.ofInt(this, "progress", getProgress(), toProgress);
        progressAnimator.setInterpolator(Animations.INTERPOLATOR);
        progressAnimator.setDuration(400);
        progressAnimator.start();
    }

    private void cancelProgressAnimation() {
        if (progressAnimator != null) {
            progressAnimator.cancel();
        }
    }

    @Override
    public synchronized void setIndeterminate(boolean indeterminate) {
        cancelProgressAnimation();
        super.setIndeterminate(indeterminate);
    }

    @Override
    public void setVisibility(int visibility) {
        setVisible(visibility == VISIBLE, true);
    }

    public void setVisibilityWithoutAnimation(int visibility) {
        setVisible(visibility == VISIBLE, false);
    }

    public void show() {
        setVisible(true, true);
    }

    public void hide() {
        setVisible(false, true);
    }

    protected void setVisible(boolean visible, boolean animate) {
        if (getHeight() > 0 && animate) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            boolean isTopAligned = marginLayoutParams.topMargin < 0;

            // Since we apply negative margins to negate ProgressView's extra vertical spacing,
            // set a pivot that ensures the gravity of the bar while animating in/out.
            float pivotYFactor = (float) Math.abs(isTopAligned ? marginLayoutParams.topMargin : 2 * marginLayoutParams.bottomMargin) / getHeight();
            setPivotY(getHeight() * pivotYFactor);

            animate().cancel();
            animate()
                    .scaleY(visible ? 1f : 0f)
                    .setStartDelay(visibilityAnimationOngoing ? 100 : 0)
                    .setInterpolator(new DecelerateInterpolator())
                    .setDuration(400)
                    .withStartAction(() -> visibilityAnimationOngoing = true)
                    .withEndAction(() -> visibilityAnimationOngoing = false)
                    .start();
        } else {
            setScaleY(visible ? 1f : 0f);
            visibilityAnimationOngoing = false;
        }
    }
}
