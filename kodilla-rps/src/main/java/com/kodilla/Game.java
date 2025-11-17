package com.kodilla;

import java.util.Random;

public class Game {

    private final String playerName;
    private final int roundsToWin;

    private int playerScore = 0;
    private int computerScore = 0;

    public Game(String playerName, int roundsToWin) {
        this.playerName = playerName;
        this.roundsToWin = roundsToWin;
    }

    public Move randomComputerMove() {
        return Move.values()[new Random().nextInt(3)];
    }

    public String playRound(Move playerMove) {
        Move computerMove = randomComputerMove();

        if (playerMove == computerMove) {
            return "Draw!";
        } else if (playerMove.beats(computerMove)) {
            playerScore++;
            return "You win this round!";
        } else {
            computerScore++;
            return "Computer win this round!";
        }
    }

    public boolean isFinished() {
        return playerScore == roundsToWin || computerScore == roundsToWin;
    }

    public String getScore() {
        return "Result: " + playerName + " " + playerScore + " : " + computerScore + " Computer";
    }

}
