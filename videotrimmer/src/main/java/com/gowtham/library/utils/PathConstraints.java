package com.gowtham.library.utils;

import android.content.Context;
import android.os.Environment;

import androidx.annotation.NonNull;

import java.io.File;

/**
 * 路径常量
 * Created by cain.huang on 2017/8/8.
 */
public class PathConstraints {

    private PathConstraints() {}

    public static String getImageCachePath(Context context) {
        String directoryPath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            directoryPath = context.getExternalCacheDir().getAbsolutePath();
        } else {
            directoryPath = context.getCacheDir().getAbsolutePath();
        }
        String path = directoryPath + File.separator + "CB_MEDIA_" + System.currentTimeMillis() + ".jpeg";
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return path;
    }

    public static String getVideoCachePath(Context context) {
        String directoryPath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            directoryPath = context.getExternalCacheDir().getAbsolutePath();
        } else {
            directoryPath = context.getCacheDir().getAbsolutePath();
        }
        String path = directoryPath + File.separator + "CB_MEDIA_" + System.currentTimeMillis() + ".mp4";
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return path;
    }

    public static String getAudioTempPath(@NonNull Context context) {
        String directoryPath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
            directoryPath = context.getExternalCacheDir().getAbsolutePath();
        } else {
            directoryPath = context.getCacheDir().getAbsolutePath();
        }
        String path = directoryPath + File.separator + "temp.aac";
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return path;
    }

    public static String getVideoTempPath(@NonNull Context context) {
        String directoryPath;
        if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState()) && context.getExternalCacheDir() != null) {
            directoryPath = context.getExternalCacheDir().getAbsolutePath();
        } else {
            directoryPath = context.getCacheDir().getAbsolutePath();
        }
        String path = directoryPath + File.separator + "temp.mp4";
        File file = new File(path);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        return path;
    }
}
