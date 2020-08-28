package com.vietepicrunes.androidgoodies;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.util.Log;

import androidx.annotation.RequiresApi;

import java.io.File;


public class DirectoryUtils
{

    public void CreateDirectory(String folderName, Context context)
    {
        File dir = new File(context.getExternalFilesDir(null), folderName);
        if(!dir.exists())
        {
            dir.mkdirs();
        }
    }

    public String GetDirectoryFolder(String folderName, Context context)
    {
        File dir = new File(context.getExternalFilesDir( null), folderName);
        if(!dir.exists())
        {
            dir.mkdir();
        }
        return dir.getAbsolutePath();
    }

    public String LegacyGetDirectoryFolder(String folderName)
    {
        File dir = new File(Environment.getExternalStorageDirectory(), folderName);
        if(!dir.exists())
        {
            dir.mkdir();
        }
        return dir.getAbsolutePath();
    }



    public void DeleteDirectory(String folderName, Context context)
    {
        File dir = new File(context.getExternalFilesDir(null), folderName);
        if(dir.exists())
        {
            dir.delete();
        }
    }


}


