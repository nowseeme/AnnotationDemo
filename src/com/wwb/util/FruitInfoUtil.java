package com.wwb.util;

import java.lang.reflect.Field;

import com.wwb.annotation.FruitColor;
import com.wwb.annotation.FruitName;
import com.wwb.annotation.FruitProvider;

public class FruitInfoUtil {
	public static void getFruitInfo(Class<?> clazz){
		 String strFruitName=" ˮ�����ƣ�";
		 String strFruitColor=" ˮ����ɫ��";
		 String strFruitProvicer="��Ӧ����Ϣ��";
		 Field[] fields = clazz.getDeclaredFields();
		 for(Field field : fields){
			 if (field.isAnnotationPresent(FruitName.class)) {
				 FruitName fruitName = (FruitName) field.getAnnotation(FruitName.class);
	             strFruitName += fruitName.value();
	             System.out.println(strFruitName);
			 }
			 if (field.isAnnotationPresent(FruitColor.class)) {
				 FruitColor fruitColor = field.getAnnotation(FruitColor.class);
				 strFruitColor += fruitColor.fruitColor();
				 System.out.println(strFruitColor);
			 }
			 if (field.isAnnotationPresent(FruitProvider.class)) {
				 FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
				 strFruitProvicer += " ��Ӧ�̱�ţ�"+fruitProvider.id()+" ��Ӧ�����ƣ�"+fruitProvider.name()+" ��Ӧ�̵�ַ��"+fruitProvider.address();
				 System.out.println(strFruitProvicer);
				
			}
			 
		 }
	}
}
