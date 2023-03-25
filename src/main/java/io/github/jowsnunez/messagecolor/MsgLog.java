/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.jowsnunez.messagecolor;

import io.github.jowsnunez.messagecolor.annotations.Separators;
import io.github.jowsnunez.messagecolor.enums.Case;
import io.github.jowsnunez.messagecolor.enums.Color;

import java.lang.annotation.Annotation;
import java.util.Date;

/**
 * @author JowsNunez
 */
@Separators
public class MsgLog {

    private final Date date = new Date();
    private String separator;
    private String color;

    public MsgLog() {
        configLog(this.getClass());
    }

    public final void configLog(Class<? extends MsgLog> clazz) {
        Annotation[] a = clazz.getAnnotationsByType(Separators.class);
        for (Annotation annotation : a) {
            if (annotation instanceof Separators) {
                Separators separators = (Separators) annotation;
                separator = " " + separators.value() + " ";
                Case priority = separators.priority();

                if (priority == Case.SEVERAL) {
                    color = Color.RED.getValue();
                }
                if (priority == Case.NORMAL) {
                    color = Color.GREEN.getValue();
                }
                if (priority == Case.LOW) {
                    color = Color.YELLOW.getValue();
                }
                break;
            }

        }
        System.out.println(a[0].annotationType());
    }

    public  void show(String ntag, String ndescription) {
        System.out.println(color + date + separator + ntag + separator + ndescription + Color.NONE.getValue());
    }
}
