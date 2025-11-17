package com.kodilla;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String name = scanner.nextLine();

        System.out.println("How many rounds do you want to play?");
        int rounds = scanner.nextInt();
        scanner.nextLine();

        Game game = new Game(name, rounds);

        boolean end = false;

        while (!end) {
            System.out.println("Select move: 1 - rock, 2 - paper, 3 - scissors, x - exit, n - new game");
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    end = playMove(Move.ROCK, game);
                    break;
                case "2":
                    end = playMove(Move.PAPER, game);
                    break;
                case "3":
                    end = playMove(Move.SCISSORS, game);
                    break;
                case "x":
                    end = confirmExit(scanner);
                    break;
                case "n": {
                    if (confirmNewGame(scanner)) {
                        game = startNewGame(scanner);
                    }
                    break;
                }
                default:
                    System.out.println("No option selected!");
            }
        }
    }

    private static boolean playMove(Move move, Game game) {
        System.out.println(game.playRound(move));
        System.out.println(game.getScore());

        if (game.isFinished()) {
            System.out.println("The game is over!");
            return true;
        }
        return false;
    }

    private static boolean confirmExit(Scanner sc) {
        System.out.println("Are you sure you want to leave?? (y/n)");
        return sc.nextLine().equalsIgnoreCase("y");
    }

    private static boolean confirmNewGame(Scanner sc) {
        System.out.println("Are you sure you want to quit the current game? (y/n)");
        return sc.nextLine().equalsIgnoreCase("y");
    }

    private static Game startNewGame(Scanner scanner) {
        System.out.println("Starting a new game!");

        System.out.println("Insert your name: ");
        String newName = scanner.nextLine();

        System.out.println("How many rounds do you want to play?");
        int newRounds = scanner.nextInt();
        scanner.nextLine();

        return new Game(newName, newRounds);
    }
}