/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.placement.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author jatin
 */
public class FilesUtil {

    public static void saveImageFile(File file, String FileName, ServletContext context) {
        try {
            String realPath = context.getRealPath("/UsersFiles") + File.separator + "profile";
            File destFile = new File(realPath, FileName);
            FileUtils.copyFile(file, destFile);
        } catch (IOException ex) {
            Logger.getLogger(FilesUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void savePdfFile(File file, String FileName, ServletContext context) {
        try {
            String realPath = context.getRealPath("/UsersFiles") + File.separator + "cv";
            File destFile = new File(realPath, FileName);
            FileUtils.copyFile(file, destFile);
        } catch (IOException ex) {
            Logger.getLogger(FilesUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
