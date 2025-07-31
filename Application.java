import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {

    public static void main(String[] args) {
        // Define the paths for input and output.
        // For a real application, these might come from command-line arguments or a config file.
        String inputFile = "C:\\log_project\\newproject\\data\\log1.txt";
        String outputDir = "C:\\log_project\\newproject\\output";

        System.out.println("Starting log file processing...");
        System.out.println("Input file: " + inputFile);
        System.out.println("Output directory: " + outputDir);

        LogFileProcessor processor = new LogFileProcessor();
        try {
            processor.processLogFile(inputFile, outputDir);
            Path outputPath = Paths.get(outputDir, "processed_log.txt");
            System.out.println("\nLog processing completed successfully.");
            System.out.println("Processed log saved to: " + outputPath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("\nAn error occurred during file processing.");
            System.err.println("Please check the file paths and permissions.");
            System.err.println("Details: " + e.getMessage());
            e.printStackTrace();
        }
    }
}