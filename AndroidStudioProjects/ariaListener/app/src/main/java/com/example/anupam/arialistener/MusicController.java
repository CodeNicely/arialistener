package com.example.anupam.arialistener;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/**
 * Created by Anupam on 10/15/2016.
 */
public class MusicController extends MediaController {
    public MusicController(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MusicController(Context context, boolean useFastForward) {
        super(context, useFastForward);
    }

    public MusicController(Context c) {
        super(c);
    }

    @Override
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override
    public void setMediaPlayer(MediaPlayerControl player) {
        super.setMediaPlayer(player);
    }

    @Override
    public void setAnchorView(View view) {
        super.setAnchorView(view);
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void show(int timeout) {
        super.show(timeout);
    }

    @Override
    public boolean isShowing() {
        return super.isShowing();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent ev) {
        return super.onTrackballEvent(ev);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override
    public void setPrevNextListeners(OnClickListener next, OnClickListener prev) {
        super.setPrevNextListeners(next, prev);
    }
}
