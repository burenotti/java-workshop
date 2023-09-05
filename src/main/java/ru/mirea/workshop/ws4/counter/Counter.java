package ru.mirea.workshop.ws4.counter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Counter extends JFrame {

    CounterState state;
    JButton milanButton;
    JButton realButton;
    JLabel scoreLabel;
    JLabel resultLabel;
    JLabel lastScorer;

    Counter() {
        state = new CounterState("AC Milan", "Real Madrid");

        mount();
    }

    private void mount() {
        setSize(200, 200);
        milanButton = new JButton(state.getTeamLeftName());
        realButton = new JButton(state.getTeamRightName());
        scoreLabel = new JLabel();
        resultLabel = new JLabel();
        lastScorer = new JLabel();

        milanButton.addActionListener(this::onIncrementMilan);
        realButton.addActionListener(this::onIncrementReal);

        setLayout(new FlowLayout());

        add(scoreLabel);
        add(milanButton);
        add(realButton);
        add(lastScorer);
        add(resultLabel);

        setVisible(true);
        update();
    }

    void onIncrementMilan(ActionEvent e) {
        state.incrementLeft();
        update();
    }

    void onIncrementReal(ActionEvent e) {
        state.incrementRight();
        update();
    }

    void update() {
        scoreLabel.setText(String.format("%d x %d", state.getTeamLeftScore(), state.getTeamRightScore()));
        resultLabel.setText("Winner: " + state.getWinner());
        lastScorer.setText("Last Scorer: " + state.getLastScorer());
    }

    public static void main(String[] args) {
        new Counter();
    }
}
