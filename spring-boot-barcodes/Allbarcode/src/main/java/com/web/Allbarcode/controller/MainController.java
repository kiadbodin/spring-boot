package com.web.Allbarcode.controller;


import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.BarcodeFormat;
import com.web.Allbarcode.controller.Qrcode.QRCodeGenerator;

@Controller
@RequestMapping("/")
public class MainController {
		
	private static final String QR_CODE_IMAGE_PATH = "./src/main/resources/static/img/QRCode.png";

	@GetMapping("")	
	public ModelAndView Home(Model model) {
		ModelAndView mav  = new ModelAndView("index");

		String medium="https://rahul26021999.medium.com/";
        String github="https://www.scimath.org/article-technology/item/7742-bluetooth-5";

		byte[] image = new byte[0];

        try {

            // Generate and Return Qr Code in Byte Array
            image = QRCodeGenerator.getQRCodeImage(medium,250,250);

            // Generate and Save Qr Code Image in static/image folder
            QRCodeGenerator.generateQRCodeImage(github,250,250,QR_CODE_IMAGE_PATH);

        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }

        BitMatrix bitMatrix1;
        //bitMatrix1 = new MultiFormatWriter().encode(github, BarcodeFormat.QR_CODE, 250, 250);

        // Convert Byte Array into Base64 Encode String
        String qrcode = Base64.getEncoder().encodeToString(image);

        mav.addObject("medium",medium);
        mav.addObject("github",github);
        
        mav.addObject("qrcode",qrcode);
        
		return mav;
		
	}
	
	@GetMapping("barcodes/list")
	public ModelAndView Barcodes() {	
		ModelAndView mav  = new ModelAndView("barcodeslist");		
		return mav;
	}
	
}
