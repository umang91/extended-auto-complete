package com.umang.extendedautocomplete;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION_CODES;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AutoCompleteTextView;

/**
 * @author Umang Chamaria
 */

public class ExtendedAutoCompleteTextView extends AutoCompleteTextView {
  public ExtendedAutoCompleteTextView(Context context) {
    super(context);
  }

  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @TargetApi(VERSION_CODES.LOLLIPOP)
  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr,
      int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @TargetApi(VERSION_CODES.N)
  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr,
      int defStyleRes, Theme popupTheme) {
    super(context, attrs, defStyleAttr, defStyleRes, popupTheme);
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    setDropDownBackgroundResource(R.color.milky_white);
    showDropDown();
    return super.onTouchEvent(event);
  }


  @Override
  public boolean enoughToFilter() {
    return true;
  }
}
