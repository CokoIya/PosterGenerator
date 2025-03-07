package com.poster.generator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PosterGenerator {
    public static void main(String[] args) {
        // 定义要填充的数据
        String company = "稀定（厦门）有限公司";
        String authorizedCompany = "不白吃有限公司";
        String representative = "朱总";
        String brand = "高大上";
        String authorizationNumber = "GD666666";
        String authorizationPeriod = "2025年03月07日—2026年03月06日";
        String authorizationDate = "2025年03月07日";
        String legalRepresentative = "高小定";

        // 调用生成方法
        generatePoster(company, authorizedCompany, representative, brand,
                authorizationNumber, authorizationPeriod,
                authorizationDate, legalRepresentative);
    }

    public static void generatePoster(String company, String authorizedCompany,
                                      String representative, String brand,
                                      String authorizationNumber, String authorizationPeriod,
                                      String authorizationDate, String legalRepresentative) {
        try {
            // 加载模板图片
            BufferedImage templateImage = ImageIO.read(new File("src/main/resources/template.png"));

            // 创建对象用于绘制
            Graphics2D g2d = templateImage.createGraphics();

            // 抗锯齿
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 设置字体颜色
            g2d.setColor(Color.BLACK);

            // 设置字体及大小
            Font font = new Font("宋体", Font.PLAIN, 24);
            g2d.setFont(font);

            // 根据模板位置调整文字坐标
            g2d.drawString(company, 220, 230);
            g2d.drawString(authorizedCompany, 550, 230);
            g2d.drawString(representative, 250, 270);
            g2d.drawString(brand, 500, 270);
            g2d.drawString(authorizationNumber, 420, 360);
            g2d.drawString(authorizationPeriod, 320, 320);
            g2d.drawString(authorizationDate, 220, 420);
            g2d.drawString(legalRepresentative, 650, 400);

            // 释放资源
            g2d.dispose();

            // 输出生成的图片
            ImageIO.write(templateImage, "png", new File("poster.png"));

            System.out.println("✅ 海报生成成功！保存为poster.png");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
