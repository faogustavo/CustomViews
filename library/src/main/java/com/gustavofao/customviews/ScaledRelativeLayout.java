package com.gustavofao.customviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class ScaledRelativeLayout extends RelativeLayout {

    private int base;
    private int width;
    private int height;

    public ScaledRelativeLayout(Context context) {
        super(context);
    }

    public ScaledRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.init(context, attrs);
    }

    public ScaledRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ScaledRelativeLayout,
                0, 0);

        try {
            base = typedArray.getInteger(R.styleable.ScaledRelativeLayout_scaleBase, 1);
            width = typedArray.getInteger(R.styleable.ScaledRelativeLayout_widthScale, 16);
            height = typedArray.getInteger(R.styleable.ScaledRelativeLayout_heightScale, 9);
        } finally {
            typedArray.recycle();
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        int width;
        int height;

        if (base == 0) {
            height = heightSize;
            width = (int)((height * 1.0 / this.height) * this.width);
        } else if (base == 1) {
            width = widthSize;
            height = (int)((width * 1.0 / this.width) * this.height);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }

        setMeasuredDimension(width, height);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
