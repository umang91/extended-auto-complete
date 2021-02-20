package com.umang.extendedautocomplete;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author Umang Chamaria
 */
public class ExtendedAutoCompleteTextView
    extends androidx.appcompat.widget.AppCompatAutoCompleteTextView{
  public ExtendedAutoCompleteTextView(Context context) {
    super(context);
  }

  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public ExtendedAutoCompleteTextView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override public boolean onTouchEvent(MotionEvent event) {
    setDropDownBackgroundResource(R.color.milky_white);
    showDropDown();
    return super.onTouchEvent(event);
  }

  @Override public boolean enoughToFilter() {
    return true;
  }
}
