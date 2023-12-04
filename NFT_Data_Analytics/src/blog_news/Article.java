package blog_news;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Article {
	private static int idCounter = 1;

	private int id;
    private String title;
    private String absoluteURL;
    private String fullContent;
    private List<String> tags;
    private String publishDate;
    
    public Article() {
        this.id = idCounter++;
    }

    public Article(String title, String absoluteURL, String fullContent, List<String> tags, String publishDate) {
        this.id = idCounter++;
        this.title = title;
        this.absoluteURL = absoluteURL;
        this.fullContent = fullContent;
        this.tags = tags;
        this.publishDate = publishDate;
    }
    
    // Getters/Setters
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbsoluteURL() {
        return absoluteURL;
    }

    public void setAbsoluteURL(String absoluteURL) {
        this.absoluteURL = absoluteURL;
    }
	
    public String getFullContent() {
		return fullContent;
	}

	public void setFullContent(String fullContent) {
		this.fullContent = fullContent;
	}

	public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", absoluteURL='" + absoluteURL + '\'' +
                ", content='" + fullContent + '\'' +
                ", tags=" + tags +
                ", publishDate='" + publishDate + '\'' +
                '}';
    }

	public static void resetIdCounter(int maxId) {
		idCounter = maxId + 1;	
	}
	
}


