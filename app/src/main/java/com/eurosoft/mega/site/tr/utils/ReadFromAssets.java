package com.eurosoft.mega.site.tr.utils;

import android.content.Context;
import android.widget.Toast;

import com.eurosoft.mega.site.tr.R;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ytu-nuh-koca on 19/08/2017.
 */

public class ReadFromAssets {
    public String readFile(Context context, String text) {
        String tContents = "";

        try {
            InputStream stream = context.getAssets().open(text);

            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            tContents = new String(buffer);
        } catch (IOException e) {
            Toast.makeText(context, context.getString(R.string.file_read_error), Toast.LENGTH_SHORT).show();
        }

        return tContents;
    }
}
