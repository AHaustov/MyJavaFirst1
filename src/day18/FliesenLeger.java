package day18;

import java.util.Scanner;

public class FliesenLeger {
    public static void main(String[] args) {
        double tileSide1 = getMeSideTileOne();
        double tileSide2 = getMeSideTileTwo();
        double roomSide1 = getMeRoomSideOne();
        double roomSide2 = getMeRoomSideTwo();
        double surfaceRoom = getMeSurface(roomSide1, roomSide2);
        int countWholeTile = getMeWholeTile(roomSide1, roomSide2, tileSide1, tileSide2);
        int countBrokenTile = getMeBrokenTile(roomSide1, roomSide2, tileSide1, tileSide2);
        double priceMaterial = (countBrokenTile + countWholeTile) * getMePriceTile();
        double priceWorkHours = surfaceRoom * 27.00;
        System.out.println("The estimated work will cost " + priceWorkHours);
        System.out.println("I need " + (countWholeTile + countBrokenTile) + " Tiles for your Room");
        System.out.println(countWholeTile + " will be whole and i need " + countBrokenTile + " to break.");
        System.out.println("The estimated price for your Tiles will be " + priceMaterial);
        System.out.println("The estimated price for everything will be " + (priceMaterial + priceWorkHours));
    }

    private static double getMePriceTile() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the Price of 1 Tile?");
        double priceTile = input.nextDouble();
        return priceTile;
    }

    private static int getMeBrokenTile(double a, double b, double c, double d) {
        int result = 0;
        if ((int) (a / c) * (int) (b / d) > (int) (a / d) * (int) (b / c)) {
            result = (int) Math.ceil(((a / c) - (int) (a / c)) * (b / d) + ((b / d) - (int) (b / d)) * (int) (a / c));
        } else {
            result = (int) Math.ceil(((a / d) - (int) (a / d)) * (b / c) + ((b / c) - (int) (b / c)) * (int) (a / d));
        }
        return result;
    }

    private static int getMeWholeTile(double a, double b, double c, double d) {
        return Math.max((int) (a / c) * (int) (b / d), (int) (a / d) * (int) (b / c));
    }

    private static double getMeRoomSideTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first Sidelength of your Room?");
        double side1 = input.nextDouble();
        return side1;
    }

    private static double getMeRoomSideOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the second Sidelength of your Room?");
        double side2 = input.nextDouble();
        return side2;
    }

    private static double getMeSideTileTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the second Sidelength of your Tile?");
        double tile2 = input.nextDouble();
        return tile2;
    }

    private static double getMeSideTileOne() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first Sidelength of your Tile?");
        double tile1 = input.nextDouble();
        return tile1;
    }

    private static double getMeSurface(double a, double b) {
        return a * b;
    }


}
