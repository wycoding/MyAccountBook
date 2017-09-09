package pers.wang.accountbook.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.annotation.StyleableRes;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by winnw on 2017/9/9.
 */

public class CustomToolBar extends LinearLayout {

    private Boolean isLeftBtnVisible;
    private int leftResId;

    private Boolean isLeftTvVisible;
    private String leftTvText;

    private Boolean isRightBtnVisible;
    private int rightResId;

    private Boolean isRightTvVisible;
    private String rightTvText;

    private Boolean isTitleVisible;
    private String titleText;

    private int backgroundResId;

    public CustomToolBar(Context context) {
        super(context);
    }

    public CustomToolBar(Context context,  AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomToolBar(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomToolBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(attrs);
    }

    private void initView(AttributeSet attrs) {
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, )
    }


    public Boolean getLeftBtnVisible() {
        return isLeftBtnVisible;
    }

    public void setLeftBtnVisible(Boolean leftBtnVisible) {
        isLeftBtnVisible = leftBtnVisible;
    }

    public int getLeftResId() {
        return leftResId;
    }

    public void setLeftResId(int leftResId) {
        this.leftResId = leftResId;
    }

    public Boolean getLeftTvVisible() {
        return isLeftTvVisible;
    }

    public void setLeftTvVisible(Boolean leftTvVisible) {
        isLeftTvVisible = leftTvVisible;
    }

    public String getLeftTvText() {
        return leftTvText;
    }

    public void setLeftTvText(String leftTvText) {
        this.leftTvText = leftTvText;
    }

    public Boolean getRightBtnVisible() {
        return isRightBtnVisible;
    }

    public void setRightBtnVisible(Boolean rightBtnVisible) {
        isRightBtnVisible = rightBtnVisible;
    }

    public int getRightResId() {
        return rightResId;
    }

    public void setRightResId(int rightResId) {
        this.rightResId = rightResId;
    }

    public Boolean getRightTvVisible() {
        return isRightTvVisible;
    }

    public void setRightTvVisible(Boolean rightTvVisible) {
        isRightTvVisible = rightTvVisible;
    }

    public String getRightTvText() {
        return rightTvText;
    }

    public void setRightTvText(String rightTvText) {
        this.rightTvText = rightTvText;
    }

    public Boolean getTitleVisible() {
        return isTitleVisible;
    }

    public void setTitleVisible(Boolean titleVisible) {
        isTitleVisible = titleVisible;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public int getBackgroundResId() {
        return backgroundResId;
    }

    public void setBackgroundResId(int backgroundResId) {
        this.backgroundResId = backgroundResId;
    }
}
