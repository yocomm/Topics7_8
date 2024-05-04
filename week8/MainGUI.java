package week8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainGUI {
    public class MovieGUI extends JFrame {
        private JTextField movieTitleTextField;
        private JSlider ratingSlider;
        private JCheckBox wouldSeeAgainCheckBox;

        private JPanel mainPanel;
        private JLabel sliderValuelLabel;
        private JLabel movieOpinionLabel;

        MovieGUI() {
            setContentPane(mainPanel);

            pack();

            setvisible(true);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            configureEventHandlers();

            private void configureEventHandlers() {
                ratingSlider.addChangeListener(new ChangeListener() {
                    @override
                    public void stateChanged(ChangeEvent e) {
                    }
                });
            }
            private void updateOpinion() {
                String movieName = movieTitleTextField.getText();
                int rating = ratingSlider.getValue();
                boolean seeAgain = wouldSeeAgainCheckBox.isSelected();
}
