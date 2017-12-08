package com.eurosoft.mega.site.tr.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.Toast;

import com.eurosoft.mega.site.tr.R;

import java.util.Hashtable;

/**
 * Created by ytu-nuh-koca on 20/08/2017.
 */

public class FontEquipper {
    public static final int ROBOTO_LIGHT = 0;
    public static final int ROBOTO_REGULAR = 1;
    public static final int ROBOTO_MEDIUM = 2;

    private static final String ROBOTO_LIGHT_PATH = "fonts/Roboto-Light.ttf";
    private static final String ROBOTO_REGULAR_PATH = "fonts/Roboto-Regular.ttf";
    private static final String ROBOTO_MEDIUM_PATH = "fonts/Roboto-Medium.ttf";

    private static Hashtable<String, Typeface> fontCacheTable = new Hashtable<>();

    public static Typeface equip(int fontType, Context context) {

        if (fontType == ROBOTO_LIGHT) {
            Typeface lightTypeface = fontCacheTable.get(ROBOTO_LIGHT_PATH);
            if (lightTypeface == null) {
                try {
                    lightTypeface = Typeface.createFromAsset(context.getAssets(), ROBOTO_LIGHT_PATH);
                    fontCacheTable.put(ROBOTO_LIGHT_PATH, lightTypeface);
                } catch (Exception e) {
                    Toast.makeText(context, R.string.font_not_found_error, Toast.LENGTH_LONG).show();
                    return null;
                }
            }
            return lightTypeface;

        } else if (fontType == ROBOTO_REGULAR) {
            Typeface regularTypeface = fontCacheTable.get(ROBOTO_REGULAR_PATH);
            if (regularTypeface == null) {
                try {
                    regularTypeface = Typeface.createFromAsset(context.getAssets(), ROBOTO_REGULAR_PATH);
                    fontCacheTable.put(ROBOTO_REGULAR_PATH, regularTypeface);
                } catch (Exception e) {
                    Toast.makeText(context, R.string.font_not_found_error, Toast.LENGTH_LONG).show();
                    return null;
                }
            }
            return regularTypeface;

        } else if (fontType == ROBOTO_MEDIUM) {
            Typeface mediumTypeface = fontCacheTable.get(ROBOTO_MEDIUM_PATH);
            if (mediumTypeface == null) {
                try {
                    mediumTypeface = Typeface.createFromAsset(context.getAssets(), ROBOTO_MEDIUM_PATH);
                    fontCacheTable.put(ROBOTO_MEDIUM_PATH, mediumTypeface);
                } catch (Exception e) {
                    Toast.makeText(context, R.string.font_not_found_error, Toast.LENGTH_LONG).show();
                    return null;
                }
            }
            return mediumTypeface;

        }

        return null;
    }
}
