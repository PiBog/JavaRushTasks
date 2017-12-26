package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public  static ImageReader getImageReader(ImageTypes imageTypes) throws IllegalArgumentException{
        ImageReader object = null;
        //{
            if (imageTypes == ImageTypes.BMP) object =  new BmpReader();
            else if(imageTypes == ImageTypes.JPG) object = new JpgReader();
            else if(imageTypes == ImageTypes.PNG) object = new PngReader();
            else throw new IllegalArgumentException("Неизвестный тип картинки");
        //} catch (IllegalArgumentException iae) {}

    return object;
    }
}
