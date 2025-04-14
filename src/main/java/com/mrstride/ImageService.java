package com.mrstride;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public BufferedImage getImage() {
        try {
            return ImageIO.read(getClass().getResourceAsStream("/images/HOME.png"));
        } catch (IOException e) {
            e.printStackTrace();
            //return blank image if loading fails 
            return new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        }
    }

}
