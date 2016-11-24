package com.javarush.test.samples.multithreading.onethread.javaclocks;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by prulov on 24.11.2016.
 */
public class JavaClock2 extends JFrame implements Threadable {

    private JLabel clockLabel = new JLabel();

    public JavaClock2() {
        // Установить заголовок
        setTitle("ClockThread");

        // Выравнять метку по горизонтали - есть такой метод у Label
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Установить размер шрифта для метки  - есть такой метод у Label
        // Для эт ого создаем шрифт и сразу его отдаем методу setFont
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 48);
        clockLabel.setFont(f);

        // Добавить метку на основную панель окна
        getContentPane().add(clockLabel);

        // Установить размеры окна
        setBounds(800, 600, 600, 200);

        // ОБРАТИТЬ ВНИМАНИЕ !!!
        // Создаем отдельный поток, который должен обновлять значение метки
        MyThread myThread = new MyThread();
        myThread.setClock(this);
        myThread.start();
    }

    @Override
    public void setTime() {
        // Более корректный вызов в отдельном потоке, который отвечает за графику
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                clockLabel.setText(df.format(Calendar.getInstance().getTime()));
            }
        });
    }
}
