package com.mrstride;

import java.awt.image.BufferedImage;

public class MyTemp {

  final private ImageService imageservice;

  public MyTemp(){
    this.imageservice = ApplicationContextProvider.getApplicationContext().getBean(ImageService.class);
  }

  public MyTemp(ImageService imageservice){
    this.imageservice = imageservice;
  }

  public BufferedImage loadImage(){
    return imageservice.getImage();
  }
  
}
