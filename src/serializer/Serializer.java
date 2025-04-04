package serializer;

public interface Serializer {
    void save(Object obj, String fileName);
    Object load(String fileName);
    void setFilePath(String filePath);
}
