package com.rincliu.annotation.test;

import java.lang.reflect.Field;

import com.rincliu.annotation.ProgrammerAnnotation;

public class Test
{
    @ProgrammerAnnotation(
            email = "i@RincLiu.com", 
            site = "http://RincLiu.com", 
            skills = {"Android", "iOS", "Golang"}
    )
    private String rinc;
    
    public static void main(String[] args)
    {
        Class<?> clazz = null;
        try
        {
            clazz = Class.forName("com.rincliu.annotation.test.Test");
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        if (clazz != null)
        {
            for (Field field : clazz.getDeclaredFields())
            {
                if (field.isAnnotationPresent(ProgrammerAnnotation.class))
                {
                    ProgrammerAnnotation pa = field.getAnnotation(ProgrammerAnnotation.class);
                    System.out.println("Email: " + pa.email());
                    System.out.println("Site: " + pa.site());
                    System.out.print("Skills: ");
                    for(String sk : pa.skills())
                    {
                        System.out.print(sk + " ");
                    }
                    System.out.println();
                    break;
                }
            }
        }
    }
}
