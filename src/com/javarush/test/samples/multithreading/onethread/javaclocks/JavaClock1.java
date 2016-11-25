package com.javarush.test.samples.multithreading.onethread.javaclocks;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by prulov on 24.11.2016.
 */
public class JavaClock1 extends JFrame implements Threadable {

    private JLabel clockLabel = new JLabel();
    private MyThread myThread;

    public JavaClock1() {
        // Установить заголовок
        setTitle("JAVAClock - 1: uses MyThread");

        // Выравнять метку по горизонтали - есть такой метод у Label
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Установить размер шрифта для метки  - есть такой метод у Label
        // Для эт ого создаем шрифт и сразу его отдаем методу setFont
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 24);
        clockLabel.setFont(f);

        // Добавить метку на основную панель окна
        getContentPane().add(clockLabel);

        // Установить размеры окна
        setBounds(600, 0, 400, 100);

        // ОБРАТИТЬ ВНИМАНИЕ !!!
        // Создаем отдельный поток, который должен обновлять значение метки
        myThread = new MyThread();
        myThread.setClock(this);
        myThread.start();
        System.out.println(myThread.toString() + " started!");
    }

    @Override
    public void setTime() {
        // Создаем объект для форматирования даты
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        // Устанавливаем новое значение для метки - сразу форматируем дату в строку и устанавливаем новый текст
        clockLabel.setText(df.format(Calendar.getInstance().getTime()));
    }

    public MyThread getMyThread()
    {
        return myThread;
    }
}

