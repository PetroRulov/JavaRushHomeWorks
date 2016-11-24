package com.javarush.test.samples.multithreading.onethread.javaclocks;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class StartStopClock extends JFrame implements Threadable, ActionListener
{
    private static final String START = "START";
    private static final String STOP = "STOP";

    private final JLabel clockLabel = new JLabel();
    //private ClockThread clockThread = null;
    private MyThread clockThread = null;

    public StartStopClock()
    {
        // Установить заголовок
        setTitle("ClockThread");

        // Выравнять метку по горизонтали - есть такой метод у Label
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Установить размер шрифта для метки  - есть такой метод у Label
        // Для эт ого создаем шрифт и сразу его отдаем методу setFont
        Font f = new Font("Default", Font.BOLD + Font.ITALIC, 48);
        clockLabel.setFont(f);

        // Добавить метку на основную панель окна
        add(clockLabel);

        // Добавить кнопку для старта
        JButton start = new JButton(START);
        start.setFont(f);
        start.setForeground(Color.BLUE);
        start.setActionCommand(START);
        start.addActionListener(this);
        add(start, BorderLayout.NORTH);

        // Добавить кнопку для становки
        JButton stop = new JButton(STOP);
        stop.setFont(f);
        stop.setForeground(Color.RED);
        stop.setActionCommand(STOP);
        stop.addActionListener(this);
        add(stop, BorderLayout.SOUTH);

        // Установить размеры окна
        setBounds(0, 0, 600, 400);

    }

    @Override
    public void setTime()
    {
        // Более корректный вызов в отдельном потоке, который отвечает за графику
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                clockLabel.setText(df.format(Calendar.getInstance().getTime()));
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (START.equals(ae.getActionCommand()))
        {
            if (clockThread == null)
            {
                clockThread = new MyThread();
                clockThread.setClock(this);
                clockThread.start();
            }
        }
        if (STOP.equals(ae.getActionCommand()))
        {
            if (clockThread != null)
            {
                clockThread.stopClock();
                clockThread = null;
            }
        }
    }
}