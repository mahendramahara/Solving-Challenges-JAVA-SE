import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Main extends JFrame {
    private JLabel repoNameLabel;
    private JTextArea descriptionTextArea;

    public Main() {
        setTitle("GitHub Repository Description");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        repoNameLabel = new JLabel("Repository: Solving-Challenges-JAVA-SE");
        descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(descriptionTextArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(repoNameLabel, BorderLayout.NORTH);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        fetchRepoDescription();

        setVisible(true);
    }

    private void fetchRepoDescription() {
        try {
            URL url = new URL("https://api.github.com/repos/mahendramahara/Solving-Challenges-JAVA-SE");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/vnd.github.v3+json");

            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse the JSON response to get repository description
                String json = response.toString();
                String description = json.split("\"description\":")[1].split(",")[0];
                description = description.substring(1, description.length() - 1); // Remove surrounding quotes
                descriptionTextArea.setText(description);
            } else {
                descriptionTextArea.setText("Failed to fetch description. Response code: " + responseCode);
            }
        } catch (IOException e) {
            descriptionTextArea.setText("Failed to fetch description. Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
