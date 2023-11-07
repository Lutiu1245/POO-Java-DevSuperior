package exercicio_string_builder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private int likes;
    List<Comment> comments = new ArrayList<>();

    private Comment comment;

    public Post(Date moment, String title, String content, int likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    public Post(Date moment, String title, String content, int likes, Comment comment) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
        this.comment = comment;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                likes + "Likes" + " - "+ moment + '\'' +
                content + '\'' +
                "Comments:" + '\'' +
                comment +
                '}';
    }
}
