package structural_patterns.facade;

public class VideoFacade {
    void receiveVideo(String newFormat, int newSize) {
        VideoDownloader downloader = new VideoDownloader();
        downloader.download();

        VideoConverter converter = new VideoConverter();
        converter.converter(newFormat);

        VideoCompressor compressor = new VideoCompressor();
        compressor.compress(newSize);
    }
}
