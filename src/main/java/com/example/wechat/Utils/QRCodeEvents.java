package com.example.wechat.Utils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import org.springframework.beans.factory.annotation.Value;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Hashtable;

public class QRCodeEvents {

    @Value("${application.file.path}")
    private String path;

    public Image writeQrCodeContent(String text) throws Exception {
        int width = 100;
        int height = 100;
        String format = "jpg";

        Hashtable<EncodeHintType, String> hints = new Hashtable<EncodeHintType, String>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");

        BitMatrix bitMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.QR_CODE, width, height, hints);

        File outputFile = new File(path + File.separator + "1.jpg");
        MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);

        File file=new File(path+"1.jpg");
        InputStream is = new FileInputStream(file);
        BufferedImage bi;
        bi = ImageIO.read(is);
        Image im = (Image)bi;

        return im;
    }
}
