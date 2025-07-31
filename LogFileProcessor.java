import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LogFileProcessor {

    // List of keywords to search for in the log file
    private static final List<String> KEYWORDS = Arrays.asList("error", "fail", "warning");

    /**
     * Reads a log file, filters for lines containing specific keywords,
     * and writes the matching lines to an output file.
     * This method is now responsible only for the processing logic and throws
     * an IOException to be handled by the caller.
     *
     * @param inputFilePath  The path to the input log file.
     * @param outputDirPath  The path to the directory where the output file will be saved.
     * @throws IOException if an I/O error occurs.
     */
    public void processLogFile(String inputFilePath, String outputDirPath) throws IOException {
        Path inputPath = Paths.get(inputFilePath);
        Path outputDir = Paths.get(outputDirPath);
        Path outputPath = outputDir.resolve("processed_log.txt");

        Files.createDirectories(outputDir);

        // Use modern Java NIO and a Stream-based check for better performance and readability
        try (BufferedReader reader = Files.newBufferedReader(inputPath);
             BufferedWriter writer = Files.newBufferedWriter(outputPath)) {

            String line;
            while ((line = reader.readLine()) != null) {
                final String lowerCaseLine = line.toLowerCase();
                if (KEYWORDS.stream().anyMatch(lowerCaseLine::contains)) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        }
    }
}