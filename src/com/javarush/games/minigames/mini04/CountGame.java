 package com.javarush.games.minigames.mini04;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import static java.awt.Color.green;

/* 
Считаем клетки
*/

public class CountGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(10, 10);
        showGrid(false);
        for (int j = 0; j < 50; j++) {
            int x = getRandomNumber(10);
            int y = getRandomNumber(10);
            setCellColor(x, y, Color.GREEN);
            setCellNumber(x, y, getRandomNumber(100));
        }
        showResult();
    }

    public void showResult() {
        //напишите тут ваш код
        int sum = 0;
        int greenNumber = 0;
        for (int i=0;i<10;i++){
            for (int j = 0; j < 10; j++) {
                sum=sum+getCellNumber(i,j);
                if (getCellColor(i,j)==Color.GREEN){
                    greenNumber++;
                };
            }
        }
        printSum(sum);
        printCountOfGreenCells(greenNumber);
    }

    private void printSum(int sum) {
        System.out.println("Сумма всех чисел = " + sum);
    }

    private void printCountOfGreenCells(int count) {
        System.out.println("Количество зеленых клеток = " + count);
    }
}
