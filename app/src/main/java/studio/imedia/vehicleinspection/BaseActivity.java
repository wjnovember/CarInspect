package studio.imedia.vehicleinspection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 代码咖啡 on 17/4/6
 * <p>
 * Email: wjnovember@icloud.com
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected static String CONNECT_FAILED;
    protected static String LOGIN_SUCCESS;
    protected static String LOGIN_FAILED;

    protected static int COLOR_TAB_NORMAL;
    protected static int COLOR_TAB_SELECTED;

    protected static String TITLE_CAR_INSPECTION;
    protected static String TITLE_CAR_FILE_DETAIL;
    protected static String TITLE_SELECT_CAR_BRAND;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 初始化上下文
        initContext();
        // 初始化字符串
        initString();
        // 初始化颜色
        initColor();
    }

    /**
     * 初始化字符串
     */
    private void initString() {
        CONNECT_FAILED = getString(R.string.connect_failed);
        LOGIN_SUCCESS = getString(R.string.login_success);
        LOGIN_FAILED = getString(R.string.login_fail);

        TITLE_CAR_INSPECTION = getString(R.string.title_car_inspection);
        TITLE_CAR_FILE_DETAIL= getString(R.string.title_car_file_detail);
        TITLE_SELECT_CAR_BRAND = getString(R.string.title_select_car_brand);
    }

    /**
     * 初始化颜色
     */
    private void initColor() {
        COLOR_TAB_NORMAL = getResources().getColor(R.color.color_tab_text_normal);
        COLOR_TAB_SELECTED = getResources().getColor(R.color.color_tab_text_selected);
    }

    protected abstract Context initContext();

    /**
     * activity跳转
     *
     * @param cls
     *      目标Activity
     */
    protected void activityJump(Class<?> cls) {
        Context context = initContext();
        context.startActivity(new Intent(context, cls));
    }

    /**
     * activity跳转
     *
     * @param cls
     *      目标Activity
     * @param bundle
     *      键值对
     */
    protected void activityJump(Class<?> cls, Bundle bundle) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /**
     *
     * @param cls
     * @param key
     * @param str
     */
    protected void activityJump(Class<?> cls, String key, String str) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtra(key, str);
        context.startActivity(intent);
    }

    /**
     *
     * @param cls
     * @param key
     * @param d
     */
    protected void activityJump(Class<?> cls, String key, double d) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtra(key, d);
        context.startActivity(intent);
    }

    /**
     *
     * @param cls
     * @param key
     * @param i
     */
    protected void activityJump(Class<?> cls, String key, int i) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtra(key, i);
        context.startActivity(intent);
    }

    /**
     *
     * @param cls
     * @param key
     * @param b
     */
    protected void activityJump(Class<?> cls, String key, boolean b) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtra(key, b);
        context.startActivity(intent);
    }

    /**
     *
     * @param cls
     * @param key
     * @param p
     */
    protected void activityJump(Class<?> cls, String key, Parcelable p) {
        Context context = initContext();
        Intent intent = new Intent(context, cls);
        intent.putExtra(key, p);
        context.startActivity(intent);
    }

}