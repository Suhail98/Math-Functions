package com.company;

import java.util.Scanner;

public class Main {
    private static ISubscriber[] subscribers = {
            new SphereCircumference(),new LucasSeriesSubscriber()
    };
    public static void main(String[] args) {
        Topic mathTopic = new Topic();
        for (ISubscriber sub : subscribers) {
            mathTopic.addSubscriber(sub);
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        mathTopic.dispatchEvent(input);
    }
}