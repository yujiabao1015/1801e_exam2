package com.yujiabao.common.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class RandomUtil {
	//方法1：获得指定范围的随机小数,精度scale表示小数点后位数
	public static double getValue(final double min, final double max,final int scale){
		if(max<min) {
			throw new RuntimeException("请按要求输入");
		}
		double num = Math.random()*(max-min)+min;
		NumberFormat mf = NumberFormat.getInstance();
		mf.setMaximumFractionDigits(scale);
		mf.setRoundingMode(RoundingMode.DOWN);
		String format = mf.format(num);
		Double number = Double.valueOf(format);
		return number;
	}
	//方法2：返回min-max之间的随机整数（包含min和不包含max值），
	public static int random(int min, int max){
		if(max<min) {
			throw new RuntimeException("请按要求输入");
		}
		Random random = new Random();
		int num = random.nextInt((max-min))+min;
		return num;
	}

}
