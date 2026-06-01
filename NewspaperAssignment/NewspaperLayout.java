import javax.swing.*;
import java.awt.*;

public class NewspaperLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Newspaper Layout");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(1000, 700);

            // Main panel
            JPanel mainPanel = new JPanel(new BorderLayout());

            // Newspaper title
            JLabel title = new JLabel("THE DAILY NEWS", SwingConstants.CENTER);
            title.setFont(new Font("Serif", Font.BOLD, 36));
            title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

            mainPanel.add(title, BorderLayout.NORTH);

            // Content panel with 3 columns
            JPanel contentPanel = new JPanel(new GridLayout(1, 3, 15, 0));

           String article1 = """
        Headline 1

        It's me Aashma.
        """;

String article2 = """
        Headline 2

        Ministers and officials fighting inside parliament.
        """;

String article3 = """
        Headline 3

        WWE going inside parliament. Ghanti versus Mato.
        """;

            JTextArea col1 = createColumn(article1);
            JTextArea col2 = createColumn(article2);
            JTextArea col3 = createColumn(article3);

            contentPanel.add(new JScrollPane(col1));
            contentPanel.add(new JScrollPane(col2));
            contentPanel.add(new JScrollPane(col3));

            mainPanel.add(contentPanel, BorderLayout.CENTER);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }

    private static JTextArea createColumn(String text) {
        JTextArea area = new JTextArea(text);
        area.setFont(new Font("Serif", Font.PLAIN, 16));
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEditable(false);
        area.setMargin(new Insets(10, 10, 10, 10));
        return area;
    }
}