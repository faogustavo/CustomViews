package com.gustavofao.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class SquareRelativeLayout extends RelativeLayout {

    private int base;

    public SquareRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
    }

    public SquareRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.SquareRelativeLayout,
                0, 0);

        try {
            base = typedArray.getInteger(R.styleable.SquareRelativeLayout_base, 1);
        } finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (base == 0)
            super.onMeasure(heightMeasureSpec, heightMeasureSpec);
        else if (base == 1)
            super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        else
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
